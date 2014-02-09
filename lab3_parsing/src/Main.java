
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Author: Artem Popov <jambo@yandex-team.ru>
 * Date: 03.05.13
 */
public class Main {
    public static void main(String[] args) throws IOException {
        CharStream cs = new ANTLRFileStream("example.pas");
        pascalGrammarLexer lexer = new pascalGrammarLexer(cs);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        pascalGrammarParser parser = new pascalGrammarParser(tokenStream);
        parser.allProgram();
        System.out.println(parser.code.toString());
    }
}
