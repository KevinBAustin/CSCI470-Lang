// Generated from SomeLang.g by ANTLR 4.5
package somelang.parser; import static somelang.AST.*;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SomeLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, ID=19, Dot=20, Number=21, String=22, TrueLiteral=23, FalseLiteral=24, 
		WS=25, Line_Comment=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "ID", "Dot", "Number", "DIGIT", "String", "TrueLiteral", "FalseLiteral", 
		"WS", "Line_Comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "'is'", "'add'", "'sub'", "'mult'", "'div'", "'rem'", "'compare'", 
		"'to'", "'repeat'", "'if less than'", "'if greater than'", "'if eless than'", 
		"'if egreater than'", "'if equal'", "'else'", "'give'", "'gain'", null, 
		"'.'", null, null, "'#t'", "'#f'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "ID", "Dot", "Number", "String", 
		"TrueLiteral", "FalseLiteral", "WS", "Line_Comment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SomeLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SomeLang.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u00ea\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\7\24\u00bc"+
		"\n\24\f\24\16\24\u00bf\13\24\3\25\3\25\3\26\6\26\u00c4\n\26\r\26\16\26"+
		"\u00c5\3\27\3\27\3\30\3\30\7\30\u00cc\n\30\f\30\16\30\u00cf\13\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\6\33\u00da\n\33\r\33\16\33\u00db"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u00e4\n\34\f\34\16\34\u00e7\13\34"+
		"\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\2/\30\61\31\63\32\65\33"+
		"\67\34\3\2\7\n\2$$&&*+..\60\60\62;=?``\t\2$$&&*+..\60\60=?``\4\2$$``\5"+
		"\2\13\f\16\17\"\"\4\2\f\f\17\17\u00ed\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7>\3\2\2\2\tB\3\2\2\2\13F\3\2\2\2\r"+
		"K\3\2\2\2\17O\3\2\2\2\21S\3\2\2\2\23[\3\2\2\2\25^\3\2\2\2\27e\3\2\2\2"+
		"\31r\3\2\2\2\33\u0082\3\2\2\2\35\u0090\3\2\2\2\37\u00a1\3\2\2\2!\u00aa"+
		"\3\2\2\2#\u00af\3\2\2\2%\u00b4\3\2\2\2\'\u00b9\3\2\2\2)\u00c0\3\2\2\2"+
		"+\u00c3\3\2\2\2-\u00c7\3\2\2\2/\u00c9\3\2\2\2\61\u00d2\3\2\2\2\63\u00d5"+
		"\3\2\2\2\65\u00d9\3\2\2\2\67\u00df\3\2\2\29:\7/\2\2:\4\3\2\2\2;<\7k\2"+
		"\2<=\7u\2\2=\6\3\2\2\2>?\7c\2\2?@\7f\2\2@A\7f\2\2A\b\3\2\2\2BC\7u\2\2"+
		"CD\7w\2\2DE\7d\2\2E\n\3\2\2\2FG\7o\2\2GH\7w\2\2HI\7n\2\2IJ\7v\2\2J\f\3"+
		"\2\2\2KL\7f\2\2LM\7k\2\2MN\7x\2\2N\16\3\2\2\2OP\7t\2\2PQ\7g\2\2QR\7o\2"+
		"\2R\20\3\2\2\2ST\7e\2\2TU\7q\2\2UV\7o\2\2VW\7r\2\2WX\7c\2\2XY\7t\2\2Y"+
		"Z\7g\2\2Z\22\3\2\2\2[\\\7v\2\2\\]\7q\2\2]\24\3\2\2\2^_\7t\2\2_`\7g\2\2"+
		"`a\7r\2\2ab\7g\2\2bc\7c\2\2cd\7v\2\2d\26\3\2\2\2ef\7k\2\2fg\7h\2\2gh\7"+
		"\"\2\2hi\7n\2\2ij\7g\2\2jk\7u\2\2kl\7u\2\2lm\7\"\2\2mn\7v\2\2no\7j\2\2"+
		"op\7c\2\2pq\7p\2\2q\30\3\2\2\2rs\7k\2\2st\7h\2\2tu\7\"\2\2uv\7i\2\2vw"+
		"\7t\2\2wx\7g\2\2xy\7c\2\2yz\7v\2\2z{\7g\2\2{|\7t\2\2|}\7\"\2\2}~\7v\2"+
		"\2~\177\7j\2\2\177\u0080\7c\2\2\u0080\u0081\7p\2\2\u0081\32\3\2\2\2\u0082"+
		"\u0083\7k\2\2\u0083\u0084\7h\2\2\u0084\u0085\7\"\2\2\u0085\u0086\7g\2"+
		"\2\u0086\u0087\7n\2\2\u0087\u0088\7g\2\2\u0088\u0089\7u\2\2\u0089\u008a"+
		"\7u\2\2\u008a\u008b\7\"\2\2\u008b\u008c\7v\2\2\u008c\u008d\7j\2\2\u008d"+
		"\u008e\7c\2\2\u008e\u008f\7p\2\2\u008f\34\3\2\2\2\u0090\u0091\7k\2\2\u0091"+
		"\u0092\7h\2\2\u0092\u0093\7\"\2\2\u0093\u0094\7g\2\2\u0094\u0095\7i\2"+
		"\2\u0095\u0096\7t\2\2\u0096\u0097\7g\2\2\u0097\u0098\7c\2\2\u0098\u0099"+
		"\7v\2\2\u0099\u009a\7g\2\2\u009a\u009b\7t\2\2\u009b\u009c\7\"\2\2\u009c"+
		"\u009d\7v\2\2\u009d\u009e\7j\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7p\2\2"+
		"\u00a0\36\3\2\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7h\2\2\u00a3\u00a4\7"+
		"\"\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7s\2\2\u00a6\u00a7\7w\2\2\u00a7"+
		"\u00a8\7c\2\2\u00a8\u00a9\7n\2\2\u00a9 \3\2\2\2\u00aa\u00ab\7g\2\2\u00ab"+
		"\u00ac\7n\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7g\2\2\u00ae\"\3\2\2\2\u00af"+
		"\u00b0\7i\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7x\2\2\u00b2\u00b3\7g\2\2"+
		"\u00b3$\3\2\2\2\u00b4\u00b5\7i\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7k\2"+
		"\2\u00b7\u00b8\7p\2\2\u00b8&\3\2\2\2\u00b9\u00bd\t\2\2\2\u00ba\u00bc\t"+
		"\3\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be(\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\60\2\2"+
		"\u00c1*\3\2\2\2\u00c2\u00c4\5-\27\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3"+
		"\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6,\3\2\2\2\u00c7\u00c8"+
		"\4\62;\2\u00c8.\3\2\2\2\u00c9\u00cd\7$\2\2\u00ca\u00cc\t\4\2\2\u00cb\u00ca"+
		"\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7$\2\2\u00d1\60\3\2\2\2"+
		"\u00d2\u00d3\7%\2\2\u00d3\u00d4\7v\2\2\u00d4\62\3\2\2\2\u00d5\u00d6\7"+
		"%\2\2\u00d6\u00d7\7h\2\2\u00d7\64\3\2\2\2\u00d8\u00da\t\5\2\2\u00d9\u00d8"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\b\33\2\2\u00de\66\3\2\2\2\u00df\u00e0\7\61"+
		"\2\2\u00e0\u00e1\7\61\2\2\u00e1\u00e5\3\2\2\2\u00e2\u00e4\n\6\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\b\34\2\2\u00e9"+
		"8\3\2\2\2\b\2\u00bd\u00c5\u00cd\u00db\u00e5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}