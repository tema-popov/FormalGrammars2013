// Generated from MetaGrammar.g4 by ANTLR 4.0

    import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MetaGrammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NODE_RULES_PART=1, LEXER_RULES_PART=2, GRAMMAR_RULES_PART=3, CODE=4, EQUALS=5, 
		OPEN_BRACKETS=6, CLOSE_BRACKETS=7, SEMI=8, OR=9, ARROW=10, EPSILON=11, 
		NODE=12, WS=13, STRING_LITERAL=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'NODE'", "'LEXER'", "'GRAMMAR'", "CODE", "'='", "'['", "']'", "';'", 
		"'|'", "':'", "'EPS'", "NODE", "WS", "STRING_LITERAL"
	};
	public static final String[] ruleNames = {
		"NODE_RULES_PART", "LEXER_RULES_PART", "GRAMMAR_RULES_PART", "OPEN_CODE", 
		"CLOSE_CODE", "CODE", "EQUALS", "OPEN_BRACKETS", "CLOSE_BRACKETS", "SEMI", 
		"OR", "ARROW", "EPSILON", "NODE", "QUOTE", "WS", "STRING_LITERAL"
	};


	    final List<LexerRule> lexerRules = new ArrayList<LexerRule>();
	    final List<ParserRule> parserRules = new ArrayList<ParserRule>();
	    final List<ParserRule.RuleElement> currentVariant = new ArrayList<ParserRule.RuleElement>();
	    CodeSection fields;
	    String mainRule;



	public MetaGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MetaGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 15: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = HIDDEN;  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\20q\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\7\7A\n\7\f"+
		"\7\16\7D\13\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\17\3\17\7\17Z\n\17\f\17\16\17]\13\17\3\20\3\20"+
		"\3\21\6\21b\n\21\r\21\16\21c\3\21\3\21\3\22\3\22\3\22\3\22\6\22l\n\22"+
		"\r\22\16\22m\3\22\3\22\3B\23\3\3\1\5\4\1\7\5\1\t\2\1\13\2\1\r\6\1\17\7"+
		"\1\21\b\1\23\t\1\25\n\1\27\13\1\31\f\1\33\r\1\35\16\1\37\2\1!\17\2#\20"+
		"\1\3\2\6\4C\\c|\7))\62;C\\aac|\5\13\f\17\17\"\"\3))r\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5*\3\2\2\2\7\60\3\2\2\2\t8\3\2\2\2\13;\3"+
		"\2\2\2\r>\3\2\2\2\17G\3\2\2\2\21I\3\2\2\2\23K\3\2\2\2\25M\3\2\2\2\27O"+
		"\3\2\2\2\31Q\3\2\2\2\33S\3\2\2\2\35W\3\2\2\2\37^\3\2\2\2!a\3\2\2\2#g\3"+
		"\2\2\2%&\7P\2\2&\'\7Q\2\2\'(\7F\2\2()\7G\2\2)\4\3\2\2\2*+\7N\2\2+,\7G"+
		"\2\2,-\7Z\2\2-.\7G\2\2./\7T\2\2/\6\3\2\2\2\60\61\7I\2\2\61\62\7T\2\2\62"+
		"\63\7C\2\2\63\64\7O\2\2\64\65\7O\2\2\65\66\7C\2\2\66\67\7T\2\2\67\b\3"+
		"\2\2\289\7}\2\29:\7\'\2\2:\n\3\2\2\2;<\7\'\2\2<=\7\177\2\2=\f\3\2\2\2"+
		">B\5\t\5\2?A\13\2\2\2@?\3\2\2\2AD\3\2\2\2BC\3\2\2\2B@\3\2\2\2CE\3\2\2"+
		"\2DB\3\2\2\2EF\5\13\6\2F\16\3\2\2\2GH\7?\2\2H\20\3\2\2\2IJ\7]\2\2J\22"+
		"\3\2\2\2KL\7_\2\2L\24\3\2\2\2MN\7=\2\2N\26\3\2\2\2OP\7~\2\2P\30\3\2\2"+
		"\2QR\7<\2\2R\32\3\2\2\2ST\7G\2\2TU\7R\2\2UV\7U\2\2V\34\3\2\2\2W[\t\2\2"+
		"\2XZ\t\3\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\36\3\2\2\2][\3"+
		"\2\2\2^_\7)\2\2_ \3\2\2\2`b\t\4\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3"+
		"\2\2\2de\3\2\2\2ef\b\21\2\2f\"\3\2\2\2gk\5\37\20\2hi\7^\2\2il\7)\2\2j"+
		"l\n\5\2\2kh\3\2\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2"+
		"op\5\37\20\2p$\3\2\2\2\b\2B[ckm";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}