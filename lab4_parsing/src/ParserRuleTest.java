import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

/**
 * Author: Artem Popov <jambo@yandex-team.ru>
 * Date: 02.06.13
 */
public class ParserRuleTest {
    @Test
    public void testConstruct(){
        String name = "A";
        final ParserRule parserRule = new ParserRule(name);
        parserRule.addVariant(Arrays.asList(new ParserRule.RuleElement("a"), new ParserRule.RuleElement("b"), new ParserRule.RuleElement("c")));
    }

}
