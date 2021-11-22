// Generated from c:\Users\Chris\OneDrive - University of St Andrews\Lectures\PLDI\2020\Practicals\P2\v2\Haskell.g by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HaskellLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, APPLY=2, MAIN=3, WHERE=4, TRUE=5, FALSE=6, NIL=7, RPAREN=8, LPAREN=9, 
		IF=10, THEN=11, ELSE=12, COMMA=13, EQ=14, EQUALS=15, HEAD=16, TAIL=17, 
		NULL=18, NOT=19, MINUS=20, AND=21, OR=22, NEQ=23, LT=24, GT=25, LTE=26, 
		GTE=27, PLUS=28, DIV=29, MUL=30, CONS=31, IDENT=32, NUMERAL=33, LETTER=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "APPLY", "MAIN", "WHERE", "TRUE", "FALSE", "NIL", "RPAREN", "LPAREN", 
			"IF", "THEN", "ELSE", "COMMA", "EQ", "EQUALS", "HEAD", "TAIL", "NULL", 
			"NOT", "MINUS", "AND", "OR", "NEQ", "LT", "GT", "LTE", "GTE", "PLUS", 
			"DIV", "MUL", "CONS", "IDENT", "NUMERAL", "LETTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'apply'", "'main'", "'where'", "'true'", "'false'", "'nil'", 
			"')'", "'('", "'if'", "'then'", "'else'", "','", "'=='", "'='", "'hd'", 
			"'tl'", "'null'", "'not'", "'-'", "'and'", "'or'", "'<>'", "'<'", "'>'", 
			"'<='", "'>='", "'+'", "'/'", "'*'", "'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "APPLY", "MAIN", "WHERE", "TRUE", "FALSE", "NIL", "RPAREN", 
			"LPAREN", "IF", "THEN", "ELSE", "COMMA", "EQ", "EQUALS", "HEAD", "TAIL", 
			"NULL", "NOT", "MINUS", "AND", "OR", "NEQ", "LT", "GT", "LTE", "GTE", 
			"PLUS", "DIV", "MUL", "CONS", "IDENT", "NUMERAL", "LETTER"
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


	public HaskellLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Haskell.g"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u00c8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\5\2J\n\2\3\2\6\2M\n\2\r\2\16\2N\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\7!\u00bc\n!\f!\16!\u00bf\13"+
		"!\3\"\6\"\u00c2\n\"\r\"\16\"\u00c3\3#\5#\u00c7\n#\2\2$\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$\3\2\5"+
		"\4\2\13\13\"\"\3\2\62;\5\2C\\aac|\2\u00cd\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3L\3\2\2\2\5R\3\2\2\2\7X\3\2\2\2\t]"+
		"\3\2\2\2\13c\3\2\2\2\rh\3\2\2\2\17n\3\2\2\2\21r\3\2\2\2\23t\3\2\2\2\25"+
		"v\3\2\2\2\27y\3\2\2\2\31~\3\2\2\2\33\u0083\3\2\2\2\35\u0085\3\2\2\2\37"+
		"\u0088\3\2\2\2!\u008a\3\2\2\2#\u008d\3\2\2\2%\u0090\3\2\2\2\'\u0095\3"+
		"\2\2\2)\u0099\3\2\2\2+\u009b\3\2\2\2-\u009f\3\2\2\2/\u00a2\3\2\2\2\61"+
		"\u00a5\3\2\2\2\63\u00a7\3\2\2\2\65\u00a9\3\2\2\2\67\u00ac\3\2\2\29\u00af"+
		"\3\2\2\2;\u00b1\3\2\2\2=\u00b3\3\2\2\2?\u00b5\3\2\2\2A\u00b8\3\2\2\2C"+
		"\u00c1\3\2\2\2E\u00c6\3\2\2\2GM\t\2\2\2HJ\7\17\2\2IH\3\2\2\2IJ\3\2\2\2"+
		"JK\3\2\2\2KM\7\f\2\2LG\3\2\2\2LI\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2"+
		"OP\3\2\2\2PQ\b\2\2\2Q\4\3\2\2\2RS\7c\2\2ST\7r\2\2TU\7r\2\2UV\7n\2\2VW"+
		"\7{\2\2W\6\3\2\2\2XY\7o\2\2YZ\7c\2\2Z[\7k\2\2[\\\7p\2\2\\\b\3\2\2\2]^"+
		"\7y\2\2^_\7j\2\2_`\7g\2\2`a\7t\2\2ab\7g\2\2b\n\3\2\2\2cd\7v\2\2de\7t\2"+
		"\2ef\7w\2\2fg\7g\2\2g\f\3\2\2\2hi\7h\2\2ij\7c\2\2jk\7n\2\2kl\7u\2\2lm"+
		"\7g\2\2m\16\3\2\2\2no\7p\2\2op\7k\2\2pq\7n\2\2q\20\3\2\2\2rs\7+\2\2s\22"+
		"\3\2\2\2tu\7*\2\2u\24\3\2\2\2vw\7k\2\2wx\7h\2\2x\26\3\2\2\2yz\7v\2\2z"+
		"{\7j\2\2{|\7g\2\2|}\7p\2\2}\30\3\2\2\2~\177\7g\2\2\177\u0080\7n\2\2\u0080"+
		"\u0081\7u\2\2\u0081\u0082\7g\2\2\u0082\32\3\2\2\2\u0083\u0084\7.\2\2\u0084"+
		"\34\3\2\2\2\u0085\u0086\7?\2\2\u0086\u0087\7?\2\2\u0087\36\3\2\2\2\u0088"+
		"\u0089\7?\2\2\u0089 \3\2\2\2\u008a\u008b\7j\2\2\u008b\u008c\7f\2\2\u008c"+
		"\"\3\2\2\2\u008d\u008e\7v\2\2\u008e\u008f\7n\2\2\u008f$\3\2\2\2\u0090"+
		"\u0091\7p\2\2\u0091\u0092\7w\2\2\u0092\u0093\7n\2\2\u0093\u0094\7n\2\2"+
		"\u0094&\3\2\2\2\u0095\u0096\7p\2\2\u0096\u0097\7q\2\2\u0097\u0098\7v\2"+
		"\2\u0098(\3\2\2\2\u0099\u009a\7/\2\2\u009a*\3\2\2\2\u009b\u009c\7c\2\2"+
		"\u009c\u009d\7p\2\2\u009d\u009e\7f\2\2\u009e,\3\2\2\2\u009f\u00a0\7q\2"+
		"\2\u00a0\u00a1\7t\2\2\u00a1.\3\2\2\2\u00a2\u00a3\7>\2\2\u00a3\u00a4\7"+
		"@\2\2\u00a4\60\3\2\2\2\u00a5\u00a6\7>\2\2\u00a6\62\3\2\2\2\u00a7\u00a8"+
		"\7@\2\2\u00a8\64\3\2\2\2\u00a9\u00aa\7>\2\2\u00aa\u00ab\7?\2\2\u00ab\66"+
		"\3\2\2\2\u00ac\u00ad\7@\2\2\u00ad\u00ae\7?\2\2\u00ae8\3\2\2\2\u00af\u00b0"+
		"\7-\2\2\u00b0:\3\2\2\2\u00b1\u00b2\7\61\2\2\u00b2<\3\2\2\2\u00b3\u00b4"+
		"\7,\2\2\u00b4>\3\2\2\2\u00b5\u00b6\7<\2\2\u00b6\u00b7\7<\2\2\u00b7@\3"+
		"\2\2\2\u00b8\u00bd\5E#\2\u00b9\u00bc\5E#\2\u00ba\u00bc\t\3\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00beB\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c2\t\3\2\2"+
		"\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4D\3\2\2\2\u00c5\u00c7\t\4\2\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"F\3\2\2\2\n\2ILN\u00bb\u00bd\u00c3\u00c6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}