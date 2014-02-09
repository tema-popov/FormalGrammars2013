import java.util.regex.Pattern;

/**
 * Author: Artem Popov <jambo@yandex-team.ru>
 * Date: 02.06.13
 */
public class LexerRule {
    final String name;
    final Pattern pattern;

    public LexerRule(String name, String pattern) {
        this.name = name;
        this.pattern = Pattern.compile(fromEscapedString(pattern.substring(1, pattern.length() - 1)));
    }

    private String fromEscapedString(String pattern) {
        return pattern.replaceAll("\\\\'", "'");
    }

    @Override
    public String toString() {
        return  name + " => " + pattern.pattern();
    }
}
