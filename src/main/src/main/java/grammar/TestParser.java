// Generated from C:/Users/gmigu/Documents/3ano/2sem/ELP/projeto/src/main/resources/grammar\Test.g4 by ANTLR 4.12.0
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TestParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, FOR=3, IN=4, BOOLEAN=5, OPERATOR=6, CONDITION=7, ASSIGN=8, 
		DIV=9, TIL=10, COMA=11, BRACKET=12, VERTICAL=13, OPEN=14, CLOSE=15, END=16, 
		INT=17, CAPS=18, LOWER=19, ENTER=20, WS=21;
	public static final int
		RULE_script = 0, RULE_constante = 1, RULE_propriedade = 2, RULE_instrucao = 3, 
		RULE_div = 4, RULE_objeto = 5, RULE_point2D = 6, RULE_dim = 7, RULE_interval = 8, 
		RULE_color = 9, RULE_cut = 10, RULE_full = 11, RULE_colorCommand = 12, 
		RULE_figure = 13, RULE_estrutura = 14, RULE_fig = 15, RULE_shape = 16, 
		RULE_ifCommand = 17, RULE_condicao = 18, RULE_forloop = 19, RULE_capsID = 20, 
		RULE_lowerID = 21, RULE_expressao = 22, RULE_aux = 23, RULE_operacao = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "constante", "propriedade", "instrucao", "div", "objeto", "point2D", 
			"dim", "interval", "color", "cut", "full", "colorCommand", "figure", 
			"estrutura", "fig", "shape", "ifCommand", "condicao", "forloop", "capsID", 
			"lowerID", "expressao", "aux", "operacao"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'for'", "'in'", null, null, null, "':'", "'---'", 
			"'~'", "','", null, "'|'", "'('", "')'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "FOR", "IN", "BOOLEAN", "OPERATOR", "CONDITION", 
			"ASSIGN", "DIV", "TIL", "COMA", "BRACKET", "VERTICAL", "OPEN", "CLOSE", 
			"END", "INT", "CAPS", "LOWER", "ENTER", "WS"
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
	public String getGrammarFileName() { return "Test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TestParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptContext extends ParserRuleContext {
		public List<DivContext> div() {
			return getRuleContexts(DivContext.class);
		}
		public DivContext div(int i) {
			return getRuleContext(DivContext.class,i);
		}
		public TerminalNode EOF() { return getToken(TestParser.EOF, 0); }
		public List<ConstanteContext> constante() {
			return getRuleContexts(ConstanteContext.class);
		}
		public ConstanteContext constante(int i) {
			return getRuleContext(ConstanteContext.class,i);
		}
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public List<PropriedadeContext> propriedade() {
			return getRuleContexts(PropriedadeContext.class);
		}
		public PropriedadeContext propriedade(int i) {
			return getRuleContext(PropriedadeContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				constante();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CAPS );
			setState(55);
			div();
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(56);
					propriedade();
					}
					}
					setState(59); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LOWER );
				setState(61);
				div();
				}
				break;
			}
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				instrucao();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 524298L) != 0) );
			setState(70);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstanteContext extends ParserRuleContext {
		public CapsIDContext capsID() {
			return getRuleContext(CapsIDContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(TestParser.ASSIGN, 0); }
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public TerminalNode ENTER() { return getToken(TestParser.ENTER, 0); }
		public ConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterConstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitConstante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitConstante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstanteContext constante() throws RecognitionException {
		ConstanteContext _localctx = new ConstanteContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			capsID();
			setState(73);
			match(ASSIGN);
			setState(74);
			objeto();
			setState(75);
			match(ENTER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropriedadeContext extends ParserRuleContext {
		public LowerIDContext lowerID() {
			return getRuleContext(LowerIDContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(TestParser.ASSIGN, 0); }
		public TerminalNode ENTER() { return getToken(TestParser.ENTER, 0); }
		public CapsIDContext capsID() {
			return getRuleContext(CapsIDContext.class,0);
		}
		public DimContext dim() {
			return getRuleContext(DimContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public PropriedadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propriedade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterPropriedade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitPropriedade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitPropriedade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropriedadeContext propriedade() throws RecognitionException {
		PropriedadeContext _localctx = new PropriedadeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_propriedade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			lowerID();
			setState(78);
			match(ASSIGN);
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(79);
				capsID();
				}
				break;
			case 2:
				{
				setState(80);
				dim();
				}
				break;
			case 3:
				{
				setState(81);
				color();
				}
				break;
			}
			setState(84);
			match(ENTER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstrucaoContext extends ParserRuleContext {
		public TerminalNode ENTER() { return getToken(TestParser.ENTER, 0); }
		public ColorCommandContext colorCommand() {
			return getRuleContext(ColorCommandContext.class,0);
		}
		public FigureContext figure() {
			return getRuleContext(FigureContext.class,0);
		}
		public EstruturaContext estrutura() {
			return getRuleContext(EstruturaContext.class,0);
		}
		public InstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitInstrucao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitInstrucao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instrucao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(86);
				colorCommand();
				}
				break;
			case 2:
				{
				setState(87);
				figure();
				}
				break;
			case 3:
				{
				setState(88);
				estrutura();
				}
				break;
			}
			setState(91);
			match(ENTER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DivContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(TestParser.DIV, 0); }
		public TerminalNode ENTER() { return getToken(TestParser.ENTER, 0); }
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(DIV);
			setState(94);
			match(ENTER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjetoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(TestParser.BOOLEAN, 0); }
		public Point2DContext point2D() {
			return getRuleContext(Point2DContext.class,0);
		}
		public DimContext dim() {
			return getRuleContext(DimContext.class,0);
		}
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public ObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterObjeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitObjeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitObjeto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjetoContext objeto() throws RecognitionException {
		ObjetoContext _localctx = new ObjetoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_objeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(96);
				expressao();
				}
				break;
			case 2:
				{
				setState(97);
				match(BOOLEAN);
				}
				break;
			case 3:
				{
				setState(98);
				point2D();
				}
				break;
			case 4:
				{
				setState(99);
				dim();
				}
				break;
			case 5:
				{
				setState(100);
				interval();
				}
				break;
			case 6:
				{
				setState(101);
				color();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Point2DContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode COMA() { return getToken(TestParser.COMA, 0); }
		public Point2DContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point2D; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterPoint2D(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitPoint2D(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitPoint2D(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Point2DContext point2D() throws RecognitionException {
		Point2DContext _localctx = new Point2DContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_point2D);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			expressao();
			setState(105);
			match(COMA);
			setState(106);
			expressao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DimContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode TIL() { return getToken(TestParser.TIL, 0); }
		public DimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterDim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitDim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitDim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimContext dim() throws RecognitionException {
		DimContext _localctx = new DimContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			expressao();
			setState(109);
			match(TIL);
			setState(110);
			expressao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntervalContext extends ParserRuleContext {
		public List<TerminalNode> BRACKET() { return getTokens(TestParser.BRACKET); }
		public TerminalNode BRACKET(int i) {
			return getToken(TestParser.BRACKET, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode COMA() { return getToken(TestParser.COMA, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(BRACKET);
			setState(113);
			expressao();
			setState(114);
			match(COMA);
			setState(115);
			expressao();
			setState(116);
			match(BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColorContext extends ParserRuleContext {
		public CutContext cut() {
			return getRuleContext(CutContext.class,0);
		}
		public FullContext full() {
			return getRuleContext(FullContext.class,0);
		}
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_color);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERTICAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				cut();
				}
				break;
			case OPEN:
			case INT:
			case CAPS:
			case LOWER:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				full();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CutContext extends ParserRuleContext {
		public List<TerminalNode> VERTICAL() { return getTokens(TestParser.VERTICAL); }
		public TerminalNode VERTICAL(int i) {
			return getToken(TestParser.VERTICAL, i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterCut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitCut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitCut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CutContext cut() throws RecognitionException {
		CutContext _localctx = new CutContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cut);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(VERTICAL);
			setState(123);
			expressao();
			setState(124);
			match(VERTICAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FullContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> VERTICAL() { return getTokens(TestParser.VERTICAL); }
		public TerminalNode VERTICAL(int i) {
			return getToken(TestParser.VERTICAL, i);
		}
		public FullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitFull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullContext full() throws RecognitionException {
		FullContext _localctx = new FullContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_full);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			expressao();
			setState(127);
			match(VERTICAL);
			setState(128);
			expressao();
			setState(129);
			match(VERTICAL);
			setState(130);
			expressao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColorCommandContext extends ParserRuleContext {
		public LowerIDContext lowerID() {
			return getRuleContext(LowerIDContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public CapsIDContext capsID() {
			return getRuleContext(CapsIDContext.class,0);
		}
		public ColorCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterColorCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitColorCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitColorCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorCommandContext colorCommand() throws RecognitionException {
		ColorCommandContext _localctx = new ColorCommandContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_colorCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			lowerID();
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(133);
				color();
				}
				break;
			case 2:
				{
				setState(134);
				capsID();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FigureContext extends ParserRuleContext {
		public LowerIDContext lowerID() {
			return getRuleContext(LowerIDContext.class,0);
		}
		public FigContext fig() {
			return getRuleContext(FigContext.class,0);
		}
		public ShapeContext shape() {
			return getRuleContext(ShapeContext.class,0);
		}
		public FigureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_figure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterFigure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitFigure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitFigure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FigureContext figure() throws RecognitionException {
		FigureContext _localctx = new FigureContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_figure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			lowerID();
			setState(138);
			fig();
			setState(139);
			shape();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EstruturaContext extends ParserRuleContext {
		public IfCommandContext ifCommand() {
			return getRuleContext(IfCommandContext.class,0);
		}
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}
		public EstruturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estrutura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterEstrutura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitEstrutura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitEstrutura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstruturaContext estrutura() throws RecognitionException {
		EstruturaContext _localctx = new EstruturaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_estrutura);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				ifCommand();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				forloop();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FigContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode COMA() { return getToken(TestParser.COMA, 0); }
		public FigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterFig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitFig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitFig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FigContext fig() throws RecognitionException {
		FigContext _localctx = new FigContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			expressao();
			setState(146);
			match(COMA);
			setState(147);
			expressao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShapeContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DimContext dim() {
			return getRuleContext(DimContext.class,0);
		}
		public ShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterShape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitShape(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitShape(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShapeContext shape() throws RecognitionException {
		ShapeContext _localctx = new ShapeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_shape);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				expressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				dim();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfCommandContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(TestParser.IF, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public List<TerminalNode> ENTER() { return getTokens(TestParser.ENTER); }
		public TerminalNode ENTER(int i) {
			return getToken(TestParser.ENTER, i);
		}
		public TerminalNode END() { return getToken(TestParser.END, 0); }
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(TestParser.ELSE, 0); }
		public IfCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterIfCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitIfCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitIfCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfCommandContext ifCommand() throws RecognitionException {
		IfCommandContext _localctx = new IfCommandContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(IF);
			setState(154);
			condicao();
			setState(155);
			match(ENTER);
			setState(157); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(156);
				instrucao();
				}
				}
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 524298L) != 0) );
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(161);
				match(ELSE);
				setState(162);
				match(ENTER);
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(163);
					instrucao();
					}
					}
					setState(166); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 524298L) != 0) );
				}
			}

			setState(170);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicaoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TestParser.INT, 0); }
		public TerminalNode CONDITION() { return getToken(TestParser.CONDITION, 0); }
		public List<OperacaoContext> operacao() {
			return getRuleContexts(OperacaoContext.class);
		}
		public OperacaoContext operacao(int i) {
			return getRuleContext(OperacaoContext.class,i);
		}
		public TerminalNode BOOLEAN() { return getToken(TestParser.BOOLEAN, 0); }
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitCondicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitCondicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condicao);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(173);
					operacao(0);
					}
					}
					setState(176); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 933888L) != 0) );
				setState(178);
				match(CONDITION);
				setState(179);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(BOOLEAN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(182);
					operacao(0);
					}
					}
					setState(185); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 933888L) != 0) );
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForloopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(TestParser.FOR, 0); }
		public LowerIDContext lowerID() {
			return getRuleContext(LowerIDContext.class,0);
		}
		public TerminalNode IN() { return getToken(TestParser.IN, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TerminalNode ENTER() { return getToken(TestParser.ENTER, 0); }
		public TerminalNode END() { return getToken(TestParser.END, 0); }
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterForloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitForloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitForloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(FOR);
			setState(190);
			lowerID();
			setState(191);
			match(IN);
			setState(192);
			interval();
			setState(193);
			match(ENTER);
			setState(195); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(194);
				instrucao();
				}
				}
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 524298L) != 0) );
			setState(199);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CapsIDContext extends ParserRuleContext {
		public TerminalNode CAPS() { return getToken(TestParser.CAPS, 0); }
		public CapsIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capsID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterCapsID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitCapsID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitCapsID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CapsIDContext capsID() throws RecognitionException {
		CapsIDContext _localctx = new CapsIDContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_capsID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(CAPS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LowerIDContext extends ParserRuleContext {
		public TerminalNode LOWER() { return getToken(TestParser.LOWER, 0); }
		public LowerIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowerID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterLowerID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitLowerID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitLowerID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LowerIDContext lowerID() throws RecognitionException {
		LowerIDContext _localctx = new LowerIDContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lowerID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(LOWER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TestParser.INT, 0); }
		public TerminalNode CAPS() { return getToken(TestParser.CAPS, 0); }
		public TerminalNode LOWER() { return getToken(TestParser.LOWER, 0); }
		public List<OperacaoContext> operacao() {
			return getRuleContexts(OperacaoContext.class);
		}
		public OperacaoContext operacao(int i) {
			return getRuleContext(OperacaoContext.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressao);
		try {
			int _alt;
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(CAPS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				match(LOWER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(209); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(208);
						operacao(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(211); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class AuxContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TestParser.INT, 0); }
		public TerminalNode CAPS() { return getToken(TestParser.CAPS, 0); }
		public TerminalNode LOWER() { return getToken(TestParser.LOWER, 0); }
		public AuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitAux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitAux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxContext aux() throws RecognitionException {
		AuxContext _localctx = new AuxContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_aux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperacaoContext extends ParserRuleContext {
		public List<AuxContext> aux() {
			return getRuleContexts(AuxContext.class);
		}
		public AuxContext aux(int i) {
			return getRuleContext(AuxContext.class,i);
		}
		public TerminalNode OPERATOR() { return getToken(TestParser.OPERATOR, 0); }
		public List<OperacaoContext> operacao() {
			return getRuleContexts(OperacaoContext.class);
		}
		public OperacaoContext operacao(int i) {
			return getRuleContext(OperacaoContext.class,i);
		}
		public TerminalNode OPEN() { return getToken(TestParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(TestParser.CLOSE, 0); }
		public OperacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterOperacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitOperacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitOperacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacaoContext operacao() throws RecognitionException {
		return operacao(0);
	}

	private OperacaoContext operacao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperacaoContext _localctx = new OperacaoContext(_ctx, _parentState);
		OperacaoContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_operacao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(218);
				aux();
				setState(219);
				match(OPERATOR);
				setState(220);
				aux();
				}
				break;
			case 2:
				{
				setState(222);
				aux();
				setState(223);
				match(OPERATOR);
				setState(224);
				operacao(5);
				}
				break;
			case 3:
				{
				setState(226);
				aux();
				setState(227);
				match(OPERATOR);
				setState(228);
				match(OPEN);
				setState(229);
				operacao(0);
				setState(230);
				match(CLOSE);
				}
				break;
			case 4:
				{
				setState(232);
				match(OPEN);
				setState(233);
				operacao(0);
				setState(234);
				match(CLOSE);
				setState(235);
				match(OPERATOR);
				setState(236);
				operacao(2);
				}
				break;
			case 5:
				{
				setState(238);
				match(OPEN);
				setState(239);
				operacao(0);
				setState(240);
				match(CLOSE);
				setState(241);
				match(OPERATOR);
				setState(242);
				aux();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperacaoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operacao);
					setState(246);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(247);
					match(OPERATOR);
					setState(248);
					match(OPEN);
					setState(249);
					operacao(0);
					setState(250);
					match(CLOSE);
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return operacao_sempred((OperacaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operacao_sempred(OperacaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0015\u0102\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0001\u0000\u0004\u00004\b\u0000\u000b\u0000\f\u00005\u0001\u0000"+
		"\u0001\u0000\u0004\u0000:\b\u0000\u000b\u0000\f\u0000;\u0001\u0000\u0001"+
		"\u0000\u0003\u0000@\b\u0000\u0001\u0000\u0004\u0000C\b\u0000\u000b\u0000"+
		"\f\u0000D\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002S\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003Z\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005g\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0003\ty\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0088\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u0090\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u0098\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u009e\b\u0011\u000b\u0011\f"+
		"\u0011\u009f\u0001\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u00a5\b\u0011"+
		"\u000b\u0011\f\u0011\u00a6\u0003\u0011\u00a9\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0004\u0012\u00af\b\u0012\u000b\u0012\f"+
		"\u0012\u00b0\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0004\u0012\u00b8\b\u0012\u000b\u0012\f\u0012\u00b9\u0003\u0012\u00bc"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0004\u0013\u00c4\b\u0013\u000b\u0013\f\u0013\u00c5\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0004\u0016\u00d2\b\u0016\u000b\u0016"+
		"\f\u0016\u00d3\u0003\u0016\u00d6\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00f5\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u00fd"+
		"\b\u0018\n\u0018\f\u0018\u0100\t\u0018\u0001\u0018\u0000\u00010\u0019"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.0\u0000\u0001\u0001\u0000\u0011\u0013\u010b\u0000"+
		"3\u0001\u0000\u0000\u0000\u0002H\u0001\u0000\u0000\u0000\u0004M\u0001"+
		"\u0000\u0000\u0000\u0006Y\u0001\u0000\u0000\u0000\b]\u0001\u0000\u0000"+
		"\u0000\nf\u0001\u0000\u0000\u0000\fh\u0001\u0000\u0000\u0000\u000el\u0001"+
		"\u0000\u0000\u0000\u0010p\u0001\u0000\u0000\u0000\u0012x\u0001\u0000\u0000"+
		"\u0000\u0014z\u0001\u0000\u0000\u0000\u0016~\u0001\u0000\u0000\u0000\u0018"+
		"\u0084\u0001\u0000\u0000\u0000\u001a\u0089\u0001\u0000\u0000\u0000\u001c"+
		"\u008f\u0001\u0000\u0000\u0000\u001e\u0091\u0001\u0000\u0000\u0000 \u0097"+
		"\u0001\u0000\u0000\u0000\"\u0099\u0001\u0000\u0000\u0000$\u00bb\u0001"+
		"\u0000\u0000\u0000&\u00bd\u0001\u0000\u0000\u0000(\u00c9\u0001\u0000\u0000"+
		"\u0000*\u00cb\u0001\u0000\u0000\u0000,\u00d5\u0001\u0000\u0000\u0000."+
		"\u00d7\u0001\u0000\u0000\u00000\u00f4\u0001\u0000\u0000\u000024\u0003"+
		"\u0002\u0001\u000032\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u0000"+
		"53\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u00007?\u0003\b\u0004\u00008:\u0003\u0004\u0002\u000098\u0001\u0000\u0000"+
		"\u0000:;\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0003\b\u0004\u0000>@\u0001\u0000"+
		"\u0000\u0000?9\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@B\u0001"+
		"\u0000\u0000\u0000AC\u0003\u0006\u0003\u0000BA\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EF\u0001\u0000\u0000\u0000FG\u0005\u0000\u0000\u0001G\u0001\u0001"+
		"\u0000\u0000\u0000HI\u0003(\u0014\u0000IJ\u0005\b\u0000\u0000JK\u0003"+
		"\n\u0005\u0000KL\u0005\u0014\u0000\u0000L\u0003\u0001\u0000\u0000\u0000"+
		"MN\u0003*\u0015\u0000NR\u0005\b\u0000\u0000OS\u0003(\u0014\u0000PS\u0003"+
		"\u000e\u0007\u0000QS\u0003\u0012\t\u0000RO\u0001\u0000\u0000\u0000RP\u0001"+
		"\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TU\u0005\u0014\u0000\u0000U\u0005\u0001\u0000\u0000\u0000VZ\u0003\u0018"+
		"\f\u0000WZ\u0003\u001a\r\u0000XZ\u0003\u001c\u000e\u0000YV\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000YX\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[\\\u0005\u0014\u0000\u0000\\\u0007\u0001\u0000\u0000"+
		"\u0000]^\u0005\t\u0000\u0000^_\u0005\u0014\u0000\u0000_\t\u0001\u0000"+
		"\u0000\u0000`g\u0003,\u0016\u0000ag\u0005\u0005\u0000\u0000bg\u0003\f"+
		"\u0006\u0000cg\u0003\u000e\u0007\u0000dg\u0003\u0010\b\u0000eg\u0003\u0012"+
		"\t\u0000f`\u0001\u0000\u0000\u0000fa\u0001\u0000\u0000\u0000fb\u0001\u0000"+
		"\u0000\u0000fc\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fe\u0001"+
		"\u0000\u0000\u0000g\u000b\u0001\u0000\u0000\u0000hi\u0003,\u0016\u0000"+
		"ij\u0005\u000b\u0000\u0000jk\u0003,\u0016\u0000k\r\u0001\u0000\u0000\u0000"+
		"lm\u0003,\u0016\u0000mn\u0005\n\u0000\u0000no\u0003,\u0016\u0000o\u000f"+
		"\u0001\u0000\u0000\u0000pq\u0005\f\u0000\u0000qr\u0003,\u0016\u0000rs"+
		"\u0005\u000b\u0000\u0000st\u0003,\u0016\u0000tu\u0005\f\u0000\u0000u\u0011"+
		"\u0001\u0000\u0000\u0000vy\u0003\u0014\n\u0000wy\u0003\u0016\u000b\u0000"+
		"xv\u0001\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000y\u0013\u0001\u0000"+
		"\u0000\u0000z{\u0005\r\u0000\u0000{|\u0003,\u0016\u0000|}\u0005\r\u0000"+
		"\u0000}\u0015\u0001\u0000\u0000\u0000~\u007f\u0003,\u0016\u0000\u007f"+
		"\u0080\u0005\r\u0000\u0000\u0080\u0081\u0003,\u0016\u0000\u0081\u0082"+
		"\u0005\r\u0000\u0000\u0082\u0083\u0003,\u0016\u0000\u0083\u0017\u0001"+
		"\u0000\u0000\u0000\u0084\u0087\u0003*\u0015\u0000\u0085\u0088\u0003\u0012"+
		"\t\u0000\u0086\u0088\u0003(\u0014\u0000\u0087\u0085\u0001\u0000\u0000"+
		"\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0019\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0003*\u0015\u0000\u008a\u008b\u0003\u001e\u000f\u0000"+
		"\u008b\u008c\u0003 \u0010\u0000\u008c\u001b\u0001\u0000\u0000\u0000\u008d"+
		"\u0090\u0003\"\u0011\u0000\u008e\u0090\u0003&\u0013\u0000\u008f\u008d"+
		"\u0001\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u001d"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0003,\u0016\u0000\u0092\u0093\u0005"+
		"\u000b\u0000\u0000\u0093\u0094\u0003,\u0016\u0000\u0094\u001f\u0001\u0000"+
		"\u0000\u0000\u0095\u0098\u0003,\u0016\u0000\u0096\u0098\u0003\u000e\u0007"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000"+
		"\u0000\u0098!\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u0001\u0000\u0000"+
		"\u009a\u009b\u0003$\u0012\u0000\u009b\u009d\u0005\u0014\u0000\u0000\u009c"+
		"\u009e\u0003\u0006\u0003\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a8\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0005\u0002\u0000\u0000\u00a2\u00a4\u0005\u0014\u0000\u0000\u00a3"+
		"\u00a5\u0003\u0006\u0003\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0010\u0000\u0000\u00ab"+
		"#\u0001\u0000\u0000\u0000\u00ac\u00bc\u0005\u0011\u0000\u0000\u00ad\u00af"+
		"\u00030\u0018\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005"+
		"\u0007\u0000\u0000\u00b3\u00b4\u0005\u0011\u0000\u0000\u00b4\u00bc\u0001"+
		"\u0000\u0000\u0000\u00b5\u00bc\u0005\u0005\u0000\u0000\u00b6\u00b8\u0003"+
		"0\u0018\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00ac\u0001\u0000"+
		"\u0000\u0000\u00bb\u00ae\u0001\u0000\u0000\u0000\u00bb\u00b5\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b7\u0001\u0000\u0000\u0000\u00bc%\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0005\u0003\u0000\u0000\u00be\u00bf\u0003*\u0015\u0000"+
		"\u00bf\u00c0\u0005\u0004\u0000\u0000\u00c0\u00c1\u0003\u0010\b\u0000\u00c1"+
		"\u00c3\u0005\u0014\u0000\u0000\u00c2\u00c4\u0003\u0006\u0003\u0000\u00c3"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0010\u0000\u0000\u00c8"+
		"\'\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u0012\u0000\u0000\u00ca)"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u0013\u0000\u0000\u00cc+\u0001"+
		"\u0000\u0000\u0000\u00cd\u00d6\u0005\u0011\u0000\u0000\u00ce\u00d6\u0005"+
		"\u0012\u0000\u0000\u00cf\u00d6\u0005\u0013\u0000\u0000\u00d0\u00d2\u0003"+
		"0\u0018\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00cd\u0001\u0000"+
		"\u0000\u0000\u00d5\u00ce\u0001\u0000\u0000\u0000\u00d5\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d1\u0001\u0000\u0000\u0000\u00d6-\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0007\u0000\u0000\u0000\u00d8/\u0001\u0000\u0000\u0000"+
		"\u00d9\u00da\u0006\u0018\uffff\uffff\u0000\u00da\u00db\u0003.\u0017\u0000"+
		"\u00db\u00dc\u0005\u0006\u0000\u0000\u00dc\u00dd\u0003.\u0017\u0000\u00dd"+
		"\u00f5\u0001\u0000\u0000\u0000\u00de\u00df\u0003.\u0017\u0000\u00df\u00e0"+
		"\u0005\u0006\u0000\u0000\u00e0\u00e1\u00030\u0018\u0005\u00e1\u00f5\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0003.\u0017\u0000\u00e3\u00e4\u0005\u0006"+
		"\u0000\u0000\u00e4\u00e5\u0005\u000e\u0000\u0000\u00e5\u00e6\u00030\u0018"+
		"\u0000\u00e6\u00e7\u0005\u000f\u0000\u0000\u00e7\u00f5\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0005\u000e\u0000\u0000\u00e9\u00ea\u00030\u0018\u0000"+
		"\u00ea\u00eb\u0005\u000f\u0000\u0000\u00eb\u00ec\u0005\u0006\u0000\u0000"+
		"\u00ec\u00ed\u00030\u0018\u0002\u00ed\u00f5\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0005\u000e\u0000\u0000\u00ef\u00f0\u00030\u0018\u0000\u00f0\u00f1"+
		"\u0005\u000f\u0000\u0000\u00f1\u00f2\u0005\u0006\u0000\u0000\u00f2\u00f3"+
		"\u0003.\u0017\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00d9\u0001"+
		"\u0000\u0000\u0000\u00f4\u00de\u0001\u0000\u0000\u0000\u00f4\u00e2\u0001"+
		"\u0000\u0000\u0000\u00f4\u00e8\u0001\u0000\u0000\u0000\u00f4\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f5\u00fe\u0001\u0000\u0000\u0000\u00f6\u00f7\n\u0003"+
		"\u0000\u0000\u00f7\u00f8\u0005\u0006\u0000\u0000\u00f8\u00f9\u0005\u000e"+
		"\u0000\u0000\u00f9\u00fa\u00030\u0018\u0000\u00fa\u00fb\u0005\u000f\u0000"+
		"\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00f6\u0001\u0000\u0000"+
		"\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff1\u0001\u0000\u0000\u0000"+
		"\u0100\u00fe\u0001\u0000\u0000\u0000\u00165;?DRYfx\u0087\u008f\u0097\u009f"+
		"\u00a6\u00a8\u00b0\u00b9\u00bb\u00c5\u00d3\u00d5\u00f4\u00fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}