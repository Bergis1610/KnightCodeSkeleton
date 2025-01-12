// Generated from KnightCode.g4 by ANTLR 4.9.2
package lexparse; 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KnightCodeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, ID=19, ESC=20, STRING=21, ASSIGN=22, LETTER=23, NUMBER=24, MUL=25, 
		DIV=26, ADD=27, SUB=28, GT=29, LT=30, EQ=31, NEQ=32, LINE_COMMENT=33, 
		WS=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "ID", "ESC", "STRING", "ASSIGN", "LETTER", "NUMBER", "MUL", 
			"DIV", "ADD", "SUB", "GT", "LT", "EQ", "NEQ", "LINE_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'DECLARE'", "'INTEGER'", "'STRING'", "'BEGIN'", "'END'", 
			"'SET'", "'('", "')'", "'PRINT'", "'READ'", "'IF'", "'THEN'", "'ELSE'", 
			"'ENDIF'", "'WHILE'", "'DO'", "'ENDWHILE'", null, null, null, "':='", 
			null, null, "'*'", "'/'", "'+'", "'-'", "'>'", "'<'", "'='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "ID", "ESC", "STRING", "ASSIGN", 
			"LETTER", "NUMBER", "MUL", "DIV", "ADD", "SUB", "GT", "LT", "EQ", "NEQ", 
			"LINE_COMMENT", "WS"
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


	public KnightCodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KnightCode.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u00f0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u00ac\n\24\f\24\16\24\u00af"+
		"\13\24\3\25\3\25\3\25\3\25\5\25\u00b5\n\25\3\26\3\26\3\26\7\26\u00ba\n"+
		"\26\f\26\16\26\u00bd\13\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\6\31"+
		"\u00c7\n\31\r\31\16\31\u00c8\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\7\"\u00de\n\"\f\"\16\"\u00e1"+
		"\13\"\3\"\5\"\u00e4\n\"\3\"\3\"\3\"\3\"\3#\6#\u00eb\n#\r#\16#\u00ec\3"+
		"#\3#\4\u00bb\u00df\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17"+
		"\"\"\2\u00f8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\3G\3\2\2\2\5O\3\2\2\2\7W\3\2\2\2\t_\3\2\2\2\13f\3\2\2\2\rl\3\2\2\2"+
		"\17p\3\2\2\2\21t\3\2\2\2\23v\3\2\2\2\25x\3\2\2\2\27~\3\2\2\2\31\u0083"+
		"\3\2\2\2\33\u0086\3\2\2\2\35\u008b\3\2\2\2\37\u0090\3\2\2\2!\u0096\3\2"+
		"\2\2#\u009c\3\2\2\2%\u009f\3\2\2\2\'\u00a8\3\2\2\2)\u00b4\3\2\2\2+\u00b6"+
		"\3\2\2\2-\u00c0\3\2\2\2/\u00c3\3\2\2\2\61\u00c6\3\2\2\2\63\u00ca\3\2\2"+
		"\2\65\u00cc\3\2\2\2\67\u00ce\3\2\2\29\u00d0\3\2\2\2;\u00d2\3\2\2\2=\u00d4"+
		"\3\2\2\2?\u00d6\3\2\2\2A\u00d8\3\2\2\2C\u00db\3\2\2\2E\u00ea\3\2\2\2G"+
		"H\7R\2\2HI\7T\2\2IJ\7Q\2\2JK\7I\2\2KL\7T\2\2LM\7C\2\2MN\7O\2\2N\4\3\2"+
		"\2\2OP\7F\2\2PQ\7G\2\2QR\7E\2\2RS\7N\2\2ST\7C\2\2TU\7T\2\2UV\7G\2\2V\6"+
		"\3\2\2\2WX\7K\2\2XY\7P\2\2YZ\7V\2\2Z[\7G\2\2[\\\7I\2\2\\]\7G\2\2]^\7T"+
		"\2\2^\b\3\2\2\2_`\7U\2\2`a\7V\2\2ab\7T\2\2bc\7K\2\2cd\7P\2\2de\7I\2\2"+
		"e\n\3\2\2\2fg\7D\2\2gh\7G\2\2hi\7I\2\2ij\7K\2\2jk\7P\2\2k\f\3\2\2\2lm"+
		"\7G\2\2mn\7P\2\2no\7F\2\2o\16\3\2\2\2pq\7U\2\2qr\7G\2\2rs\7V\2\2s\20\3"+
		"\2\2\2tu\7*\2\2u\22\3\2\2\2vw\7+\2\2w\24\3\2\2\2xy\7R\2\2yz\7T\2\2z{\7"+
		"K\2\2{|\7P\2\2|}\7V\2\2}\26\3\2\2\2~\177\7T\2\2\177\u0080\7G\2\2\u0080"+
		"\u0081\7C\2\2\u0081\u0082\7F\2\2\u0082\30\3\2\2\2\u0083\u0084\7K\2\2\u0084"+
		"\u0085\7H\2\2\u0085\32\3\2\2\2\u0086\u0087\7V\2\2\u0087\u0088\7J\2\2\u0088"+
		"\u0089\7G\2\2\u0089\u008a\7P\2\2\u008a\34\3\2\2\2\u008b\u008c\7G\2\2\u008c"+
		"\u008d\7N\2\2\u008d\u008e\7U\2\2\u008e\u008f\7G\2\2\u008f\36\3\2\2\2\u0090"+
		"\u0091\7G\2\2\u0091\u0092\7P\2\2\u0092\u0093\7F\2\2\u0093\u0094\7K\2\2"+
		"\u0094\u0095\7H\2\2\u0095 \3\2\2\2\u0096\u0097\7Y\2\2\u0097\u0098\7J\2"+
		"\2\u0098\u0099\7K\2\2\u0099\u009a\7N\2\2\u009a\u009b\7G\2\2\u009b\"\3"+
		"\2\2\2\u009c\u009d\7F\2\2\u009d\u009e\7Q\2\2\u009e$\3\2\2\2\u009f\u00a0"+
		"\7G\2\2\u00a0\u00a1\7P\2\2\u00a1\u00a2\7F\2\2\u00a2\u00a3\7Y\2\2\u00a3"+
		"\u00a4\7J\2\2\u00a4\u00a5\7K\2\2\u00a5\u00a6\7N\2\2\u00a6\u00a7\7G\2\2"+
		"\u00a7&\3\2\2\2\u00a8\u00ad\5/\30\2\u00a9\u00ac\5/\30\2\u00aa\u00ac\t"+
		"\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae(\3\2\2\2\u00af\u00ad\3\2\2\2"+
		"\u00b0\u00b1\7^\2\2\u00b1\u00b5\7$\2\2\u00b2\u00b3\7^\2\2\u00b3\u00b5"+
		"\7^\2\2\u00b4\u00b0\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5*\3\2\2\2\u00b6\u00bb"+
		"\7$\2\2\u00b7\u00ba\5)\25\2\u00b8\u00ba\13\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7$\2\2\u00bf"+
		",\3\2\2\2\u00c0\u00c1\7<\2\2\u00c1\u00c2\7?\2\2\u00c2.\3\2\2\2\u00c3\u00c4"+
		"\t\3\2\2\u00c4\60\3\2\2\2\u00c5\u00c7\t\2\2\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\62\3\2\2"+
		"\2\u00ca\u00cb\7,\2\2\u00cb\64\3\2\2\2\u00cc\u00cd\7\61\2\2\u00cd\66\3"+
		"\2\2\2\u00ce\u00cf\7-\2\2\u00cf8\3\2\2\2\u00d0\u00d1\7/\2\2\u00d1:\3\2"+
		"\2\2\u00d2\u00d3\7@\2\2\u00d3<\3\2\2\2\u00d4\u00d5\7>\2\2\u00d5>\3\2\2"+
		"\2\u00d6\u00d7\7?\2\2\u00d7@\3\2\2\2\u00d8\u00d9\7>\2\2\u00d9\u00da\7"+
		"@\2\2\u00daB\3\2\2\2\u00db\u00df\7%\2\2\u00dc\u00de\13\2\2\2\u00dd\u00dc"+
		"\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e4\7\17\2\2\u00e3\u00e2\3"+
		"\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7\f\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\b\"\2\2\u00e8D\3\2\2\2\u00e9\u00eb\t\4\2\2"+
		"\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\b#\2\2\u00efF\3\2\2\2\f\2\u00ab"+
		"\u00ad\u00b4\u00b9\u00bb\u00c8\u00df\u00e3\u00ec\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}