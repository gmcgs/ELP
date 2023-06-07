// Generated from /Users/franciscorodrigues/Downloads/ELP/src/Test.g4 by ANTLR 4.12.0
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		SVAL=25, COLOR_LITERAL=26, VAL=27, NUMBER=28, WS=29;
	public static final int
		RULE_script = 0, RULE_constante = 1, RULE_value = 2, RULE_propriedade = 3, 
		RULE_valor = 4, RULE_instrucao = 5, RULE_colorCommand = 6, RULE_loopCommand = 7, 
		RULE_drawCommand = 8, RULE_algo = 9, RULE_ifCommand = 10, RULE_elseifCommand = 11, 
		RULE_elseCommand = 12, RULE_statement = 13, RULE_geometric = 14, RULE_square = 15, 
		RULE_rectangule = 16, RULE_first = 17, RULE_identificador = 18, RULE_identif = 19, 
		RULE_name = 20, RULE_if = 21, RULE_figure = 22, RULE_cond = 23, RULE_parenteses = 24, 
		RULE_binaryOperator = 25, RULE_condition = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "constante", "value", "propriedade", "valor", "instrucao", 
			"colorCommand", "loopCommand", "drawCommand", "algo", "ifCommand", "elseifCommand", 
			"elseCommand", "statement", "geometric", "square", "rectangule", "first", 
			"identificador", "identif", "name", "if", "figure", "cond", "parenteses", 
			"binaryOperator", "condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "':'", "'~'", "'color'", "'for'", "'in'", "'['", "','", 
			"']'", "'if'", "'else-if'", "'else'", "'fill'", "'square'", "'rectangle'", 
			"'('", "')'", "'+'", "'*'", "'/'", "'%'", "'<'", "'>'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "SVAL", "COLOR_LITERAL", "VAL", "NUMBER", "WS"
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
		public List<ConstanteContext> constante() {
			return getRuleContexts(ConstanteContext.class);
		}
		public ConstanteContext constante(int i) {
			return getRuleContext(ConstanteContext.class,i);
		}
		public List<PropriedadeContext> propriedade() {
			return getRuleContexts(PropriedadeContext.class);
		}
		public PropriedadeContext propriedade(int i) {
			return getRuleContext(PropriedadeContext.class,i);
		}
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAL) {
				{
				{
				setState(54);
				constante();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(T__0);
			setState(62); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(61);
					match(T__0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(64); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SVAL) {
				{
				{
				setState(66);
				propriedade();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				match(T__0);
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 50224L) != 0)) {
				{
				{
				setState(77);
				instrucao();
				}
				}
				setState(82);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstanteContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
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
			setState(83);
			identificador();
			setState(84);
			match(T__1);
			setState(85);
			value();
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(TestParser.NUMBER, 0); }
		public List<TerminalNode> COLOR_LITERAL() { return getTokens(TestParser.COLOR_LITERAL); }
		public TerminalNode COLOR_LITERAL(int i) {
			return getToken(TestParser.COLOR_LITERAL, i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_value);
		int _la;
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(NUMBER);
				}
				break;
			case COLOR_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(88);
					match(COLOR_LITERAL);
					}
					}
					setState(91); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COLOR_LITERAL );
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
	public static class PropriedadeContext extends ParserRuleContext {
		public IdentifContext identif() {
			return getRuleContext(IdentifContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
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
		enterRule(_localctx, 6, RULE_propriedade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			identif();
			setState(96);
			match(T__1);
			setState(97);
			valor();
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
	public static class ValorContext extends ParserRuleContext {
		public TerminalNode VAL() { return getToken(TestParser.VAL, 0); }
		public List<FirstContext> first() {
			return getRuleContexts(FirstContext.class);
		}
		public FirstContext first(int i) {
			return getRuleContext(FirstContext.class,i);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_valor);
		int _la;
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(VAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(100);
					first();
					}
					}
					setState(103); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==VAL || _la==NUMBER );
				setState(105);
				match(T__2);
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(106);
					first();
					}
					}
					setState(109); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==VAL || _la==NUMBER );
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
	public static class InstrucaoContext extends ParserRuleContext {
		public ColorCommandContext colorCommand() {
			return getRuleContext(ColorCommandContext.class,0);
		}
		public LoopCommandContext loopCommand() {
			return getRuleContext(LoopCommandContext.class,0);
		}
		public DrawCommandContext drawCommand() {
			return getRuleContext(DrawCommandContext.class,0);
		}
		public IfCommandContext ifCommand() {
			return getRuleContext(IfCommandContext.class,0);
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
		enterRule(_localctx, 10, RULE_instrucao);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				colorCommand();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				loopCommand();
				}
				break;
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				drawCommand();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				ifCommand();
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
	public static class ColorCommandContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
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
		enterRule(_localctx, 12, RULE_colorCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__3);
			setState(120);
			identificador();
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
	public static class LoopCommandContext extends ParserRuleContext {
		public IdentifContext identif() {
			return getRuleContext(IdentifContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<AlgoContext> algo() {
			return getRuleContexts(AlgoContext.class);
		}
		public AlgoContext algo(int i) {
			return getRuleContext(AlgoContext.class,i);
		}
		public LoopCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterLoopCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitLoopCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitLoopCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopCommandContext loopCommand() throws RecognitionException {
		LoopCommandContext _localctx = new LoopCommandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loopCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__4);
			setState(123);
			identif();
			setState(124);
			match(T__5);
			setState(125);
			match(T__6);
			setState(126);
			name();
			setState(127);
			match(T__7);
			setState(128);
			name();
			setState(129);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				algo();
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 64544L) != 0) );
			setState(135);
			match(T__0);
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
	public static class DrawCommandContext extends ParserRuleContext {
		public GeometricContext geometric() {
			return getRuleContext(GeometricContext.class,0);
		}
		public DrawCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterDrawCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitDrawCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitDrawCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrawCommandContext drawCommand() throws RecognitionException {
		DrawCommandContext _localctx = new DrawCommandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_drawCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			geometric();
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
	public static class AlgoContext extends ParserRuleContext {
		public LoopCommandContext loopCommand() {
			return getRuleContext(LoopCommandContext.class,0);
		}
		public IfCommandContext ifCommand() {
			return getRuleContext(IfCommandContext.class,0);
		}
		public ElseifCommandContext elseifCommand() {
			return getRuleContext(ElseifCommandContext.class,0);
		}
		public ElseCommandContext elseCommand() {
			return getRuleContext(ElseCommandContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public AlgoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterAlgo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitAlgo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitAlgo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgoContext algo() throws RecognitionException {
		AlgoContext _localctx = new AlgoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_algo);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				loopCommand();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				ifCommand();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				elseifCommand();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(142);
				elseCommand();
				}
				}
				break;
			case T__12:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				statement();
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
	public static class IfCommandContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<IfContext> if_() {
			return getRuleContexts(IfContext.class);
		}
		public IfContext if_(int i) {
			return getRuleContext(IfContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__9);
			setState(148); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(147);
				if_();
				}
				}
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 440336386L) != 0) );
			setState(152);
			condition();
			setState(154); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(153);
					if_();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(156); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseifCommandContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<IfContext> if_() {
			return getRuleContexts(IfContext.class);
		}
		public IfContext if_(int i) {
			return getRuleContext(IfContext.class,i);
		}
		public ElseifCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterElseifCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitElseifCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitElseifCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifCommandContext elseifCommand() throws RecognitionException {
		ElseifCommandContext _localctx = new ElseifCommandContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseifCommand);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__10);
			setState(160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159);
				if_();
				}
				}
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 440336386L) != 0) );
			setState(164);
			condition();
			setState(166); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(165);
					if_();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(168); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseCommandContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 24, RULE_elseCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__11);
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(171);
				statement();
				}
				}
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0) );
			setState(176);
			match(T__0);
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
	public static class StatementContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public GeometricContext geometric() {
			return getRuleContext(GeometricContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(178);
				match(T__12);
				setState(179);
				identificador();
				}
				}
				break;
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				geometric();
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
	public static class GeometricContext extends ParserRuleContext {
		public SquareContext square() {
			return getRuleContext(SquareContext.class,0);
		}
		public RectanguleContext rectangule() {
			return getRuleContext(RectanguleContext.class,0);
		}
		public GeometricContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geometric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterGeometric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitGeometric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitGeometric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeometricContext geometric() throws RecognitionException {
		GeometricContext _localctx = new GeometricContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_geometric);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				square();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				rectangule();
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
	public static class SquareContext extends ParserRuleContext {
		public List<FigureContext> figure() {
			return getRuleContexts(FigureContext.class);
		}
		public FigureContext figure(int i) {
			return getRuleContext(FigureContext.class,i);
		}
		public SquareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_square; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterSquare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitSquare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitSquare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SquareContext square() throws RecognitionException {
		SquareContext _localctx = new SquareContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_square);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__13);
			setState(189); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(188);
				figure();
				}
				}
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 436207616L) != 0) );
			setState(193);
			match(T__7);
			setState(195); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(194);
				figure();
				}
				}
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 436207616L) != 0) );
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
	public static class RectanguleContext extends ParserRuleContext {
		public List<FigureContext> figure() {
			return getRuleContexts(FigureContext.class);
		}
		public FigureContext figure(int i) {
			return getRuleContext(FigureContext.class,i);
		}
		public RectanguleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rectangule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterRectangule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitRectangule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitRectangule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RectanguleContext rectangule() throws RecognitionException {
		RectanguleContext _localctx = new RectanguleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rectangule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__14);
			setState(201); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(200);
				figure();
				}
				}
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 436207616L) != 0) );
			setState(205);
			match(T__7);
			setState(207); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(206);
				figure();
				}
				}
				setState(209); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 436207616L) != 0) );
			setState(211);
			match(T__2);
			setState(213); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(212);
				figure();
				}
				}
				setState(215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 436207616L) != 0) );
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
	public static class FirstContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public BinaryOperatorContext binaryOperator() {
			return getRuleContext(BinaryOperatorContext.class,0);
		}
		public FirstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstContext first() throws RecognitionException {
		FirstContext _localctx = new FirstContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_first);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				name();
				setState(218);
				binaryOperator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				name();
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
	public static class IdentificadorContext extends ParserRuleContext {
		public TerminalNode VAL() { return getToken(TestParser.VAL, 0); }
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(VAL);
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
	public static class IdentifContext extends ParserRuleContext {
		public TerminalNode SVAL() { return getToken(TestParser.SVAL, 0); }
		public IdentifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterIdentif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitIdentif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitIdentif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifContext identif() throws RecognitionException {
		IdentifContext _localctx = new IdentifContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_identif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(SVAL);
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
	public static class NameContext extends ParserRuleContext {
		public TerminalNode VAL() { return getToken(TestParser.VAL, 0); }
		public TerminalNode NUMBER() { return getToken(TestParser.NUMBER, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if ( !(_la==VAL || _la==NUMBER) ) {
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
	public static class IfContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public BinaryOperatorContext binaryOperator() {
			return getRuleContext(BinaryOperatorContext.class,0);
		}
		public ParentesesContext parenteses() {
			return getRuleContext(ParentesesContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_if);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				cond();
				setState(230);
				binaryOperator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				cond();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				binaryOperator();
				setState(234);
				cond();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				parenteses();
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
	public static class FigureContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public BinaryOperatorContext binaryOperator() {
			return getRuleContext(BinaryOperatorContext.class,0);
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
		enterRule(_localctx, 44, RULE_figure);
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				cond();
				setState(240);
				binaryOperator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				cond();
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
	public static class CondContext extends ParserRuleContext {
		public TerminalNode SVAL() { return getToken(TestParser.SVAL, 0); }
		public TerminalNode VAL() { return getToken(TestParser.VAL, 0); }
		public TerminalNode NUMBER() { return getToken(TestParser.NUMBER, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 436207616L) != 0)) ) {
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
	public static class ParentesesContext extends ParserRuleContext {
		public ParentesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenteses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterParenteses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitParenteses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitParenteses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParentesesContext parenteses() throws RecognitionException {
		ParentesesContext _localctx = new ParentesesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parenteses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
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
	public static class BinaryOperatorContext extends ParserRuleContext {
		public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterBinaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitBinaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitBinaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_binaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932162L) != 0)) ) {
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
	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u001d\u00fe\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0005"+
		"\u00008\b\u0000\n\u0000\f\u0000;\t\u0000\u0001\u0000\u0001\u0000\u0004"+
		"\u0000?\b\u0000\u000b\u0000\f\u0000@\u0001\u0000\u0005\u0000D\b\u0000"+
		"\n\u0000\f\u0000G\t\u0000\u0001\u0000\u0004\u0000J\b\u0000\u000b\u0000"+
		"\f\u0000K\u0001\u0000\u0005\u0000O\b\u0000\n\u0000\f\u0000R\t\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0004"+
		"\u0002Z\b\u0002\u000b\u0002\f\u0002[\u0003\u0002^\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0004\u0004"+
		"f\b\u0004\u000b\u0004\f\u0004g\u0001\u0004\u0001\u0004\u0004\u0004l\b"+
		"\u0004\u000b\u0004\f\u0004m\u0003\u0004p\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005v\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u0084\b\u0007"+
		"\u000b\u0007\f\u0007\u0085\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0091\b\t\u0001\n\u0001\n\u0004"+
		"\n\u0095\b\n\u000b\n\f\n\u0096\u0001\n\u0001\n\u0004\n\u009b\b\n\u000b"+
		"\n\f\n\u009c\u0001\u000b\u0001\u000b\u0004\u000b\u00a1\b\u000b\u000b\u000b"+
		"\f\u000b\u00a2\u0001\u000b\u0001\u000b\u0004\u000b\u00a7\b\u000b\u000b"+
		"\u000b\f\u000b\u00a8\u0001\f\u0001\f\u0004\f\u00ad\b\f\u000b\f\f\f\u00ae"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u00b6\b\r\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00ba\b\u000e\u0001\u000f\u0001\u000f\u0004\u000f"+
		"\u00be\b\u000f\u000b\u000f\f\u000f\u00bf\u0001\u000f\u0001\u000f\u0004"+
		"\u000f\u00c4\b\u000f\u000b\u000f\f\u000f\u00c5\u0001\u0010\u0001\u0010"+
		"\u0004\u0010\u00ca\b\u0010\u000b\u0010\f\u0010\u00cb\u0001\u0010\u0001"+
		"\u0010\u0004\u0010\u00d0\b\u0010\u000b\u0010\f\u0010\u00d1\u0001\u0010"+
		"\u0001\u0010\u0004\u0010\u00d6\b\u0010\u000b\u0010\f\u0010\u00d7\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00de\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u00ee\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u00f4\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0000\u0000\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.024\u0000\u0006\u0002\u0000"+
		"\u0007\u0007\t\t\u0001\u0000\u001b\u001c\u0002\u0000\u0019\u0019\u001b"+
		"\u001c\u0001\u0000\u0010\u0011\u0002\u0000\u0001\u0001\u0012\u0015\u0001"+
		"\u0000\u0016\u0018\u0105\u00009\u0001\u0000\u0000\u0000\u0002S\u0001\u0000"+
		"\u0000\u0000\u0004]\u0001\u0000\u0000\u0000\u0006_\u0001\u0000\u0000\u0000"+
		"\bo\u0001\u0000\u0000\u0000\nu\u0001\u0000\u0000\u0000\fw\u0001\u0000"+
		"\u0000\u0000\u000ez\u0001\u0000\u0000\u0000\u0010\u0089\u0001\u0000\u0000"+
		"\u0000\u0012\u0090\u0001\u0000\u0000\u0000\u0014\u0092\u0001\u0000\u0000"+
		"\u0000\u0016\u009e\u0001\u0000\u0000\u0000\u0018\u00aa\u0001\u0000\u0000"+
		"\u0000\u001a\u00b5\u0001\u0000\u0000\u0000\u001c\u00b9\u0001\u0000\u0000"+
		"\u0000\u001e\u00bb\u0001\u0000\u0000\u0000 \u00c7\u0001\u0000\u0000\u0000"+
		"\"\u00dd\u0001\u0000\u0000\u0000$\u00df\u0001\u0000\u0000\u0000&\u00e1"+
		"\u0001\u0000\u0000\u0000(\u00e3\u0001\u0000\u0000\u0000*\u00ed\u0001\u0000"+
		"\u0000\u0000,\u00f3\u0001\u0000\u0000\u0000.\u00f5\u0001\u0000\u0000\u0000"+
		"0\u00f7\u0001\u0000\u0000\u00002\u00f9\u0001\u0000\u0000\u00004\u00fb"+
		"\u0001\u0000\u0000\u000068\u0003\u0002\u0001\u000076\u0001\u0000\u0000"+
		"\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000"+
		"\u0000\u0000:<\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<>\u0005"+
		"\u0001\u0000\u0000=?\u0005\u0001\u0000\u0000>=\u0001\u0000\u0000\u0000"+
		"?@\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000AE\u0001\u0000\u0000\u0000BD\u0003\u0006\u0003\u0000CB\u0001\u0000"+
		"\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"HJ\u0005\u0001\u0000\u0000IH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LP\u0001\u0000"+
		"\u0000\u0000MO\u0003\n\u0005\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000"+
		"\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\u0001"+
		"\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u0003$\u0012\u0000"+
		"TU\u0005\u0002\u0000\u0000UV\u0003\u0004\u0002\u0000V\u0003\u0001\u0000"+
		"\u0000\u0000W^\u0005\u001c\u0000\u0000XZ\u0005\u001a\u0000\u0000YX\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000]W\u0001\u0000\u0000"+
		"\u0000]Y\u0001\u0000\u0000\u0000^\u0005\u0001\u0000\u0000\u0000_`\u0003"+
		"&\u0013\u0000`a\u0005\u0002\u0000\u0000ab\u0003\b\u0004\u0000b\u0007\u0001"+
		"\u0000\u0000\u0000cp\u0005\u001b\u0000\u0000df\u0003\"\u0011\u0000ed\u0001"+
		"\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000"+
		"gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0005\u0003\u0000"+
		"\u0000jl\u0003\"\u0011\u0000kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000"+
		"\u0000\u0000oc\u0001\u0000\u0000\u0000oe\u0001\u0000\u0000\u0000p\t\u0001"+
		"\u0000\u0000\u0000qv\u0003\f\u0006\u0000rv\u0003\u000e\u0007\u0000sv\u0003"+
		"\u0010\b\u0000tv\u0003\u0014\n\u0000uq\u0001\u0000\u0000\u0000ur\u0001"+
		"\u0000\u0000\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000"+
		"v\u000b\u0001\u0000\u0000\u0000wx\u0005\u0004\u0000\u0000xy\u0003$\u0012"+
		"\u0000y\r\u0001\u0000\u0000\u0000z{\u0005\u0005\u0000\u0000{|\u0003&\u0013"+
		"\u0000|}\u0005\u0006\u0000\u0000}~\u0005\u0007\u0000\u0000~\u007f\u0003"+
		"(\u0014\u0000\u007f\u0080\u0005\b\u0000\u0000\u0080\u0081\u0003(\u0014"+
		"\u0000\u0081\u0083\u0007\u0000\u0000\u0000\u0082\u0084\u0003\u0012\t\u0000"+
		"\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000"+
		"\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u0001\u0000\u0000"+
		"\u0088\u000f\u0001\u0000\u0000\u0000\u0089\u008a\u0003\u001c\u000e\u0000"+
		"\u008a\u0011\u0001\u0000\u0000\u0000\u008b\u0091\u0003\u000e\u0007\u0000"+
		"\u008c\u0091\u0003\u0014\n\u0000\u008d\u0091\u0003\u0016\u000b\u0000\u008e"+
		"\u0091\u0003\u0018\f\u0000\u008f\u0091\u0003\u001a\r\u0000\u0090\u008b"+
		"\u0001\u0000\u0000\u0000\u0090\u008c\u0001\u0000\u0000\u0000\u0090\u008d"+
		"\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0013\u0001\u0000\u0000\u0000\u0092\u0094"+
		"\u0005\n\u0000\u0000\u0093\u0095\u0003*\u0015\u0000\u0094\u0093\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0094\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0001"+
		"\u0000\u0000\u0000\u0098\u009a\u00034\u001a\u0000\u0099\u009b\u0003*\u0015"+
		"\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u0015\u0001\u0000\u0000\u0000\u009e\u00a0\u0005\u000b\u0000"+
		"\u0000\u009f\u00a1\u0003*\u0015\u0000\u00a0\u009f\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a6\u00034\u001a\u0000\u00a5\u00a7\u0003*\u0015\u0000\u00a6\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u0017"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ac\u0005\f\u0000\u0000\u00ab\u00ad\u0003"+
		"\u001a\r\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u0001"+
		"\u0000\u0000\u00b1\u0019\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\r\u0000"+
		"\u0000\u00b3\u00b6\u0003$\u0012\u0000\u00b4\u00b6\u0003\u001c\u000e\u0000"+
		"\u00b5\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b6\u001b\u0001\u0000\u0000\u0000\u00b7\u00ba\u0003\u001e\u000f\u0000"+
		"\u00b8\u00ba\u0003 \u0010\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b8\u0001\u0000\u0000\u0000\u00ba\u001d\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bd\u0005\u000e\u0000\u0000\u00bc\u00be\u0003,\u0016\u0000\u00bd\u00bc"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c3\u0005\b\u0000\u0000\u00c2\u00c4\u0003"+
		",\u0016\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c6\u001f\u0001\u0000\u0000\u0000\u00c7\u00c9\u0005\u000f"+
		"\u0000\u0000\u00c8\u00ca\u0003,\u0016\u0000\u00c9\u00c8\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cd\u00cf\u0005\b\u0000\u0000\u00ce\u00d0\u0003,\u0016\u0000"+
		"\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d5\u0005\u0003\u0000\u0000"+
		"\u00d4\u00d6\u0003,\u0016\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d8!\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0003(\u0014\u0000\u00da\u00db\u00032\u0019\u0000\u00db\u00de\u0001\u0000"+
		"\u0000\u0000\u00dc\u00de\u0003(\u0014\u0000\u00dd\u00d9\u0001\u0000\u0000"+
		"\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de#\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0005\u001b\u0000\u0000\u00e0%\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0005\u0019\u0000\u0000\u00e2\'\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0007\u0001\u0000\u0000\u00e4)\u0001\u0000\u0000\u0000\u00e5\u00e6\u0003"+
		".\u0017\u0000\u00e6\u00e7\u00032\u0019\u0000\u00e7\u00ee\u0001\u0000\u0000"+
		"\u0000\u00e8\u00ee\u0003.\u0017\u0000\u00e9\u00ea\u00032\u0019\u0000\u00ea"+
		"\u00eb\u0003.\u0017\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ee"+
		"\u00030\u0018\u0000\u00ed\u00e5\u0001\u0000\u0000\u0000\u00ed\u00e8\u0001"+
		"\u0000\u0000\u0000\u00ed\u00e9\u0001\u0000\u0000\u0000\u00ed\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ee+\u0001\u0000\u0000\u0000\u00ef\u00f0\u0003.\u0017"+
		"\u0000\u00f0\u00f1\u00032\u0019\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f4\u0003.\u0017\u0000\u00f3\u00ef\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f4-\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0007\u0002\u0000\u0000\u00f6/\u0001\u0000\u0000\u0000\u00f7\u00f8\u0007"+
		"\u0003\u0000\u0000\u00f81\u0001\u0000\u0000\u0000\u00f9\u00fa\u0007\u0004"+
		"\u0000\u0000\u00fa3\u0001\u0000\u0000\u0000\u00fb\u00fc\u0007\u0005\u0000"+
		"\u0000\u00fc5\u0001\u0000\u0000\u0000\u001c9@EKP[]gmou\u0085\u0090\u0096"+
		"\u009c\u00a2\u00a8\u00ae\u00b5\u00b9\u00bf\u00c5\u00cb\u00d1\u00d7\u00dd"+
		"\u00ed\u00f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}