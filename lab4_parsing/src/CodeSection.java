/**
 * Author: Artem Popov <jambo@yandex-team.ru>
 * Date: 04.06.13
 */
public class CodeSection {
    public CodeSection(String code) {
        this.code = code.substring(2, code.length() - 2);
    }

    @Override
    public String toString() {
        return "CodeSection{" +
                 code  +
                '}';
    }

    final String code;
}
