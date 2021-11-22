// Generated from Haskell.g by ANTLR 4.7.2
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, LBRACE=2, RBRACE=3, APPLY=4, MAIN=5, WHERE=6, TRUE=7, FALSE=8, NIL=9, 
		RPAREN=10, LPAREN=11, IF=12, THEN=13, ELSE=14, COMMA=15, EQ=16, EQUALS=17, 
		HEAD=18, TAIL=19, NULL=20, NOT=21, MINUS=22, AND=23, OR=24, NEQ=25, LT=26, 
		GT=27, LTE=28, GTE=29, PLUS=30, DIV=31, MUL=32, CONS=33, IDENT=34, NUMERAL=35, 
		LETTER=36;
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
			null, null, "'{'", "'}'", "'apply'", "'main'", "'where'", "'true'", "'false'", 
			"'nil'", "')'", "'('", "'if'", "'then'", "'else'", "','", "'=='", "'='", 
			"'hd'", "'tl'", "'null'", "'not'", "'-'", "'and'", "'or'", "'<>'", "'<'", 
			"'>'", "'<='", "'>='", "'+'", "'/'", "'*'", "'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LBRACE", "RBRACE", "APPLY", "MAIN", "WHERE", "TRUE", "FALSE", 
			"NIL", "RPAREN", "LPAREN", "IF", "THEN", "ELSE", "COMMA", "EQ", "EQUALS", 
			"HEAD", "TAIL", "NULL", "NOT", "MINUS", "AND", "OR", "NEQ", "LT", "GT", 
			"LTE", "GTE", "PLUS", "DIV", "MUL", "CONS", "IDENT", "NUMERAL", "LETTER"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitProgram(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitMain(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitDecls(this);
		}
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
		public TerminalNode LBRACE() { return getToken(HaskellParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HaskellParser.RBRACE, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitWhere(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_where);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(WHERE);
			setState(37);
			match(LBRACE);
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				decls();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			setState(43);
			match(RBRACE);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(45);
				match(IDENT);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitExpr(this);
		}
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
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APPLY:
				{
				setState(52);
				match(APPLY);
				setState(53);
				match(LPAREN);
				setState(54);
				expr(0);
				setState(55);
				match(COMMA);
				setState(56);
				expr(0);
				setState(57);
				match(RPAREN);
				}
				break;
			case NIL:
				{
				setState(59);
				match(NIL);
				}
				break;
			case IDENT:
				{
				setState(60);
				match(IDENT);
				}
				break;
			case NUMERAL:
				{
				setState(61);
				match(NUMERAL);
				}
				break;
			case TRUE:
				{
				setState(62);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(63);
				match(FALSE);
				}
				break;
			case HEAD:
			case TAIL:
			case NULL:
			case NOT:
			case MINUS:
				{
				setState(64);
				unop();
				setState(65);
				expr(3);
				}
				break;
			case IF:
				{
				setState(67);
				match(IF);
				setState(68);
				expr(0);
				setState(69);
				match(THEN);
				setState(70);
				expr(0);
				setState(71);
				match(ELSE);
				setState(72);
				expr(2);
				}
				break;
			case LPAREN:
				{
				setState(74);
				match(LPAREN);
				setState(75);
				expr(0);
				setState(76);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(86);
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
					setState(80);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(81);
					binop();
					setState(82);
					expr(5);
					}
					} 
				}
				setState(88);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterUnop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitUnop(this);
		}
	}

	public final UnopContext unop() throws RecognitionException {
		UnopContext _localctx = new UnopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitBinop(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&`\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\7\2\25\n\2\f"+
		"\2\16\2\30\13\2\3\3\3\3\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\3\4\5\4%\n"+
		"\4\3\5\3\5\3\5\6\5*\n\5\r\5\16\5+\3\5\3\5\3\6\7\6\61\n\6\f\6\16\6\64\13"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7Q\n\7\3\7\3\7\3\7\3\7\7\7"+
		"W\n\7\f\7\16\7Z\13\7\3\b\3\b\3\t\3\t\3\t\2\3\f\n\2\4\6\b\n\f\16\20\2\4"+
		"\3\2\24\30\4\2\22\22\30#\2e\2\22\3\2\2\2\4\31\3\2\2\2\6\37\3\2\2\2\b&"+
		"\3\2\2\2\n\62\3\2\2\2\fP\3\2\2\2\16[\3\2\2\2\20]\3\2\2\2\22\26\5\4\3\2"+
		"\23\25\5\6\4\2\24\23\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2"+
		"\27\3\3\2\2\2\30\26\3\2\2\2\31\32\7\7\2\2\32\33\7\23\2\2\33\35\5\f\7\2"+
		"\34\36\5\b\5\2\35\34\3\2\2\2\35\36\3\2\2\2\36\5\3\2\2\2\37 \7$\2\2 !\5"+
		"\n\6\2!\"\7\23\2\2\"$\5\f\7\2#%\5\b\5\2$#\3\2\2\2$%\3\2\2\2%\7\3\2\2\2"+
		"&\'\7\b\2\2\')\7\4\2\2(*\5\6\4\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2"+
		"\2,-\3\2\2\2-.\7\5\2\2.\t\3\2\2\2/\61\7$\2\2\60/\3\2\2\2\61\64\3\2\2\2"+
		"\62\60\3\2\2\2\62\63\3\2\2\2\63\13\3\2\2\2\64\62\3\2\2\2\65\66\b\7\1\2"+
		"\66\67\7\6\2\2\678\7\r\2\289\5\f\7\29:\7\21\2\2:;\5\f\7\2;<\7\f\2\2<Q"+
		"\3\2\2\2=Q\7\13\2\2>Q\7$\2\2?Q\7%\2\2@Q\7\t\2\2AQ\7\n\2\2BC\5\16\b\2C"+
		"D\5\f\7\5DQ\3\2\2\2EF\7\16\2\2FG\5\f\7\2GH\7\17\2\2HI\5\f\7\2IJ\7\20\2"+
		"\2JK\5\f\7\4KQ\3\2\2\2LM\7\r\2\2MN\5\f\7\2NO\7\f\2\2OQ\3\2\2\2P\65\3\2"+
		"\2\2P=\3\2\2\2P>\3\2\2\2P?\3\2\2\2P@\3\2\2\2PA\3\2\2\2PB\3\2\2\2PE\3\2"+
		"\2\2PL\3\2\2\2QX\3\2\2\2RS\f\6\2\2ST\5\20\t\2TU\5\f\7\7UW\3\2\2\2VR\3"+
		"\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\r\3\2\2\2ZX\3\2\2\2[\\\t\2\2\2\\"+
		"\17\3\2\2\2]^\t\3\2\2^\21\3\2\2\2\t\26\35$+\62PX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}