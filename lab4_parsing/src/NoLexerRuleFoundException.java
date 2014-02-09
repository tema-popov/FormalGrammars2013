/**
* Author: Artem Popov <jambo@yandex-team.ru>
* Date: 02.06.13
*/
public class NoLexerRuleFoundException extends Exception {
    final String token;
    public NoLexerRuleFoundException(String cur) {
        token = cur;
    }
}
