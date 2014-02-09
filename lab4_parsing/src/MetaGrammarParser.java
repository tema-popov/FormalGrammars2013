// Generated from MetaGrammar.g4 by ANTLR 4.0

    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MetaGrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NODE_RULES_PART=1, LEXER_RULES_PART=2, GRAMMAR_RULES_PART=3, CODE=4, EQUALS=5, 
		OPEN_BRACKETS=6, CLOSE_BRACKETS=7, SEMI=8, OR=9, ARROW=10, EPSILON=11, 
		NODE=12, WS=13, STRING_LITERAL=14;
	public static final String[] tokenNames = {
		"<INVALID>", "'NODE'", "'LEXER'", "'GRAMMAR'", "CODE", "'='", "'['", "']'", 
		"';'", "'|'", "':'", "'EPS'", "NODE", "WS", "STRING_LITERAL"
	};
	public static final int
		RULE_fullGrammar = 0, RULE_node_section = 1, RULE_main_rule = 2, RULE_lexerRules = 3, 
		RULE_lexerRule = 4, RULE_grammarRules = 5, RULE_grammarRule = 6, RULE_code = 7, 
		RULE_singleRule = 8, RULE_string = 9;
	public static final String[] ruleNames = {
		"fullGrammar", "node_section", "main_rule", "lexerRules", "lexerRule", 
		"grammarRules", "grammarRule", "code", "singleRule", "string"
	};

	@Override
	public String getGrammarFileName() { return "MetaGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	    final List<LexerRule> lexerRules = new ArrayList<LexerRule>();
	    final List<ParserRule> parserRules = new ArrayList<ParserRule>();
	    final List<ParserRule.RuleElement> currentVariant = new ArrayList<ParserRule.RuleElement>();
	    CodeSection fields;
	    String mainRule;


	public MetaGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FullGrammarContext extends ParserRuleContext {
		public Node_sectionContext node_section() {
			return getRuleContext(Node_sectionContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(MetaGrammarParser.EQUALS, 0); }
		public TerminalNode CLOSE_BRACKETS(int i) {
			return getToken(MetaGrammarParser.CLOSE_BRACKETS, i);
		}
		public TerminalNode LEXER_RULES_PART() { return getToken(MetaGrammarParser.LEXER_RULES_PART, 0); }
		public List<TerminalNode> OPEN_BRACKETS() { return getTokens(MetaGrammarParser.OPEN_BRACKETS); }
		public GrammarRulesContext grammarRules() {
			return getRuleContext(GrammarRulesContext.class,0);
		}
		public LexerRulesContext lexerRules() {
			return getRuleContext(LexerRulesContext.class,0);
		}
		public List<TerminalNode> CLOSE_BRACKETS() { return getTokens(MetaGrammarParser.CLOSE_BRACKETS); }
		public Main_ruleContext main_rule() {
			return getRuleContext(Main_ruleContext.class,0);
		}
		public TerminalNode GRAMMAR_RULES_PART() { return getToken(MetaGrammarParser.GRAMMAR_RULES_PART, 0); }
		public TerminalNode OPEN_BRACKETS(int i) {
			return getToken(MetaGrammarParser.OPEN_BRACKETS, i);
		}
		public FullGrammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullGrammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterFullGrammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitFullGrammar(this);
		}
	}

	public final FullGrammarContext fullGrammar() throws RecognitionException {
		FullGrammarContext _localctx = new FullGrammarContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fullGrammar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(20); node_section();
				}
				break;
			}
			setState(23); match(OPEN_BRACKETS);
			setState(24); match(LEXER_RULES_PART);
			setState(25); match(CLOSE_BRACKETS);
			setState(26); lexerRules();
			setState(27); match(OPEN_BRACKETS);
			setState(28); match(GRAMMAR_RULES_PART);
			setState(29); match(EQUALS);
			setState(30); main_rule();
			setState(31); match(CLOSE_BRACKETS);
			setState(32); grammarRules();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Node_sectionContext extends ParserRuleContext {
		public Token CODE;
		public TerminalNode NODE_RULES_PART() { return getToken(MetaGrammarParser.NODE_RULES_PART, 0); }
		public TerminalNode OPEN_BRACKETS() { return getToken(MetaGrammarParser.OPEN_BRACKETS, 0); }
		public TerminalNode CLOSE_BRACKETS() { return getToken(MetaGrammarParser.CLOSE_BRACKETS, 0); }
		public TerminalNode CODE() { return getToken(MetaGrammarParser.CODE, 0); }
		public Node_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterNode_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitNode_section(this);
		}
	}

	public final Node_sectionContext node_section() throws RecognitionException {
		Node_sectionContext _localctx = new Node_sectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_node_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(34); match(OPEN_BRACKETS);
			setState(35); match(NODE_RULES_PART);
			setState(36); match(CLOSE_BRACKETS);
			setState(37); ((Node_sectionContext)_localctx).CODE = match(CODE);
			fields = new CodeSection((((Node_sectionContext)_localctx).CODE!=null?((Node_sectionContext)_localctx).CODE.getText():null));
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_ruleContext extends ParserRuleContext {
		public Token NODE;
		public TerminalNode NODE() { return getToken(MetaGrammarParser.NODE, 0); }
		public Main_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterMain_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitMain_rule(this);
		}
	}

	public final Main_ruleContext main_rule() throws RecognitionException {
		Main_ruleContext _localctx = new Main_ruleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); ((Main_ruleContext)_localctx).NODE = match(NODE);

			                    mainRule = (((Main_ruleContext)_localctx).NODE!=null?((Main_ruleContext)_localctx).NODE.getText():null);
			                    final ParserRule parserRule = new ParserRule("MAIN");
			                    parserRule.addVariant(Arrays.asList(new ParserRule.RuleElement((((Main_ruleContext)_localctx).NODE!=null?((Main_ruleContext)_localctx).NODE.getText():null)), new ParserRule.RuleElement("END")));
			                    parserRules.add(parserRule);
			               
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerRulesContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(MetaGrammarParser.SEMI); }
		public List<LexerRuleContext> lexerRule() {
			return getRuleContexts(LexerRuleContext.class);
		}
		public TerminalNode SEMI(int i) {
			return getToken(MetaGrammarParser.SEMI, i);
		}
		public LexerRuleContext lexerRule(int i) {
			return getRuleContext(LexerRuleContext.class,i);
		}
		public LexerRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterLexerRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitLexerRules(this);
		}
	}

	public final LexerRulesContext lexerRules() throws RecognitionException {
		LexerRulesContext _localctx = new LexerRulesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lexerRules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NODE) {
				{
				{
				setState(43); lexerRule();
				setState(44); match(SEMI);
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerRuleContext extends ParserRuleContext {
		public Token NODE;
		public StringContext string;
		public TerminalNode ARROW() { return getToken(MetaGrammarParser.ARROW, 0); }
		public TerminalNode NODE() { return getToken(MetaGrammarParser.NODE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public LexerRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterLexerRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitLexerRule(this);
		}
	}

	public final LexerRuleContext lexerRule() throws RecognitionException {
		LexerRuleContext _localctx = new LexerRuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lexerRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); ((LexerRuleContext)_localctx).NODE = match(NODE);
			setState(52); match(ARROW);
			setState(53); ((LexerRuleContext)_localctx).string = string();
			lexerRules.add(new LexerRule((((LexerRuleContext)_localctx).NODE!=null?((LexerRuleContext)_localctx).NODE.getText():null), (((LexerRuleContext)_localctx).string!=null?_input.getText(((LexerRuleContext)_localctx).string.start,((LexerRuleContext)_localctx).string.stop):null)));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarRulesContext extends ParserRuleContext {
		public List<GrammarRuleContext> grammarRule() {
			return getRuleContexts(GrammarRuleContext.class);
		}
		public List<TerminalNode> SEMI() { return getTokens(MetaGrammarParser.SEMI); }
		public GrammarRuleContext grammarRule(int i) {
			return getRuleContext(GrammarRuleContext.class,i);
		}
		public TerminalNode SEMI(int i) {
			return getToken(MetaGrammarParser.SEMI, i);
		}
		public GrammarRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterGrammarRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitGrammarRules(this);
		}
	}

	public final GrammarRulesContext grammarRules() throws RecognitionException {
		GrammarRulesContext _localctx = new GrammarRulesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_grammarRules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NODE) {
				{
				{
				setState(56); grammarRule();
				setState(57); match(SEMI);
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarRuleContext extends ParserRuleContext {
		public Token NODE;
		public SingleRuleContext singleRule(int i) {
			return getRuleContext(SingleRuleContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(MetaGrammarParser.ARROW, 0); }
		public TerminalNode NODE() { return getToken(MetaGrammarParser.NODE, 0); }
		public TerminalNode OR(int i) {
			return getToken(MetaGrammarParser.OR, i);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public List<SingleRuleContext> singleRule() {
			return getRuleContexts(SingleRuleContext.class);
		}
		public List<TerminalNode> OR() { return getTokens(MetaGrammarParser.OR); }
		public GrammarRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterGrammarRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitGrammarRule(this);
		}
	}

	public final GrammarRuleContext grammarRule() throws RecognitionException {
		GrammarRuleContext _localctx = new GrammarRuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_grammarRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); ((GrammarRuleContext)_localctx).NODE = match(NODE);

			                final ParserRule parserRule = new ParserRule((((GrammarRuleContext)_localctx).NODE!=null?((GrammarRuleContext)_localctx).NODE.getText():null));
			               
			setState(67);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(66); match(ARROW);
				}
			}

			setState(70);
			_la = _input.LA(1);
			if (_la==CODE) {
				{
				setState(69); code();
				}
			}

			setState(72); singleRule();
			setState(74);
			_la = _input.LA(1);
			if (_la==CODE) {
				{
				setState(73); code();
				}
			}


			                parserRule.addVariant(new ArrayList<ParserRule.RuleElement>(currentVariant));
			                currentVariant.clear();
			               
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(77); match(OR);
				setState(79);
				_la = _input.LA(1);
				if (_la==CODE) {
					{
					setState(78); code();
					}
				}

				setState(81); singleRule();
				setState(83);
				_la = _input.LA(1);
				if (_la==CODE) {
					{
					setState(82); code();
					}
				}


				                parserRule.addVariant(new ArrayList<ParserRule.RuleElement>(currentVariant));
				                currentVariant.clear();
				               
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			parserRules.add(parserRule);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeContext extends ParserRuleContext {
		public Token CODE;
		public TerminalNode CODE() { return getToken(MetaGrammarParser.CODE, 0); }
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); ((CodeContext)_localctx).CODE = match(CODE);
			System.out.println("CODE! " + (((CodeContext)_localctx).CODE!=null?((CodeContext)_localctx).CODE.getText():null)); currentVariant.add(new ParserRule.RuleElement(new CodeSection((((CodeContext)_localctx).CODE!=null?((CodeContext)_localctx).CODE.getText():null))));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleRuleContext extends ParserRuleContext {
		public Token NODE;
		public Token EPSILON;
		public TerminalNode NODE() { return getToken(MetaGrammarParser.NODE, 0); }
		public TerminalNode EPSILON() { return getToken(MetaGrammarParser.EPSILON, 0); }
		public SingleRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterSingleRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitSingleRule(this);
		}
	}

	public final SingleRuleContext singleRule() throws RecognitionException {
		SingleRuleContext _localctx = new SingleRuleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_singleRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			switch (_input.LA(1)) {
			case NODE:
				{
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(97); ((SingleRuleContext)_localctx).NODE = match(NODE);
					currentVariant.add(new ParserRule.RuleElement((((SingleRuleContext)_localctx).NODE!=null?((SingleRuleContext)_localctx).NODE.getText():null)));
					}
					}
					setState(101); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NODE );
				}
				break;
			case EPSILON:
				{
				setState(103); ((SingleRuleContext)_localctx).EPSILON = match(EPSILON);
				currentVariant.add(new ParserRule.RuleElement((((SingleRuleContext)_localctx).EPSILON!=null?((SingleRuleContext)_localctx).EPSILON.getText():null)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(MetaGrammarParser.STRING_LITERAL, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\2\3\20p\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\4\13\t\13\3\2\5\2\30\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\7\5\61\n\5"+
		"\f\5\16\5\64\13\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7>\n\7\f\7\16\7A\13"+
		"\7\3\b\3\b\3\b\5\bF\n\b\3\b\5\bI\n\b\3\b\3\b\5\bM\n\b\3\b\3\b\3\b\5\b"+
		"R\n\b\3\b\3\b\5\bV\n\b\3\b\3\b\7\bZ\n\b\f\b\16\b]\13\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\6\nf\n\n\r\n\16\ng\3\n\3\n\5\nl\n\n\3\13\3\13\3\13\2\f\2"+
		"\4\6\b\n\f\16\20\22\24\2\2p\2\27\3\2\2\2\4$\3\2\2\2\6*\3\2\2\2\b\62\3"+
		"\2\2\2\n\65\3\2\2\2\f?\3\2\2\2\16B\3\2\2\2\20`\3\2\2\2\22k\3\2\2\2\24"+
		"m\3\2\2\2\26\30\5\4\3\2\27\26\3\2\2\2\27\30\3\2\2\2\30\31\3\2\2\2\31\32"+
		"\7\b\2\2\32\33\7\4\2\2\33\34\7\t\2\2\34\35\5\b\5\2\35\36\7\b\2\2\36\37"+
		"\7\5\2\2\37 \7\7\2\2 !\5\6\4\2!\"\7\t\2\2\"#\5\f\7\2#\3\3\2\2\2$%\7\b"+
		"\2\2%&\7\3\2\2&\'\7\t\2\2\'(\7\6\2\2()\b\3\1\2)\5\3\2\2\2*+\7\16\2\2+"+
		",\b\4\1\2,\7\3\2\2\2-.\5\n\6\2./\7\n\2\2/\61\3\2\2\2\60-\3\2\2\2\61\64"+
		"\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\t\3\2\2\2\64\62\3\2\2\2\65\66"+
		"\7\16\2\2\66\67\7\f\2\2\678\5\24\13\289\b\6\1\29\13\3\2\2\2:;\5\16\b\2"+
		";<\7\n\2\2<>\3\2\2\2=:\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\r\3\2\2"+
		"\2A?\3\2\2\2BC\7\16\2\2CE\b\b\1\2DF\7\f\2\2ED\3\2\2\2EF\3\2\2\2FH\3\2"+
		"\2\2GI\5\20\t\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JL\5\22\n\2KM\5\20\t\2LK"+
		"\3\2\2\2LM\3\2\2\2MN\3\2\2\2N[\b\b\1\2OQ\7\13\2\2PR\5\20\t\2QP\3\2\2\2"+
		"QR\3\2\2\2RS\3\2\2\2SU\5\22\n\2TV\5\20\t\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2"+
		"\2WX\b\b\1\2XZ\3\2\2\2YO\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2"+
		"\2\2][\3\2\2\2^_\b\b\1\2_\17\3\2\2\2`a\7\6\2\2ab\b\t\1\2b\21\3\2\2\2c"+
		"d\7\16\2\2df\b\n\1\2ec\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hl\3\2\2\2"+
		"ij\7\r\2\2jl\b\n\1\2ke\3\2\2\2ki\3\2\2\2l\23\3\2\2\2mn\7\20\2\2n\25\3"+
		"\2\2\2\r\27\62?EHLQU[gk";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}