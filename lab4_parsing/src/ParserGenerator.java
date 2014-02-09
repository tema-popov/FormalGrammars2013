import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

/**
 * Author: Artem Popov <jambo@yandex-team.ru>
 * Date: 02.06.13
 */
public class ParserGenerator {
    private final Grammar grammar;
    Set<String> terminals;
    Set<String> nonTerminals;

    public ParserGenerator(Grammar grammar) {
        this.grammar = grammar;
        terminals = new HashSet<String>();
        nonTerminals = new HashSet<String>();
        for (LexerRule lexerRule : grammar.lexerRules) {
            terminals.add(lexerRule.name);
        }
        terminals.add(Lexem.END_LEXEM.name);
        for (ParserRule parserRule : grammar.parserRules) {
            nonTerminals.add(parserRule.name);
        }
    }

    public Map<String, Set<String>> getFirstSet() {
        Map<String, Set<String>> firstTable = new HashMap<String, Set<String>>();
        for (String nonTerminal : nonTerminals) {
            firstTable.put(nonTerminal, new HashSet<String>());
        }
        boolean changes = true;
        while (changes) {
            changes = false;
            for (ParserRule parserRule : grammar.parserRules) {
                for (List<String> rule : parserRule.rules) {
                    for (int i = 0; i < rule.size(); i++) {
                        String s = rule.get(i);
                        if (terminals.contains(s) || s.equals(Lexem.EPS_LEXEM.name)) {
                            if (!firstTable.get(parserRule.name).contains(s)) {
                                changes = true;
                            }
                            firstTable.get(parserRule.name).add(s);
                            break;
                        } else {
                            for (String terminal : terminals) {
                                if (firstTable.get(s).contains(terminal)) {
                                    if (!firstTable.get(parserRule.name).contains(terminal)) {
                                        changes = true;
                                    }
                                    firstTable.get(parserRule.name).add(terminal);
                                }
                            }
                            if (!firstTable.get(s).contains(Lexem.EPS_LEXEM.name)) {
                                break;
                            } else {
                                if (i == rule.size() - 1) {
                                    if (!firstTable.get(parserRule.name).contains(Lexem.EPS_LEXEM.name)) {
                                        changes = true;
                                    }
                                    firstTable.get(parserRule.name).add(Lexem.EPS_LEXEM.name);
                                }
                            }
                        }
                    }
                }
            }
        }

        return firstTable;
    }


    public Map<String, Set<String>> getFollowSet(Map<String, Set<String>> firstSet) {
        Map<String, Set<String>> followSet = new HashMap<String, Set<String>>();
        for (String nonTerminal : nonTerminals) {
            followSet.put(nonTerminal, new HashSet<String>());
        }

        boolean changes = true;
        while (changes) {
            changes = false;
            for (ParserRule parserRule : grammar.parserRules) {
                for (List<String> rule : parserRule.rules) {
                    for (int i = 0; i < rule.size() - 1; i++) {
                        String symbol = rule.get(i);
                        String next = rule.get(i + 1);
                        if (nonTerminals.contains(symbol)) {
                            if (nonTerminals.contains(next)) {
                                for (String terminal : terminals) {
                                    if (firstSet.get(next).contains(terminal)) {
                                        if (!followSet.get(symbol).contains(terminal)) {
                                            changes = true;
                                        }
                                        followSet.get(symbol).add(terminal);
                                    }
                                }
                                if (firstSet.get(next).contains(Lexem.EPS_LEXEM.name)) {
                                    for (String terminal : terminals) {
                                        if (followSet.get(next).contains(terminal)) {
                                            if (!followSet.get(symbol).contains(terminal)) {
                                                changes = true;
                                            }
                                            followSet.get(symbol).add(terminal);
                                        }
                                    }
                                }
                            } else {
                                if (!followSet.get(symbol).contains(next)) {
                                    changes = true;
                                }
                                followSet.get(symbol).add(next);
                            }
                        }
                    }
                    String symbol = rule.get(rule.size() - 1);
                    if (nonTerminals.contains(symbol)) {
                        for (String terminal : terminals) {
                            if (followSet.get(parserRule.name).contains(terminal)) {
                                if (!followSet.get(symbol).contains(terminal)) {
                                    changes = true;
                                }
                                followSet.get(symbol).add(terminal);
                            }
                        }
                    }
                }

            }

        }

        return followSet;
    }

    public Map<String, Map<String, List<ParserRule.RuleElement>>> buildParseTable() {
        final Map<String, Set<String>> firstSet = getFirstSet();
        final Map<String, Set<String>> followSet = getFollowSet(firstSet);
        Map<String, Map<String, List<ParserRule.RuleElement>>> parseTable = new HashMap<String, Map<String, List<ParserRule.RuleElement>>>();
        for (String nonTerminal : nonTerminals) {
            parseTable.put(nonTerminal, new HashMap<String, List<ParserRule.RuleElement>>());
        }

        for (ParserRule parserRule : grammar.parserRules) {
            for (List<ParserRule.RuleElement> rule : parserRule.ruleElements) {

                boolean nulable = true;
                for (ParserRule.RuleElement ruleElement : rule) {
                    if (!ruleElement.isRule()) continue;
                    String symbol = ruleElement.rule;
                    if (symbol.equals(Lexem.EPS_LEXEM.name)) {
                        break;
                    }
                    if (terminals.contains(symbol)) {
                        if (!parseTable.get(parserRule.name).containsKey(symbol)) {
                            parseTable.get(parserRule.name).put(symbol, rule);
                        } else {
                            throw new NotLL1GrammarException();
                        }
                        nulable = false;
                        break;
                    } else {
                        for (String terminal : terminals) {
                            if (firstSet.get(symbol).contains(terminal)) {
                                if (!parseTable.get(parserRule.name).containsKey(terminal)) {
                                    parseTable.get(parserRule.name).put(terminal, rule);
                                } else {
                                    throw new NotLL1GrammarException();
                                }
                            }
                        }
                        if (firstSet.get(symbol).contains(Lexem.EPS_LEXEM.name)) {
                            nulable = false;
                            break;
                        }
                    }
                }
                if (nulable) {
                    for (String terminal : terminals) {
                        if (followSet.get(parserRule.name).contains(terminal)) {
                            if (!parseTable.get(parserRule.name).containsKey(terminal)) {
                                parseTable.get(parserRule.name).put(terminal, rule);
                            } else {
                                throw new NotLL1GrammarException();
                            }
                        }
                    }
                }
            }
        }
        return parseTable;
    }

    private String getSetText(String name, Set<String> strings) {
        List<String> escapedStrings = new ArrayList<String>();
        for (String string : strings) {
            escapedStrings.add("\"" + StringEscapeUtils.escapeJava(string) + "\"");
        }
        return "\tSet<String> " + name + "Set = new HashSet<String>(Arrays.asList(" + StringUtils.join(escapedStrings, ", ")+  "));";
    }

    private String getNodeText(String name, Map<String, List<ParserRule.RuleElement>> stringListMap) {
//        private Node MAIN() {
//            final Node node = new Node();
//            if (MAINSet.contains(currentLexem.name)) {
//                if (currentLexem.name.equals("not")){
//                    node.addNode(OR());
//                    node.addNode(test("END"));
//                }
//                if (currentLexem.name.equals("openBr")){
//                    node.addNode(OR());
//                    node.addNode(test("END"));
//                }
//                if (currentLexem.name.equals("var")){
//                    node.addNode(OR());
//                    node.addNode(test("END"));
//                }
//                if (currentLexem.name.equals("END")){
//                    node.addNode(OR());
//                    node.addNode(test("END"));
//                }
//                return node;
//            } else {
//                throw new UnexpectedLexemException(MAINSet, currentLexem.name);
//            }
//        }
        StringBuilder result = new StringBuilder();
        result.append("\tpublic Node ").append(name).append("(Node node0) {\n");
//        result.append("\t\tfinal Node node0 = new Node(\"" + StringEscapeUtils.escapeJava(name) + "\", null);\n" );
        result.append("\t\tif (").append(name).append("Set.contains(currentLexem.name)) {\n");
        for (String terminal : stringListMap.keySet()) {
            result.append("\t\t\tif (currentLexem.name.equals(\"").append(StringEscapeUtils.escapeJava(terminal)).append("\")){\n");
            int i = 1;
            for (ParserRule.RuleElement ruleNode : stringListMap.get(terminal)) {
                if (ruleNode.isRule()) {
                    if (ruleNode.rule.equals(Lexem.EPS_LEXEM.name)) {
                        break;
                    }
                    result.append("\t\t\t\tNode node").append(Integer.toString(i)).append(" = new Node(\"").append(StringEscapeUtils.escapeJava(ruleNode.rule)).append("\", null);\n");
                    i++;
                }
            }
            i = 1;
            for (ParserRule.RuleElement ruleNode : stringListMap.get(terminal)) {
                if (ruleNode.isRule()) {
                    if (ruleNode.rule.equals(Lexem.EPS_LEXEM.name)) {
                        continue;
                    }
                    if (terminals.contains(ruleNode.rule)) {
                        result.append("\t\t\t\tnode").append(Integer.toString(i)).append(" = test(\"").append(StringEscapeUtils.escapeJava(ruleNode.rule)).append("\", node").append(Integer.toString(i)).append(");\n");
                        result.append("\t\t\t\t" + "node0.addNode(node").append(Integer.toString(i)).append(");\n");
                    } else {
                        result.append("\t\t\t\tnode").append(Integer.toString(i)).append(" = ").append(ruleNode.rule).append("(node").append(Integer.toString(i)).append(");\n");
                        result.append("\t\t\t\t" + "node0.addNode(node").append(Integer.toString(i)).append(");\n");
                    }
                    i++;
                } else {
                    final String[] insertedCode = ruleNode.code.code.replaceAll("\\$", "node").split("\\n");
                    for (String s : insertedCode) {
                        result.append("\t\t\t\t").append(s.trim()).append("\n");
                    }
                }
            }
            result.append("\t\t\t\treturn node0;\n\t\t\t}\n");
        }
        result.append("\t\t\treturn node0;\n");
        result.append("\t\t} else {\n");
        result.append("\t\t\tthrow new UnexpectedLexemException(").append(name).append("Set, currentLexem.name);\n");
        result.append("\t\t}\n");
        result.append("\t}\n");
        return result.toString();
    }

    public void generateParser(String name) throws FileNotFoundException {
        String text = new Scanner(new File("src/parser.template")).useDelimiter("\\A").next();
        final PrintWriter printWriter = new PrintWriter("src/" + name + "Parser.java");
        final Map<String, Map<String, List<ParserRule.RuleElement>>> parseTable = buildParseTable();
        List<String> sets = new ArrayList<String>();
        List<String> functions = new ArrayList<String>();
        for (String nonTerminal : parseTable.keySet()) {
            sets.add(getSetText(nonTerminal, parseTable.get(nonTerminal).keySet()));
            functions.add(getNodeText(nonTerminal, parseTable.get(nonTerminal)));

        }
        String stringSets = StringUtils.join(sets, "\n");
        String stringMethods = StringUtils.join(functions, "\n");
        printWriter.print(String.format(text, name, grammar.fields != null ? grammar.fields.code : "", name, stringSets, stringMethods));
        printWriter.close();
    }

}
