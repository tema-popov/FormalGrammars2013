import java.util.List;

/**
 * Author: Artem Popov <jambo@yandex-team.ru>
 * Date: 02.06.13
 */
public class Grammar {
    final List<LexerRule> lexerRules;
    final List<ParserRule> parserRules;
    final CodeSection fields;
    final String mainRule;

    public Grammar(List<LexerRule> lexerRules, List<ParserRule> parserRules, CodeSection fields, String mainRule) {
        this.lexerRules = lexerRules;
        this.parserRules = parserRules;
        this.fields = fields;
        this.mainRule = mainRule;
    }
}
