// Generated from pascalGrammar.g4 by ANTLR 4.0

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
public class pascalGrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, READ=2, READLN=3, WRITELN=4, WRITE=5, AND=6, ARRAY=7, BEGIN=8, 
		BOOLEAN=9, CASE=10, CHAR=11, CHR=12, EXIT=13, CONST=14, DIV=15, DO=16, 
		DOWNTO=17, ELSE=18, END=19, FILE=20, FOR=21, FORWARD=22, FUNCTION=23, 
		GOTO=24, IF=25, IN=26, INTEGER=27, LABEL=28, MOD=29, NIL=30, NOT=31, OF=32, 
		OR=33, PACKED=34, PROCEDURE=35, PROGRAM=36, REAL=37, RECORD=38, REPEAT=39, 
		SET=40, THEN=41, TO=42, TYPE=43, UNTIL=44, VAR=45, WHILE=46, WITH=47, 
		UNIT=48, INTERFACE=49, USES=50, STRING=51, IMPLEMENTATION=52, PLUS=53, 
		MINUS=54, STAR=55, SLASH=56, ASSIGN=57, COMMA=58, SEMI=59, COLON=60, EQUAL=61, 
		NOT_EQUAL=62, LT=63, LE=64, GE=65, GT=66, LPAREN=67, RPAREN=68, LBRACK=69, 
		LBRACK2=70, RBRACK=71, RBRACK2=72, POINTER=73, AT=74, DOT=75, DOTDOT=76, 
		LCURLY=77, RCURLY=78, IDENT=79, QUOTE=80, NUM_INT=81, WS=82;
	public static final String[] tokenNames = {
		"<INVALID>", "''''", "'read'", "'readln'", "'writeln'", "'write'", "'and'", 
		"'array'", "'begin'", "'boolean'", "'case'", "'char'", "'chr'", "'exit'", 
		"'const'", "'div'", "'do'", "'downto'", "'else'", "'end'", "'file'", "'for'", 
		"'forward'", "'function'", "'goto'", "'if'", "'in'", "'integer'", "'label'", 
		"'mod'", "'nil'", "'not'", "'of'", "'or'", "'packed'", "'procedure'", 
		"'program'", "'real'", "'record'", "'repeat'", "'set'", "'then'", "'to'", 
		"'type'", "'until'", "'var'", "'while'", "'with'", "'unit'", "'interface'", 
		"'uses'", "'string'", "'implementation'", "'+'", "'-'", "'*'", "'/'", 
		"':='", "','", "';'", "':'", "'='", "'<>'", "'<'", "'<='", "'>='", "'>'", 
		"'('", "')'", "'['", "'(.'", "']'", "'.)'", "'^'", "'@'", "'.'", "'..'", 
		"'{'", "'}'", "IDENT", "'''", "NUM_INT", "WS"
	};
	public static final int
		RULE_allProgram = 0, RULE_programId = 1, RULE_variables = 2, RULE_variable = 3, 
		RULE_varNames = 4, RULE_varName = 5, RULE_varType = 6, RULE_programName = 7, 
		RULE_programBody = 8, RULE_statements = 9, RULE_statement = 10, RULE_singleStatement = 11, 
		RULE_readStatement = 12, RULE_writeStatement = 13, RULE_compoundStatement = 14, 
		RULE_whileStatement = 15, RULE_ifStatement = 16, RULE_assignStatement = 17, 
		RULE_emptyStatement = 18, RULE_expression = 19, RULE_cmp = 20, RULE_simpleExpression = 21, 
		RULE_term = 22, RULE_signedFactor = 23, RULE_sign = 24, RULE_factor = 25, 
		RULE_unsignedConstant = 26, RULE_stringLiteral = 27, RULE_string = 28;
	public static final String[] ruleNames = {
		"allProgram", "programId", "variables", "variable", "varNames", "varName", 
		"varType", "programName", "programBody", "statements", "statement", "singleStatement", 
		"readStatement", "writeStatement", "compoundStatement", "whileStatement", 
		"ifStatement", "assignStatement", "emptyStatement", "expression", "cmp", 
		"simpleExpression", "term", "signedFactor", "sign", "factor", "unsignedConstant", 
		"stringLiteral", "string"
	};

	@Override
	public String getGrammarFileName() { return "pascalGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	    int currentOffset = 1;
	    public StringBuilder code = new StringBuilder("#include <stdio.h>\nint main() {\n");
	    private String currentVarNames, currentVarType;
	    private Map<String, String> types = new HashMap<String, String>();
	    boolean ln = false;
	    boolean inWrite = false;
	    List<String> writeIds = new ArrayList<String>(); 
	    private void append(String s) {
	        code.append(s);
	    }                  
	    private void offset(){
	        for (int i = 0; i < currentOffset; i++) {
	            code.append("\t");                                        
	        }
	    }
	    private void addVars(String currentVarNames, String currentVarType){
	        currentVarNames = currentVarNames.replaceAll(" ", "");
	        for (String s: currentVarNames.split(",")) {                                                                   
	            if (currentVarType.equals("int"))
	                types.put(s, "%d");
	            if (currentVarType.equals("char*"))
	                types.put(s, "%s");
	        }                                                                
	    }
	    
	    public String join(List<String> list, String conjunction)
	    {
	        StringBuilder sb = new StringBuilder();
	        boolean first = true;
	        for (String item : list)
	        {
	        if (first)
	            first = false;
	        else
	            sb.append(conjunction);
	        sb.append(item);
	        }
	        return sb.toString();
	    }

	public pascalGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AllProgramContext extends ParserRuleContext {
		public ProgramIdContext programId() {
			return getRuleContext(ProgramIdContext.class,0);
		}
		public ProgramBodyContext programBody() {
			return getRuleContext(ProgramBodyContext.class,0);
		}
		public TerminalNode DOT() { return getToken(pascalGrammarParser.DOT, 0); }
		public TerminalNode END() { return getToken(pascalGrammarParser.END, 0); }
		public TerminalNode BEGIN() { return getToken(pascalGrammarParser.BEGIN, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public AllProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allProgram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterAllProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitAllProgram(this);
		}
	}

	public final AllProgramContext allProgram() throws RecognitionException {
		AllProgramContext _localctx = new AllProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_allProgram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if (_la==PROGRAM) {
				{
				setState(58); programId();
				}
			}

			setState(62);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(61); variables();
				}
			}

			setState(64); match(BEGIN);
			setState(65); programBody();
			setState(66); match(END);
			setState(67); match(DOT);
			offset(); append("return 0;\n}");
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

	public static class ProgramIdContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(pascalGrammarParser.PROGRAM, 0); }
		public TerminalNode SEMI() { return getToken(pascalGrammarParser.SEMI, 0); }
		public ProgramNameContext programName() {
			return getRuleContext(ProgramNameContext.class,0);
		}
		public ProgramIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterProgramId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitProgramId(this);
		}
	}

	public final ProgramIdContext programId() throws RecognitionException {
		ProgramIdContext _localctx = new ProgramIdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(PROGRAM);
			setState(71); programName();
			setState(72); match(SEMI);
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

	public static class VariablesContext extends ParserRuleContext {
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode VAR() { return getToken(pascalGrammarParser.VAR, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitVariables(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(VAR);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(75); variable();
				}
				}
				setState(80);
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

	public static class VariableContext extends ParserRuleContext {
		public VarNamesContext varNames;
		public TerminalNode COLON() { return getToken(pascalGrammarParser.COLON, 0); }
		public VarNamesContext varNames() {
			return getRuleContext(VarNamesContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pascalGrammarParser.SEMI, 0); }
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); ((VariableContext)_localctx).varNames = varNames();
			currentVarNames = (((VariableContext)_localctx).varNames!=null?_input.getText(((VariableContext)_localctx).varNames.start,((VariableContext)_localctx).varNames.stop):null);
			setState(83); match(COLON);
			setState(84); varType();

			                offset();
			                addVars(currentVarNames, currentVarType);
			                append(currentVarType + " " + currentVarNames + ";\n");
			           
			setState(86); match(SEMI);
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

	public static class VarNamesContext extends ParserRuleContext {
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(pascalGrammarParser.COMMA, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascalGrammarParser.COMMA); }
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public VarNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterVarNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitVarNames(this);
		}
	}

	public final VarNamesContext varNames() throws RecognitionException {
		VarNamesContext _localctx = new VarNamesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); varName();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(89); match(COMMA);
				setState(90); varName();
				}
				}
				setState(95);
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

	public static class VarNameContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(pascalGrammarParser.IDENT, 0); }
		public VarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterVarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitVarName(this);
		}
	}

	public final VarNameContext varName() throws RecognitionException {
		VarNameContext _localctx = new VarNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); match(IDENT);
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

	public static class VarTypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(pascalGrammarParser.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(pascalGrammarParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(pascalGrammarParser.STRING, 0); }
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitVarType(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varType);
		try {
			setState(104);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); match(BOOLEAN);
				currentVarType = "bool";
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(100); match(INTEGER);
				currentVarType = "int";
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(102); match(STRING);
				currentVarType = "char*";
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ProgramNameContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(pascalGrammarParser.IDENT, 0); }
		public ProgramNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterProgramName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitProgramName(this);
		}
	}

	public final ProgramNameContext programName() throws RecognitionException {
		ProgramNameContext _localctx = new ProgramNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_programName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(IDENT);
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

	public static class ProgramBodyContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ProgramBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterProgramBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitProgramBody(this);
		}
	}

	public final ProgramBodyContext programBody() throws RecognitionException {
		ProgramBodyContext _localctx = new ProgramBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_programBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); statements();
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascalGrammarParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalGrammarParser.SEMI, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); statement();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(111); match(SEMI);
				setState(112); statement();
				}
				}
				setState(117);
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

	public static class StatementContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				offset();
				setState(119); singleStatement();
				append(";\n");
				}
				break;

			case 2:
				{
				setState(122); emptyStatement();
				}
				break;

			case 3:
				{
				offset();
				setState(124); ifStatement();
				}
				break;

			case 4:
				{
				offset();
				setState(126); whileStatement();
				}
				break;

			case 5:
				{
				offset();
				setState(128); compoundStatement();
				}
				break;

			case 6:
				{
				}
				break;
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

	public static class SingleStatementContext extends ParserRuleContext {
		public ReadStatementContext readStatement() {
			return getRuleContext(ReadStatementContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public WriteStatementContext writeStatement() {
			return getRuleContext(WriteStatementContext.class,0);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitSingleStatement(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_singleStatement);
		try {
			setState(135);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(132); assignStatement();
				}
				break;
			case READ:
			case READLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(133); readStatement();
				}
				break;
			case WRITELN:
			case WRITE:
				enterOuterAlt(_localctx, 3);
				{
				setState(134); writeStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ReadStatementContext extends ParserRuleContext {
		public Token IDENT;
		public TerminalNode RPAREN() { return getToken(pascalGrammarParser.RPAREN, 0); }
		public List<TerminalNode> IDENT() { return getTokens(pascalGrammarParser.IDENT); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalGrammarParser.COMMA, i);
		}
		public TerminalNode IDENT(int i) {
			return getToken(pascalGrammarParser.IDENT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascalGrammarParser.COMMA); }
		public TerminalNode READ() { return getToken(pascalGrammarParser.READ, 0); }
		public TerminalNode LPAREN() { return getToken(pascalGrammarParser.LPAREN, 0); }
		public TerminalNode READLN() { return getToken(pascalGrammarParser.READLN, 0); }
		public ReadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterReadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitReadStatement(this);
		}
	}

	public final ReadStatementContext readStatement() throws RecognitionException {
		ReadStatementContext _localctx = new ReadStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_readStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			switch (_input.LA(1)) {
			case READ:
				{
				setState(137); match(READ);
				ln = false;
				}
				break;
			case READLN:
				{
				setState(139); match(READLN);
				ln = true;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(143); match(LPAREN);

			                 append("scanf(\""); 
			setState(145); ((ReadStatementContext)_localctx).IDENT = match(IDENT);
			append(types.get((((ReadStatementContext)_localctx).IDENT!=null?((ReadStatementContext)_localctx).IDENT.getText():null)));
			                 writeIds.add("&" + (((ReadStatementContext)_localctx).IDENT!=null?((ReadStatementContext)_localctx).IDENT.getText():null));
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(147); match(COMMA);
				setState(148); ((ReadStatementContext)_localctx).IDENT = match(IDENT);
				append(" " + types.get((((ReadStatementContext)_localctx).IDENT!=null?((ReadStatementContext)_localctx).IDENT.getText():null)));
				                           writeIds.add("&" + (((ReadStatementContext)_localctx).IDENT!=null?((ReadStatementContext)_localctx).IDENT.getText():null));
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155); match(RPAREN);
			if (ln)
			                      append("\"\\n\"");
			                  if (!writeIds.isEmpty())
			                      append("\", ");
			                  append(join(writeIds, ", "));
			                  writeIds.clear();
			                  append(")");
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

	public static class WriteStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pascalGrammarParser.RPAREN, 0); }
		public TerminalNode WRITELN() { return getToken(pascalGrammarParser.WRITELN, 0); }
		public TerminalNode WRITE() { return getToken(pascalGrammarParser.WRITE, 0); }
		public TerminalNode LPAREN() { return getToken(pascalGrammarParser.LPAREN, 0); }
		public WriteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterWriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitWriteStatement(this);
		}
	}

	public final WriteStatementContext writeStatement() throws RecognitionException {
		WriteStatementContext _localctx = new WriteStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_writeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			switch (_input.LA(1)) {
			case WRITE:
				{
				setState(158); match(WRITE);
				ln = false;
				}
				break;
			case WRITELN:
				{
				setState(160); match(WRITELN);
				ln = true;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(164); match(LPAREN);
			 inWrite = true;
			                          append("printf("); 
			setState(169);
			_la = _input.LA(1);
			if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (NOT - 31)) | (1L << (PLUS - 31)) | (1L << (MINUS - 31)) | (1L << (LPAREN - 31)) | (1L << (IDENT - 31)) | (1L << (QUOTE - 31)) | (1L << (NUM_INT - 31)))) != 0)) {
				{
				setState(166); expression();
				if (ln) append(" + ");
				}
			}

			setState(171); match(RPAREN);
			if (ln) append("\"\\n\"");
			                          if (!writeIds.isEmpty()) append(", ");
			                          append(join(writeIds, ", "));
			                          writeIds.clear();
			                          inWrite = false; append(")");
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(pascalGrammarParser.END, 0); }
		public TerminalNode BEGIN() { return getToken(pascalGrammarParser.BEGIN, 0); }
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitCompoundStatement(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174); match(BEGIN);
			append("{\n"); currentOffset++;
			setState(176); statements();
			setState(177); match(END);

			           currentOffset--;
			           offset();
			           append("}\n");
			       
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

	public static class WhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(pascalGrammarParser.DO, 0); }
		public TerminalNode WHILE() { return getToken(pascalGrammarParser.WHILE, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); match(WHILE);
			append("while (");
			setState(182); expression();
			append(") \n"); 
			setState(184); match(DO);
			setState(185); statement();
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

	public static class IfStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode THEN() { return getToken(pascalGrammarParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(pascalGrammarParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(pascalGrammarParser.IF, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); match(IF);
			append("if (");
			setState(189); expression();
			setState(190); match(THEN);
			append(")\n");
			setState(192); statement();
			setState(196);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(193); match(ELSE);
				offset(); append("else\n");
				setState(195); statement();
				}
				break;
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

	public static class AssignStatementContext extends ParserRuleContext {
		public Token IDENT;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(pascalGrammarParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(pascalGrammarParser.ASSIGN, 0); }
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitAssignStatement(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198); ((AssignStatementContext)_localctx).IDENT = match(IDENT);
			setState(199); match(ASSIGN);
			append((((AssignStatementContext)_localctx).IDENT!=null?((AssignStatementContext)_localctx).IDENT.getText():null) + " = ");
			setState(201); expression();
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class ExpressionContext extends ParserRuleContext {
		public CmpContext cmp;
		public CmpContext cmp(int i) {
			return getRuleContext(CmpContext.class,i);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public List<CmpContext> cmp() {
			return getRuleContexts(CmpContext.class);
		}
		public List<TerminalNode> NOT_EQUAL() { return getTokens(pascalGrammarParser.NOT_EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(pascalGrammarParser.EQUAL, i);
		}
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public TerminalNode NOT_EQUAL(int i) {
			return getToken(pascalGrammarParser.NOT_EQUAL, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(pascalGrammarParser.EQUAL); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); simpleExpression();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (EQUAL - 61)) | (1L << (NOT_EQUAL - 61)) | (1L << (LT - 61)) | (1L << (LE - 61)) | (1L << (GE - 61)) | (1L << (GT - 61)))) != 0)) {
				{
				{
				setState(213);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(206); match(EQUAL);
					append(" == ");
					}
					break;
				case NOT_EQUAL:
					{
					setState(208); match(NOT_EQUAL);
					append(" != ");
					}
					break;
				case LT:
				case LE:
				case GE:
				case GT:
					{
					setState(210); ((ExpressionContext)_localctx).cmp = cmp();
					append(" " + (((ExpressionContext)_localctx).cmp!=null?_input.getText(((ExpressionContext)_localctx).cmp.start,((ExpressionContext)_localctx).cmp.stop):null) + " ");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(215); simpleExpression();
				}
				}
				setState(220);
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

	public static class CmpContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(pascalGrammarParser.GT, 0); }
		public TerminalNode GE() { return getToken(pascalGrammarParser.GE, 0); }
		public TerminalNode LT() { return getToken(pascalGrammarParser.LT, 0); }
		public TerminalNode LE() { return getToken(pascalGrammarParser.LE, 0); }
		public CmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitCmp(this);
		}
	}

	public final CmpContext cmp() throws RecognitionException {
		CmpContext _localctx = new CmpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (LT - 63)) | (1L << (LE - 63)) | (1L << (GE - 63)) | (1L << (GT - 63)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public SignContext sign;
		public List<SignContext> sign() {
			return getRuleContexts(SignContext.class);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TerminalNode OR(int i) {
			return getToken(pascalGrammarParser.OR, i);
		}
		public SignContext sign(int i) {
			return getRuleContext(SignContext.class,i);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(pascalGrammarParser.OR); }
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitSimpleExpression(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); term();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				{
				setState(229);
				switch (_input.LA(1)) {
				case PLUS:
				case MINUS:
					{
					setState(224); ((SimpleExpressionContext)_localctx).sign = sign();
					append(" " + (((SimpleExpressionContext)_localctx).sign!=null?_input.getText(((SimpleExpressionContext)_localctx).sign.start,((SimpleExpressionContext)_localctx).sign.stop):null) + " ");
					}
					break;
				case OR:
					{
					setState(227); match(OR);
					append(" || ");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(231); term();
				}
				}
				setState(236);
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

	public static class TermContext extends ParserRuleContext {
		public List<TerminalNode> SLASH() { return getTokens(pascalGrammarParser.SLASH); }
		public List<TerminalNode> STAR() { return getTokens(pascalGrammarParser.STAR); }
		public TerminalNode MOD(int i) {
			return getToken(pascalGrammarParser.MOD, i);
		}
		public List<TerminalNode> DIV() { return getTokens(pascalGrammarParser.DIV); }
		public List<TerminalNode> AND() { return getTokens(pascalGrammarParser.AND); }
		public TerminalNode SLASH(int i) {
			return getToken(pascalGrammarParser.SLASH, i);
		}
		public List<SignedFactorContext> signedFactor() {
			return getRuleContexts(SignedFactorContext.class);
		}
		public List<TerminalNode> MOD() { return getTokens(pascalGrammarParser.MOD); }
		public TerminalNode AND(int i) {
			return getToken(pascalGrammarParser.AND, i);
		}
		public TerminalNode DIV(int i) {
			return getToken(pascalGrammarParser.DIV, i);
		}
		public SignedFactorContext signedFactor(int i) {
			return getRuleContext(SignedFactorContext.class,i);
		}
		public TerminalNode STAR(int i) {
			return getToken(pascalGrammarParser.STAR, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); signedFactor();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << DIV) | (1L << MOD) | (1L << STAR) | (1L << SLASH))) != 0)) {
				{
				{
				setState(248);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(238); match(STAR);
					append(" * ");
					}
					break;
				case SLASH:
					{
					setState(240); match(SLASH);
					append(" / ");
					}
					break;
				case DIV:
					{
					setState(242); match(DIV);
					append(" / ");
					}
					break;
				case MOD:
					{
					setState(244); match(MOD);
					append(" % ");
					}
					break;
				case AND:
					{
					setState(246); match(AND);
					append(" && ");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(250); signedFactor();
				}
				}
				setState(255);
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

	public static class SignedFactorContext extends ParserRuleContext {
		public SignContext sign;
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public SignedFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterSignedFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitSignedFactor(this);
		}
	}

	public final SignedFactorContext signedFactor() throws RecognitionException {
		SignedFactorContext _localctx = new SignedFactorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(256); ((SignedFactorContext)_localctx).sign = sign();
				append((((SignedFactorContext)_localctx).sign!=null?_input.getText(((SignedFactorContext)_localctx).sign.start,((SignedFactorContext)_localctx).sign.stop):null));
				}
			}

			setState(261); factor();
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

	public static class SignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(pascalGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(pascalGrammarParser.MINUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class FactorContext extends ParserRuleContext {
		public Token IDENT;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pascalGrammarParser.RPAREN, 0); }
		public TerminalNode IDENT() { return getToken(pascalGrammarParser.IDENT, 0); }
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public TerminalNode NOT() { return getToken(pascalGrammarParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(pascalGrammarParser.LPAREN, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_factor);
		try {
			setState(277);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(265); ((FactorContext)_localctx).IDENT = match(IDENT);
				  
				       if (inWrite) {
				           writeIds.add((((FactorContext)_localctx).IDENT!=null?((FactorContext)_localctx).IDENT.getText():null));
				           append("\"" + types.get((((FactorContext)_localctx).IDENT!=null?((FactorContext)_localctx).IDENT.getText():null)) + "\"");
				       } else append((((FactorContext)_localctx).IDENT!=null?((FactorContext)_localctx).IDENT.getText():null));
				      
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(267); match(LPAREN);
				append("(");
				setState(269); expression();
				setState(270); match(RPAREN);
				append(")");
				}
				break;
			case QUOTE:
			case NUM_INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(273); unsignedConstant();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(274); match(NOT);
				append("!");
				setState(276); factor();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class UnsignedConstantContext extends ParserRuleContext {
		public Token NUM_INT;
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(pascalGrammarParser.NUM_INT, 0); }
		public UnsignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterUnsignedConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitUnsignedConstant(this);
		}
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_unsignedConstant);
		try {
			setState(282);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(279); ((UnsignedConstantContext)_localctx).NUM_INT = match(NUM_INT);

				       if (inWrite) {
				           writeIds.add((((UnsignedConstantContext)_localctx).NUM_INT!=null?((UnsignedConstantContext)_localctx).NUM_INT.getText():null));
				           append("\"%d\"");
				       } else append((((UnsignedConstantContext)_localctx).NUM_INT!=null?((UnsignedConstantContext)_localctx).NUM_INT.getText():null));
				      
				}
				break;
			case QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(281); stringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StringLiteralContext extends ParserRuleContext {
		public StringContext string;
		public List<TerminalNode> QUOTE() { return getTokens(pascalGrammarParser.QUOTE); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode QUOTE(int i) {
			return getToken(pascalGrammarParser.QUOTE, i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitStringLiteral(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284); match(QUOTE);
			setState(285); ((StringLiteralContext)_localctx).string = string();
			setState(286); match(QUOTE);
			append("\"" + (((StringLiteralContext)_localctx).string!=null?_input.getText(((StringLiteralContext)_localctx).string.start,((StringLiteralContext)_localctx).string.stop):null) + "\"");
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
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << READ) | (1L << READLN) | (1L << WRITELN) | (1L << WRITE) | (1L << AND) | (1L << ARRAY) | (1L << BEGIN) | (1L << BOOLEAN) | (1L << CASE) | (1L << CHAR) | (1L << CHR) | (1L << EXIT) | (1L << CONST) | (1L << DIV) | (1L << DO) | (1L << DOWNTO) | (1L << ELSE) | (1L << END) | (1L << FILE) | (1L << FOR) | (1L << FORWARD) | (1L << FUNCTION) | (1L << GOTO) | (1L << IF) | (1L << IN) | (1L << INTEGER) | (1L << LABEL) | (1L << MOD) | (1L << NIL) | (1L << NOT) | (1L << OF) | (1L << OR) | (1L << PACKED) | (1L << PROCEDURE) | (1L << PROGRAM) | (1L << REAL) | (1L << RECORD) | (1L << REPEAT) | (1L << SET) | (1L << THEN) | (1L << TO) | (1L << TYPE) | (1L << UNTIL) | (1L << VAR) | (1L << WHILE) | (1L << WITH) | (1L << UNIT) | (1L << INTERFACE) | (1L << USES) | (1L << STRING) | (1L << IMPLEMENTATION) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << SLASH) | (1L << ASSIGN) | (1L << COMMA) | (1L << SEMI) | (1L << COLON) | (1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (LBRACK2 - 64)) | (1L << (RBRACK - 64)) | (1L << (RBRACK2 - 64)) | (1L << (POINTER - 64)) | (1L << (AT - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (IDENT - 64)) | (1L << (NUM_INT - 64)) | (1L << (WS - 64)))) != 0)) {
				{
				setState(291);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(289); match(1);
					}
					break;

				case 2:
					{
					setState(290);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==QUOTE) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				}
				setState(295);
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

	public static final String _serializedATN =
		"\2\3T\u012b\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\3\2\5\2>\n\2\3\2\5\2A\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\7\4O\n\4\f\4\16\4R\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7"+
		"\6^\n\6\f\6\16\6a\13\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bk\n\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\13\7\13t\n\13\f\13\16\13w\13\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0085\n\f\3\r\3\r\3\r\5\r\u008a\n"+
		"\r\3\16\3\16\3\16\3\16\5\16\u0090\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\7\16\u0099\n\16\f\16\16\16\u009c\13\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\5\17\u00a5\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ac\n\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c7\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u00d8\n\25\3\25\7\25\u00db\n\25\f\25\16\25\u00de\13\25\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00e8\n\27\3\27\7\27\u00eb\n\27\f"+
		"\27\16\27\u00ee\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u00fb\n\30\3\30\7\30\u00fe\n\30\f\30\16\30\u0101\13\30\3\31"+
		"\3\31\3\31\5\31\u0106\n\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0118\n\33\3\34\3\34\3\34\5\34"+
		"\u011d\n\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\7\36\u0126\n\36\f\36\16"+
		"\36\u0129\13\36\3\36\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:\2\5\3AD\3\678\3RR\u0131\2=\3\2\2\2\4H\3\2\2\2\6L\3"+
		"\2\2\2\bS\3\2\2\2\nZ\3\2\2\2\fb\3\2\2\2\16j\3\2\2\2\20l\3\2\2\2\22n\3"+
		"\2\2\2\24p\3\2\2\2\26\u0084\3\2\2\2\30\u0089\3\2\2\2\32\u008f\3\2\2\2"+
		"\34\u00a4\3\2\2\2\36\u00b0\3\2\2\2 \u00b6\3\2\2\2\"\u00bd\3\2\2\2$\u00c8"+
		"\3\2\2\2&\u00cd\3\2\2\2(\u00cf\3\2\2\2*\u00df\3\2\2\2,\u00e1\3\2\2\2."+
		"\u00ef\3\2\2\2\60\u0105\3\2\2\2\62\u0109\3\2\2\2\64\u0117\3\2\2\2\66\u011c"+
		"\3\2\2\28\u011e\3\2\2\2:\u0127\3\2\2\2<>\5\4\3\2=<\3\2\2\2=>\3\2\2\2>"+
		"@\3\2\2\2?A\5\6\4\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7\n\2\2CD\5\22\n\2"+
		"DE\7\25\2\2EF\7M\2\2FG\b\2\1\2G\3\3\2\2\2HI\7&\2\2IJ\5\20\t\2JK\7=\2\2"+
		"K\5\3\2\2\2LP\7/\2\2MO\5\b\5\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2"+
		"Q\7\3\2\2\2RP\3\2\2\2ST\5\n\6\2TU\b\5\1\2UV\7>\2\2VW\5\16\b\2WX\b\5\1"+
		"\2XY\7=\2\2Y\t\3\2\2\2Z_\5\f\7\2[\\\7<\2\2\\^\5\f\7\2][\3\2\2\2^a\3\2"+
		"\2\2_]\3\2\2\2_`\3\2\2\2`\13\3\2\2\2a_\3\2\2\2bc\7Q\2\2c\r\3\2\2\2de\7"+
		"\13\2\2ek\b\b\1\2fg\7\35\2\2gk\b\b\1\2hi\7\65\2\2ik\b\b\1\2jd\3\2\2\2"+
		"jf\3\2\2\2jh\3\2\2\2k\17\3\2\2\2lm\7Q\2\2m\21\3\2\2\2no\5\24\13\2o\23"+
		"\3\2\2\2pu\5\26\f\2qr\7=\2\2rt\5\26\f\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2"+
		"uv\3\2\2\2v\25\3\2\2\2wu\3\2\2\2xy\b\f\1\2yz\5\30\r\2z{\b\f\1\2{\u0085"+
		"\3\2\2\2|\u0085\5&\24\2}~\b\f\1\2~\u0085\5\"\22\2\177\u0080\b\f\1\2\u0080"+
		"\u0085\5 \21\2\u0081\u0082\b\f\1\2\u0082\u0085\5\36\20\2\u0083\u0085\3"+
		"\2\2\2\u0084x\3\2\2\2\u0084|\3\2\2\2\u0084}\3\2\2\2\u0084\177\3\2\2\2"+
		"\u0084\u0081\3\2\2\2\u0084\u0083\3\2\2\2\u0085\27\3\2\2\2\u0086\u008a"+
		"\5$\23\2\u0087\u008a\5\32\16\2\u0088\u008a\5\34\17\2\u0089\u0086\3\2\2"+
		"\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\31\3\2\2\2\u008b\u008c"+
		"\7\4\2\2\u008c\u0090\b\16\1\2\u008d\u008e\7\5\2\2\u008e\u0090\b\16\1\2"+
		"\u008f\u008b\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092"+
		"\7E\2\2\u0092\u0093\b\16\1\2\u0093\u0094\7Q\2\2\u0094\u009a\b\16\1\2\u0095"+
		"\u0096\7<\2\2\u0096\u0097\7Q\2\2\u0097\u0099\b\16\1\2\u0098\u0095\3\2"+
		"\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7F\2\2\u009e\u009f\b\16"+
		"\1\2\u009f\33\3\2\2\2\u00a0\u00a1\7\7\2\2\u00a1\u00a5\b\17\1\2\u00a2\u00a3"+
		"\7\6\2\2\u00a3\u00a5\b\17\1\2\u00a4\u00a0\3\2\2\2\u00a4\u00a2\3\2\2\2"+
		"\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7E\2\2\u00a7\u00ab\b\17\1\2\u00a8\u00a9"+
		"\5(\25\2\u00a9\u00aa\b\17\1\2\u00aa\u00ac\3\2\2\2\u00ab\u00a8\3\2\2\2"+
		"\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7F\2\2\u00ae\u00af"+
		"\b\17\1\2\u00af\35\3\2\2\2\u00b0\u00b1\7\n\2\2\u00b1\u00b2\b\20\1\2\u00b2"+
		"\u00b3\5\24\13\2\u00b3\u00b4\7\25\2\2\u00b4\u00b5\b\20\1\2\u00b5\37\3"+
		"\2\2\2\u00b6\u00b7\7\60\2\2\u00b7\u00b8\b\21\1\2\u00b8\u00b9\5(\25\2\u00b9"+
		"\u00ba\b\21\1\2\u00ba\u00bb\7\22\2\2\u00bb\u00bc\5\26\f\2\u00bc!\3\2\2"+
		"\2\u00bd\u00be\7\33\2\2\u00be\u00bf\b\22\1\2\u00bf\u00c0\5(\25\2\u00c0"+
		"\u00c1\7+\2\2\u00c1\u00c2\b\22\1\2\u00c2\u00c6\5\26\f\2\u00c3\u00c4\7"+
		"\24\2\2\u00c4\u00c5\b\22\1\2\u00c5\u00c7\5\26\f\2\u00c6\u00c3\3\2\2\2"+
		"\u00c6\u00c7\3\2\2\2\u00c7#\3\2\2\2\u00c8\u00c9\7Q\2\2\u00c9\u00ca\7;"+
		"\2\2\u00ca\u00cb\b\23\1\2\u00cb\u00cc\5(\25\2\u00cc%\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\'\3\2\2\2\u00cf\u00dc\5,\27\2\u00d0\u00d1\7?\2\2\u00d1"+
		"\u00d8\b\25\1\2\u00d2\u00d3\7@\2\2\u00d3\u00d8\b\25\1\2\u00d4\u00d5\5"+
		"*\26\2\u00d5\u00d6\b\25\1\2\u00d6\u00d8\3\2\2\2\u00d7\u00d0\3\2\2\2\u00d7"+
		"\u00d2\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\5,"+
		"\27\2\u00da\u00d7\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd)\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\t\2\2\2"+
		"\u00e0+\3\2\2\2\u00e1\u00ec\5.\30\2\u00e2\u00e3\5\62\32\2\u00e3\u00e4"+
		"\b\27\1\2\u00e4\u00e8\3\2\2\2\u00e5\u00e6\7#\2\2\u00e6\u00e8\b\27\1\2"+
		"\u00e7\u00e2\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb"+
		"\5.\30\2\u00ea\u00e7\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed-\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00ff\5\60\31"+
		"\2\u00f0\u00f1\79\2\2\u00f1\u00fb\b\30\1\2\u00f2\u00f3\7:\2\2\u00f3\u00fb"+
		"\b\30\1\2\u00f4\u00f5\7\21\2\2\u00f5\u00fb\b\30\1\2\u00f6\u00f7\7\37\2"+
		"\2\u00f7\u00fb\b\30\1\2\u00f8\u00f9\7\b\2\2\u00f9\u00fb\b\30\1\2\u00fa"+
		"\u00f0\3\2\2\2\u00fa\u00f2\3\2\2\2\u00fa\u00f4\3\2\2\2\u00fa\u00f6\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\5\60\31\2\u00fd"+
		"\u00fa\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100/\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\5\62\32\2\u0103\u0104"+
		"\b\31\1\2\u0104\u0106\3\2\2\2\u0105\u0102\3\2\2\2\u0105\u0106\3\2\2\2"+
		"\u0106\u0107\3\2\2\2\u0107\u0108\5\64\33\2\u0108\61\3\2\2\2\u0109\u010a"+
		"\t\3\2\2\u010a\63\3\2\2\2\u010b\u010c\7Q\2\2\u010c\u0118\b\33\1\2\u010d"+
		"\u010e\7E\2\2\u010e\u010f\b\33\1\2\u010f\u0110\5(\25\2\u0110\u0111\7F"+
		"\2\2\u0111\u0112\b\33\1\2\u0112\u0118\3\2\2\2\u0113\u0118\5\66\34\2\u0114"+
		"\u0115\7!\2\2\u0115\u0116\b\33\1\2\u0116\u0118\5\64\33\2\u0117\u010b\3"+
		"\2\2\2\u0117\u010d\3\2\2\2\u0117\u0113\3\2\2\2\u0117\u0114\3\2\2\2\u0118"+
		"\65\3\2\2\2\u0119\u011a\7S\2\2\u011a\u011d\b\34\1\2\u011b\u011d\58\35"+
		"\2\u011c\u0119\3\2\2\2\u011c\u011b\3\2\2\2\u011d\67\3\2\2\2\u011e\u011f"+
		"\7R\2\2\u011f\u0120\5:\36\2\u0120\u0121\7R\2\2\u0121\u0122\b\35\1\2\u0122"+
		"9\3\2\2\2\u0123\u0126\7\3\2\2\u0124\u0126\n\4\2\2\u0125\u0123\3\2\2\2"+
		"\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128;\3\2\2\2\u0129\u0127\3\2\2\2\32=@P_ju\u0084\u0089\u008f"+
		"\u009a\u00a4\u00ab\u00c6\u00d7\u00dc\u00e7\u00ec\u00fa\u00ff\u0105\u0117"+
		"\u011c\u0125\u0127";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}