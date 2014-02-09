// Generated from pascalGrammar.g4 by ANTLR 4.0

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
public class pascalGrammarLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"''''", "'read'", "'readln'", "'writeln'", "'write'", "'and'", "'array'", 
		"'begin'", "'boolean'", "'case'", "'char'", "'chr'", "'exit'", "'const'", 
		"'div'", "'do'", "'downto'", "'else'", "'end'", "'file'", "'for'", "'forward'", 
		"'function'", "'goto'", "'if'", "'in'", "'integer'", "'label'", "'mod'", 
		"'nil'", "'not'", "'of'", "'or'", "'packed'", "'procedure'", "'program'", 
		"'real'", "'record'", "'repeat'", "'set'", "'then'", "'to'", "'type'", 
		"'until'", "'var'", "'while'", "'with'", "'unit'", "'interface'", "'uses'", 
		"'string'", "'implementation'", "'+'", "'-'", "'*'", "'/'", "':='", "','", 
		"';'", "':'", "'='", "'<>'", "'<'", "'<='", "'>='", "'>'", "'('", "')'", 
		"'['", "'(.'", "']'", "'.)'", "'^'", "'@'", "'.'", "'..'", "'{'", "'}'", 
		"IDENT", "'''", "NUM_INT", "WS"
	};
	public static final String[] ruleNames = {
		"T__0", "READ", "READLN", "WRITELN", "WRITE", "AND", "ARRAY", "BEGIN", 
		"BOOLEAN", "CASE", "CHAR", "CHR", "EXIT", "CONST", "DIV", "DO", "DOWNTO", 
		"ELSE", "END", "FILE", "FOR", "FORWARD", "FUNCTION", "GOTO", "IF", "IN", 
		"INTEGER", "LABEL", "MOD", "NIL", "NOT", "OF", "OR", "PACKED", "PROCEDURE", 
		"PROGRAM", "REAL", "RECORD", "REPEAT", "SET", "THEN", "TO", "TYPE", "UNTIL", 
		"VAR", "WHILE", "WITH", "UNIT", "INTERFACE", "USES", "STRING", "IMPLEMENTATION", 
		"PLUS", "MINUS", "STAR", "SLASH", "ASSIGN", "COMMA", "SEMI", "COLON", 
		"EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", "LPAREN", "RPAREN", "LBRACK", 
		"LBRACK2", "RBRACK", "RBRACK2", "POINTER", "AT", "DOT", "DOTDOT", "LCURLY", 
		"RCURLY", "IDENT", "QUOTE", "NUM_INT", "WS"
	};


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


	public pascalGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "pascalGrammar.g4"; }

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
		case 81: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = HIDDEN;  break;
		}
	}

	public static final String _serializedATN =
		"\2\4T\u021d\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\t"+
		"E\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4"+
		"Q\tQ\4R\tR\4S\tS\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		"!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3"+
		",\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3:\3;\3;\3<\3<\3=\3=\3>\3"+
		">\3?\3?\3?\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3G\3"+
		"H\3H\3I\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3M\3N\3N\3O\3O\3P\3P\7P\u020b\n"+
		"P\fP\16P\u020e\13P\3Q\3Q\3R\6R\u0213\nR\rR\16R\u0214\3S\6S\u0218\nS\r"+
		"S\16S\u0219\3S\3S\2T\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n"+
		"\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%"+
		"\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19"+
		"\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1"+
		"Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1i\66\1k\67\1m8\1o9\1q:\1s"+
		";\1u<\1w=\1y>\1{?\1}@\1\177A\1\u0081B\1\u0083C\1\u0085D\1\u0087E\1\u0089"+
		"F\1\u008bG\1\u008dH\1\u008fI\1\u0091J\1\u0093K\1\u0095L\1\u0097M\1\u0099"+
		"N\1\u009bO\1\u009dP\1\u009fQ\1\u00a1R\1\u00a3S\1\u00a5T\2\3\2\5\4C\\c"+
		"|\6\62;C\\aac|\5\13\f\17\17\"\"\u021f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2"+
		"\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2"+
		"\2\2\u00a5\3\2\2\2\3\u00a7\3\2\2\2\5\u00aa\3\2\2\2\7\u00af\3\2\2\2\t\u00b6"+
		"\3\2\2\2\13\u00be\3\2\2\2\r\u00c4\3\2\2\2\17\u00c8\3\2\2\2\21\u00ce\3"+
		"\2\2\2\23\u00d4\3\2\2\2\25\u00dc\3\2\2\2\27\u00e1\3\2\2\2\31\u00e6\3\2"+
		"\2\2\33\u00ea\3\2\2\2\35\u00ef\3\2\2\2\37\u00f5\3\2\2\2!\u00f9\3\2\2\2"+
		"#\u00fc\3\2\2\2%\u0103\3\2\2\2\'\u0108\3\2\2\2)\u010c\3\2\2\2+\u0111\3"+
		"\2\2\2-\u0115\3\2\2\2/\u011d\3\2\2\2\61\u0126\3\2\2\2\63\u012b\3\2\2\2"+
		"\65\u012e\3\2\2\2\67\u0131\3\2\2\29\u0139\3\2\2\2;\u013f\3\2\2\2=\u0143"+
		"\3\2\2\2?\u0147\3\2\2\2A\u014b\3\2\2\2C\u014e\3\2\2\2E\u0151\3\2\2\2G"+
		"\u0158\3\2\2\2I\u0162\3\2\2\2K\u016a\3\2\2\2M\u016f\3\2\2\2O\u0176\3\2"+
		"\2\2Q\u017d\3\2\2\2S\u0181\3\2\2\2U\u0186\3\2\2\2W\u0189\3\2\2\2Y\u018e"+
		"\3\2\2\2[\u0194\3\2\2\2]\u0198\3\2\2\2_\u019e\3\2\2\2a\u01a3\3\2\2\2c"+
		"\u01a8\3\2\2\2e\u01b2\3\2\2\2g\u01b7\3\2\2\2i\u01be\3\2\2\2k\u01cd\3\2"+
		"\2\2m\u01cf\3\2\2\2o\u01d1\3\2\2\2q\u01d3\3\2\2\2s\u01d5\3\2\2\2u\u01d8"+
		"\3\2\2\2w\u01da\3\2\2\2y\u01dc\3\2\2\2{\u01de\3\2\2\2}\u01e0\3\2\2\2\177"+
		"\u01e3\3\2\2\2\u0081\u01e5\3\2\2\2\u0083\u01e8\3\2\2\2\u0085\u01eb\3\2"+
		"\2\2\u0087\u01ed\3\2\2\2\u0089\u01ef\3\2\2\2\u008b\u01f1\3\2\2\2\u008d"+
		"\u01f3\3\2\2\2\u008f\u01f6\3\2\2\2\u0091\u01f8\3\2\2\2\u0093\u01fb\3\2"+
		"\2\2\u0095\u01fd\3\2\2\2\u0097\u01ff\3\2\2\2\u0099\u0201\3\2\2\2\u009b"+
		"\u0204\3\2\2\2\u009d\u0206\3\2\2\2\u009f\u0208\3\2\2\2\u00a1\u020f\3\2"+
		"\2\2\u00a3\u0212\3\2\2\2\u00a5\u0217\3\2\2\2\u00a7\u00a8\7)\2\2\u00a8"+
		"\u00a9\7)\2\2\u00a9\4\3\2\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		"\u00ad\7c\2\2\u00ad\u00ae\7f\2\2\u00ae\6\3\2\2\2\u00af\u00b0\7t\2\2\u00b0"+
		"\u00b1\7g\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7f\2\2\u00b3\u00b4\7n\2\2"+
		"\u00b4\u00b5\7p\2\2\u00b5\b\3\2\2\2\u00b6\u00b7\7y\2\2\u00b7\u00b8\7t"+
		"\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc"+
		"\7n\2\2\u00bc\u00bd\7p\2\2\u00bd\n\3\2\2\2\u00be\u00bf\7y\2\2\u00bf\u00c0"+
		"\7t\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7g\2\2\u00c3"+
		"\f\3\2\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7f\2\2\u00c7"+
		"\16\3\2\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7t\2\2\u00cb"+
		"\u00cc\7c\2\2\u00cc\u00cd\7{\2\2\u00cd\20\3\2\2\2\u00ce\u00cf\7d\2\2\u00cf"+
		"\u00d0\7g\2\2\u00d0\u00d1\7i\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7p\2\2"+
		"\u00d3\22\3\2\2\2\u00d4\u00d5\7d\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7"+
		"q\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7c\2\2\u00da\u00db"+
		"\7p\2\2\u00db\24\3\2\2\2\u00dc\u00dd\7e\2\2\u00dd\u00de\7c\2\2\u00de\u00df"+
		"\7u\2\2\u00df\u00e0\7g\2\2\u00e0\26\3\2\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3"+
		"\7j\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7t\2\2\u00e5\30\3\2\2\2\u00e6\u00e7"+
		"\7e\2\2\u00e7\u00e8\7j\2\2\u00e8\u00e9\7t\2\2\u00e9\32\3\2\2\2\u00ea\u00eb"+
		"\7g\2\2\u00eb\u00ec\7z\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7v\2\2\u00ee"+
		"\34\3\2\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7p\2\2\u00f2"+
		"\u00f3\7u\2\2\u00f3\u00f4\7v\2\2\u00f4\36\3\2\2\2\u00f5\u00f6\7f\2\2\u00f6"+
		"\u00f7\7k\2\2\u00f7\u00f8\7x\2\2\u00f8 \3\2\2\2\u00f9\u00fa\7f\2\2\u00fa"+
		"\u00fb\7q\2\2\u00fb\"\3\2\2\2\u00fc\u00fd\7f\2\2\u00fd\u00fe\7q\2\2\u00fe"+
		"\u00ff\7y\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7v\2\2\u0101\u0102\7q\2\2"+
		"\u0102$\3\2\2\2\u0103\u0104\7g\2\2\u0104\u0105\7n\2\2\u0105\u0106\7u\2"+
		"\2\u0106\u0107\7g\2\2\u0107&\3\2\2\2\u0108\u0109\7g\2\2\u0109\u010a\7"+
		"p\2\2\u010a\u010b\7f\2\2\u010b(\3\2\2\2\u010c\u010d\7h\2\2\u010d\u010e"+
		"\7k\2\2\u010e\u010f\7n\2\2\u010f\u0110\7g\2\2\u0110*\3\2\2\2\u0111\u0112"+
		"\7h\2\2\u0112\u0113\7q\2\2\u0113\u0114\7t\2\2\u0114,\3\2\2\2\u0115\u0116"+
		"\7h\2\2\u0116\u0117\7q\2\2\u0117\u0118\7t\2\2\u0118\u0119\7y\2\2\u0119"+
		"\u011a\7c\2\2\u011a\u011b\7t\2\2\u011b\u011c\7f\2\2\u011c.\3\2\2\2\u011d"+
		"\u011e\7h\2\2\u011e\u011f\7w\2\2\u011f\u0120\7p\2\2\u0120\u0121\7e\2\2"+
		"\u0121\u0122\7v\2\2\u0122\u0123\7k\2\2\u0123\u0124\7q\2\2\u0124\u0125"+
		"\7p\2\2\u0125\60\3\2\2\2\u0126\u0127\7i\2\2\u0127\u0128\7q\2\2\u0128\u0129"+
		"\7v\2\2\u0129\u012a\7q\2\2\u012a\62\3\2\2\2\u012b\u012c\7k\2\2\u012c\u012d"+
		"\7h\2\2\u012d\64\3\2\2\2\u012e\u012f\7k\2\2\u012f\u0130\7p\2\2\u0130\66"+
		"\3\2\2\2\u0131\u0132\7k\2\2\u0132\u0133\7p\2\2\u0133\u0134\7v\2\2\u0134"+
		"\u0135\7g\2\2\u0135\u0136\7i\2\2\u0136\u0137\7g\2\2\u0137\u0138\7t\2\2"+
		"\u01388\3\2\2\2\u0139\u013a\7n\2\2\u013a\u013b\7c\2\2\u013b\u013c\7d\2"+
		"\2\u013c\u013d\7g\2\2\u013d\u013e\7n\2\2\u013e:\3\2\2\2\u013f\u0140\7"+
		"o\2\2\u0140\u0141\7q\2\2\u0141\u0142\7f\2\2\u0142<\3\2\2\2\u0143\u0144"+
		"\7p\2\2\u0144\u0145\7k\2\2\u0145\u0146\7n\2\2\u0146>\3\2\2\2\u0147\u0148"+
		"\7p\2\2\u0148\u0149\7q\2\2\u0149\u014a\7v\2\2\u014a@\3\2\2\2\u014b\u014c"+
		"\7q\2\2\u014c\u014d\7h\2\2\u014dB\3\2\2\2\u014e\u014f\7q\2\2\u014f\u0150"+
		"\7t\2\2\u0150D\3\2\2\2\u0151\u0152\7r\2\2\u0152\u0153\7c\2\2\u0153\u0154"+
		"\7e\2\2\u0154\u0155\7m\2\2\u0155\u0156\7g\2\2\u0156\u0157\7f\2\2\u0157"+
		"F\3\2\2\2\u0158\u0159\7r\2\2\u0159\u015a\7t\2\2\u015a\u015b\7q\2\2\u015b"+
		"\u015c\7e\2\2\u015c\u015d\7g\2\2\u015d\u015e\7f\2\2\u015e\u015f\7w\2\2"+
		"\u015f\u0160\7t\2\2\u0160\u0161\7g\2\2\u0161H\3\2\2\2\u0162\u0163\7r\2"+
		"\2\u0163\u0164\7t\2\2\u0164\u0165\7q\2\2\u0165\u0166\7i\2\2\u0166\u0167"+
		"\7t\2\2\u0167\u0168\7c\2\2\u0168\u0169\7o\2\2\u0169J\3\2\2\2\u016a\u016b"+
		"\7t\2\2\u016b\u016c\7g\2\2\u016c\u016d\7c\2\2\u016d\u016e\7n\2\2\u016e"+
		"L\3\2\2\2\u016f\u0170\7t\2\2\u0170\u0171\7g\2\2\u0171\u0172\7e\2\2\u0172"+
		"\u0173\7q\2\2\u0173\u0174\7t\2\2\u0174\u0175\7f\2\2\u0175N\3\2\2\2\u0176"+
		"\u0177\7t\2\2\u0177\u0178\7g\2\2\u0178\u0179\7r\2\2\u0179\u017a\7g\2\2"+
		"\u017a\u017b\7c\2\2\u017b\u017c\7v\2\2\u017cP\3\2\2\2\u017d\u017e\7u\2"+
		"\2\u017e\u017f\7g\2\2\u017f\u0180\7v\2\2\u0180R\3\2\2\2\u0181\u0182\7"+
		"v\2\2\u0182\u0183\7j\2\2\u0183\u0184\7g\2\2\u0184\u0185\7p\2\2\u0185T"+
		"\3\2\2\2\u0186\u0187\7v\2\2\u0187\u0188\7q\2\2\u0188V\3\2\2\2\u0189\u018a"+
		"\7v\2\2\u018a\u018b\7{\2\2\u018b\u018c\7r\2\2\u018c\u018d\7g\2\2\u018d"+
		"X\3\2\2\2\u018e\u018f\7w\2\2\u018f\u0190\7p\2\2\u0190\u0191\7v\2\2\u0191"+
		"\u0192\7k\2\2\u0192\u0193\7n\2\2\u0193Z\3\2\2\2\u0194\u0195\7x\2\2\u0195"+
		"\u0196\7c\2\2\u0196\u0197\7t\2\2\u0197\\\3\2\2\2\u0198\u0199\7y\2\2\u0199"+
		"\u019a\7j\2\2\u019a\u019b\7k\2\2\u019b\u019c\7n\2\2\u019c\u019d\7g\2\2"+
		"\u019d^\3\2\2\2\u019e\u019f\7y\2\2\u019f\u01a0\7k\2\2\u01a0\u01a1\7v\2"+
		"\2\u01a1\u01a2\7j\2\2\u01a2`\3\2\2\2\u01a3\u01a4\7w\2\2\u01a4\u01a5\7"+
		"p\2\2\u01a5\u01a6\7k\2\2\u01a6\u01a7\7v\2\2\u01a7b\3\2\2\2\u01a8\u01a9"+
		"\7k\2\2\u01a9\u01aa\7p\2\2\u01aa\u01ab\7v\2\2\u01ab\u01ac\7g\2\2\u01ac"+
		"\u01ad\7t\2\2\u01ad\u01ae\7h\2\2\u01ae\u01af\7c\2\2\u01af\u01b0\7e\2\2"+
		"\u01b0\u01b1\7g\2\2\u01b1d\3\2\2\2\u01b2\u01b3\7w\2\2\u01b3\u01b4\7u\2"+
		"\2\u01b4\u01b5\7g\2\2\u01b5\u01b6\7u\2\2\u01b6f\3\2\2\2\u01b7\u01b8\7"+
		"u\2\2\u01b8\u01b9\7v\2\2\u01b9\u01ba\7t\2\2\u01ba\u01bb\7k\2\2\u01bb\u01bc"+
		"\7p\2\2\u01bc\u01bd\7i\2\2\u01bdh\3\2\2\2\u01be\u01bf\7k\2\2\u01bf\u01c0"+
		"\7o\2\2\u01c0\u01c1\7r\2\2\u01c1\u01c2\7n\2\2\u01c2\u01c3\7g\2\2\u01c3"+
		"\u01c4\7o\2\2\u01c4\u01c5\7g\2\2\u01c5\u01c6\7p\2\2\u01c6\u01c7\7v\2\2"+
		"\u01c7\u01c8\7c\2\2\u01c8\u01c9\7v\2\2\u01c9\u01ca\7k\2\2\u01ca\u01cb"+
		"\7q\2\2\u01cb\u01cc\7p\2\2\u01ccj\3\2\2\2\u01cd\u01ce\7-\2\2\u01cel\3"+
		"\2\2\2\u01cf\u01d0\7/\2\2\u01d0n\3\2\2\2\u01d1\u01d2\7,\2\2\u01d2p\3\2"+
		"\2\2\u01d3\u01d4\7\61\2\2\u01d4r\3\2\2\2\u01d5\u01d6\7<\2\2\u01d6\u01d7"+
		"\7?\2\2\u01d7t\3\2\2\2\u01d8\u01d9\7.\2\2\u01d9v\3\2\2\2\u01da\u01db\7"+
		"=\2\2\u01dbx\3\2\2\2\u01dc\u01dd\7<\2\2\u01ddz\3\2\2\2\u01de\u01df\7?"+
		"\2\2\u01df|\3\2\2\2\u01e0\u01e1\7>\2\2\u01e1\u01e2\7@\2\2\u01e2~\3\2\2"+
		"\2\u01e3\u01e4\7>\2\2\u01e4\u0080\3\2\2\2\u01e5\u01e6\7>\2\2\u01e6\u01e7"+
		"\7?\2\2\u01e7\u0082\3\2\2\2\u01e8\u01e9\7@\2\2\u01e9\u01ea\7?\2\2\u01ea"+
		"\u0084\3\2\2\2\u01eb\u01ec\7@\2\2\u01ec\u0086\3\2\2\2\u01ed\u01ee\7*\2"+
		"\2\u01ee\u0088\3\2\2\2\u01ef\u01f0\7+\2\2\u01f0\u008a\3\2\2\2\u01f1\u01f2"+
		"\7]\2\2\u01f2\u008c\3\2\2\2\u01f3\u01f4\7*\2\2\u01f4\u01f5\7\60\2\2\u01f5"+
		"\u008e\3\2\2\2\u01f6\u01f7\7_\2\2\u01f7\u0090\3\2\2\2\u01f8\u01f9\7\60"+
		"\2\2\u01f9\u01fa\7+\2\2\u01fa\u0092\3\2\2\2\u01fb\u01fc\7`\2\2\u01fc\u0094"+
		"\3\2\2\2\u01fd\u01fe\7B\2\2\u01fe\u0096\3\2\2\2\u01ff\u0200\7\60\2\2\u0200"+
		"\u0098\3\2\2\2\u0201\u0202\7\60\2\2\u0202\u0203\7\60\2\2\u0203\u009a\3"+
		"\2\2\2\u0204\u0205\7}\2\2\u0205\u009c\3\2\2\2\u0206\u0207\7\177\2\2\u0207"+
		"\u009e\3\2\2\2\u0208\u020c\t\2\2\2\u0209\u020b\t\3\2\2\u020a\u0209\3\2"+
		"\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u00a0\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0210\7)\2\2\u0210\u00a2\3\2"+
		"\2\2\u0211\u0213\4\62;\2\u0212\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214"+
		"\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u00a4\3\2\2\2\u0216\u0218\t\4"+
		"\2\2\u0217\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u0217\3\2\2\2\u0219"+
		"\u021a\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\bS\2\2\u021c\u00a6\3\2"+
		"\2\2\6\2\u020c\u0214\u0219";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}