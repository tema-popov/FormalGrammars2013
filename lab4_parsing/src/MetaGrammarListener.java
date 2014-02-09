// Generated from MetaGrammar.g4 by ANTLR 4.0

    import java.util.*;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface MetaGrammarListener extends ParseTreeListener {
	void enterNode_section(MetaGrammarParser.Node_sectionContext ctx);
	void exitNode_section(MetaGrammarParser.Node_sectionContext ctx);

	void enterGrammarRule(MetaGrammarParser.GrammarRuleContext ctx);
	void exitGrammarRule(MetaGrammarParser.GrammarRuleContext ctx);

	void enterString(MetaGrammarParser.StringContext ctx);
	void exitString(MetaGrammarParser.StringContext ctx);

	void enterFullGrammar(MetaGrammarParser.FullGrammarContext ctx);
	void exitFullGrammar(MetaGrammarParser.FullGrammarContext ctx);

	void enterGrammarRules(MetaGrammarParser.GrammarRulesContext ctx);
	void exitGrammarRules(MetaGrammarParser.GrammarRulesContext ctx);

	void enterLexerRules(MetaGrammarParser.LexerRulesContext ctx);
	void exitLexerRules(MetaGrammarParser.LexerRulesContext ctx);

	void enterLexerRule(MetaGrammarParser.LexerRuleContext ctx);
	void exitLexerRule(MetaGrammarParser.LexerRuleContext ctx);

	void enterSingleRule(MetaGrammarParser.SingleRuleContext ctx);
	void exitSingleRule(MetaGrammarParser.SingleRuleContext ctx);

	void enterCode(MetaGrammarParser.CodeContext ctx);
	void exitCode(MetaGrammarParser.CodeContext ctx);

	void enterMain_rule(MetaGrammarParser.Main_ruleContext ctx);
	void exitMain_rule(MetaGrammarParser.Main_ruleContext ctx);
}