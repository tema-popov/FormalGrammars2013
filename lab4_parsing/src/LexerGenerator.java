import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author: Artem Popov <jambo@yandex-team.ru>
 * Date: 02.06.13
 */
public class LexerGenerator {
    final Grammar grammar;

    public LexerGenerator(Grammar grammar) {
        this.grammar = grammar;
    }

    public void generateLexer(String name) throws FileNotFoundException {
        String text = new Scanner(new File("src/lexer.template")).useDelimiter("\\A").next();
        List<String> rules = new ArrayList<String>();
        for (LexerRule lexerRule : grammar.lexerRules) {
            rules.add("new Rule(\"" + StringEscapeUtils.escapeJava(lexerRule.name) + "\", \""
                    + StringEscapeUtils.escapeJava(lexerRule.pattern.pattern()) + "\")");
        }
        String stringRules = StringUtils.join(rules, ", ");
        final PrintWriter printWriter = new PrintWriter(String.format("src/%sLexer.java", name));
        printWriter.print(String.format(text, name, stringRules));
        printWriter.close();
    }
}
