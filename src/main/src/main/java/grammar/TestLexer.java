// Generated from C:/Users/gmigu/Documents/3ano/2sem/ELP/projeto/src/main/resources/grammar\Test.g4 by ANTLR 4.12.0
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TestLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, FOR=3, IN=4, BOOLEAN=5, OPERATOR=6, CONDITION=7, ASSIGN=8, 
		DIV=9, TIL=10, COMA=11, BRACKET=12, VERTICAL=13, OPEN=14, CLOSE=15, END=16, 
		INT=17, CAPS=18, LOWER=19, ENTER=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELSE", "FOR", "IN", "BOOLEAN", "OPERATOR", "CONDITION", "ASSIGN", 
			"DIV", "TIL", "COMA", "BRACKET", "VERTICAL", "OPEN", "CLOSE", "END", 
			"INT", "CAPS", "LOWER", "ENTER", "WS"
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


	public TestLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Test.g4"; }

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
		"\u0004\u0000\u0015\u0086\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004D\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006Q\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0004\u0010h\b\u0010\u000b\u0010\f\u0010i\u0001\u0011"+
		"\u0001\u0011\u0005\u0011n\b\u0011\n\u0011\f\u0011q\t\u0011\u0001\u0012"+
		"\u0001\u0012\u0005\u0012u\b\u0012\n\u0012\f\u0012x\t\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013~\b\u0013\u0001\u0014"+
		"\u0004\u0014\u0081\b\u0014\u000b\u0014\f\u0014\u0082\u0001\u0014\u0001"+
		"\u0014\u0000\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015\u0001\u0000\b\u0004\u0000%%*+--//\u0002\u0000<<>>\u0002"+
		"\u0000[[]]\u0001\u000009\u0001\u0000AZ\u0002\u000009AZ\u0001\u0000az\u0002"+
		"\u000009az\u0090\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u0003.\u0001\u0000\u0000"+
		"\u0000\u00053\u0001\u0000\u0000\u0000\u00077\u0001\u0000\u0000\u0000\t"+
		"C\u0001\u0000\u0000\u0000\u000bE\u0001\u0000\u0000\u0000\rP\u0001\u0000"+
		"\u0000\u0000\u000fR\u0001\u0000\u0000\u0000\u0011T\u0001\u0000\u0000\u0000"+
		"\u0013X\u0001\u0000\u0000\u0000\u0015Z\u0001\u0000\u0000\u0000\u0017\\"+
		"\u0001\u0000\u0000\u0000\u0019^\u0001\u0000\u0000\u0000\u001b`\u0001\u0000"+
		"\u0000\u0000\u001db\u0001\u0000\u0000\u0000\u001fd\u0001\u0000\u0000\u0000"+
		"!g\u0001\u0000\u0000\u0000#k\u0001\u0000\u0000\u0000%r\u0001\u0000\u0000"+
		"\u0000\'}\u0001\u0000\u0000\u0000)\u0080\u0001\u0000\u0000\u0000+,\u0005"+
		"i\u0000\u0000,-\u0005f\u0000\u0000-\u0002\u0001\u0000\u0000\u0000./\u0005"+
		"e\u0000\u0000/0\u0005l\u0000\u000001\u0005s\u0000\u000012\u0005e\u0000"+
		"\u00002\u0004\u0001\u0000\u0000\u000034\u0005f\u0000\u000045\u0005o\u0000"+
		"\u000056\u0005r\u0000\u00006\u0006\u0001\u0000\u0000\u000078\u0005i\u0000"+
		"\u000089\u0005n\u0000\u00009\b\u0001\u0000\u0000\u0000:;\u0005t\u0000"+
		"\u0000;<\u0005r\u0000\u0000<=\u0005u\u0000\u0000=D\u0005e\u0000\u0000"+
		">?\u0005f\u0000\u0000?@\u0005a\u0000\u0000@A\u0005l\u0000\u0000AB\u0005"+
		"s\u0000\u0000BD\u0005e\u0000\u0000C:\u0001\u0000\u0000\u0000C>\u0001\u0000"+
		"\u0000\u0000D\n\u0001\u0000\u0000\u0000EF\u0007\u0000\u0000\u0000F\f\u0001"+
		"\u0000\u0000\u0000GH\u0005=\u0000\u0000HQ\u0005=\u0000\u0000IJ\u0005!"+
		"\u0000\u0000JQ\u0005=\u0000\u0000KQ\u0007\u0001\u0000\u0000LM\u0005<\u0000"+
		"\u0000MQ\u0005=\u0000\u0000NO\u0005>\u0000\u0000OQ\u0005=\u0000\u0000"+
		"PG\u0001\u0000\u0000\u0000PI\u0001\u0000\u0000\u0000PK\u0001\u0000\u0000"+
		"\u0000PL\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000Q\u000e\u0001"+
		"\u0000\u0000\u0000RS\u0005:\u0000\u0000S\u0010\u0001\u0000\u0000\u0000"+
		"TU\u0005-\u0000\u0000UV\u0005-\u0000\u0000VW\u0005-\u0000\u0000W\u0012"+
		"\u0001\u0000\u0000\u0000XY\u0005~\u0000\u0000Y\u0014\u0001\u0000\u0000"+
		"\u0000Z[\u0005,\u0000\u0000[\u0016\u0001\u0000\u0000\u0000\\]\u0007\u0002"+
		"\u0000\u0000]\u0018\u0001\u0000\u0000\u0000^_\u0005|\u0000\u0000_\u001a"+
		"\u0001\u0000\u0000\u0000`a\u0005(\u0000\u0000a\u001c\u0001\u0000\u0000"+
		"\u0000bc\u0005)\u0000\u0000c\u001e\u0001\u0000\u0000\u0000de\u0005_\u0000"+
		"\u0000e \u0001\u0000\u0000\u0000fh\u0007\u0003\u0000\u0000gf\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000j\"\u0001\u0000\u0000\u0000ko\u0007\u0004\u0000\u0000"+
		"ln\u0007\u0005\u0000\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000"+
		"\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p$\u0001\u0000"+
		"\u0000\u0000qo\u0001\u0000\u0000\u0000rv\u0007\u0006\u0000\u0000su\u0007"+
		"\u0007\u0000\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w&\u0001\u0000\u0000"+
		"\u0000xv\u0001\u0000\u0000\u0000y~\u0005\r\u0000\u0000z{\u0005\r\u0000"+
		"\u0000{~\u0005\n\u0000\u0000|~\u0005\n\u0000\u0000}y\u0001\u0000\u0000"+
		"\u0000}z\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~(\u0001\u0000"+
		"\u0000\u0000\u007f\u0081\u0005 \u0000\u0000\u0080\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0006\u0014\u0000\u0000\u0085*\u0001\u0000\u0000\u0000"+
		"\b\u0000CPiov}\u0082\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}