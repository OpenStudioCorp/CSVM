// Generated from d://postreset//repos//CSVM//CubeScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CubeScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		Comment=39, BOOL_OPERATOR=40, INTEGER=41, FLOAT=42, IMPORT=43, STRING=44, 
		BOOL=45, TYPE=46, WHILE=47, IF=48, ELSE=49, FOR=50, RETURN=51, SWITCH=52, 
		CASE=53, DEFAULT=54, STATES=55, WS=56, IDENTIFIER=57;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_statement = 2, RULE_assignment = 3, 
		RULE_ifBlock = 4, RULE_whileBlock = 5, RULE_functionCall = 6, RULE_forBlock = 7, 
		RULE_codeBlock = 8, RULE_functionblock = 9, RULE_returnstatement = 10, 
		RULE_importStatement = 11, RULE_includeStatement = 12, RULE_arrayDeclaration = 13, 
		RULE_usingStatement = 14, RULE_expression = 15, RULE_multOp = 16, RULE_addOp = 17, 
		RULE_cmpOp = 18, RULE_boolOp = 19, RULE_constant = 20, RULE_break = 21, 
		RULE_switchBlock = 22, RULE_switchCase = 23, RULE_defaultCase = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "statement", "assignment", "ifBlock", "whileBlock", 
			"functionCall", "forBlock", "codeBlock", "functionblock", "returnstatement", 
			"importStatement", "includeStatement", "arrayDeclaration", "usingStatement", 
			"expression", "multOp", "addOp", "cmpOp", "boolOp", "constant", "break", 
			"switchBlock", "switchCase", "defaultCase"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'('", "')'", "'{'", "'}'", "','", "'>'", "'.'", 
			"'?'", "':'", "'['", "']'", "'++'", "'--'", "'!'", "'-'", "'+'", "'new'", 
			"'*'", "'/'", "'%'", "'^'", "'<<'", "'>>'", "'&'", "'|'", "'&&'", "'||'", 
			"'+='", "'-='", "'*='", "'<'", "'<='", "'>='", "'=='", "'!='", "'stop;'", 
			null, null, null, null, null, null, null, null, "'while'", "'if'", "'else'", 
			"'for'", "'return'", "'switch'", "'at'", "'bland'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "Comment", "BOOL_OPERATOR", "INTEGER", "FLOAT", "IMPORT", 
			"STRING", "BOOL", "TYPE", "WHILE", "IF", "ELSE", "FOR", "RETURN", "SWITCH", 
			"CASE", "DEFAULT", "STATES", "WS", "IDENTIFIER"
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
	public String getGrammarFileName() { return "CubeScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CubeScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CubeScriptParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 188586860007637000L) != 0)) {
				{
				{
				setState(50);
				line();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
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
	public static class LineContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Comment() { return getToken(CubeScriptParser.Comment, 0); }
		public UsingStatementContext usingStatement() {
			return getRuleContext(UsingStatementContext.class,0);
		}
		public ReturnstatementContext returnstatement() {
			return getRuleContext(ReturnstatementContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				ifBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				whileBlock();
				setState(61);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				match(Comment);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				usingStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				returnstatement();
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
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDeclarationexpContext extends StatementContext {
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public ArrayDeclarationexpContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterArrayDeclarationexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitArrayDeclarationexp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakexpContext extends StatementContext {
		public BreakContext break_() {
			return getRuleContext(BreakContext.class,0);
		}
		public BreakexpContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterBreakexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitBreakexp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExpContext extends StatementContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExpContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterFunctionCallExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitFunctionCallExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UsingStatementexpContext extends StatementContext {
		public UsingStatementContext usingStatement() {
			return getRuleContext(UsingStatementContext.class,0);
		}
		public UsingStatementexpContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterUsingStatementexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitUsingStatementexp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncludeStatementexpContext extends StatementContext {
		public IncludeStatementContext includeStatement() {
			return getRuleContext(IncludeStatementContext.class,0);
		}
		public IncludeStatementexpContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterIncludeStatementexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitIncludeStatementexp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionblockexpContext extends StatementContext {
		public FunctionblockContext functionblock() {
			return getRuleContext(FunctionblockContext.class,0);
		}
		public FunctionblockexpContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterFunctionblockexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitFunctionblockexp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommentexpContext extends StatementContext {
		public TerminalNode Comment() { return getToken(CubeScriptParser.Comment, 0); }
		public CommentexpContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterCommentexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitCommentexp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfblockexpContext extends StatementContext {
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public IfblockexpContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterIfblockexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitIfblockexp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionexpContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionexpContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterExpressionexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitExpressionexp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentexpContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentexpContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterAssignmentexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitAssignmentexp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForblockexpContext extends StatementContext {
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public ForblockexpContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterForblockexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitForblockexp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnstatementexpContext extends StatementContext {
		public ReturnstatementContext returnstatement() {
			return getRuleContext(ReturnstatementContext.class,0);
		}
		public ReturnstatementexpContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterReturnstatementexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitReturnstatementexp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementexpContext extends StatementContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ImportStatementexpContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterImportStatementexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitImportStatementexp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchBlockexpContext extends StatementContext {
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchBlockexpContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterSwitchBlockexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitSwitchBlockexp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileblockexpContext extends StatementContext {
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public WhileblockexpContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterWhileblockexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitWhileblockexp(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new AssignmentexpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				assignment();
				}
				break;
			case 2:
				_localctx = new FunctionCallExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				functionCall();
				}
				break;
			case 3:
				_localctx = new IfblockexpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				ifBlock();
				}
				break;
			case 4:
				_localctx = new WhileblockexpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				whileBlock();
				}
				break;
			case 5:
				_localctx = new ForblockexpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				forBlock();
				}
				break;
			case 6:
				_localctx = new BreakexpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				break_();
				}
				break;
			case 7:
				_localctx = new ReturnstatementexpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(74);
				returnstatement();
				}
				break;
			case 8:
				_localctx = new ExpressionexpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(75);
				expression(0);
				}
				break;
			case 9:
				_localctx = new CommentexpContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(76);
				match(Comment);
				}
				break;
			case 10:
				_localctx = new UsingStatementexpContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(77);
				usingStatement();
				}
				break;
			case 11:
				_localctx = new ImportStatementexpContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(78);
				importStatement();
				}
				break;
			case 12:
				_localctx = new IncludeStatementexpContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(79);
				includeStatement();
				}
				break;
			case 13:
				_localctx = new ArrayDeclarationexpContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(80);
				arrayDeclaration();
				}
				break;
			case 14:
				_localctx = new SwitchBlockexpContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(81);
				switchBlock();
				}
				break;
			case 15:
				_localctx = new FunctionblockexpContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(82);
				functionblock();
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CubeScriptParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(IDENTIFIER);
			setState(86);
			match(T__0);
			setState(87);
			expression(0);
			setState(88);
			match(T__1);
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
	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CubeScriptParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CubeScriptParser.ELSE, 0); }
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitIfBlock(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(IF);
			setState(91);
			match(T__2);
			setState(92);
			expression(0);
			setState(93);
			match(T__3);
			setState(94);
			match(T__4);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 188586860007637000L) != 0)) {
				{
				{
				setState(95);
				line();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(T__5);
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(102);
				match(ELSE);
				setState(103);
				match(T__4);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 188586860007637000L) != 0)) {
					{
					{
					setState(104);
					line();
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(110);
				match(T__5);
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
	public static class WhileBlockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CubeScriptParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitWhileBlock(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(WHILE);
			setState(114);
			match(T__2);
			setState(115);
			expression(0);
			setState(116);
			match(T__3);
			setState(117);
			match(T__4);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 188586860007637000L) != 0)) {
				{
				{
				setState(118);
				line();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(T__5);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CubeScriptParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(IDENTIFIER);
			setState(127);
			match(T__2);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 148054463361302536L) != 0)) {
				{
				setState(128);
				expression(0);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(129);
					match(T__6);
					setState(130);
					expression(0);
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(138);
			match(T__3);
			setState(139);
			match(T__1);
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
	public static class ForBlockContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CubeScriptParser.FOR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitForBlock(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(FOR);
			setState(142);
			match(T__2);
			setState(143);
			expression(0);
			setState(144);
			match(T__7);
			setState(145);
			expression(0);
			setState(146);
			match(T__3);
			setState(147);
			match(T__4);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 188586860007637000L) != 0)) {
				{
				{
				setState(148);
				line();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			match(T__5);
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
	public static class CodeBlockContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitCodeBlock(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_codeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__4);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 188586860007637000L) != 0)) {
				{
				{
				setState(157);
				line();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			match(T__5);
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
	public static class FunctionblockContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(CubeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CubeScriptParser.IDENTIFIER, i);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode STATES() { return getToken(CubeScriptParser.STATES, 0); }
		public FunctionblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterFunctionblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitFunctionblock(this);
		}
	}

	public final FunctionblockContext functionblock() throws RecognitionException {
		FunctionblockContext _localctx = new FunctionblockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATES) {
				{
				setState(165);
				match(STATES);
				}
			}

			setState(168);
			match(IDENTIFIER);
			setState(169);
			match(T__2);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(170);
				match(IDENTIFIER);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(171);
					match(T__6);
					setState(172);
					match(IDENTIFIER);
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(180);
			match(T__3);
			setState(181);
			codeBlock();
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
	public static class ReturnstatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CubeScriptParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterReturnstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitReturnstatement(this);
		}
	}

	public final ReturnstatementContext returnstatement() throws RecognitionException {
		ReturnstatementContext _localctx = new ReturnstatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(RETURN);
			setState(184);
			expression(0);
			setState(185);
			match(T__1);
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
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(CubeScriptParser.IMPORT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CubeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CubeScriptParser.IDENTIFIER, i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitImportStatement(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_importStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(IMPORT);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(188);
					match(IDENTIFIER);
					setState(189);
					match(T__8);
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(195);
			match(IDENTIFIER);
			setState(196);
			match(T__1);
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
	public static class IncludeStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(CubeScriptParser.IMPORT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CubeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CubeScriptParser.IDENTIFIER, i);
		}
		public IncludeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterIncludeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitIncludeStatement(this);
		}
	}

	public final IncludeStatementContext includeStatement() throws RecognitionException {
		IncludeStatementContext _localctx = new IncludeStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_includeStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(IMPORT);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(199);
					match(IDENTIFIER);
					setState(200);
					match(T__8);
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(206);
			match(IDENTIFIER);
			setState(207);
			match(T__1);
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
	public static class ArrayDeclarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(CubeScriptParser.TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CubeScriptParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitArrayDeclaration(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(TYPE);
			setState(210);
			match(IDENTIFIER);
			setState(211);
			match(T__4);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 148054463361302536L) != 0)) {
				{
				setState(212);
				expression(0);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(213);
					match(T__6);
					setState(214);
					expression(0);
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(222);
			match(T__5);
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
	public static class UsingStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(CubeScriptParser.IMPORT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CubeScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CubeScriptParser.IDENTIFIER, i);
		}
		public UsingStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterUsingStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitUsingStatement(this);
		}
	}

	public final UsingStatementContext usingStatement() throws RecognitionException {
		UsingStatementContext _localctx = new UsingStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_usingStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(IMPORT);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(225);
					match(IDENTIFIER);
					setState(226);
					match(T__8);
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(232);
			match(IDENTIFIER);
			setState(233);
			match(T__1);
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
	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public BreakContext break_() {
			return getRuleContext(BreakContext.class,0);
		}
		public ReturnstatementContext returnstatement() {
			return getRuleContext(ReturnstatementContext.class,0);
		}
		public TerminalNode Comment() { return getToken(CubeScriptParser.Comment, 0); }
		public UsingStatementContext usingStatement() {
			return getRuleContext(UsingStatementContext.class,0);
		}
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public IncludeStatementContext includeStatement() {
			return getRuleContext(IncludeStatementContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(CubeScriptParser.IDENTIFIER, 0); }
		public MultOpContext multOp() {
			return getRuleContext(MultOpContext.class,0);
		}
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
		public CmpOpContext cmpOp() {
			return getRuleContext(CmpOpContext.class,0);
		}
		public BoolOpContext boolOp() {
			return getRuleContext(BoolOpContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(236);
				assignment();
				}
				break;
			case 2:
				{
				setState(237);
				functionCall();
				}
				break;
			case 3:
				{
				setState(238);
				ifBlock();
				}
				break;
			case 4:
				{
				setState(239);
				whileBlock();
				}
				break;
			case 5:
				{
				setState(240);
				forBlock();
				}
				break;
			case 6:
				{
				setState(241);
				break_();
				}
				break;
			case 7:
				{
				setState(242);
				returnstatement();
				}
				break;
			case 8:
				{
				setState(243);
				match(Comment);
				}
				break;
			case 9:
				{
				setState(244);
				usingStatement();
				}
				break;
			case 10:
				{
				setState(245);
				importStatement();
				}
				break;
			case 11:
				{
				setState(246);
				includeStatement();
				}
				break;
			case 12:
				{
				setState(247);
				arrayDeclaration();
				}
				break;
			case 13:
				{
				setState(248);
				constant();
				}
				break;
			case 14:
				{
				setState(249);
				match(T__2);
				setState(250);
				expression(0);
				setState(251);
				match(T__3);
				}
				break;
			case 15:
				{
				setState(253);
				match(T__13);
				setState(254);
				expression(9);
				}
				break;
			case 16:
				{
				setState(255);
				match(T__14);
				setState(256);
				expression(8);
				}
				break;
			case 17:
				{
				setState(257);
				match(T__15);
				setState(258);
				expression(7);
				}
				break;
			case 18:
				{
				setState(259);
				match(T__16);
				setState(260);
				expression(6);
				}
				break;
			case 19:
				{
				setState(261);
				match(T__17);
				setState(262);
				expression(5);
				}
				break;
			case 20:
				{
				setState(263);
				match(T__18);
				setState(264);
				match(IDENTIFIER);
				setState(265);
				match(T__2);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 148054463361302536L) != 0)) {
					{
					setState(266);
					expression(0);
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(267);
						match(T__6);
						setState(268);
						expression(0);
						}
						}
						setState(273);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(276);
				match(T__3);
				}
				break;
			case 21:
				{
				setState(277);
				match(T__18);
				setState(278);
				match(IDENTIFIER);
				setState(279);
				match(T__11);
				setState(280);
				expression(0);
				setState(281);
				match(T__12);
				}
				break;
			case 22:
				{
				setState(283);
				match(T__18);
				setState(284);
				match(IDENTIFIER);
				setState(285);
				match(T__11);
				setState(286);
				expression(0);
				setState(287);
				match(T__12);
				setState(288);
				match(T__4);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 148054463361302536L) != 0)) {
					{
					setState(289);
					expression(0);
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(290);
						match(T__6);
						setState(291);
						expression(0);
						}
						}
						setState(296);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(299);
				match(T__5);
				}
				break;
			case 23:
				{
				setState(301);
				match(T__18);
				setState(302);
				match(IDENTIFIER);
				setState(303);
				match(T__11);
				setState(304);
				expression(0);
				setState(305);
				match(T__12);
				setState(306);
				match(T__4);
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 148054463361302536L) != 0)) {
					{
					setState(307);
					expression(0);
					setState(312);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(308);
						match(T__6);
						setState(309);
						expression(0);
						}
						}
						setState(314);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(317);
				match(T__5);
				setState(318);
				match(T__4);
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 148054463361302536L) != 0)) {
					{
					setState(319);
					expression(0);
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(320);
						match(T__6);
						setState(321);
						expression(0);
						}
						}
						setState(326);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(329);
				match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(380);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(333);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(334);
						multOp();
						setState(335);
						expression(21);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(337);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(338);
						addOp();
						setState(339);
						expression(20);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(341);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(342);
						cmpOp();
						setState(343);
						expression(19);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(345);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(346);
						boolOp();
						setState(347);
						expression(18);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(349);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(350);
						match(T__9);
						setState(351);
						expression(0);
						setState(352);
						match(T__10);
						setState(353);
						expression(16);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(355);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(356);
						match(T__11);
						setState(357);
						expression(0);
						setState(358);
						match(T__12);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(360);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(361);
						match(T__8);
						setState(362);
						match(IDENTIFIER);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(363);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(364);
						match(T__2);
						setState(373);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 148054463361302536L) != 0)) {
							{
							setState(365);
							expression(0);
							setState(370);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__6) {
								{
								{
								setState(366);
								match(T__6);
								setState(367);
								expression(0);
								}
								}
								setState(372);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(375);
						match(T__3);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(376);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(377);
						match(T__13);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(378);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(379);
						match(T__14);
						}
						break;
					}
					} 
				}
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
	public static class MultOpContext extends ParserRuleContext {
		public MultOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterMultOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitMultOp(this);
		}
	}

	public final MultOpContext multOp() throws RecognitionException {
		MultOpContext _localctx = new MultOpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_multOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8588886018L) != 0)) ) {
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
	public static class AddOpContext extends ParserRuleContext {
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterAddOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitAddOp(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
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
	public static class CmpOpContext extends ParserRuleContext {
		public CmpOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmpOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterCmpOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitCmpOp(this);
		}
	}

	public final CmpOpContext cmpOp() throws RecognitionException {
		CmpOpContext _localctx = new CmpOpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmpOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 266287972608L) != 0)) ) {
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
	public static class BoolOpContext extends ParserRuleContext {
		public TerminalNode BOOL_OPERATOR() { return getToken(CubeScriptParser.BOOL_OPERATOR, 0); }
		public BoolOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitBoolOp(this);
		}
	}

	public final BoolOpContext boolOp() throws RecognitionException {
		BoolOpContext _localctx = new BoolOpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_boolOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(BOOL_OPERATOR);
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
	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(CubeScriptParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(CubeScriptParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(CubeScriptParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(CubeScriptParser.BOOL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CubeScriptParser.IDENTIFIER, 0); }
		public TerminalNode TYPE() { return getToken(CubeScriptParser.TYPE, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 144244930447933440L) != 0)) ) {
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
	public static class BreakContext extends ParserRuleContext {
		public BreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitBreak(this);
		}
	}

	public final BreakContext break_() throws RecognitionException {
		BreakContext _localctx = new BreakContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(T__37);
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
	public static class SwitchBlockContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(CubeScriptParser.SWITCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<SwitchCaseContext> switchCase() {
			return getRuleContexts(SwitchCaseContext.class);
		}
		public SwitchCaseContext switchCase(int i) {
			return getRuleContext(SwitchCaseContext.class,i);
		}
		public DefaultCaseContext defaultCase() {
			return getRuleContext(DefaultCaseContext.class,0);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_switchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(SWITCH);
			setState(398);
			match(T__2);
			setState(399);
			expression(0);
			setState(400);
			match(T__3);
			setState(401);
			match(T__4);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(402);
				switchCase();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(408);
				defaultCase();
				}
			}

			setState(411);
			match(T__5);
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
	public static class SwitchCaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(CubeScriptParser.CASE, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitSwitchCase(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_switchCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(CASE);
			setState(414);
			constant();
			setState(415);
			match(T__10);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 188586860007637000L) != 0)) {
				{
				{
				setState(416);
				line();
				}
				}
				setState(421);
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
	public static class DefaultCaseContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(CubeScriptParser.DEFAULT, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public DefaultCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).enterDefaultCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeScriptListener ) ((CubeScriptListener)listener).exitDefaultCase(this);
		}
	}

	public final DefaultCaseContext defaultCase() throws RecognitionException {
		DefaultCaseContext _localctx = new DefaultCaseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_defaultCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(DEFAULT);
			setState(423);
			match(T__10);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 188586860007637000L) != 0)) {
				{
				{
				setState(424);
				line();
				}
				}
				setState(429);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00019\u01af\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0005\u00004\b\u0000\n\u0000\f\u00007\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001C\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002T\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004a\b\u0004\n\u0004\f\u0004"+
		"d\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"j\b\u0004\n\u0004\f\u0004m\t\u0004\u0001\u0004\u0003\u0004p\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005x\b\u0005\n\u0005\f\u0005{\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0084"+
		"\b\u0006\n\u0006\f\u0006\u0087\t\u0006\u0003\u0006\u0089\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0096"+
		"\b\u0007\n\u0007\f\u0007\u0099\t\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0005\b\u009f\b\b\n\b\f\b\u00a2\t\b\u0001\b\u0001\b\u0001\t\u0003"+
		"\t\u00a7\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00ae\b\t"+
		"\n\t\f\t\u00b1\t\t\u0003\t\u00b3\b\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00bf"+
		"\b\u000b\n\u000b\f\u000b\u00c2\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u00ca\b\f\n\f\f\f\u00cd\t\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00d8"+
		"\b\r\n\r\f\r\u00db\t\r\u0003\r\u00dd\b\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u00e4\b\u000e\n\u000e\f\u000e\u00e7\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u010e\b\u000f\n\u000f\f\u000f\u0111\t\u000f\u0003"+
		"\u000f\u0113\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u0125\b\u000f\n\u000f\f\u000f\u0128\t\u000f\u0003\u000f\u012a\b"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u0137\b\u000f\n\u000f\f\u000f\u013a\t\u000f\u0003\u000f\u013c\b"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u0143\b\u000f\n\u000f\f\u000f\u0146\t\u000f\u0003\u000f\u0148\b"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u014c\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0171\b\u000f\n"+
		"\u000f\f\u000f\u0174\t\u000f\u0003\u000f\u0176\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u017d\b\u000f\n"+
		"\u000f\f\u000f\u0180\t\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0194\b\u0016\n\u0016\f\u0016"+
		"\u0197\t\u0016\u0001\u0016\u0003\u0016\u019a\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u01a2"+
		"\b\u0017\n\u0017\f\u0017\u01a5\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u01aa\b\u0018\n\u0018\f\u0018\u01ad\t\u0018\u0001\u0018\u0000"+
		"\u0001\u001e\u0019\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.0\u0000\u0004\u0002\u0000\u0001"+
		"\u0001\u0014 \u0001\u0000\u0011\u0012\u0002\u0000\b\b!%\u0003\u0000)*"+
		",.99\u01e7\u00005\u0001\u0000\u0000\u0000\u0002B\u0001\u0000\u0000\u0000"+
		"\u0004S\u0001\u0000\u0000\u0000\u0006U\u0001\u0000\u0000\u0000\bZ\u0001"+
		"\u0000\u0000\u0000\nq\u0001\u0000\u0000\u0000\f~\u0001\u0000\u0000\u0000"+
		"\u000e\u008d\u0001\u0000\u0000\u0000\u0010\u009c\u0001\u0000\u0000\u0000"+
		"\u0012\u00a6\u0001\u0000\u0000\u0000\u0014\u00b7\u0001\u0000\u0000\u0000"+
		"\u0016\u00bb\u0001\u0000\u0000\u0000\u0018\u00c6\u0001\u0000\u0000\u0000"+
		"\u001a\u00d1\u0001\u0000\u0000\u0000\u001c\u00e0\u0001\u0000\u0000\u0000"+
		"\u001e\u014b\u0001\u0000\u0000\u0000 \u0181\u0001\u0000\u0000\u0000\""+
		"\u0183\u0001\u0000\u0000\u0000$\u0185\u0001\u0000\u0000\u0000&\u0187\u0001"+
		"\u0000\u0000\u0000(\u0189\u0001\u0000\u0000\u0000*\u018b\u0001\u0000\u0000"+
		"\u0000,\u018d\u0001\u0000\u0000\u0000.\u019d\u0001\u0000\u0000\u00000"+
		"\u01a6\u0001\u0000\u0000\u000024\u0003\u0002\u0001\u000032\u0001\u0000"+
		"\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u000068\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"89\u0005\u0000\u0000\u00019\u0001\u0001\u0000\u0000\u0000:C\u0003\u0004"+
		"\u0002\u0000;C\u0003\b\u0004\u0000<=\u0003\n\u0005\u0000=>\u0003\u001e"+
		"\u000f\u0000>C\u0001\u0000\u0000\u0000?C\u0005\'\u0000\u0000@C\u0003\u001c"+
		"\u000e\u0000AC\u0003\u0014\n\u0000B:\u0001\u0000\u0000\u0000B;\u0001\u0000"+
		"\u0000\u0000B<\u0001\u0000\u0000\u0000B?\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000C\u0003\u0001\u0000\u0000"+
		"\u0000DT\u0003\u0006\u0003\u0000ET\u0003\f\u0006\u0000FT\u0003\b\u0004"+
		"\u0000GT\u0003\n\u0005\u0000HT\u0003\u000e\u0007\u0000IT\u0003*\u0015"+
		"\u0000JT\u0003\u0014\n\u0000KT\u0003\u001e\u000f\u0000LT\u0005\'\u0000"+
		"\u0000MT\u0003\u001c\u000e\u0000NT\u0003\u0016\u000b\u0000OT\u0003\u0018"+
		"\f\u0000PT\u0003\u001a\r\u0000QT\u0003,\u0016\u0000RT\u0003\u0012\t\u0000"+
		"SD\u0001\u0000\u0000\u0000SE\u0001\u0000\u0000\u0000SF\u0001\u0000\u0000"+
		"\u0000SG\u0001\u0000\u0000\u0000SH\u0001\u0000\u0000\u0000SI\u0001\u0000"+
		"\u0000\u0000SJ\u0001\u0000\u0000\u0000SK\u0001\u0000\u0000\u0000SL\u0001"+
		"\u0000\u0000\u0000SM\u0001\u0000\u0000\u0000SN\u0001\u0000\u0000\u0000"+
		"SO\u0001\u0000\u0000\u0000SP\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000"+
		"\u0000SR\u0001\u0000\u0000\u0000T\u0005\u0001\u0000\u0000\u0000UV\u0005"+
		"9\u0000\u0000VW\u0005\u0001\u0000\u0000WX\u0003\u001e\u000f\u0000XY\u0005"+
		"\u0002\u0000\u0000Y\u0007\u0001\u0000\u0000\u0000Z[\u00050\u0000\u0000"+
		"[\\\u0005\u0003\u0000\u0000\\]\u0003\u001e\u000f\u0000]^\u0005\u0004\u0000"+
		"\u0000^b\u0005\u0005\u0000\u0000_a\u0003\u0002\u0001\u0000`_\u0001\u0000"+
		"\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"eo\u0005\u0006\u0000\u0000fg\u00051\u0000\u0000gk\u0005\u0005\u0000\u0000"+
		"hj\u0003\u0002\u0001\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000np\u0005\u0006\u0000\u0000of\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p\t\u0001\u0000\u0000\u0000"+
		"qr\u0005/\u0000\u0000rs\u0005\u0003\u0000\u0000st\u0003\u001e\u000f\u0000"+
		"tu\u0005\u0004\u0000\u0000uy\u0005\u0005\u0000\u0000vx\u0003\u0002\u0001"+
		"\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000|}\u0005\u0006\u0000\u0000}\u000b\u0001\u0000\u0000"+
		"\u0000~\u007f\u00059\u0000\u0000\u007f\u0088\u0005\u0003\u0000\u0000\u0080"+
		"\u0085\u0003\u001e\u000f\u0000\u0081\u0082\u0005\u0007\u0000\u0000\u0082"+
		"\u0084\u0003\u001e\u000f\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084"+
		"\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087"+
		"\u0085\u0001\u0000\u0000\u0000\u0088\u0080\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0005\u0004\u0000\u0000\u008b\u008c\u0005\u0002\u0000\u0000\u008c"+
		"\r\u0001\u0000\u0000\u0000\u008d\u008e\u00052\u0000\u0000\u008e\u008f"+
		"\u0005\u0003\u0000\u0000\u008f\u0090\u0003\u001e\u000f\u0000\u0090\u0091"+
		"\u0005\b\u0000\u0000\u0091\u0092\u0003\u001e\u000f\u0000\u0092\u0093\u0005"+
		"\u0004\u0000\u0000\u0093\u0097\u0005\u0005\u0000\u0000\u0094\u0096\u0003"+
		"\u0002\u0001\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0099\u0001"+
		"\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001"+
		"\u0000\u0000\u0000\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u0097\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0005\u0006\u0000\u0000\u009b\u000f\u0001"+
		"\u0000\u0000\u0000\u009c\u00a0\u0005\u0005\u0000\u0000\u009d\u009f\u0003"+
		"\u0002\u0001\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0005\u0006\u0000\u0000\u00a4\u0011\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a7\u00057\u0000\u0000\u00a6\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u00059\u0000\u0000\u00a9\u00b2\u0005\u0003\u0000"+
		"\u0000\u00aa\u00af\u00059\u0000\u0000\u00ab\u00ac\u0005\u0007\u0000\u0000"+
		"\u00ac\u00ae\u00059\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1"+
		"\u00af\u0001\u0000\u0000\u0000\u00b2\u00aa\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0005\u0004\u0000\u0000\u00b5\u00b6\u0003\u0010\b\u0000\u00b6\u0013"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u00053\u0000\u0000\u00b8\u00b9\u0003"+
		"\u001e\u000f\u0000\u00b9\u00ba\u0005\u0002\u0000\u0000\u00ba\u0015\u0001"+
		"\u0000\u0000\u0000\u00bb\u00c0\u0005+\u0000\u0000\u00bc\u00bd\u00059\u0000"+
		"\u0000\u00bd\u00bf\u0005\t\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c4\u00059\u0000\u0000\u00c4"+
		"\u00c5\u0005\u0002\u0000\u0000\u00c5\u0017\u0001\u0000\u0000\u0000\u00c6"+
		"\u00cb\u0005+\u0000\u0000\u00c7\u00c8\u00059\u0000\u0000\u00c8\u00ca\u0005"+
		"\t\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u00059\u0000\u0000\u00cf\u00d0\u0005\u0002\u0000"+
		"\u0000\u00d0\u0019\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005.\u0000\u0000"+
		"\u00d2\u00d3\u00059\u0000\u0000\u00d3\u00dc\u0005\u0005\u0000\u0000\u00d4"+
		"\u00d9\u0003\u001e\u000f\u0000\u00d5\u00d6\u0005\u0007\u0000\u0000\u00d6"+
		"\u00d8\u0003\u001e\u000f\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8"+
		"\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db"+
		"\u00d9\u0001\u0000\u0000\u0000\u00dc\u00d4\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0005\u0006\u0000\u0000\u00df\u001b\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e5\u0005+\u0000\u0000\u00e1\u00e2\u00059\u0000\u0000\u00e2\u00e4\u0005"+
		"\t\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u00059\u0000\u0000\u00e9\u00ea\u0005\u0002\u0000"+
		"\u0000\u00ea\u001d\u0001\u0000\u0000\u0000\u00eb\u00ec\u0006\u000f\uffff"+
		"\uffff\u0000\u00ec\u014c\u0003\u0006\u0003\u0000\u00ed\u014c\u0003\f\u0006"+
		"\u0000\u00ee\u014c\u0003\b\u0004\u0000\u00ef\u014c\u0003\n\u0005\u0000"+
		"\u00f0\u014c\u0003\u000e\u0007\u0000\u00f1\u014c\u0003*\u0015\u0000\u00f2"+
		"\u014c\u0003\u0014\n\u0000\u00f3\u014c\u0005\'\u0000\u0000\u00f4\u014c"+
		"\u0003\u001c\u000e\u0000\u00f5\u014c\u0003\u0016\u000b\u0000\u00f6\u014c"+
		"\u0003\u0018\f\u0000\u00f7\u014c\u0003\u001a\r\u0000\u00f8\u014c\u0003"+
		"(\u0014\u0000\u00f9\u00fa\u0005\u0003\u0000\u0000\u00fa\u00fb\u0003\u001e"+
		"\u000f\u0000\u00fb\u00fc\u0005\u0004\u0000\u0000\u00fc\u014c\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0005\u000e\u0000\u0000\u00fe\u014c\u0003\u001e"+
		"\u000f\t\u00ff\u0100\u0005\u000f\u0000\u0000\u0100\u014c\u0003\u001e\u000f"+
		"\b\u0101\u0102\u0005\u0010\u0000\u0000\u0102\u014c\u0003\u001e\u000f\u0007"+
		"\u0103\u0104\u0005\u0011\u0000\u0000\u0104\u014c\u0003\u001e\u000f\u0006"+
		"\u0105\u0106\u0005\u0012\u0000\u0000\u0106\u014c\u0003\u001e\u000f\u0005"+
		"\u0107\u0108\u0005\u0013\u0000\u0000\u0108\u0109\u00059\u0000\u0000\u0109"+
		"\u0112\u0005\u0003\u0000\u0000\u010a\u010f\u0003\u001e\u000f\u0000\u010b"+
		"\u010c\u0005\u0007\u0000\u0000\u010c\u010e\u0003\u001e\u000f\u0000\u010d"+
		"\u010b\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f"+
		"\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110"+
		"\u0113\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112"+
		"\u010a\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113"+
		"\u0114\u0001\u0000\u0000\u0000\u0114\u014c\u0005\u0004\u0000\u0000\u0115"+
		"\u0116\u0005\u0013\u0000\u0000\u0116\u0117\u00059\u0000\u0000\u0117\u0118"+
		"\u0005\f\u0000\u0000\u0118\u0119\u0003\u001e\u000f\u0000\u0119\u011a\u0005"+
		"\r\u0000\u0000\u011a\u014c\u0001\u0000\u0000\u0000\u011b\u011c\u0005\u0013"+
		"\u0000\u0000\u011c\u011d\u00059\u0000\u0000\u011d\u011e\u0005\f\u0000"+
		"\u0000\u011e\u011f\u0003\u001e\u000f\u0000\u011f\u0120\u0005\r\u0000\u0000"+
		"\u0120\u0129\u0005\u0005\u0000\u0000\u0121\u0126\u0003\u001e\u000f\u0000"+
		"\u0122\u0123\u0005\u0007\u0000\u0000\u0123\u0125\u0003\u001e\u000f\u0000"+
		"\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000\u0000\u0000"+
		"\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000"+
		"\u0127\u012a\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000"+
		"\u0129\u0121\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0005\u0006\u0000\u0000"+
		"\u012c\u014c\u0001\u0000\u0000\u0000\u012d\u012e\u0005\u0013\u0000\u0000"+
		"\u012e\u012f\u00059\u0000\u0000\u012f\u0130\u0005\f\u0000\u0000\u0130"+
		"\u0131\u0003\u001e\u000f\u0000\u0131\u0132\u0005\r\u0000\u0000\u0132\u013b"+
		"\u0005\u0005\u0000\u0000\u0133\u0138\u0003\u001e\u000f\u0000\u0134\u0135"+
		"\u0005\u0007\u0000\u0000\u0135\u0137\u0003\u001e\u000f\u0000\u0136\u0134"+
		"\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138\u0136"+
		"\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013c"+
		"\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b\u0133"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013d"+
		"\u0001\u0000\u0000\u0000\u013d\u013e\u0005\u0006\u0000\u0000\u013e\u0147"+
		"\u0005\u0005\u0000\u0000\u013f\u0144\u0003\u001e\u000f\u0000\u0140\u0141"+
		"\u0005\u0007\u0000\u0000\u0141\u0143\u0003\u001e\u000f\u0000\u0142\u0140"+
		"\u0001\u0000\u0000\u0000\u0143\u0146\u0001\u0000\u0000\u0000\u0144\u0142"+
		"\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0148"+
		"\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0147\u013f"+
		"\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0149"+
		"\u0001\u0000\u0000\u0000\u0149\u014a\u0005\u0006\u0000\u0000\u014a\u014c"+
		"\u0001\u0000\u0000\u0000\u014b\u00eb\u0001\u0000\u0000\u0000\u014b\u00ed"+
		"\u0001\u0000\u0000\u0000\u014b\u00ee\u0001\u0000\u0000\u0000\u014b\u00ef"+
		"\u0001\u0000\u0000\u0000\u014b\u00f0\u0001\u0000\u0000\u0000\u014b\u00f1"+
		"\u0001\u0000\u0000\u0000\u014b\u00f2\u0001\u0000\u0000\u0000\u014b\u00f3"+
		"\u0001\u0000\u0000\u0000\u014b\u00f4\u0001\u0000\u0000\u0000\u014b\u00f5"+
		"\u0001\u0000\u0000\u0000\u014b\u00f6\u0001\u0000\u0000\u0000\u014b\u00f7"+
		"\u0001\u0000\u0000\u0000\u014b\u00f8\u0001\u0000\u0000\u0000\u014b\u00f9"+
		"\u0001\u0000\u0000\u0000\u014b\u00fd\u0001\u0000\u0000\u0000\u014b\u00ff"+
		"\u0001\u0000\u0000\u0000\u014b\u0101\u0001\u0000\u0000\u0000\u014b\u0103"+
		"\u0001\u0000\u0000\u0000\u014b\u0105\u0001\u0000\u0000\u0000\u014b\u0107"+
		"\u0001\u0000\u0000\u0000\u014b\u0115\u0001\u0000\u0000\u0000\u014b\u011b"+
		"\u0001\u0000\u0000\u0000\u014b\u012d\u0001\u0000\u0000\u0000\u014c\u017e"+
		"\u0001\u0000\u0000\u0000\u014d\u014e\n\u0014\u0000\u0000\u014e\u014f\u0003"+
		" \u0010\u0000\u014f\u0150\u0003\u001e\u000f\u0015\u0150\u017d\u0001\u0000"+
		"\u0000\u0000\u0151\u0152\n\u0013\u0000\u0000\u0152\u0153\u0003\"\u0011"+
		"\u0000\u0153\u0154\u0003\u001e\u000f\u0014\u0154\u017d\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\n\u0012\u0000\u0000\u0156\u0157\u0003$\u0012\u0000"+
		"\u0157\u0158\u0003\u001e\u000f\u0013\u0158\u017d\u0001\u0000\u0000\u0000"+
		"\u0159\u015a\n\u0011\u0000\u0000\u015a\u015b\u0003&\u0013\u0000\u015b"+
		"\u015c\u0003\u001e\u000f\u0012\u015c\u017d\u0001\u0000\u0000\u0000\u015d"+
		"\u015e\n\u000f\u0000\u0000\u015e\u015f\u0005\n\u0000\u0000\u015f\u0160"+
		"\u0003\u001e\u000f\u0000\u0160\u0161\u0005\u000b\u0000\u0000\u0161\u0162"+
		"\u0003\u001e\u000f\u0010\u0162\u017d\u0001\u0000\u0000\u0000\u0163\u0164"+
		"\n\u000e\u0000\u0000\u0164\u0165\u0005\f\u0000\u0000\u0165\u0166\u0003"+
		"\u001e\u000f\u0000\u0166\u0167\u0005\r\u0000\u0000\u0167\u017d\u0001\u0000"+
		"\u0000\u0000\u0168\u0169\n\r\u0000\u0000\u0169\u016a\u0005\t\u0000\u0000"+
		"\u016a\u017d\u00059\u0000\u0000\u016b\u016c\n\f\u0000\u0000\u016c\u0175"+
		"\u0005\u0003\u0000\u0000\u016d\u0172\u0003\u001e\u000f\u0000\u016e\u016f"+
		"\u0005\u0007\u0000\u0000\u016f\u0171\u0003\u001e\u000f\u0000\u0170\u016e"+
		"\u0001\u0000\u0000\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172\u0170"+
		"\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0176"+
		"\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0175\u016d"+
		"\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0177"+
		"\u0001\u0000\u0000\u0000\u0177\u017d\u0005\u0004\u0000\u0000\u0178\u0179"+
		"\n\u000b\u0000\u0000\u0179\u017d\u0005\u000e\u0000\u0000\u017a\u017b\n"+
		"\n\u0000\u0000\u017b\u017d\u0005\u000f\u0000\u0000\u017c\u014d\u0001\u0000"+
		"\u0000\u0000\u017c\u0151\u0001\u0000\u0000\u0000\u017c\u0155\u0001\u0000"+
		"\u0000\u0000\u017c\u0159\u0001\u0000\u0000\u0000\u017c\u015d\u0001\u0000"+
		"\u0000\u0000\u017c\u0163\u0001\u0000\u0000\u0000\u017c\u0168\u0001\u0000"+
		"\u0000\u0000\u017c\u016b\u0001\u0000\u0000\u0000\u017c\u0178\u0001\u0000"+
		"\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017d\u0180\u0001\u0000"+
		"\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000"+
		"\u0000\u0000\u017f\u001f\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000"+
		"\u0000\u0000\u0181\u0182\u0007\u0000\u0000\u0000\u0182!\u0001\u0000\u0000"+
		"\u0000\u0183\u0184\u0007\u0001\u0000\u0000\u0184#\u0001\u0000\u0000\u0000"+
		"\u0185\u0186\u0007\u0002\u0000\u0000\u0186%\u0001\u0000\u0000\u0000\u0187"+
		"\u0188\u0005(\u0000\u0000\u0188\'\u0001\u0000\u0000\u0000\u0189\u018a"+
		"\u0007\u0003\u0000\u0000\u018a)\u0001\u0000\u0000\u0000\u018b\u018c\u0005"+
		"&\u0000\u0000\u018c+\u0001\u0000\u0000\u0000\u018d\u018e\u00054\u0000"+
		"\u0000\u018e\u018f\u0005\u0003\u0000\u0000\u018f\u0190\u0003\u001e\u000f"+
		"\u0000\u0190\u0191\u0005\u0004\u0000\u0000\u0191\u0195\u0005\u0005\u0000"+
		"\u0000\u0192\u0194\u0003.\u0017\u0000\u0193\u0192\u0001\u0000\u0000\u0000"+
		"\u0194\u0197\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000"+
		"\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0199\u0001\u0000\u0000\u0000"+
		"\u0197\u0195\u0001\u0000\u0000\u0000\u0198\u019a\u00030\u0018\u0000\u0199"+
		"\u0198\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a"+
		"\u019b\u0001\u0000\u0000\u0000\u019b\u019c\u0005\u0006\u0000\u0000\u019c"+
		"-\u0001\u0000\u0000\u0000\u019d\u019e\u00055\u0000\u0000\u019e\u019f\u0003"+
		"(\u0014\u0000\u019f\u01a3\u0005\u000b\u0000\u0000\u01a0\u01a2\u0003\u0002"+
		"\u0001\u0000\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a4/\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a7\u00056\u0000\u0000\u01a7\u01ab\u0005\u000b\u0000\u0000"+
		"\u01a8\u01aa\u0003\u0002\u0001\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000"+
		"\u01aa\u01ad\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000"+
		"\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac1\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ab\u0001\u0000\u0000\u0000$5BSbkoy\u0085\u0088\u0097\u00a0\u00a6\u00af"+
		"\u00b2\u00c0\u00cb\u00d9\u00dc\u00e5\u010f\u0112\u0126\u0129\u0138\u013b"+
		"\u0144\u0147\u014b\u0172\u0175\u017c\u017e\u0195\u0199\u01a3\u01ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}