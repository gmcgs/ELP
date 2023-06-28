// Generated from C:/Users/gmigu/Documents/3ano/2sem/ELP/projeto/src/main/resources/grammar\Test.g4 by ANTLR 4.12.0

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

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
		RULE_div = 4, RULE_colorCommand = 5, RULE_figure = 6, RULE_estrutura = 7, 
		RULE_fig = 8, RULE_shape = 9, RULE_ifCommand = 10, RULE_elseCommand = 11, 
		RULE_condicao = 12, RULE_forloop = 13, RULE_objeto = 14, RULE_point2D = 15, 
		RULE_dim = 16, RULE_interval = 17, RULE_color = 18, RULE_cut = 19, RULE_full = 20, 
		RULE_capsID = 21, RULE_lowerID = 22, RULE_expressao = 23, RULE_aux = 24, 
		RULE_operacao = 25, RULE_val1 = 26, RULE_val2 = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "constante", "propriedade", "instrucao", "div", "colorCommand", 
			"figure", "estrutura", "fig", "shape", "ifCommand", "elseCommand", "condicao", 
			"forloop", "objeto", "point2D", "dim", "interval", "color", "cut", "full", 
			"capsID", "lowerID", "expressao", "aux", "operacao", "val1", "val2"
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
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				constante();
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CAPS );
			setState(61);
			div();
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(62);
					propriedade();
					}
					}
					setState(65); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LOWER );
				setState(67);
				div();
				}
				break;
			}
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				instrucao();
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 524298L) != 0) );
			setState(76);
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
			setState(78);
			capsID();
			setState(79);
			match(ASSIGN);
			setState(80);
			objeto();
			setState(81);
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
			setState(83);
			lowerID();
			setState(84);
			match(ASSIGN);
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(85);
				capsID();
				}
				break;
			case 2:
				{
				setState(86);
				dim();
				}
				break;
			case 3:
				{
				setState(87);
				color();
				}
				break;
			}
			setState(90);
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
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(92);
				colorCommand();
				}
				break;
			case 2:
				{
				setState(93);
				figure();
				}
				break;
			case 3:
				{
				setState(94);
				estrutura();
				}
				break;
			}
			setState(97);
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
			setState(99);
			match(DIV);
			setState(100);
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
		enterRule(_localctx, 10, RULE_colorCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			lowerID();
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(103);
				color();
				}
				break;
			case 2:
				{
				setState(104);
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
		enterRule(_localctx, 12, RULE_figure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			lowerID();
			setState(108);
			fig();
			setState(109);
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
		enterRule(_localctx, 14, RULE_estrutura);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				ifCommand();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
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
		enterRule(_localctx, 16, RULE_fig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			expressao();
			setState(116);
			match(COMA);
			setState(117);
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
		enterRule(_localctx, 18, RULE_shape);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				expressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
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
		public TerminalNode ENTER() { return getToken(TestParser.ENTER, 0); }
		public TerminalNode END() { return getToken(TestParser.END, 0); }
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public ElseCommandContext elseCommand() {
			return getRuleContext(ElseCommandContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_ifCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(IF);
			setState(124);
			condicao();
			setState(125);
			match(ENTER);
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(126);
				instrucao();
				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 524298L) != 0) );
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(131);
				elseCommand();
				}
			}

			setState(134);
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
	public static class ElseCommandContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(TestParser.ELSE, 0); }
		public TerminalNode ENTER() { return getToken(TestParser.ENTER, 0); }
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public ElseCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterElseCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitElseCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitElseCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseCommandContext elseCommand() throws RecognitionException {
		ElseCommandContext _localctx = new ElseCommandContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(ELSE);
			setState(137);
			match(ENTER);
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(138);
				instrucao();
				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 524298L) != 0) );
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
		public Val1Context val1() {
			return getRuleContext(Val1Context.class,0);
		}
		public TerminalNode CONDITION() { return getToken(TestParser.CONDITION, 0); }
		public Val2Context val2() {
			return getRuleContext(Val2Context.class,0);
		}
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
		enterRule(_localctx, 24, RULE_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			val1();
			setState(144);
			match(CONDITION);
			setState(145);
			val2();
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
		enterRule(_localctx, 26, RULE_forloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(FOR);
			setState(148);
			lowerID();
			setState(149);
			match(IN);
			setState(150);
			interval();
			setState(151);
			match(ENTER);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 524298L) != 0)) {
				{
				{
				setState(152);
				instrucao();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
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
		enterRule(_localctx, 28, RULE_objeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(160);
				expressao();
				}
				break;
			case 2:
				{
				setState(161);
				match(BOOLEAN);
				}
				break;
			case 3:
				{
				setState(162);
				point2D();
				}
				break;
			case 4:
				{
				setState(163);
				dim();
				}
				break;
			case 5:
				{
				setState(164);
				interval();
				}
				break;
			case 6:
				{
				setState(165);
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
		enterRule(_localctx, 30, RULE_point2D);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			expressao();
			setState(169);
			match(COMA);
			setState(170);
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
		enterRule(_localctx, 32, RULE_dim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			expressao();
			setState(173);
			match(TIL);
			setState(174);
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
		enterRule(_localctx, 34, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(BRACKET);
			setState(177);
			expressao();
			setState(178);
			match(COMA);
			setState(179);
			expressao();
			setState(180);
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
		enterRule(_localctx, 36, RULE_color);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERTICAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				cut();
				}
				break;
			case OPEN:
			case INT:
			case CAPS:
			case LOWER:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
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
		enterRule(_localctx, 38, RULE_cut);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(VERTICAL);
			setState(187);
			expressao();
			setState(188);
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
		enterRule(_localctx, 40, RULE_full);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			expressao();
			setState(191);
			match(VERTICAL);
			setState(192);
			expressao();
			setState(193);
			match(VERTICAL);
			setState(194);
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
		enterRule(_localctx, 42, RULE_capsID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
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
		enterRule(_localctx, 44, RULE_lowerID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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
		enterRule(_localctx, 46, RULE_expressao);
		try {
			int _alt;
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(CAPS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				match(LOWER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(204); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(203);
						operacao(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(206); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 48, RULE_aux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_operacao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(213);
				aux();
				setState(214);
				match(OPERATOR);
				setState(215);
				aux();
				}
				break;
			case 2:
				{
				setState(217);
				aux();
				setState(218);
				match(OPERATOR);
				setState(219);
				operacao(5);
				}
				break;
			case 3:
				{
				setState(221);
				aux();
				setState(222);
				match(OPERATOR);
				setState(223);
				match(OPEN);
				setState(224);
				operacao(0);
				setState(225);
				match(CLOSE);
				}
				break;
			case 4:
				{
				setState(227);
				match(OPEN);
				setState(228);
				operacao(0);
				setState(229);
				match(CLOSE);
				setState(230);
				match(OPERATOR);
				setState(231);
				operacao(2);
				}
				break;
			case 5:
				{
				setState(233);
				match(OPEN);
				setState(234);
				operacao(0);
				setState(235);
				match(CLOSE);
				setState(236);
				match(OPERATOR);
				setState(237);
				aux();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperacaoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operacao);
					setState(241);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(242);
					match(OPERATOR);
					setState(243);
					match(OPEN);
					setState(244);
					operacao(0);
					setState(245);
					match(CLOSE);
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Val1Context extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TestParser.INT, 0); }
		public List<OperacaoContext> operacao() {
			return getRuleContexts(OperacaoContext.class);
		}
		public OperacaoContext operacao(int i) {
			return getRuleContext(OperacaoContext.class,i);
		}
		public Val1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterVal1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitVal1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitVal1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Val1Context val1() throws RecognitionException {
		Val1Context _localctx = new Val1Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_val1);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(253);
					operacao(0);
					}
					}
					setState(256); 
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
	public static class Val2Context extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TestParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(TestParser.BOOLEAN, 0); }
		public List<OperacaoContext> operacao() {
			return getRuleContexts(OperacaoContext.class);
		}
		public OperacaoContext operacao(int i) {
			return getRuleContext(OperacaoContext.class,i);
		}
		public Val2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterVal2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitVal2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitVal2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Val2Context val2() throws RecognitionException {
		Val2Context _localctx = new Val2Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_val2);
		int _la;
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(BOOLEAN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(263); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(262);
					operacao(0);
					}
					}
					setState(265); 
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 25:
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
		"\u0004\u0001\u0015\u010e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0001\u0000\u0004\u0000:\b\u0000\u000b\u0000\f\u0000;\u0001\u0000"+
		"\u0001\u0000\u0004\u0000@\b\u0000\u000b\u0000\f\u0000A\u0001\u0000\u0001"+
		"\u0000\u0003\u0000F\b\u0000\u0001\u0000\u0004\u0000I\b\u0000\u000b\u0000"+
		"\f\u0000J\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002Y\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003`\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005j\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0003\u0007r\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0003\tz\b\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0004\n\u0080\b\n\u000b\n\f\n\u0081\u0001\n\u0003\n\u0085\b\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u008c\b\u000b"+
		"\u000b\u000b\f\u000b\u008d\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u009a\b\r\n\r\f\r\u009d\t\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00a7\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00b9\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0004\u0017\u00cd\b\u0017\u000b"+
		"\u0017\f\u0017\u00ce\u0003\u0017\u00d1\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u00f0\b\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u00f8\b\u0019\n\u0019\f\u0019\u00fb\t\u0019\u0001\u001a\u0001\u001a\u0004"+
		"\u001a\u00ff\b\u001a\u000b\u001a\f\u001a\u0100\u0003\u001a\u0103\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0004\u001b\u0108\b\u001b\u000b\u001b"+
		"\f\u001b\u0109\u0003\u001b\u010c\b\u001b\u0001\u001b\u0000\u00012\u001c"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.0246\u0000\u0001\u0001\u0000\u0011\u0013\u0114\u0000"+
		"9\u0001\u0000\u0000\u0000\u0002N\u0001\u0000\u0000\u0000\u0004S\u0001"+
		"\u0000\u0000\u0000\u0006_\u0001\u0000\u0000\u0000\bc\u0001\u0000\u0000"+
		"\u0000\nf\u0001\u0000\u0000\u0000\fk\u0001\u0000\u0000\u0000\u000eq\u0001"+
		"\u0000\u0000\u0000\u0010s\u0001\u0000\u0000\u0000\u0012y\u0001\u0000\u0000"+
		"\u0000\u0014{\u0001\u0000\u0000\u0000\u0016\u0088\u0001\u0000\u0000\u0000"+
		"\u0018\u008f\u0001\u0000\u0000\u0000\u001a\u0093\u0001\u0000\u0000\u0000"+
		"\u001c\u00a6\u0001\u0000\u0000\u0000\u001e\u00a8\u0001\u0000\u0000\u0000"+
		" \u00ac\u0001\u0000\u0000\u0000\"\u00b0\u0001\u0000\u0000\u0000$\u00b8"+
		"\u0001\u0000\u0000\u0000&\u00ba\u0001\u0000\u0000\u0000(\u00be\u0001\u0000"+
		"\u0000\u0000*\u00c4\u0001\u0000\u0000\u0000,\u00c6\u0001\u0000\u0000\u0000"+
		".\u00d0\u0001\u0000\u0000\u00000\u00d2\u0001\u0000\u0000\u00002\u00ef"+
		"\u0001\u0000\u0000\u00004\u0102\u0001\u0000\u0000\u00006\u010b\u0001\u0000"+
		"\u0000\u00008:\u0003\u0002\u0001\u000098\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<=\u0001\u0000\u0000\u0000=E\u0003\b\u0004\u0000>@\u0003\u0004\u0002\u0000"+
		"?>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0003\b\u0004"+
		"\u0000DF\u0001\u0000\u0000\u0000E?\u0001\u0000\u0000\u0000EF\u0001\u0000"+
		"\u0000\u0000FH\u0001\u0000\u0000\u0000GI\u0003\u0006\u0003\u0000HG\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0005\u0000\u0000"+
		"\u0001M\u0001\u0001\u0000\u0000\u0000NO\u0003*\u0015\u0000OP\u0005\b\u0000"+
		"\u0000PQ\u0003\u001c\u000e\u0000QR\u0005\u0014\u0000\u0000R\u0003\u0001"+
		"\u0000\u0000\u0000ST\u0003,\u0016\u0000TX\u0005\b\u0000\u0000UY\u0003"+
		"*\u0015\u0000VY\u0003 \u0010\u0000WY\u0003$\u0012\u0000XU\u0001\u0000"+
		"\u0000\u0000XV\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z[\u0005\u0014\u0000\u0000[\u0005\u0001\u0000\u0000"+
		"\u0000\\`\u0003\n\u0005\u0000]`\u0003\f\u0006\u0000^`\u0003\u000e\u0007"+
		"\u0000_\\\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_^\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0005\u0014\u0000\u0000b\u0007"+
		"\u0001\u0000\u0000\u0000cd\u0005\t\u0000\u0000de\u0005\u0014\u0000\u0000"+
		"e\t\u0001\u0000\u0000\u0000fi\u0003,\u0016\u0000gj\u0003$\u0012\u0000"+
		"hj\u0003*\u0015\u0000ig\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000"+
		"j\u000b\u0001\u0000\u0000\u0000kl\u0003,\u0016\u0000lm\u0003\u0010\b\u0000"+
		"mn\u0003\u0012\t\u0000n\r\u0001\u0000\u0000\u0000or\u0003\u0014\n\u0000"+
		"pr\u0003\u001a\r\u0000qo\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000"+
		"r\u000f\u0001\u0000\u0000\u0000st\u0003.\u0017\u0000tu\u0005\u000b\u0000"+
		"\u0000uv\u0003.\u0017\u0000v\u0011\u0001\u0000\u0000\u0000wz\u0003.\u0017"+
		"\u0000xz\u0003 \u0010\u0000yw\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000"+
		"\u0000z\u0013\u0001\u0000\u0000\u0000{|\u0005\u0001\u0000\u0000|}\u0003"+
		"\u0018\f\u0000}\u007f\u0005\u0014\u0000\u0000~\u0080\u0003\u0006\u0003"+
		"\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000"+
		"\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u0085\u0003\u0016\u000b\u0000"+
		"\u0084\u0083\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0010\u0000\u0000"+
		"\u0087\u0015\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0002\u0000\u0000"+
		"\u0089\u008b\u0005\u0014\u0000\u0000\u008a\u008c\u0003\u0006\u0003\u0000"+
		"\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000"+
		"\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e\u0017\u0001\u0000\u0000\u0000\u008f\u0090\u00034\u001a\u0000\u0090"+
		"\u0091\u0005\u0007\u0000\u0000\u0091\u0092\u00036\u001b\u0000\u0092\u0019"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0003\u0000\u0000\u0094\u0095"+
		"\u0003,\u0016\u0000\u0095\u0096\u0005\u0004\u0000\u0000\u0096\u0097\u0003"+
		"\"\u0011\u0000\u0097\u009b\u0005\u0014\u0000\u0000\u0098\u009a\u0003\u0006"+
		"\u0003\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0005\u0010\u0000\u0000\u009f\u001b\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a7\u0003.\u0017\u0000\u00a1\u00a7\u0005\u0005\u0000"+
		"\u0000\u00a2\u00a7\u0003\u001e\u000f\u0000\u00a3\u00a7\u0003 \u0010\u0000"+
		"\u00a4\u00a7\u0003\"\u0011\u0000\u00a5\u00a7\u0003$\u0012\u0000\u00a6"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a6\u00a1\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a6\u00a3\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7"+
		"\u001d\u0001\u0000\u0000\u0000\u00a8\u00a9\u0003.\u0017\u0000\u00a9\u00aa"+
		"\u0005\u000b\u0000\u0000\u00aa\u00ab\u0003.\u0017\u0000\u00ab\u001f\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0003.\u0017\u0000\u00ad\u00ae\u0005\n"+
		"\u0000\u0000\u00ae\u00af\u0003.\u0017\u0000\u00af!\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0005\f\u0000\u0000\u00b1\u00b2\u0003.\u0017\u0000\u00b2"+
		"\u00b3\u0005\u000b\u0000\u0000\u00b3\u00b4\u0003.\u0017\u0000\u00b4\u00b5"+
		"\u0005\f\u0000\u0000\u00b5#\u0001\u0000\u0000\u0000\u00b6\u00b9\u0003"+
		"&\u0013\u0000\u00b7\u00b9\u0003(\u0014\u0000\u00b8\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9%\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0005\r\u0000\u0000\u00bb\u00bc\u0003.\u0017\u0000\u00bc"+
		"\u00bd\u0005\r\u0000\u0000\u00bd\'\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0003.\u0017\u0000\u00bf\u00c0\u0005\r\u0000\u0000\u00c0\u00c1\u0003"+
		".\u0017\u0000\u00c1\u00c2\u0005\r\u0000\u0000\u00c2\u00c3\u0003.\u0017"+
		"\u0000\u00c3)\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u0012\u0000\u0000"+
		"\u00c5+\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\u0013\u0000\u0000\u00c7"+
		"-\u0001\u0000\u0000\u0000\u00c8\u00d1\u0005\u0011\u0000\u0000\u00c9\u00d1"+
		"\u0005\u0012\u0000\u0000\u00ca\u00d1\u0005\u0013\u0000\u0000\u00cb\u00cd"+
		"\u00032\u0019\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00c8\u0001"+
		"\u0000\u0000\u0000\u00d0\u00c9\u0001\u0000\u0000\u0000\u00d0\u00ca\u0001"+
		"\u0000\u0000\u0000\u00d0\u00cc\u0001\u0000\u0000\u0000\u00d1/\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0007\u0000\u0000\u0000\u00d31\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0006\u0019\uffff\uffff\u0000\u00d5\u00d6\u00030\u0018"+
		"\u0000\u00d6\u00d7\u0005\u0006\u0000\u0000\u00d7\u00d8\u00030\u0018\u0000"+
		"\u00d8\u00f0\u0001\u0000\u0000\u0000\u00d9\u00da\u00030\u0018\u0000\u00da"+
		"\u00db\u0005\u0006\u0000\u0000\u00db\u00dc\u00032\u0019\u0005\u00dc\u00f0"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u00030\u0018\u0000\u00de\u00df\u0005"+
		"\u0006\u0000\u0000\u00df\u00e0\u0005\u000e\u0000\u0000\u00e0\u00e1\u0003"+
		"2\u0019\u0000\u00e1\u00e2\u0005\u000f\u0000\u0000\u00e2\u00f0\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0005\u000e\u0000\u0000\u00e4\u00e5\u00032\u0019"+
		"\u0000\u00e5\u00e6\u0005\u000f\u0000\u0000\u00e6\u00e7\u0005\u0006\u0000"+
		"\u0000\u00e7\u00e8\u00032\u0019\u0002\u00e8\u00f0\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\u0005\u000e\u0000\u0000\u00ea\u00eb\u00032\u0019\u0000\u00eb"+
		"\u00ec\u0005\u000f\u0000\u0000\u00ec\u00ed\u0005\u0006\u0000\u0000\u00ed"+
		"\u00ee\u00030\u0018\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00d4"+
		"\u0001\u0000\u0000\u0000\u00ef\u00d9\u0001\u0000\u0000\u0000\u00ef\u00dd"+
		"\u0001\u0000\u0000\u0000\u00ef\u00e3\u0001\u0000\u0000\u0000\u00ef\u00e9"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f9\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\n\u0003\u0000\u0000\u00f2\u00f3\u0005\u0006\u0000\u0000\u00f3\u00f4\u0005"+
		"\u000e\u0000\u0000\u00f4\u00f5\u00032\u0019\u0000\u00f5\u00f6\u0005\u000f"+
		"\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa3\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u0103\u0005\u0011\u0000"+
		"\u0000\u00fd\u00ff\u00032\u0019\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0103\u0001\u0000\u0000\u0000"+
		"\u0102\u00fc\u0001\u0000\u0000\u0000\u0102\u00fe\u0001\u0000\u0000\u0000"+
		"\u01035\u0001\u0000\u0000\u0000\u0104\u010c\u0005\u0011\u0000\u0000\u0105"+
		"\u010c\u0005\u0005\u0000\u0000\u0106\u0108\u00032\u0019\u0000\u0107\u0106"+
		"\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u0107"+
		"\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010c"+
		"\u0001\u0000\u0000\u0000\u010b\u0104\u0001\u0000\u0000\u0000\u010b\u0105"+
		"\u0001\u0000\u0000\u0000\u010b\u0107\u0001\u0000\u0000\u0000\u010c7\u0001"+
		"\u0000\u0000\u0000\u0017;AEJX_iqy\u0081\u0084\u008d\u009b\u00a6\u00b8"+
		"\u00ce\u00d0\u00ef\u00f9\u0100\u0102\u0109\u010b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}