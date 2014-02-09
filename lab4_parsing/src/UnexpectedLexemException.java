import java.util.Set;

/**
 * Author: Artem Popov <jambo@yandex-team.ru>
 * Date: 03.06.13
 */
public class UnexpectedLexemException extends RuntimeException {
    public Set<String> expected;
    public String actual;

    public UnexpectedLexemException(Set<String> expected, String actual) {
        this.expected = expected;
        this.actual = actual;
    }
}
