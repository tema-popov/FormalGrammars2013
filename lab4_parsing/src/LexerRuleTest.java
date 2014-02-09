import org.junit.Assert;
import org.junit.Test;

/**
 * Author: Artem Popov <jambo@yandex-team.ru>
 * Date: 02.06.13
 */
public class LexerRuleTest {

    @Test
    public void testConstructor() {
        final String name = "someName";
        final String pattern = "'[a-z]\\''";
        LexerRule lexerRule = new LexerRule(name, pattern);
        Assert.assertEquals(name, lexerRule.name);
        Assert.assertTrue(lexerRule.pattern.matcher("a'").matches());
        Assert.assertFalse(lexerRule.pattern.matcher("x").matches());

    }
}
