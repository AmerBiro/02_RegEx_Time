// Generated from /mnt/d/OneDrive - Danmarks Tekniske Universitet/DTU/3. semester/#2 Compiler Construction/Lektioner/Lektion 02/Antlr4 V2/dato.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class datoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHILE=1, IDENTIFIER=2, INTCONST=3, DATO=4, DAG=5, MONAAD=6, YEAR=7, WHITESPACE=8, 
		KOMMENTAR=9, MULTILINECOMMENTS=10, MYTOKEN=11, TAG=12, ClickTime=13, Hour=14, 
		Minutte=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WHILE", "IDENTIFIER", "INTCONST", "DATO", "DAG", "MONAAD", "YEAR", "WHITESPACE", 
			"KOMMENTAR", "MULTILINECOMMENTS", "MYTOKEN", "TAG", "ClickTime", "Hour", 
			"Minutte"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHILE", "IDENTIFIER", "INTCONST", "DATO", "DAG", "MONAAD", "YEAR", 
			"WHITESPACE", "KOMMENTAR", "MULTILINECOMMENTS", "MYTOKEN", "TAG", "ClickTime", 
			"Hour", "Minutte"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public datoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "dato.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u00ba\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\6\3*\n\3\r\3\16\3+\3\4\5\4/\n\4\3\4\7\4\62\n\4\f\4\16"+
		"\4\65\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\5\6>\n\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6E\n\6\5\6G\n\6\3\7\5\7J\n\7\3\7\3\7\3\7\5\7O\n\7\3\b\3\b\7\bS\n\b\f"+
		"\b\16\bV\13\b\3\t\6\tY\n\t\r\t\16\tZ\3\t\3\t\3\n\3\n\3\n\3\n\7\nc\n\n"+
		"\f\n\16\nf\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13p\n\13\f\13"+
		"\16\13s\13\13\3\13\3\13\3\13\3\13\3\13\3\f\7\f{\n\f\f\f\16\f~\13\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\7\r\u0086\n\r\f\r\16\r\u0089\13\r\3\r\6\r\u008c\n"+
		"\r\r\r\16\r\u008d\3\r\7\r\u0091\n\r\f\r\16\r\u0094\13\r\3\r\7\r\u0097"+
		"\n\r\f\r\16\r\u009a\13\r\3\r\3\r\3\r\3\r\3\r\7\r\u00a1\n\r\f\r\16\r\u00a4"+
		"\13\r\3\r\6\r\u00a7\n\r\r\r\16\r\u00a8\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\5\17\u00b3\n\17\3\20\3\20\3\20\3\20\5\20\u00b9\n\20\2\2\21\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21\3\2\26\6\2\62;C\\aac|\b\2\13\f\"\"\62;C\\aac|\3\2\62;\3\2\63;\3\2"+
		"\63\64\3\2\65\65\3\2\62\63\3\2\63\63\3\2\62\64\4\2\13\f\"\"\3\2\f\f\3"+
		"\2\61\61\3\2,,\3\2c|\4\2\63;c|\4\2\62;c|\3\2\64\64\3\2\62\65\3\2\62\67"+
		"\3\2\63\67\2\u00cf\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3"+
		"!\3\2\2\2\5\'\3\2\2\2\7.\3\2\2\2\t\66\3\2\2\2\13F\3\2\2\2\rN\3\2\2\2\17"+
		"P\3\2\2\2\21X\3\2\2\2\23^\3\2\2\2\25i\3\2\2\2\27|\3\2\2\2\31\u008b\3\2"+
		"\2\2\33\u00aa\3\2\2\2\35\u00b2\3\2\2\2\37\u00b8\3\2\2\2!\"\7y\2\2\"#\7"+
		"j\2\2#$\7k\2\2$%\7n\2\2%&\7g\2\2&\4\3\2\2\2\')\t\2\2\2(*\t\3\2\2)(\3\2"+
		"\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\6\3\2\2\2-/\7/\2\2.-\3\2\2\2./\3\2"+
		"\2\2/\63\3\2\2\2\60\62\t\4\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2"+
		"\2\63\64\3\2\2\2\64\b\3\2\2\2\65\63\3\2\2\2\66\67\5\13\6\2\678\7/\2\2"+
		"89\5\r\7\29:\7/\2\2:;\5\17\b\2;\n\3\2\2\2<>\7\62\2\2=<\3\2\2\2=>\3\2\2"+
		"\2>?\3\2\2\2?G\t\5\2\2@A\t\6\2\2AE\t\4\2\2BC\t\7\2\2CE\t\b\2\2D@\3\2\2"+
		"\2DB\3\2\2\2EG\3\2\2\2F=\3\2\2\2FD\3\2\2\2G\f\3\2\2\2HJ\7\62\2\2IH\3\2"+
		"\2\2IJ\3\2\2\2JK\3\2\2\2KO\t\5\2\2LM\t\t\2\2MO\t\n\2\2NI\3\2\2\2NL\3\2"+
		"\2\2O\16\3\2\2\2PT\t\4\2\2QS\t\4\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3"+
		"\2\2\2U\20\3\2\2\2VT\3\2\2\2WY\t\13\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2"+
		"Z[\3\2\2\2[\\\3\2\2\2\\]\b\t\2\2]\22\3\2\2\2^_\7\61\2\2_`\7\61\2\2`d\3"+
		"\2\2\2ac\n\f\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3"+
		"\2\2\2gh\b\n\2\2h\24\3\2\2\2ij\7\61\2\2jk\7,\2\2kq\3\2\2\2lm\7,\2\2mp"+
		"\n\r\2\2np\n\16\2\2ol\3\2\2\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2"+
		"rt\3\2\2\2sq\3\2\2\2tu\7,\2\2uv\7\61\2\2vw\3\2\2\2wx\b\13\2\2x\26\3\2"+
		"\2\2y{\4\62\63\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2"+
		"~|\3\2\2\2\177\u0080\7\62\2\2\u0080\u0081\7\63\2\2\u0081\30\3\2\2\2\u0082"+
		"\u0083\7>\2\2\u0083\u0087\t\17\2\2\u0084\u0086\t\20\2\2\u0085\u0084\3"+
		"\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008c\7@\2\2\u008b\u0082\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u0092\3\2\2\2\u008f\u0091\t\3\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0098\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0095\u0097\t\3\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u00a6\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009b\u009c\7>\2\2\u009c\u009d\7\61\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u00a2\t\17\2\2\u009f\u00a1\t\21\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\7@\2\2\u00a6\u009b\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\32\3\2\2"+
		"\2\u00aa\u00ab\5\35\17\2\u00ab\u00ac\7<\2\2\u00ac\u00ad\5\37\20\2\u00ad"+
		"\34\3\2\2\2\u00ae\u00af\t\b\2\2\u00af\u00b3\t\4\2\2\u00b0\u00b1\t\22\2"+
		"\2\u00b1\u00b3\t\23\2\2\u00b2\u00ae\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\36\3\2\2\2\u00b4\u00b5\t\24\2\2\u00b5\u00b9\t\4\2\2\u00b6\u00b7\t\25"+
		"\2\2\u00b7\u00b9\t\4\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		" \3\2\2\2\31\2+.\63=DFINTZdoq|\u0087\u008d\u0092\u0098\u00a2\u00a8\u00b2"+
		"\u00b8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}