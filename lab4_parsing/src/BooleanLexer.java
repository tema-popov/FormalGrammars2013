import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * THIS IS GENERATED LEXER
 */
public class BooleanLexer {
    private class Rule {
        final String name;
        final Pattern pattern;

        private Rule(String name, String pattern) {
            this.name = name;
            this.pattern = Pattern.compile(pattern);
        }
    }

    final private List<Rule> lexerRules = Arrays.asList(
            new Rule("or", "or"), new Rule("openBr", "\\("), new Rule("closeBr", "\\)"), new Rule("not", "not"), new Rule("and", "and"), new Rule("xor", "xor"), new Rule("value", "true|false")
    );

    public List<Lexem> splitToLexems(InputStream inputStream) throws NoLexerRuleFoundException, IOException {
        final List<Lexem> lexems = new ArrayList<Lexem>();
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        inputStream,
                        Charset.forName("UTF-8")));
        int c;
        StringBuilder currentToken = new StringBuilder();
        List<Rule> possibleRules = new ArrayList<Rule>();
        while((c = reader.read()) != -1) {
            char character = (char) c;
            if (Character.isSpaceChar(character)) {
                if (currentToken.length() > 0) {
                    lexems.add(lexemFromString(currentToken.toString()));
                    currentToken.setLength(0);
                    possibleRules.clear();
                }
            } else {
                if (possibleRules.isEmpty()) {
                    currentToken.append(character);
                    possibleRules = findCandidates(currentToken.toString());
                }
                else {
                    List<Rule> currentRules = findCandidates(currentToken.toString() + character);
                    if (currentRules.isEmpty()) {
                        lexems.add(new Lexem(possibleRules.get(0).name, currentToken.toString()));
                        currentToken.setLength(0);
                        currentToken.append(character);
                        possibleRules = findCandidates(currentToken.toString());
                    } else {
                        possibleRules = currentRules;
                        currentToken.append(character);
                    }
                }
            }
        }
        if (currentToken.length() > 0) {
            lexems.add(lexemFromString(currentToken.toString()));
        }

        //lexems.add(Lexem.END_LEXEM);
        return lexems;
    }

    private List<Rule> findCandidates(String s) {
        List<Rule> candidates = new ArrayList<Rule>();
        for (Rule lexerRule : lexerRules) {
            if (lexerRule.pattern.matcher(s).matches()) {
                candidates.add(lexerRule);
            }
        }
        return candidates;
    }

    private Lexem lexemFromString(String s) throws NoLexerRuleFoundException {
        for (Rule lexerRule : lexerRules) {
            if (lexerRule.pattern.matcher(s).matches()) {
                return new Lexem(lexerRule.name, s);
            }
        }
        throw new NoLexerRuleFoundException(s);
    }

}
