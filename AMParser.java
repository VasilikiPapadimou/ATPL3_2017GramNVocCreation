// Generated from AM.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AMParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_program_structure = 1, RULE_head = 2, RULE_declaration = 3, 
		RULE_bod = 4, RULE_dec = 5, RULE_type = 6, RULE_block = 7, RULE_stat = 8, 
		RULE_assignment = 9, RULE_input = 10, RULE_output = 11, RULE_ifel = 12, 
		RULE_loop = 13, RULE_expr = 14;
	public static final String[] ruleNames = {
		"program", "program_structure", "head", "declaration", "bod", "dec", "type", 
		"block", "stat", "assignment", "input", "output", "ifel", "loop", "expr"
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

	@Override
	public String getGrammarFileName() { return "AM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Program_structureContext program_structure() {
			return getRuleContext(Program_structureContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			program_structure();
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

	public static class Program_structureContext extends ParserRuleContext {
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public BodContext bod() {
			return getRuleContext(BodContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Program_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).enterProgram_structure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).exitProgram_structure(this);
		}
	}

	public final Program_structureContext program_structure() throws RecognitionException {
		Program_structureContext _localctx = new Program_structureContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			head();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(33);
				declaration();
				}
			}

			setState(36);
			bod();
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

	public static class HeadContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(AMParser.PROGRAM, 0); }
		public TerminalNode IDENTIFIERS() { return getToken(AMParser.IDENTIFIERS, 0); }
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).exitHead(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(PROGRAM);
			setState(39);
			match(IDENTIFIERS);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(AMParser.VAR, 0); }
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(AMParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AMParser.SEMICOLON, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(VAR);
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(42);
					dec();
					setState(43);
					match(SEMICOLON);
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(50);
			dec();
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

	public static class BodContext extends ParserRuleContext {
		public TerminalNode BODY() { return getToken(AMParser.BODY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public BodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).enterBod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).exitBod(this);
		}
	}

	public final BodContext bod() throws RecognitionException {
		BodContext _localctx = new BodContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(BODY);
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(53);
				block();
				}
				break;
			case READ:
			case WRITE:
			case IF:
			case WHILE:
			case EXIT:
			case NOT:
			case TRUE:
			case FALSE:
			case IDENTIFIERS:
			case STR:
			case NUM:
			case MIN:
			case LP:
				{
				setState(54);
				stat();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DecContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIERS() { return getTokens(AMParser.IDENTIFIERS); }
		public TerminalNode IDENTIFIERS(int i) {
			return getToken(AMParser.IDENTIFIERS, i);
		}
		public TerminalNode COLON() { return getToken(AMParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(AMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AMParser.COMMA, i);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).exitDec(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(IDENTIFIERS);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(58);
				match(COMMA);
				setState(59);
				match(IDENTIFIERS);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(COLON);
			setState(66);
			type();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(AMParser.INT_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(AMParser.BOOL_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(AMParser.STRING_TYPE, 0); }
		public TerminalNode ARRAY() { return getToken(AMParser.ARRAY, 0); }
		public TerminalNode LB() { return getToken(AMParser.LB, 0); }
		public TerminalNode NUM() { return getToken(AMParser.NUM, 0); }
		public TerminalNode RB() { return getToken(AMParser.RB, 0); }
		public TerminalNode OF() { return getToken(AMParser.OF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(INT_TYPE);
				}
				break;
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(BOOL_TYPE);
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(STRING_TYPE);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				match(ARRAY);
				setState(72);
				match(LB);
				setState(73);
				match(NUM);
				setState(74);
				match(RB);
				setState(75);
				match(OF);
				setState(76);
				type();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(AMParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(AMParser.END, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(AMParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AMParser.SEMICOLON, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(BEGIN);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << WRITE) | (1L << IF) | (1L << WHILE) | (1L << EXIT) | (1L << BEGIN) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIERS) | (1L << STR) | (1L << NUM) | (1L << MIN) | (1L << LP))) != 0)) {
				{
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(82);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case READ:
						case WRITE:
						case IF:
						case WHILE:
						case EXIT:
						case NOT:
						case TRUE:
						case FALSE:
						case IDENTIFIERS:
						case STR:
						case NUM:
						case MIN:
						case LP:
							{
							setState(80);
							stat();
							}
							break;
						case BEGIN:
							{
							setState(81);
							block();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(84);
						match(SEMICOLON);
						}
						} 
					}
					setState(90);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(93);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case READ:
				case WRITE:
				case IF:
				case WHILE:
				case EXIT:
				case NOT:
				case TRUE:
				case FALSE:
				case IDENTIFIERS:
				case STR:
				case NUM:
				case MIN:
				case LP:
					{
					setState(91);
					stat();
					}
					break;
				case BEGIN:
					{
					setState(92);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(97);
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

	public static class StatContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public IfelContext ifel() {
			return getRuleContext(IfelContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public TerminalNode EXIT() { return getToken(AMParser.EXIT, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stat);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case TRUE:
			case FALSE:
			case IDENTIFIERS:
			case STR:
			case NUM:
			case MIN:
			case LP:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				assignment();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				input();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				output();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				ifel();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				loop();
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				match(EXIT);
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(AMParser.ASSIGN, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			expr(0);
			setState(108);
			match(ASSIGN);
			setState(109);
			expr(0);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(AMParser.READ, 0); }
		public TerminalNode LP() { return getToken(AMParser.LP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP() { return getToken(AMParser.RP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AMParser.COMMA, i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_input);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(READ);
			setState(112);
			match(LP);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(113);
					expr(0);
					setState(114);
					match(COMMA);
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(121);
			expr(0);
			setState(122);
			match(RP);
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

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(AMParser.WRITE, 0); }
		public TerminalNode LP() { return getToken(AMParser.LP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP() { return getToken(AMParser.RP, 0); }
		public TerminalNode COMMA() { return getToken(AMParser.COMMA, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(WRITE);
			setState(125);
			match(LP);
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(126);
				expr(0);
				setState(127);
				match(COMMA);
				}
				break;
			}
			setState(131);
			expr(0);
			setState(132);
			match(RP);
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

	public static class IfelContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AMParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(AMParser.THEN, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AMParser.ELSE, 0); }
		public IfelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).enterIfel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).exitIfel(this);
		}
	}

	public final IfelContext ifel() throws RecognitionException {
		IfelContext _localctx = new IfelContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(IF);
			setState(135);
			expr(0);
			setState(136);
			match(THEN);
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
			case WRITE:
			case IF:
			case WHILE:
			case EXIT:
			case NOT:
			case TRUE:
			case FALSE:
			case IDENTIFIERS:
			case STR:
			case NUM:
			case MIN:
			case LP:
				{
				setState(137);
				stat();
				}
				break;
			case BEGIN:
				{
				setState(138);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(141);
				match(ELSE);
				setState(144);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case READ:
				case WRITE:
				case IF:
				case WHILE:
				case EXIT:
				case NOT:
				case TRUE:
				case FALSE:
				case IDENTIFIERS:
				case STR:
				case NUM:
				case MIN:
				case LP:
					{
					setState(142);
					stat();
					}
					break;
				case BEGIN:
					{
					setState(143);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AMParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(AMParser.DO, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(WHILE);
			setState(149);
			expr(0);
			setState(150);
			match(DO);
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
			case WRITE:
			case IF:
			case WHILE:
			case EXIT:
			case NOT:
			case TRUE:
			case FALSE:
			case IDENTIFIERS:
			case STR:
			case NUM:
			case MIN:
			case LP:
				{
				setState(151);
				stat();
				}
				break;
			case BEGIN:
				{
				setState(152);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LP() { return getToken(AMParser.LP, 0); }
		public TerminalNode RP() { return getToken(AMParser.RP, 0); }
		public TerminalNode MIN() { return getToken(AMParser.MIN, 0); }
		public TerminalNode NOT() { return getToken(AMParser.NOT, 0); }
		public TerminalNode TRUE() { return getToken(AMParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(AMParser.FALSE, 0); }
		public TerminalNode IDENTIFIERS() { return getToken(AMParser.IDENTIFIERS, 0); }
		public TerminalNode LB() { return getToken(AMParser.LB, 0); }
		public TerminalNode RB() { return getToken(AMParser.RB, 0); }
		public TerminalNode NUM() { return getToken(AMParser.NUM, 0); }
		public TerminalNode STR() { return getToken(AMParser.STR, 0); }
		public TerminalNode MUL() { return getToken(AMParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(AMParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(AMParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(AMParser.ADD, 0); }
		public TerminalNode CONC() { return getToken(AMParser.CONC, 0); }
		public TerminalNode EQUAL() { return getToken(AMParser.EQUAL, 0); }
		public TerminalNode NEQUAL() { return getToken(AMParser.NEQUAL, 0); }
		public TerminalNode LESS() { return getToken(AMParser.LESS, 0); }
		public TerminalNode MORETHAN() { return getToken(AMParser.MORETHAN, 0); }
		public TerminalNode LEOREQ() { return getToken(AMParser.LEOREQ, 0); }
		public TerminalNode MOOREQ() { return getToken(AMParser.MOOREQ, 0); }
		public TerminalNode OR() { return getToken(AMParser.OR, 0); }
		public TerminalNode AND() { return getToken(AMParser.AND, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMListener ) ((AMListener)listener).exitExpr(this);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(162);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
				case MIN:
					{
					setState(156);
					_la = _input.LA(1);
					if ( !(_la==NOT || _la==MIN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(157);
					expr(0);
					}
					break;
				case LP:
					{
					setState(158);
					match(LP);
					setState(159);
					expr(0);
					setState(160);
					match(RP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				setState(164);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				setState(165);
				match(IDENTIFIERS);
				setState(166);
				match(LB);
				setState(167);
				expr(0);
				setState(168);
				match(RB);
				}
				break;
			case 4:
				{
				setState(170);
				match(NUM);
				}
				break;
			case 5:
				{
				setState(171);
				match(STR);
				}
				break;
			case 6:
				{
				setState(172);
				match(IDENTIFIERS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(190);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(176);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(177);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(179);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MIN) | (1L << CONC))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(180);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(182);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NEQUAL) | (1L << LESS) | (1L << MORETHAN) | (1L << LEOREQ) | (1L << MOOREQ))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(183);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(185);
						match(OR);
						setState(186);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(188);
						match(AND);
						setState(189);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u00c6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\5"+
		"\3%\n\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\60\n\5\f\5\16\5\63\13"+
		"\5\3\5\3\5\3\6\3\6\3\6\5\6:\n\6\3\7\3\7\3\7\7\7?\n\7\f\7\16\7B\13\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bP\n\b\3\t\3\t\3\t\5"+
		"\tU\n\t\3\t\3\t\7\tY\n\t\f\t\16\t\\\13\t\3\t\3\t\5\t`\n\t\5\tb\n\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nl\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\7\fw\n\f\f\f\16\fz\13\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u0084"+
		"\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u008e\n\16\3\16\3\16\3"+
		"\16\5\16\u0093\n\16\5\16\u0095\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u009c"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a5\n\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b0\n\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00c1\n\20\f\20"+
		"\16\20\u00c4\13\20\3\20\2\3\36\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36\2\7\4\2\27\27$$\3\2\30\31\3\2 \"\4\2#$++\3\2%*\2\u00d7\2 \3\2\2\2"+
		"\4\"\3\2\2\2\6(\3\2\2\2\b+\3\2\2\2\n\66\3\2\2\2\f;\3\2\2\2\16O\3\2\2\2"+
		"\20Q\3\2\2\2\22k\3\2\2\2\24m\3\2\2\2\26q\3\2\2\2\30~\3\2\2\2\32\u0088"+
		"\3\2\2\2\34\u0096\3\2\2\2\36\u00af\3\2\2\2 !\5\4\3\2!\3\3\2\2\2\"$\5\6"+
		"\4\2#%\5\b\5\2$#\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\5\n\6\2\'\5\3\2\2\2()"+
		"\7\3\2\2)*\7\32\2\2*\7\3\2\2\2+\61\7\21\2\2,-\5\f\7\2-.\7\61\2\2.\60\3"+
		"\2\2\2/,\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2"+
		"\63\61\3\2\2\2\64\65\5\f\7\2\65\t\3\2\2\2\669\7\22\2\2\67:\5\20\t\28:"+
		"\5\22\n\29\67\3\2\2\298\3\2\2\2:\13\3\2\2\2;@\7\32\2\2<=\7\63\2\2=?\7"+
		"\32\2\2><\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD"+
		"\7\62\2\2DE\5\16\b\2E\r\3\2\2\2FP\7\4\2\2GP\7\5\2\2HP\7\6\2\2IJ\7\7\2"+
		"\2JK\7/\2\2KL\7\36\2\2LM\7\60\2\2MN\7\b\2\2NP\5\16\b\2OF\3\2\2\2OG\3\2"+
		"\2\2OH\3\2\2\2OI\3\2\2\2P\17\3\2\2\2Qa\7\23\2\2RU\5\22\n\2SU\5\20\t\2"+
		"TR\3\2\2\2TS\3\2\2\2UV\3\2\2\2VW\7\61\2\2WY\3\2\2\2XT\3\2\2\2Y\\\3\2\2"+
		"\2ZX\3\2\2\2Z[\3\2\2\2[_\3\2\2\2\\Z\3\2\2\2]`\5\22\n\2^`\5\20\t\2_]\3"+
		"\2\2\2_^\3\2\2\2`b\3\2\2\2aZ\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\24\2\2d\21"+
		"\3\2\2\2el\5\24\13\2fl\5\26\f\2gl\5\30\r\2hl\5\32\16\2il\5\34\17\2jl\7"+
		"\20\2\2ke\3\2\2\2kf\3\2\2\2kg\3\2\2\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\23"+
		"\3\2\2\2mn\5\36\20\2no\7,\2\2op\5\36\20\2p\25\3\2\2\2qr\7\t\2\2rx\7-\2"+
		"\2st\5\36\20\2tu\7\63\2\2uw\3\2\2\2vs\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3"+
		"\2\2\2y{\3\2\2\2zx\3\2\2\2{|\5\36\20\2|}\7.\2\2}\27\3\2\2\2~\177\7\n\2"+
		"\2\177\u0083\7-\2\2\u0080\u0081\5\36\20\2\u0081\u0082\7\63\2\2\u0082\u0084"+
		"\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\5\36\20\2\u0086\u0087\7.\2\2\u0087\31\3\2\2\2\u0088\u0089\7\13"+
		"\2\2\u0089\u008a\5\36\20\2\u008a\u008d\7\f\2\2\u008b\u008e\5\22\n\2\u008c"+
		"\u008e\5\20\t\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\u0094\3"+
		"\2\2\2\u008f\u0092\7\r\2\2\u0090\u0093\5\22\n\2\u0091\u0093\5\20\t\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u008f\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\33\3\2\2\2\u0096\u0097\7\16\2\2\u0097\u0098"+
		"\5\36\20\2\u0098\u009b\7\17\2\2\u0099\u009c\5\22\n\2\u009a\u009c\5\20"+
		"\t\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\35\3\2\2\2\u009d\u00a4"+
		"\b\20\1\2\u009e\u009f\t\2\2\2\u009f\u00a5\5\36\20\2\u00a0\u00a1\7-\2\2"+
		"\u00a1\u00a2\5\36\20\2\u00a2\u00a3\7.\2\2\u00a3\u00a5\3\2\2\2\u00a4\u009e"+
		"\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a5\u00b0\3\2\2\2\u00a6\u00b0\t\3\2\2\u00a7"+
		"\u00a8\7\32\2\2\u00a8\u00a9\7/\2\2\u00a9\u00aa\5\36\20\2\u00aa\u00ab\7"+
		"\60\2\2\u00ab\u00b0\3\2\2\2\u00ac\u00b0\7\36\2\2\u00ad\u00b0\7\35\2\2"+
		"\u00ae\u00b0\7\32\2\2\u00af\u009d\3\2\2\2\u00af\u00a6\3\2\2\2\u00af\u00a7"+
		"\3\2\2\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\u00c2\3\2\2\2\u00b1\u00b2\f\f\2\2\u00b2\u00b3\t\4\2\2\u00b3\u00c1\5\36"+
		"\20\r\u00b4\u00b5\f\13\2\2\u00b5\u00b6\t\5\2\2\u00b6\u00c1\5\36\20\f\u00b7"+
		"\u00b8\f\n\2\2\u00b8\u00b9\t\6\2\2\u00b9\u00c1\5\36\20\13\u00ba\u00bb"+
		"\f\t\2\2\u00bb\u00bc\7\26\2\2\u00bc\u00c1\5\36\20\n\u00bd\u00be\f\b\2"+
		"\2\u00be\u00bf\7\25\2\2\u00bf\u00c1\5\36\20\t\u00c0\u00b1\3\2\2\2\u00c0"+
		"\u00b4\3\2\2\2\u00c0\u00b7\3\2\2\2\u00c0\u00ba\3\2\2\2\u00c0\u00bd\3\2"+
		"\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\37\3\2\2\2\u00c4\u00c2\3\2\2\2\26$\619@OTZ_akx\u0083\u008d\u0092\u0094"+
		"\u009b\u00a4\u00af\u00c0\u00c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}