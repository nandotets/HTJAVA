// Generated from MyCompiler\htmltojava\htjava.g4 by ANTLR 4.5.1
package MyCompiler.htmltojava;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class htjavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTJAVA_INI=1, HTJAVA_END=2, VAR_ASSIGN_INI=3, VAR_ASSIGN_END=4, VAR_INI=5, 
		VAR_TYPE=6, VAR_END=7, PRINT_INI=8, PRINT_END=9, IF_INI=10, IF_END=11, 
		ELSE_INI=12, ELSE_END=13, OPERATORS=14, PAR_OPEN=15, PAR_CLOSE=16, ASP_S=17, 
		ASP_D=18, BOOLEAN=19, CHAR=20, TEXTT=21, ID=22, NUMBER=23, WS=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"HTJAVA_INI", "HTJAVA_END", "VAR_ASSIGN_INI", "VAR_ASSIGN_END", "VAR_INI", 
		"VAR_TYPE", "VAR_END", "PRINT_INI", "PRINT_END", "IF_INI", "IF_END", "ELSE_INI", 
		"ELSE_END", "OPERATORS", "PAR_OPEN", "PAR_CLOSE", "ASP_S", "ASP_D", "BOOLEAN", 
		"CHAR", "TEXTT", "ID", "NUMBER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<htjava>'", "'</htjava>'", "'<var'", "'>'", "'<var>'", null, "'</var>'", 
		"'<print>'", "'</print>'", "'<if>'", "'</if>'", "'<else>'", "'</else>'", 
		null, "'('", "')'", "'''", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "HTJAVA_INI", "HTJAVA_END", "VAR_ASSIGN_INI", "VAR_ASSIGN_END", 
		"VAR_INI", "VAR_TYPE", "VAR_END", "PRINT_INI", "PRINT_END", "IF_INI", 
		"IF_END", "ELSE_INI", "ELSE_END", "OPERATORS", "PAR_OPEN", "PAR_CLOSE", 
		"ASP_S", "ASP_D", "BOOLEAN", "CHAR", "TEXTT", "ID", "NUMBER", "WS"
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


	public htjavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "htjava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u00c7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7_\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\5\24\u00a6\n\24\3\25\3\25\3\25\3\25\3\26\3\26\7\26\u00ae\n\26"+
		"\f\26\16\26\u00b1\13\26\3\26\3\26\3\27\3\27\7\27\u00b7\n\27\f\27\16\27"+
		"\u00ba\13\27\3\30\6\30\u00bd\n\30\r\30\16\30\u00be\3\31\6\31\u00c2\n\31"+
		"\r\31\16\31\u00c3\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\3\2\7\5\2,-//\61\61\6\2\62;C\\aac|\5\2C\\aac|\3\2\62;\5\2\13"+
		"\f\17\17\"\"\u00cc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5<\3\2\2\2\7F\3\2\2\2\tK\3"+
		"\2\2\2\13M\3\2\2\2\r^\3\2\2\2\17`\3\2\2\2\21g\3\2\2\2\23o\3\2\2\2\25x"+
		"\3\2\2\2\27}\3\2\2\2\31\u0083\3\2\2\2\33\u008a\3\2\2\2\35\u0092\3\2\2"+
		"\2\37\u0094\3\2\2\2!\u0096\3\2\2\2#\u0098\3\2\2\2%\u009a\3\2\2\2\'\u00a5"+
		"\3\2\2\2)\u00a7\3\2\2\2+\u00ab\3\2\2\2-\u00b4\3\2\2\2/\u00bc\3\2\2\2\61"+
		"\u00c1\3\2\2\2\63\64\7>\2\2\64\65\7j\2\2\65\66\7v\2\2\66\67\7l\2\2\67"+
		"8\7c\2\289\7x\2\29:\7c\2\2:;\7@\2\2;\4\3\2\2\2<=\7>\2\2=>\7\61\2\2>?\7"+
		"j\2\2?@\7v\2\2@A\7l\2\2AB\7c\2\2BC\7x\2\2CD\7c\2\2DE\7@\2\2E\6\3\2\2\2"+
		"FG\7>\2\2GH\7x\2\2HI\7c\2\2IJ\7t\2\2J\b\3\2\2\2KL\7@\2\2L\n\3\2\2\2MN"+
		"\7>\2\2NO\7x\2\2OP\7c\2\2PQ\7t\2\2QR\7@\2\2R\f\3\2\2\2ST\7>\2\2TU\7k\2"+
		"\2UV\7p\2\2VW\7v\2\2W_\7@\2\2XY\7>\2\2YZ\7e\2\2Z[\7j\2\2[\\\7c\2\2\\]"+
		"\7t\2\2]_\7@\2\2^S\3\2\2\2^X\3\2\2\2_\16\3\2\2\2`a\7>\2\2ab\7\61\2\2b"+
		"c\7x\2\2cd\7c\2\2de\7t\2\2ef\7@\2\2f\20\3\2\2\2gh\7>\2\2hi\7r\2\2ij\7"+
		"t\2\2jk\7k\2\2kl\7p\2\2lm\7v\2\2mn\7@\2\2n\22\3\2\2\2op\7>\2\2pq\7\61"+
		"\2\2qr\7r\2\2rs\7t\2\2st\7k\2\2tu\7p\2\2uv\7v\2\2vw\7@\2\2w\24\3\2\2\2"+
		"xy\7>\2\2yz\7k\2\2z{\7h\2\2{|\7@\2\2|\26\3\2\2\2}~\7>\2\2~\177\7\61\2"+
		"\2\177\u0080\7k\2\2\u0080\u0081\7h\2\2\u0081\u0082\7@\2\2\u0082\30\3\2"+
		"\2\2\u0083\u0084\7>\2\2\u0084\u0085\7g\2\2\u0085\u0086\7n\2\2\u0086\u0087"+
		"\7u\2\2\u0087\u0088\7g\2\2\u0088\u0089\7@\2\2\u0089\32\3\2\2\2\u008a\u008b"+
		"\7>\2\2\u008b\u008c\7\61\2\2\u008c\u008d\7g\2\2\u008d\u008e\7n\2\2\u008e"+
		"\u008f\7u\2\2\u008f\u0090\7g\2\2\u0090\u0091\7@\2\2\u0091\34\3\2\2\2\u0092"+
		"\u0093\t\2\2\2\u0093\36\3\2\2\2\u0094\u0095\7*\2\2\u0095 \3\2\2\2\u0096"+
		"\u0097\7+\2\2\u0097\"\3\2\2\2\u0098\u0099\7)\2\2\u0099$\3\2\2\2\u009a"+
		"\u009b\7$\2\2\u009b&\3\2\2\2\u009c\u009d\7v\2\2\u009d\u009e\7t\2\2\u009e"+
		"\u009f\7w\2\2\u009f\u00a6\7g\2\2\u00a0\u00a1\7h\2\2\u00a1\u00a2\7c\2\2"+
		"\u00a2\u00a3\7n\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a6\7g\2\2\u00a5\u009c"+
		"\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a6(\3\2\2\2\u00a7\u00a8\5#\22\2\u00a8"+
		"\u00a9\t\3\2\2\u00a9\u00aa\5#\22\2\u00aa*\3\2\2\2\u00ab\u00af\5%\23\2"+
		"\u00ac\u00ae\t\3\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\u00b3\5%\23\2\u00b3,\3\2\2\2\u00b4\u00b8\t\4\2\2\u00b5\u00b7\t\3\2\2"+
		"\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9.\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bd\t\5\2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\60\3\2\2\2\u00c0\u00c2\t\6\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\b\31\2\2\u00c6\62\3\2\2\2\t\2^\u00a5\u00af\u00b8\u00be\u00c3\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}