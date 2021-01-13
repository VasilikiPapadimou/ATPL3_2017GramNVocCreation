// Generated from AM.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AMLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, INT_TYPE=2, BOOL_TYPE=3, STRING_TYPE=4, ARRAY=5, OF=6, READ=7, 
		WRITE=8, IF=9, THEN=10, ELSE=11, WHILE=12, DO=13, EXIT=14, VAR=15, BODY=16, 
		BEGIN=17, END=18, AND=19, OR=20, NOT=21, TRUE=22, FALSE=23, IDENTIFIERS=24, 
		WHITESPACES=25, COMMENTS=26, STR=27, NUM=28, CONSTANTS=29, MUL=30, DIV=31, 
		MOD=32, ADD=33, MIN=34, EQUAL=35, NEQUAL=36, LESS=37, MORETHAN=38, LEOREQ=39, 
		MOOREQ=40, CONC=41, ASSIGN=42, LP=43, RP=44, LB=45, RB=46, SEMICOLON=47, 
		COLON=48, COMMA=49, CHARSET=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PROGRAM", "INT_TYPE", "BOOL_TYPE", "STRING_TYPE", "ARRAY", "OF", "READ", 
		"WRITE", "IF", "THEN", "ELSE", "WHILE", "DO", "EXIT", "VAR", "BODY", "BEGIN", 
		"END", "AND", "OR", "NOT", "TRUE", "FALSE", "IDENTIFIERS", "WHITESPACES", 
		"COMMENTS", "STR", "NUM", "CONSTANTS", "MUL", "DIV", "MOD", "ADD", "MIN", 
		"EQUAL", "NEQUAL", "LESS", "MORETHAN", "LEOREQ", "MOOREQ", "CONC", "ASSIGN", 
		"LP", "RP", "LB", "RB", "SEMICOLON", "COLON", "COMMA", "CHARSET"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PROGRAM'", "'INTEGER'", "'BOOLEAN'", "'STRING'", "'ARRAY'", "'OF'", 
		"'READ'", "'WRITE'", "'IF'", "'THEN'", "'ELSE'", "'WHILE'", "'DO'", "'EXIT'", 
		"'VAR'", "'BODY'", "'BEGIN'", "'END'", "'AND'", "'OR'", "'NOT'", "'TRUE'", 
		"'FALSE'", null, null, null, null, null, null, "'*'", "'/'", "'%'", "'+'", 
		"'-'", "'='", "'<>'", "'<'", "'>'", "'<='", "'>='", "'|'", "':='", "'('", 
		"')'", "'['", "']'", "';'", "':'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PROGRAM", "INT_TYPE", "BOOL_TYPE", "STRING_TYPE", "ARRAY", "OF", 
		"READ", "WRITE", "IF", "THEN", "ELSE", "WHILE", "DO", "EXIT", "VAR", "BODY", 
		"BEGIN", "END", "AND", "OR", "NOT", "TRUE", "FALSE", "IDENTIFIERS", "WHITESPACES", 
		"COMMENTS", "STR", "NUM", "CONSTANTS", "MUL", "DIV", "MOD", "ADD", "MIN", 
		"EQUAL", "NEQUAL", "LESS", "MORETHAN", "LEOREQ", "MOOREQ", "CONC", "ASSIGN", 
		"LP", "RP", "LB", "RB", "SEMICOLON", "COLON", "COMMA", "CHARSET"
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


	public AMLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AM.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u013e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\7\31\u00e1\n\31\f\31"+
		"\16\31\u00e4\13\31\3\32\6\32\u00e7\n\32\r\32\16\32\u00e8\3\32\3\32\3\33"+
		"\3\33\7\33\u00ef\n\33\f\33\16\33\u00f2\13\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\7\34\u00fd\n\34\f\34\16\34\u0100\13\34\3\34\3\34"+
		"\3\35\6\35\u0105\n\35\r\35\16\35\u0106\3\36\3\36\3\36\5\36\u010c\n\36"+
		"\3\36\5\36\u010f\n\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%"+
		"\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3"+
		"/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\2\2\64\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\5"+
		"\2\13\f\17\17\"\"\4\2\f\f\17\17\3\2\62;\2\u0146\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\3g\3\2\2\2\5o\3\2\2\2\7w\3\2\2\2\t\177\3\2\2\2\13\u0086\3\2\2\2"+
		"\r\u008c\3\2\2\2\17\u008f\3\2\2\2\21\u0094\3\2\2\2\23\u009a\3\2\2\2\25"+
		"\u009d\3\2\2\2\27\u00a2\3\2\2\2\31\u00a7\3\2\2\2\33\u00ad\3\2\2\2\35\u00b0"+
		"\3\2\2\2\37\u00b5\3\2\2\2!\u00b9\3\2\2\2#\u00be\3\2\2\2%\u00c4\3\2\2\2"+
		"\'\u00c8\3\2\2\2)\u00cc\3\2\2\2+\u00cf\3\2\2\2-\u00d3\3\2\2\2/\u00d8\3"+
		"\2\2\2\61\u00de\3\2\2\2\63\u00e6\3\2\2\2\65\u00ec\3\2\2\2\67\u00f7\3\2"+
		"\2\29\u0104\3\2\2\2;\u010e\3\2\2\2=\u0110\3\2\2\2?\u0112\3\2\2\2A\u0114"+
		"\3\2\2\2C\u0116\3\2\2\2E\u0118\3\2\2\2G\u011a\3\2\2\2I\u011c\3\2\2\2K"+
		"\u011f\3\2\2\2M\u0121\3\2\2\2O\u0123\3\2\2\2Q\u0126\3\2\2\2S\u0129\3\2"+
		"\2\2U\u012b\3\2\2\2W\u012e\3\2\2\2Y\u0130\3\2\2\2[\u0132\3\2\2\2]\u0134"+
		"\3\2\2\2_\u0136\3\2\2\2a\u0138\3\2\2\2c\u013a\3\2\2\2e\u013c\3\2\2\2g"+
		"h\7R\2\2hi\7T\2\2ij\7Q\2\2jk\7I\2\2kl\7T\2\2lm\7C\2\2mn\7O\2\2n\4\3\2"+
		"\2\2op\7K\2\2pq\7P\2\2qr\7V\2\2rs\7G\2\2st\7I\2\2tu\7G\2\2uv\7T\2\2v\6"+
		"\3\2\2\2wx\7D\2\2xy\7Q\2\2yz\7Q\2\2z{\7N\2\2{|\7G\2\2|}\7C\2\2}~\7P\2"+
		"\2~\b\3\2\2\2\177\u0080\7U\2\2\u0080\u0081\7V\2\2\u0081\u0082\7T\2\2\u0082"+
		"\u0083\7K\2\2\u0083\u0084\7P\2\2\u0084\u0085\7I\2\2\u0085\n\3\2\2\2\u0086"+
		"\u0087\7C\2\2\u0087\u0088\7T\2\2\u0088\u0089\7T\2\2\u0089\u008a\7C\2\2"+
		"\u008a\u008b\7[\2\2\u008b\f\3\2\2\2\u008c\u008d\7Q\2\2\u008d\u008e\7H"+
		"\2\2\u008e\16\3\2\2\2\u008f\u0090\7T\2\2\u0090\u0091\7G\2\2\u0091\u0092"+
		"\7C\2\2\u0092\u0093\7F\2\2\u0093\20\3\2\2\2\u0094\u0095\7Y\2\2\u0095\u0096"+
		"\7T\2\2\u0096\u0097\7K\2\2\u0097\u0098\7V\2\2\u0098\u0099\7G\2\2\u0099"+
		"\22\3\2\2\2\u009a\u009b\7K\2\2\u009b\u009c\7H\2\2\u009c\24\3\2\2\2\u009d"+
		"\u009e\7V\2\2\u009e\u009f\7J\2\2\u009f\u00a0\7G\2\2\u00a0\u00a1\7P\2\2"+
		"\u00a1\26\3\2\2\2\u00a2\u00a3\7G\2\2\u00a3\u00a4\7N\2\2\u00a4\u00a5\7"+
		"U\2\2\u00a5\u00a6\7G\2\2\u00a6\30\3\2\2\2\u00a7\u00a8\7Y\2\2\u00a8\u00a9"+
		"\7J\2\2\u00a9\u00aa\7K\2\2\u00aa\u00ab\7N\2\2\u00ab\u00ac\7G\2\2\u00ac"+
		"\32\3\2\2\2\u00ad\u00ae\7F\2\2\u00ae\u00af\7Q\2\2\u00af\34\3\2\2\2\u00b0"+
		"\u00b1\7G\2\2\u00b1\u00b2\7Z\2\2\u00b2\u00b3\7K\2\2\u00b3\u00b4\7V\2\2"+
		"\u00b4\36\3\2\2\2\u00b5\u00b6\7X\2\2\u00b6\u00b7\7C\2\2\u00b7\u00b8\7"+
		"T\2\2\u00b8 \3\2\2\2\u00b9\u00ba\7D\2\2\u00ba\u00bb\7Q\2\2\u00bb\u00bc"+
		"\7F\2\2\u00bc\u00bd\7[\2\2\u00bd\"\3\2\2\2\u00be\u00bf\7D\2\2\u00bf\u00c0"+
		"\7G\2\2\u00c0\u00c1\7I\2\2\u00c1\u00c2\7K\2\2\u00c2\u00c3\7P\2\2\u00c3"+
		"$\3\2\2\2\u00c4\u00c5\7G\2\2\u00c5\u00c6\7P\2\2\u00c6\u00c7\7F\2\2\u00c7"+
		"&\3\2\2\2\u00c8\u00c9\7C\2\2\u00c9\u00ca\7P\2\2\u00ca\u00cb\7F\2\2\u00cb"+
		"(\3\2\2\2\u00cc\u00cd\7Q\2\2\u00cd\u00ce\7T\2\2\u00ce*\3\2\2\2\u00cf\u00d0"+
		"\7P\2\2\u00d0\u00d1\7Q\2\2\u00d1\u00d2\7V\2\2\u00d2,\3\2\2\2\u00d3\u00d4"+
		"\7V\2\2\u00d4\u00d5\7T\2\2\u00d5\u00d6\7W\2\2\u00d6\u00d7\7G\2\2\u00d7"+
		".\3\2\2\2\u00d8\u00d9\7H\2\2\u00d9\u00da\7C\2\2\u00da\u00db\7N\2\2\u00db"+
		"\u00dc\7U\2\2\u00dc\u00dd\7G\2\2\u00dd\60\3\2\2\2\u00de\u00e2\t\2\2\2"+
		"\u00df\u00e1\t\3\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\62\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e7\t\4\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\b\32\2\2\u00eb"+
		"\64\3\2\2\2\u00ec\u00f0\7}\2\2\u00ed\u00ef\n\5\2\2\u00ee\u00ed\3\2\2\2"+
		"\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3"+
		"\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7\177\2\2\u00f4\u00f5\3\2\2\2"+
		"\u00f5\u00f6\b\33\2\2\u00f6\66\3\2\2\2\u00f7\u00f8\7$\2\2\u00f8\u00fe"+
		"\5e\63\2\u00f9\u00fd\n\5\2\2\u00fa\u00fb\7^\2\2\u00fb\u00fd\7$\2\2\u00fc"+
		"\u00f9\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101"+
		"\u0102\7$\2\2\u01028\3\2\2\2\u0103\u0105\t\6\2\2\u0104\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107:\3\2\2\2"+
		"\u0108\u010f\59\35\2\u0109\u010c\5-\27\2\u010a\u010c\5/\30\2\u010b\u0109"+
		"\3\2\2\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010f\5\67\34\2"+
		"\u010e\u0108\3\2\2\2\u010e\u010b\3\2\2\2\u010e\u010d\3\2\2\2\u010f<\3"+
		"\2\2\2\u0110\u0111\7,\2\2\u0111>\3\2\2\2\u0112\u0113\7\61\2\2\u0113@\3"+
		"\2\2\2\u0114\u0115\7\'\2\2\u0115B\3\2\2\2\u0116\u0117\7-\2\2\u0117D\3"+
		"\2\2\2\u0118\u0119\7/\2\2\u0119F\3\2\2\2\u011a\u011b\7?\2\2\u011bH\3\2"+
		"\2\2\u011c\u011d\7>\2\2\u011d\u011e\7@\2\2\u011eJ\3\2\2\2\u011f\u0120"+
		"\7>\2\2\u0120L\3\2\2\2\u0121\u0122\7@\2\2\u0122N\3\2\2\2\u0123\u0124\7"+
		">\2\2\u0124\u0125\7?\2\2\u0125P\3\2\2\2\u0126\u0127\7@\2\2\u0127\u0128"+
		"\7?\2\2\u0128R\3\2\2\2\u0129\u012a\7~\2\2\u012aT\3\2\2\2\u012b\u012c\7"+
		"<\2\2\u012c\u012d\7?\2\2\u012dV\3\2\2\2\u012e\u012f\7*\2\2\u012fX\3\2"+
		"\2\2\u0130\u0131\7+\2\2\u0131Z\3\2\2\2\u0132\u0133\7]\2\2\u0133\\\3\2"+
		"\2\2\u0134\u0135\7_\2\2\u0135^\3\2\2\2\u0136\u0137\7=\2\2\u0137`\3\2\2"+
		"\2\u0138\u0139\7<\2\2\u0139b\3\2\2\2\u013a\u013b\7.\2\2\u013bd\3\2\2\2"+
		"\u013c\u013d\13\2\2\2\u013df\3\2\2\2\13\2\u00e2\u00e8\u00f0\u00fc\u00fe"+
		"\u0106\u010b\u010e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}