// Generated from MyCompiler\htmltojava\htjava.g4 by ANTLR 4.5.1
package MyCompiler.htmltojava;

	import java.util.Map;
	import java.util.HashMap;
	import java.util.ArrayList;
	import java.io.File;
	import java.io.FileWriter;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import MyCompiler.htmltojava.astnode.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class htjavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTJAVA_INI=1, HTJAVA_END=2, VAR_ASSIGN_INI=3, VAR_ASSIGN_END=4, VAR_INI=5, 
		VAR_TYPE=6, VAR_END=7, PRINT_INI=8, PRINT_END=9, IF_INI=10, IF_END=11, 
		ELSE_INI=12, ELSE_END=13, OPERATORS=14, PAR_OPEN=15, PAR_CLOSE=16, ASP_S=17, 
		ASP_D=18, BOOLEAN=19, CHAR=20, TEXTT=21, ID=22, NUMBER=23, WS=24, PLUS=25, 
		MULT=26;
	public static final int
		RULE_htjava = 0, RULE_sentence = 1, RULE_println = 2, RULE_conditional = 3, 
		RULE_var_decl = 4, RULE_var_assign = 5, RULE_expression = 6, RULE_factor = 7, 
		RULE_term = 8;
	public static final String[] ruleNames = {
		"htjava", "sentence", "println", "conditional", "var_decl", "var_assign", 
		"expression", "factor", "term"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<htjava>'", "'</htjava>'", "'<var'", "'>'", "'<var>'", null, "'</var>'", 
		"'<print>'", "'</print>'", "'<if>'", "'</if>'", "'<else>'", "'</else>'", 
		null, "'('", "')'", "'''", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "HTJAVA_INI", "HTJAVA_END", "VAR_ASSIGN_INI", "VAR_ASSIGN_END", 
		"VAR_INI", "VAR_TYPE", "VAR_END", "PRINT_INI", "PRINT_END", "IF_INI", 
		"IF_END", "ELSE_INI", "ELSE_END", "OPERATORS", "PAR_OPEN", "PAR_CLOSE", 
		"ASP_S", "ASP_D", "BOOLEAN", "CHAR", "TEXTT", "ID", "NUMBER", "WS", "PLUS", 
		"MULT"
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
	public String getGrammarFileName() { return "htjava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		Map<String, Object> varIntTable = new HashMap<String, Object>();
		Map<String, Object> varCharTable = new HashMap<String, Object>();

	public htjavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class HtjavaContext extends ParserRuleContext {
		public SentenceContext sentence;
		public TerminalNode HTJAVA_INI() { return getToken(htjavaParser.HTJAVA_INI, 0); }
		public TerminalNode HTJAVA_END() { return getToken(htjavaParser.HTJAVA_END, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public HtjavaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htjava; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htjavaListener ) ((htjavaListener)listener).enterHtjava(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htjavaListener ) ((htjavaListener)listener).exitHtjava(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof htjavaVisitor ) return ((htjavaVisitor<? extends T>)visitor).visitHtjava(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtjavaContext htjava() throws RecognitionException {
		HtjavaContext _localctx = new HtjavaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htjava);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(HTJAVA_INI);

					ArrayList<ASTNode> body = new ArrayList<>();
					Map<String, Object> varIntTable = new HashMap<String, Object>();
					Map<String, Object> varCharTable = new HashMap<String, Object>();
					try{
						File arquivo = new File("test/HTJAVA_GENERATED.java");
						FileWriter fw = new FileWriter(arquivo);
						BufferedWriter bw = new BufferedWriter(fw);	arquivo.createNewFile();
						bw.write("//-- Codigo gerado por HTJAVA --");
						bw.newLine();
						bw.write("//-- by: Fernando T.D.Shinohara --");
						bw.newLine();
						bw.close();
						fw.close();
					} catch (IOException ex){}
					
				
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR_ASSIGN_INI) | (1L << VAR_INI) | (1L << PRINT_INI) | (1L << IF_INI))) != 0)) {
				{
				{
				setState(20);
				((HtjavaContext)_localctx).sentence = sentence();
				body.add(((HtjavaContext)_localctx).sentence.node);
					
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			match(HTJAVA_END);

					for(ASTNode n : body){
						n.execute(varIntTable, varCharTable);
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

	public static class SentenceContext extends ParserRuleContext {
		public ASTNode node;
		public PrintlnContext println;
		public ConditionalContext conditional;
		public Var_declContext var_decl;
		public Var_assignContext var_assign;
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htjavaListener ) ((htjavaListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htjavaListener ) ((htjavaListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof htjavaVisitor ) return ((htjavaVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(43);
			switch (_input.LA(1)) {
			case PRINT_INI:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				((SentenceContext)_localctx).println = println();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).println.node;
				}
				break;
			case IF_INI:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				((SentenceContext)_localctx).conditional = conditional();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).conditional.node;
				}
				break;
			case VAR_INI:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				((SentenceContext)_localctx).var_decl = var_decl();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).var_decl.node;
				}
				break;
			case VAR_ASSIGN_INI:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				((SentenceContext)_localctx).var_assign = var_assign();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).var_assign.node;
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

	public static class PrintlnContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public TerminalNode PRINT_INI() { return getToken(htjavaParser.PRINT_INI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PRINT_END() { return getToken(htjavaParser.PRINT_END, 0); }
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htjavaListener ) ((htjavaListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htjavaListener ) ((htjavaListener)listener).exitPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof htjavaVisitor ) return ((htjavaVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(PRINT_INI);
			setState(46);
			((PrintlnContext)_localctx).expression = expression();
			setState(47);
			match(PRINT_END);
			((PrintlnContext)_localctx).node =  new Println(((PrintlnContext)_localctx).expression.node);
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

	public static class ConditionalContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public SentenceContext s1;
		public SentenceContext s2;
		public TerminalNode IF_INI() { return getToken(htjavaParser.IF_INI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IF_END() { return getToken(htjavaParser.IF_END, 0); }
		public TerminalNode ELSE_INI() { return getToken(htjavaParser.ELSE_INI, 0); }
		public TerminalNode ELSE_END() { return getToken(htjavaParser.ELSE_END, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htjavaListener ) ((htjavaListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htjavaListener ) ((htjavaListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof htjavaVisitor ) return ((htjavaVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(IF_INI);
			setState(51);
			((ConditionalContext)_localctx).expression = expression();

					List<ASTNode> body = new ArrayList<ASTNode>();
				
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR_ASSIGN_INI) | (1L << VAR_INI) | (1L << PRINT_INI) | (1L << IF_INI))) != 0)) {
				{
				{
				setState(53);
				((ConditionalContext)_localctx).s1 = sentence();
				body.add(((ConditionalContext)_localctx).s1.node);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			match(IF_END);
			setState(62);
			match(ELSE_INI);

					List<ASTNode> elseBody = new ArrayList<ASTNode>();
				
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR_ASSIGN_INI) | (1L << VAR_INI) | (1L << PRINT_INI) | (1L << IF_INI))) != 0)) {
				{
				{
				setState(64);
				((ConditionalContext)_localctx).s2 = sentence();
				elseBody.add(((ConditionalContext)_localctx).s2.node);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(ELSE_END);

					((ConditionalContext)_localctx).node =  new If(((ConditionalContext)_localctx).expression.node, body, elseBody);
				
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

	public static class Var_declContext extends ParserRuleContext {
		public ASTNode node;
		public Token VAR_TYPE;
		public Token ID;
		public TerminalNode VAR_INI() { return getToken(htjavaParser.VAR_INI, 0); }
		public TerminalNode VAR_TYPE() { return getToken(htjavaParser.VAR_TYPE, 0); }
		public TerminalNode ID() { return getToken(htjavaParser.ID, 0); }
		public TerminalNode VAR_END() { return getToken(htjavaParser.VAR_END, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htjavaListener ) ((htjavaListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htjavaListener ) ((htjavaListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof htjavaVisitor ) return ((htjavaVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(VAR_INI);
			setState(76);
			((Var_declContext)_localctx).VAR_TYPE = match(VAR_TYPE);
			setState(77);
			((Var_declContext)_localctx).ID = match(ID);
			setState(78);
			match(VAR_END);

					((Var_declContext)_localctx).node =  new VarDecl((((Var_declContext)_localctx).VAR_TYPE!=null?((Var_declContext)_localctx).VAR_TYPE.getText():null), (((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null));
				
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

	public static class Var_assignContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode VAR_ASSIGN_INI() { return getToken(htjavaParser.VAR_ASSIGN_INI, 0); }
		public TerminalNode ID() { return getToken(htjavaParser.ID, 0); }
		public TerminalNode VAR_ASSIGN_END() { return getToken(htjavaParser.VAR_ASSIGN_END, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VAR_END() { return getToken(htjavaParser.VAR_END, 0); }
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htjavaListener ) ((htjavaListener)listener).enterVar_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htjavaListener ) ((htjavaListener)listener).exitVar_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof htjavaVisitor ) return ((htjavaVisitor<? extends T>)visitor).visitVar_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(VAR_ASSIGN_INI);
			setState(82);
			((Var_assignContext)_localctx).ID = match(ID);
			setState(83);
			match(VAR_ASSIGN_END);
			setState(84);
			((Var_assignContext)_localctx).expression = expression();
			setState(85);
			match(VAR_END);

					((Var_assignContext)_localctx).node =  new VarAssign((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null), ((Var_assignContext)_localctx).expression.node);
				
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

	public static class ExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public FactorContext t1;
		public FactorContext t2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(htjavaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(htjavaParser.PLUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htjavaListener ) ((htjavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htjavaListener ) ((htjavaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof htjavaVisitor ) return ((htjavaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			((ExpressionContext)_localctx).t1 = factor();
			((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).t1.node;
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(90);
				match(PLUS);
				setState(91);
				((ExpressionContext)_localctx).t2 = factor();
				((ExpressionContext)_localctx).node =  new Addition(_localctx.node, ((ExpressionContext)_localctx).t2.node);
				}
				}
				setState(98);
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

	public static class FactorContext extends ParserRuleContext {
		public ASTNode node;
		public TermContext t1;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(htjavaParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(htjavaParser.MULT, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htjavaListener ) ((htjavaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htjavaListener ) ((htjavaListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof htjavaVisitor ) return ((htjavaVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			((FactorContext)_localctx).t1 = term();
			((FactorContext)_localctx).node =  ((FactorContext)_localctx).t1.node;
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT) {
				{
				{
				setState(101);
				match(MULT);
				setState(102);
				((FactorContext)_localctx).t2 = term();
				((FactorContext)_localctx).node =  new Multiplication(_localctx.node, ((FactorContext)_localctx).t2.node);
				}
				}
				setState(109);
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

	public static class TermContext extends ParserRuleContext {
		public ASTNode node;
		public Token NUMBER;
		public Token CHAR;
		public Token BOOLEAN;
		public Token ID;
		public Token TEXTT;
		public TerminalNode NUMBER() { return getToken(htjavaParser.NUMBER, 0); }
		public TerminalNode CHAR() { return getToken(htjavaParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(htjavaParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(htjavaParser.ID, 0); }
		public TerminalNode TEXTT() { return getToken(htjavaParser.TEXTT, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htjavaListener ) ((htjavaListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htjavaListener ) ((htjavaListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof htjavaVisitor ) return ((htjavaVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_term);
		try {
			setState(120);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).node =  new Constant(Integer.parseInt((((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)));
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				((TermContext)_localctx).CHAR = match(CHAR);
				((TermContext)_localctx).node =  new Charact((((TermContext)_localctx).CHAR!=null?((TermContext)_localctx).CHAR.getText():null));
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				((TermContext)_localctx).BOOLEAN = match(BOOLEAN);
				((TermContext)_localctx).node =  new Constant(Boolean.parseBoolean((((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getText():null)));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				((TermContext)_localctx).ID = match(ID);
				((TermContext)_localctx).node =  new VarRef((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null));
				}
				break;
			case TEXTT:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				((TermContext)_localctx).TEXTT = match(TEXTT);
				((TermContext)_localctx).node =  new Text((((TermContext)_localctx).TEXTT!=null?((TermContext)_localctx).TEXTT.getText():null));
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34}\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5;\n\5\f\5\16\5>\13\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5F\n\5\f"+
		"\5\16\5I\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\ba\n\b\f\b\16\bd\13\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\7\tl\n\t\f\t\16\to\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n{\n\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2\177\2\24\3\2\2\2\4-"+
		"\3\2\2\2\6/\3\2\2\2\b\64\3\2\2\2\nM\3\2\2\2\fS\3\2\2\2\16Z\3\2\2\2\20"+
		"e\3\2\2\2\22z\3\2\2\2\24\25\7\3\2\2\25\33\b\2\1\2\26\27\5\4\3\2\27\30"+
		"\b\2\1\2\30\32\3\2\2\2\31\26\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34"+
		"\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36\37\7\4\2\2\37 \b\2\1\2 \3\3\2"+
		"\2\2!\"\5\6\4\2\"#\b\3\1\2#.\3\2\2\2$%\5\b\5\2%&\b\3\1\2&.\3\2\2\2\'("+
		"\5\n\6\2()\b\3\1\2).\3\2\2\2*+\5\f\7\2+,\b\3\1\2,.\3\2\2\2-!\3\2\2\2-"+
		"$\3\2\2\2-\'\3\2\2\2-*\3\2\2\2.\5\3\2\2\2/\60\7\n\2\2\60\61\5\16\b\2\61"+
		"\62\7\13\2\2\62\63\b\4\1\2\63\7\3\2\2\2\64\65\7\f\2\2\65\66\5\16\b\2\66"+
		"<\b\5\1\2\678\5\4\3\289\b\5\1\29;\3\2\2\2:\67\3\2\2\2;>\3\2\2\2<:\3\2"+
		"\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7\r\2\2@A\7\16\2\2AG\b\5\1\2BC\5"+
		"\4\3\2CD\b\5\1\2DF\3\2\2\2EB\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3"+
		"\2\2\2IG\3\2\2\2JK\7\17\2\2KL\b\5\1\2L\t\3\2\2\2MN\7\7\2\2NO\7\b\2\2O"+
		"P\7\30\2\2PQ\7\t\2\2QR\b\6\1\2R\13\3\2\2\2ST\7\5\2\2TU\7\30\2\2UV\7\6"+
		"\2\2VW\5\16\b\2WX\7\t\2\2XY\b\7\1\2Y\r\3\2\2\2Z[\5\20\t\2[b\b\b\1\2\\"+
		"]\7\33\2\2]^\5\20\t\2^_\b\b\1\2_a\3\2\2\2`\\\3\2\2\2ad\3\2\2\2b`\3\2\2"+
		"\2bc\3\2\2\2c\17\3\2\2\2db\3\2\2\2ef\5\22\n\2fm\b\t\1\2gh\7\34\2\2hi\5"+
		"\22\n\2ij\b\t\1\2jl\3\2\2\2kg\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\21"+
		"\3\2\2\2om\3\2\2\2pq\7\31\2\2q{\b\n\1\2rs\7\26\2\2s{\b\n\1\2tu\7\25\2"+
		"\2u{\b\n\1\2vw\7\30\2\2w{\b\n\1\2xy\7\27\2\2y{\b\n\1\2zp\3\2\2\2zr\3\2"+
		"\2\2zt\3\2\2\2zv\3\2\2\2zx\3\2\2\2{\23\3\2\2\2\t\33-<Gbmz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}