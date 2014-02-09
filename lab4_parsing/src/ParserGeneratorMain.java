import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Author: Artem Popov <jambo@yandex-team.ru>
 * Date: 02.06.13
 */
public class ParserGeneratorMain {

    public static void main(String[] args) throws IOException, NoLexerRuleFoundException {
        final ParserGeneratorMain program = new ParserGeneratorMain();
//        program.generate("Boolean", "example1.txt");
//        program.generate("Parentheses", "example.txt");
        program.runBoolean();
//          program.runParentheses();
    }

    private void runBoolean() throws IOException, NoLexerRuleFoundException {
        final List<Lexem> lexems = new BooleanLexer().splitToLexems(new FileInputStream("test1.txt"));
        System.out.println(lexems);
        BooleanParser generatedParser = new BooleanParser(lexems);
        try {
            final BooleanParser.Node s = generatedParser.OR(new BooleanParser.Node("OR", null));
            System.out.println(s.result);
        }
        catch (UnexpectedLexemException e) {
            System.out.println(e.expected);
            System.out.println(e.actual);
            throw e;
        }
    }

    private void runParentheses() throws IOException, NoLexerRuleFoundException {
        final List<Lexem> lexems = new ParenthesesLexer().splitToLexems(new FileInputStream("test.txt"));
        System.out.println(lexems);
        ParenthesesParser generatedParser = new ParenthesesParser(lexems);
        try {
            ParenthesesParser.Node s = generatedParser.S(new ParenthesesParser.Node("S", null));
            System.out.println(s);
        }
        catch (UnexpectedLexemException e) {
            System.out.println(e.expected);
            System.out.println(e.actual);
            throw e;
        }
    }

    private void generate(String name, String grammarFileName) throws IOException {
        final Grammar grammar = getGrammar(grammarFileName);
        LexerGenerator lexerGenerator = new LexerGenerator(grammar);
        lexerGenerator.generateLexer(name);
        ParserGenerator parserGenerator = new ParserGenerator(grammar);
        final Map<String,Set<String>> firstSet = parserGenerator.getFirstSet();
        System.out.println(firstSet);
        System.out.println(parserGenerator.getFollowSet(firstSet));
        System.out.println(parserGenerator.buildParseTable());
        parserGenerator.generateParser(name);
    }

    private void run() throws IOException, NoLexerRuleFoundException {

        final List<Lexem> lexems = new GeneratedLexer().splitToLexems(new FileInputStream("test.txt"));
        System.out.println(lexems);
        GeneratedParser generatedParser = new GeneratedParser(lexems);
        try {

            final GeneratedParser.Node s = generatedParser.S(new GeneratedParser.Node("S", null));
            System.out.println(s);
        }
        catch (UnexpectedLexemException e) {
            System.out.println(e.expected);
            System.out.println(e.actual);
            throw e;
        }
    }

    private Grammar getGrammar(String grammarFileName) throws IOException {
        CharStream cs = new ANTLRFileStream(grammarFileName);
        final MetaGrammarLexer lexer = new MetaGrammarLexer(cs);
        final CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        final MetaGrammarParser parser = new MetaGrammarParser(tokenStream);
        parser.fullGrammar();
        System.out.println(parser.fields);
        for (LexerRule rule : parser.lexerRules) {
            System.out.println(rule);
        }
        for (ParserRule rule : parser.parserRules) {
            System.out.println(rule);
        }
        return new Grammar(parser.lexerRules, parser.parserRules, parser.fields, parser.mainRule);
    }
}
