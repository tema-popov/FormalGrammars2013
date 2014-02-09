import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Author: Artem Popov <jambo@yandex-team.ru>
 * Date: 02.06.13
 */
public class LexerExampleTest {

    @Test
    public void testLexer() throws IOException, NoLexerRuleFoundException {
        final GeneratedLexer lexer = new GeneratedLexer();
        Assert.assertEquals(Arrays.asList(
                new Lexem("or", "or"),
                new Lexem("openBr", "("),
                new Lexem("var", "abc"),
                new Lexem("closeBr", ")"),
                new Lexem("not", "not"),
                new Lexem("closeBr", ")"),
                new Lexem("openBr", "("),
                new Lexem("var", "a"),
                Lexem.END_LEXEM
         ),
                lexer.splitToLexems(new ByteArrayInputStream("or (abc)  not )(a".getBytes("UTF-8"))));
    }
}
