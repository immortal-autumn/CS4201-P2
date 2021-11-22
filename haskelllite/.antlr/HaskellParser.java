// Generated from c:\Users\Chris\OneDrive - University of St Andrews\Lectures\PLDI\2020\Practicals\P2\v2\Haskell.g by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HaskellParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, APPLY=2, MAIN=3, WHERE=4, TRUE=5, FALSE=6, NIL=7, RPAREN=8, LPAREN=9, 
		IF=10, THEN=11, ELSE=12, COMMA=13, EQ=14, EQUALS=15, HEAD=16, TAIL=17, 
		NULL=18, NOT=19, MINUS=20, AND=21, OR=22, NEQ=23, LT=24, GT=25, LTE=26, 
		GTE=27, PLUS=28, DIV=29, MUL=30, CONS=31, IDENT=32, NUMERAL=33, LETTER=34;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_decls = 2, RULE_where = 3, RULE_args = 4, 
		RULE_expr = 5, RULE_unop = 6, RULE_binop = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "decls", "where", "args", "expr", "unop", "binop"
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

	@Override
	public String getGrammarFileName() { return "Haskell.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HaskellParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<DeclsContext> decls() {
			return getRuleContexts(DeclsContext.class);
		}
		public DeclsContext decls(int i) {
			return getRuleContext(DeclsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			main();
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(17);
				decls();
				}
				}
				setState(22);
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(HaskellParser.MAIN, 0); }
		public TerminalNode EQUALS() { return getToken(HaskellParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(MAIN);
			setState(24);
			match(EQUALS);
			setState(25);
			expr(0);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(26);
				where();
				}
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

	public static class DeclsContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(HaskellParser.IDENT, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(HaskellParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
	}

	public final DeclsContext decls() throws RecognitionException {
		DeclsContext _localctx = new DeclsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(IDENT);
			setState(30);
			args();
			setState(31);
			match(EQUALS);
			setState(32);
			expr(0);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(33);
				where();
				}
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

	public static class WhereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(HaskellParser.WHERE, 0); }
		public List<DeclsContext> decls() {
			return getRuleContexts(DeclsContext.class);
		}
		public DeclsContext decls(int i) {
			return getRuleContext(DeclsContext.class,i);
		}
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_where);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(WHERE);
			setState(38); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(37);
					decls();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(40); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ArgsContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(HaskellParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(HaskellParser.IDENT, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(42);
				match(IDENT);
				}
				}
				setState(47);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode APPLY() { return getToken(HaskellParser.APPLY, 0); }
		public TerminalNode LPAREN() { return getToken(HaskellParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(HaskellParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(HaskellParser.RPAREN, 0); }
		public TerminalNode NIL() { return getToken(HaskellParser.NIL, 0); }
		public TerminalNode IDENT() { return getToken(HaskellParser.IDENT, 0); }
		public TerminalNode NUMERAL() { return getToken(HaskellParser.NUMERAL, 0); }
		public TerminalNode TRUE() { return getToken(HaskellParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(HaskellParser.FALSE, 0); }
		public UnopContext unop() {
			return getRuleContext(UnopContext.class,0);
		}
		public TerminalNode IF() { return getToken(HaskellParser.IF, 0); }
		public TerminalNode THEN() { return getToken(HaskellParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(HaskellParser.ELSE, 0); }
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(49);
				match(APPLY);
				setState(50);
				match(LPAREN);
				setState(51);
				expr(0);
				setState(52);
				match(COMMA);
				setState(53);
				expr(0);
				setState(54);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(56);
				match(NIL);
				}
				break;
			case 4:
				{
				setState(57);
				match(IDENT);
				}
				break;
			case 5:
				{
				setState(58);
				match(NUMERAL);
				}
				break;
			case 6:
				{
				setState(59);
				match(TRUE);
				}
				break;
			case 7:
				{
				setState(60);
				match(FALSE);
				}
				break;
			case 8:
				{
				setState(61);
				unop();
				setState(62);
				expr(0);
				setState(63);
				expr(3);
				}
				break;
			case 9:
				{
				setState(65);
				match(IF);
				setState(66);
				expr(0);
				setState(67);
				match(THEN);
				setState(68);
				expr(0);
				setState(69);
				match(ELSE);
				setState(70);
				expr(2);
				}
				break;
			case 10:
				{
				setState(72);
				match(LPAREN);
				setState(73);
				expr(0);
				setState(74);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(78);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(79);
					binop();
					setState(80);
					expr(5);
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnopContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(HaskellParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(HaskellParser.MINUS, 0); }
		public TerminalNode HEAD() { return getToken(HaskellParser.HEAD, 0); }
		public TerminalNode TAIL() { return getToken(HaskellParser.TAIL, 0); }
		public TerminalNode NULL() { return getToken(HaskellParser.NULL, 0); }
		public UnopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unop; }
	}

	public final UnopContext unop() throws RecognitionException {
		UnopContext _localctx = new UnopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEAD) | (1L << TAIL) | (1L << NULL) | (1L << NOT) | (1L << MINUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BinopContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(HaskellParser.AND, 0); }
		public TerminalNode OR() { return getToken(HaskellParser.OR, 0); }
		public TerminalNode EQ() { return getToken(HaskellParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(HaskellParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(HaskellParser.LT, 0); }
		public TerminalNode LTE() { return getToken(HaskellParser.LTE, 0); }
		public TerminalNode GT() { return getToken(HaskellParser.GT, 0); }
		public TerminalNode GTE() { return getToken(HaskellParser.GTE, 0); }
		public TerminalNode PLUS() { return getToken(HaskellParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(HaskellParser.MINUS, 0); }
		public TerminalNode DIV() { return getToken(HaskellParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(HaskellParser.MUL, 0); }
		public TerminalNode CONS() { return getToken(HaskellParser.CONS, 0); }
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << MINUS) | (1L << AND) | (1L << OR) | (1L << NEQ) | (1L << LT) | (1L << GT) | (1L << LTE) | (1L << GTE) | (1L << PLUS) | (1L << DIV) | (1L << MUL) | (1L << CONS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$^\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\7\2\25\n\2\f"+
		"\2\16\2\30\13\2\3\3\3\3\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\3\4\5\4%\n"+
		"\4\3\5\3\5\6\5)\n\5\r\5\16\5*\3\6\7\6.\n\6\f\6\16\6\61\13\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7O\n\7\3\7\3\7\3\7\3\7\7\7U\n\7\f\7"+
		"\16\7X\13\7\3\b\3\b\3\t\3\t\3\t\2\3\f\n\2\4\6\b\n\f\16\20\2\4\3\2\22\26"+
		"\4\2\20\20\26!\2d\2\22\3\2\2\2\4\31\3\2\2\2\6\37\3\2\2\2\b&\3\2\2\2\n"+
		"/\3\2\2\2\fN\3\2\2\2\16Y\3\2\2\2\20[\3\2\2\2\22\26\5\4\3\2\23\25\5\6\4"+
		"\2\24\23\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\3\3\2\2"+
		"\2\30\26\3\2\2\2\31\32\7\5\2\2\32\33\7\21\2\2\33\35\5\f\7\2\34\36\5\b"+
		"\5\2\35\34\3\2\2\2\35\36\3\2\2\2\36\5\3\2\2\2\37 \7\"\2\2 !\5\n\6\2!\""+
		"\7\21\2\2\"$\5\f\7\2#%\5\b\5\2$#\3\2\2\2$%\3\2\2\2%\7\3\2\2\2&(\7\6\2"+
		"\2\')\5\6\4\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\t\3\2\2\2,.\7"+
		"\"\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\13\3\2\2\2\61/\3"+
		"\2\2\2\62O\b\7\1\2\63\64\7\4\2\2\64\65\7\13\2\2\65\66\5\f\7\2\66\67\7"+
		"\17\2\2\678\5\f\7\289\7\n\2\29O\3\2\2\2:O\7\t\2\2;O\7\"\2\2<O\7#\2\2="+
		"O\7\7\2\2>O\7\b\2\2?@\5\16\b\2@A\5\f\7\2AB\5\f\7\5BO\3\2\2\2CD\7\f\2\2"+
		"DE\5\f\7\2EF\7\r\2\2FG\5\f\7\2GH\7\16\2\2HI\5\f\7\4IO\3\2\2\2JK\7\13\2"+
		"\2KL\5\f\7\2LM\7\n\2\2MO\3\2\2\2N\62\3\2\2\2N\63\3\2\2\2N:\3\2\2\2N;\3"+
		"\2\2\2N<\3\2\2\2N=\3\2\2\2N>\3\2\2\2N?\3\2\2\2NC\3\2\2\2NJ\3\2\2\2OV\3"+
		"\2\2\2PQ\f\6\2\2QR\5\20\t\2RS\5\f\7\7SU\3\2\2\2TP\3\2\2\2UX\3\2\2\2VT"+
		"\3\2\2\2VW\3\2\2\2W\r\3\2\2\2XV\3\2\2\2YZ\t\2\2\2Z\17\3\2\2\2[\\\t\3\2"+
		"\2\\\21\3\2\2\2\t\26\35$*/NV";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}