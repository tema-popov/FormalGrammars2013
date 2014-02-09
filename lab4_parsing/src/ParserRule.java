
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Artem Popov <jambo@yandex-team.ru>
 * Date: 02.06.13
 */
public class ParserRule {
    static public class RuleElement {
        String rule = null;
        CodeSection code = null;

        public RuleElement(CodeSection code) {
            this.code = code;
        }

        public RuleElement(String rule) {
            this.rule = rule;
        }

        public boolean isRule() {
            return rule != null;
        }

        @Override
        public String toString() {
            return isRule() ? rule : code.toString();
        }
    }

    final String name;
    final List<List<RuleElement>> ruleElements;
    final List<List<String>> rules;

    public ParserRule(String name) {
        this.name = name;
        this.ruleElements = new ArrayList<List<RuleElement>>();
        this.rules = new ArrayList<List<String>>();
    }

    public void addVariant(List<RuleElement> rule) {
        ruleElements.add(rule);
        List<String> filteredRules = new ArrayList<String>();
        for (RuleElement ruleElement : rule) {
            if (ruleElement.isRule()) {
                filteredRules.add(ruleElement.rule);
            }
        }
        rules.add(filteredRules);
    }


    @Override
    public String toString() {
        final StringBuilder ans = new StringBuilder(name + " => ");
        for (List<RuleElement> rule : ruleElements) {
            if (rule.isEmpty()) {
                ans.append("EMPTY");
            } else {
                final int size = rule.size();
                for (int j = 0; j < size; j++) {
                    ans.append(rule.get(j));
                    if (j != size - 1) ans.append(" ");
                }

            }
            ans.append(" | ");
        }
        return ans.toString();
    }
}
