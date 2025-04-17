// Generated from SomeLang.g by ANTLR 4.5
package somelang.parser; import static somelang.AST.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SomeLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		ID=18, Number=19, String=20, WS=21, Line_Comment=22;
	public static final int
		RULE_program = 0, RULE_exp = 1, RULE_statement = 2, RULE_numexp = 3, RULE_strexp = 4, 
		RULE_isexp = 5, RULE_action = 6, RULE_addexp = 7, RULE_subexp = 8, RULE_multexp = 9, 
		RULE_divexp = 10, RULE_remexp = 11, RULE_compare = 12, RULE_conditions = 13, 
		RULE_give = 14, RULE_gain = 15;
	public static final String[] ruleNames = {
		"program", "exp", "statement", "numexp", "strexp", "isexp", "action", 
		"addexp", "subexp", "multexp", "divexp", "remexp", "compare", "conditions", 
		"give", "gain"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'is'", "'add'", "'sub'", "'mult'", "'div'", "'rem'", "'compare'", 
		"'to'", "'repeat'", "'if less than'", "'if greater than'", "'if eless than'", 
		"'if egreater than'", "'if equal'", "'else'", "'give'", "'gain'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "ID", "Number", "String", "WS", "Line_Comment"
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
	public String getGrammarFileName() { return "SomeLang.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SomeLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public ArrayList<Exp> list;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		 ((ProgramContext)_localctx).list =  new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==String) {
				{
				{
				setState(32);
				((ProgramContext)_localctx).e = exp();
				 _localctx.list.add(((ProgramContext)_localctx).e.ast);
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((ProgramContext)_localctx).ast =  new Program(_localctx.list); 
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

	public static class ExpContext extends ParserRuleContext {
		public Exp ast;
		public StatementContext s;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			((ExpContext)_localctx).s = statement();
			 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).s.ast; 
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

	public static class StatementContext extends ParserRuleContext {
		public Statement ast;
		public IsexpContext is;
		public StrexpContext str;
		public IsexpContext isexp() {
			return getRuleContext(IsexpContext.class,0);
		}
		public StrexpContext strexp() {
			return getRuleContext(StrexpContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(51);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				((StatementContext)_localctx).is = isexp();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).is.ast; 
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				((StatementContext)_localctx).str = strexp();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).str.ast; 
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

	public static class NumexpContext extends ParserRuleContext {
		public NumExp ast;
		public Token n;
		public TerminalNode Number() { return getToken(SomeLangParser.Number, 0); }
		public NumexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numexp; }
	}

	public final NumexpContext numexp() throws RecognitionException {
		NumexpContext _localctx = new NumexpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			((NumexpContext)_localctx).n = match(Number);
			 ((NumexpContext)_localctx).ast =  new NumExp((((NumexpContext)_localctx).n!=null?((NumexpContext)_localctx).n.getText():null)); 
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

	public static class StrexpContext extends ParserRuleContext {
		public StrExp ast;
		public Token s;
		public TerminalNode String() { return getToken(SomeLangParser.String, 0); }
		public StrexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strexp; }
	}

	public final StrexpContext strexp() throws RecognitionException {
		StrexpContext _localctx = new StrexpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_strexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			((StrexpContext)_localctx).s = match(String);
			 ((StrexpContext)_localctx).ast =  new StrExp((((StrexpContext)_localctx).s!=null?((StrexpContext)_localctx).s.getText():null)); 
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

	public static class IsexpContext extends ParserRuleContext {
		public IsExp ast;
		public Token l;
		public ExpContext r;
		public TerminalNode ID() { return getToken(SomeLangParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IsexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isexp; }
	}

	public final IsexpContext isexp() throws RecognitionException {
		IsexpContext _localctx = new IsexpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_isexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			((IsexpContext)_localctx).l = match(ID);
			setState(60);
			match(T__0);
			setState(61);
			((IsexpContext)_localctx).r = exp();
			 ((IsexpContext)_localctx).ast =  new IsExp((((IsexpContext)_localctx).l!=null?((IsexpContext)_localctx).l.getText():null), ((IsexpContext)_localctx).r.ast); 
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

	public static class ActionContext extends ParserRuleContext {
		public Action ast;
		public AddexpContext a;
		public SubexpContext s;
		public MultexpContext m;
		public DivexpContext d;
		public RemexpContext r;
		public CompareContext comp;
		public GiveContext giv;
		public GainContext gai;
		public AddexpContext addexp() {
			return getRuleContext(AddexpContext.class,0);
		}
		public SubexpContext subexp() {
			return getRuleContext(SubexpContext.class,0);
		}
		public MultexpContext multexp() {
			return getRuleContext(MultexpContext.class,0);
		}
		public DivexpContext divexp() {
			return getRuleContext(DivexpContext.class,0);
		}
		public RemexpContext remexp() {
			return getRuleContext(RemexpContext.class,0);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public GiveContext give() {
			return getRuleContext(GiveContext.class,0);
		}
		public GainContext gain() {
			return getRuleContext(GainContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_action);
		try {
			setState(88);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				((ActionContext)_localctx).a = addexp(0);
				 ((ActionContext)_localctx).ast =  ((ActionContext)_localctx).a.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				((ActionContext)_localctx).s = subexp(0);
				 ((ActionContext)_localctx).ast =  ((ActionContext)_localctx).s.ast; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				((ActionContext)_localctx).m = multexp(0);
				 ((ActionContext)_localctx).ast =  ((ActionContext)_localctx).m.ast; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				((ActionContext)_localctx).d = divexp(0);
				 ((ActionContext)_localctx).ast =  ((ActionContext)_localctx).d.ast; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				((ActionContext)_localctx).r = remexp(0);
				 ((ActionContext)_localctx).ast =  ((ActionContext)_localctx).r.ast; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(79);
				((ActionContext)_localctx).comp = compare();
				 ((ActionContext)_localctx).ast =  ((ActionContext)_localctx).comp.ast; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(82);
				((ActionContext)_localctx).giv = give();
				 ((ActionContext)_localctx).ast =  ((ActionContext)_localctx).giv.ast; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(85);
				((ActionContext)_localctx).gai = gain();
				 ((ActionContext)_localctx).ast =  ((ActionContext)_localctx).gai.ast; 
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

	public static class AddexpContext extends ParserRuleContext {
		public AddExp ast;
		public ArrayList<Exp> list;
		public AddexpContext l;
		public NumexpContext num;
		public ExpContext r;
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public AddexpContext addexp() {
			return getRuleContext(AddexpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AddexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addexp; }
	}

	public final AddexpContext addexp() throws RecognitionException {
		return addexp(0);
	}

	private AddexpContext addexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddexpContext _localctx = new AddexpContext(_ctx, _parentState);
		AddexpContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_addexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(91);
			((AddexpContext)_localctx).num = numexp();
			 ((AddexpContext)_localctx).ast =  ((AddexpContext)_localctx).num.ast; 
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddexpContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_addexp);
					setState(94);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(95);
					match(T__1);
					setState(96);
					((AddexpContext)_localctx).r = exp();
					 
					                                  ((AddexpContext)_localctx).list =  new ArrayList<Exp>();
					          			_localctx.list.add(((AddexpContext)_localctx).l.ast);
					          			_localctx.list.add(((AddexpContext)_localctx).r.ast);
					          			((AddexpContext)_localctx).ast =  new AddExp(_localctx.list);		 
					          	                   
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class SubexpContext extends ParserRuleContext {
		public SubExp ast;
		public ArrayList<Exp> list;
		public SubexpContext l;
		public NumexpContext num;
		public ExpContext r;
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public SubexpContext subexp() {
			return getRuleContext(SubexpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public SubexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subexp; }
	}

	public final SubexpContext subexp() throws RecognitionException {
		return subexp(0);
	}

	private SubexpContext subexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SubexpContext _localctx = new SubexpContext(_ctx, _parentState);
		SubexpContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_subexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(105);
			((SubexpContext)_localctx).num = numexp();
			 ((SubexpContext)_localctx).ast =  ((SubexpContext)_localctx).num.ast; 
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SubexpContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_subexp);
					setState(108);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(109);
					match(T__2);
					setState(110);
					((SubexpContext)_localctx).r = exp();
					 
					                                  ((SubexpContext)_localctx).list =  new ArrayList<Exp>();
					          			_localctx.list.add(((SubexpContext)_localctx).l.ast);
					          			_localctx.list.add(((SubexpContext)_localctx).r.ast);
					          			((SubexpContext)_localctx).ast =  new SubExp(_localctx.list);		 
					          	                   
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class MultexpContext extends ParserRuleContext {
		public MultExp ast;
		public ArrayList<Exp> list;
		public MultexpContext l;
		public NumexpContext num;
		public ExpContext r;
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public MultexpContext multexp() {
			return getRuleContext(MultexpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public MultexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multexp; }
	}

	public final MultexpContext multexp() throws RecognitionException {
		return multexp(0);
	}

	private MultexpContext multexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultexpContext _localctx = new MultexpContext(_ctx, _parentState);
		MultexpContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_multexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(119);
			((MultexpContext)_localctx).num = numexp();
			 ((MultexpContext)_localctx).ast =  ((MultexpContext)_localctx).num.ast; 
			}
			_ctx.stop = _input.LT(-1);
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultexpContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_multexp);
					setState(122);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(123);
					match(T__3);
					setState(124);
					((MultexpContext)_localctx).r = exp();
					 
					                                  ((MultexpContext)_localctx).list =  new ArrayList<Exp>();
					          			_localctx.list.add(((MultexpContext)_localctx).l.ast);
					          			_localctx.list.add(((MultexpContext)_localctx).r.ast);
					          			((MultexpContext)_localctx).ast =  new MultExp(_localctx.list);		 
					          	                   
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class DivexpContext extends ParserRuleContext {
		public DivExp ast;
		public ArrayList<Exp> list;
		public DivexpContext l;
		public NumexpContext num;
		public ExpContext r;
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public DivexpContext divexp() {
			return getRuleContext(DivexpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DivexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divexp; }
	}

	public final DivexpContext divexp() throws RecognitionException {
		return divexp(0);
	}

	private DivexpContext divexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DivexpContext _localctx = new DivexpContext(_ctx, _parentState);
		DivexpContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_divexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(133);
			((DivexpContext)_localctx).num = numexp();
			 ((DivexpContext)_localctx).ast =  ((DivexpContext)_localctx).num.ast; 
			}
			_ctx.stop = _input.LT(-1);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DivexpContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_divexp);
					setState(136);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(137);
					match(T__4);
					setState(138);
					((DivexpContext)_localctx).r = exp();
					 
					                                  ((DivexpContext)_localctx).list =  new ArrayList<Exp>();
					          			_localctx.list.add(((DivexpContext)_localctx).l.ast);
					          			_localctx.list.add(((DivexpContext)_localctx).r.ast);
					          			((DivexpContext)_localctx).ast =  new DivExp(_localctx.list);		 
					          	                   
					}
					} 
				}
				setState(145);
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

	public static class RemexpContext extends ParserRuleContext {
		public RemExp ast;
		public ArrayList<Exp> list;
		public RemexpContext l;
		public NumexpContext num;
		public ExpContext r;
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public RemexpContext remexp() {
			return getRuleContext(RemexpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public RemexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remexp; }
	}

	public final RemexpContext remexp() throws RecognitionException {
		return remexp(0);
	}

	private RemexpContext remexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RemexpContext _localctx = new RemexpContext(_ctx, _parentState);
		RemexpContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_remexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(147);
			((RemexpContext)_localctx).num = numexp();
			 ((RemexpContext)_localctx).ast =  ((RemexpContext)_localctx).num.ast; 
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RemexpContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_remexp);
					setState(150);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(151);
					match(T__5);
					setState(152);
					((RemexpContext)_localctx).r = exp();

					                                  ((RemexpContext)_localctx).list =  new ArrayList<Exp>();
					                                  _localctx.list.add(((RemexpContext)_localctx).l.ast);
					                                  _localctx.list.add(((RemexpContext)_localctx).r.ast);
					                                  ((RemexpContext)_localctx).ast =  new RemExp(_localctx.list);
					                                     
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class CompareContext extends ParserRuleContext {
		public Compare ast;
		public ArrayList<Exp> list;
		public ExpContext l;
		public ExpContext r;
		public ConditionsContext c;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<ConditionsContext> conditions() {
			return getRuleContexts(ConditionsContext.class);
		}
		public ConditionsContext conditions(int i) {
			return getRuleContext(ConditionsContext.class,i);
		}
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__6);
			setState(161);
			((CompareContext)_localctx).l = exp();
			setState(162);
			match(T__7);
			setState(163);
			((CompareContext)_localctx).r = exp();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) {
				{
				{
				setState(164);
				((CompareContext)_localctx).c = conditions();
				_localctx.list.add(((CompareContext)_localctx).c.ast)
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(166);
					match(T__8);
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

						((CompareContext)_localctx).list =  new ArrayList<Exp>();
			                        _localctx.list.add(((CompareContext)_localctx).l.ast);
			                        _localctx.list.add(((CompareContext)_localctx).r.ast);
			                        ((CompareContext)_localctx).ast =  new Compare(_localctx.list);
							   
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

	public static class ConditionsContext extends ParserRuleContext {
		public Conditions ast;
		public ArrayList<Exp> list;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conditions);
		int _la;
		try {
			setState(239);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(T__9);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID || _la==String) {
					{
					{
					setState(180);
					((ConditionsContext)_localctx).e = exp();
					 _localctx.list.add(((ConditionsContext)_localctx).e.ast);
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 ((ConditionsContext)_localctx).ast =  new Conditions(_localctx.list); 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(T__10);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID || _la==String) {
					{
					{
					setState(190);
					((ConditionsContext)_localctx).e = exp();
					 _localctx.list.add(((ConditionsContext)_localctx).e.ast);
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 ((ConditionsContext)_localctx).ast =  new Conditions(_localctx.list); 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				match(T__11);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID || _la==String) {
					{
					{
					setState(200);
					((ConditionsContext)_localctx).e = exp();
					 _localctx.list.add(((ConditionsContext)_localctx).e.ast);
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 ((ConditionsContext)_localctx).ast =  new Conditions(_localctx.list); 
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				match(T__12);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID || _la==String) {
					{
					{
					setState(210);
					((ConditionsContext)_localctx).e = exp();
					 _localctx.list.add(((ConditionsContext)_localctx).e.ast);
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 ((ConditionsContext)_localctx).ast =  new Conditions(_localctx.list); 
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
				match(T__13);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID || _la==String) {
					{
					{
					setState(220);
					((ConditionsContext)_localctx).e = exp();
					 _localctx.list.add(((ConditionsContext)_localctx).e.ast);
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 ((ConditionsContext)_localctx).ast =  new Conditions(_localctx.list); 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 6);
				{
				setState(229);
				match(T__14);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID || _la==String) {
					{
					{
					setState(230);
					((ConditionsContext)_localctx).e = exp();
					 _localctx.list.add(((ConditionsContext)_localctx).e.ast);
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 ((ConditionsContext)_localctx).ast =  new Conditions(_localctx.list); 
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

	public static class GiveContext extends ParserRuleContext {
		public Give ast;
		public ArrayList<Exp> list;
		public Token id;
		public ExpContext e;
		public TerminalNode ID() { return getToken(SomeLangParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public GiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_give; }
	}

	public final GiveContext give() throws RecognitionException {
		GiveContext _localctx = new GiveContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_give);
		try {
			setState(248);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(T__15);
				setState(242);
				((GiveContext)_localctx).id = match(ID);
				((GiveContext)_localctx).ast =  new Give((((GiveContext)_localctx).id!=null?((GiveContext)_localctx).id.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(T__15);
				setState(245);
				((GiveContext)_localctx).e = exp();
				((GiveContext)_localctx).ast =  new Give((((GiveContext)_localctx).e!=null?_input.getText(((GiveContext)_localctx).e.start,((GiveContext)_localctx).e.stop):null));
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

	public static class GainContext extends ParserRuleContext {
		public Gain ast;
		public ArrayList<Exp> list;
		public Token id;
		public TerminalNode ID() { return getToken(SomeLangParser.ID, 0); }
		public GainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gain; }
	}

	public final GainContext gain() throws RecognitionException {
		GainContext _localctx = new GainContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_gain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__16);
			setState(251);
			((GainContext)_localctx).id = match(ID);
			((GainContext)_localctx).ast =  new Gain((((GainContext)_localctx).id!=null?((GainContext)_localctx).id.getText():null));
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
		case 7:
			return addexp_sempred((AddexpContext)_localctx, predIndex);
		case 8:
			return subexp_sempred((SubexpContext)_localctx, predIndex);
		case 9:
			return multexp_sempred((MultexpContext)_localctx, predIndex);
		case 10:
			return divexp_sempred((DivexpContext)_localctx, predIndex);
		case 11:
			return remexp_sempred((RemexpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean addexp_sempred(AddexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean subexp_sempred(SubexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multexp_sempred(MultexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean divexp_sempred(DivexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean remexp_sempred(RemexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u0101\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\66\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b[\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tf\n\t\f"+
		"\t\16\ti\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nt\n\n\f\n\16\nw\13"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0082\n\13\f\13\16"+
		"\13\u0085\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0090\n\f\f\f"+
		"\16\f\u0093\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u009e\n\r\f\r"+
		"\16\r\u00a1\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00aa\n\16\f"+
		"\16\16\16\u00ad\13\16\7\16\u00af\n\16\f\16\16\16\u00b2\13\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\7\17\u00ba\n\17\f\17\16\17\u00bd\13\17\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u00c4\n\17\f\17\16\17\u00c7\13\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u00ce\n\17\f\17\16\17\u00d1\13\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u00d8\n\17\f\17\16\17\u00db\13\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u00e2\n\17\f\17\16\17\u00e5\13\17\3\17\3\17\3\17\3\17\3\17\7\17"+
		"\u00ec\n\17\f\17\16\17\u00ef\13\17\3\17\5\17\u00f2\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00fb\n\20\3\21\3\21\3\21\3\21\3\21\2\7\20\22"+
		"\24\26\30\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\u010c\2\'\3\2"+
		"\2\2\4,\3\2\2\2\6\65\3\2\2\2\b\67\3\2\2\2\n:\3\2\2\2\f=\3\2\2\2\16Z\3"+
		"\2\2\2\20\\\3\2\2\2\22j\3\2\2\2\24x\3\2\2\2\26\u0086\3\2\2\2\30\u0094"+
		"\3\2\2\2\32\u00a2\3\2\2\2\34\u00f1\3\2\2\2\36\u00fa\3\2\2\2 \u00fc\3\2"+
		"\2\2\"#\5\4\3\2#$\b\2\1\2$&\3\2\2\2%\"\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'"+
		"(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\b\2\1\2+\3\3\2\2\2,-\5\6\4\2-.\b\3\1"+
		"\2.\5\3\2\2\2/\60\5\f\7\2\60\61\b\4\1\2\61\66\3\2\2\2\62\63\5\n\6\2\63"+
		"\64\b\4\1\2\64\66\3\2\2\2\65/\3\2\2\2\65\62\3\2\2\2\66\7\3\2\2\2\678\7"+
		"\25\2\289\b\5\1\29\t\3\2\2\2:;\7\26\2\2;<\b\6\1\2<\13\3\2\2\2=>\7\24\2"+
		"\2>?\7\3\2\2?@\5\4\3\2@A\b\7\1\2A\r\3\2\2\2BC\5\20\t\2CD\b\b\1\2D[\3\2"+
		"\2\2EF\5\22\n\2FG\b\b\1\2G[\3\2\2\2HI\5\24\13\2IJ\b\b\1\2J[\3\2\2\2KL"+
		"\5\26\f\2LM\b\b\1\2M[\3\2\2\2NO\5\30\r\2OP\b\b\1\2P[\3\2\2\2QR\5\32\16"+
		"\2RS\b\b\1\2S[\3\2\2\2TU\5\36\20\2UV\b\b\1\2V[\3\2\2\2WX\5 \21\2XY\b\b"+
		"\1\2Y[\3\2\2\2ZB\3\2\2\2ZE\3\2\2\2ZH\3\2\2\2ZK\3\2\2\2ZN\3\2\2\2ZQ\3\2"+
		"\2\2ZT\3\2\2\2ZW\3\2\2\2[\17\3\2\2\2\\]\b\t\1\2]^\5\b\5\2^_\b\t\1\2_g"+
		"\3\2\2\2`a\f\4\2\2ab\7\4\2\2bc\5\4\3\2cd\b\t\1\2df\3\2\2\2e`\3\2\2\2f"+
		"i\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\21\3\2\2\2ig\3\2\2\2jk\b\n\1\2kl\5\b\5"+
		"\2lm\b\n\1\2mu\3\2\2\2no\f\4\2\2op\7\5\2\2pq\5\4\3\2qr\b\n\1\2rt\3\2\2"+
		"\2sn\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\23\3\2\2\2wu\3\2\2\2xy\b\13"+
		"\1\2yz\5\b\5\2z{\b\13\1\2{\u0083\3\2\2\2|}\f\4\2\2}~\7\6\2\2~\177\5\4"+
		"\3\2\177\u0080\b\13\1\2\u0080\u0082\3\2\2\2\u0081|\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\25\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0087\b\f\1\2\u0087\u0088\5\b\5\2\u0088\u0089\b\f"+
		"\1\2\u0089\u0091\3\2\2\2\u008a\u008b\f\4\2\2\u008b\u008c\7\7\2\2\u008c"+
		"\u008d\5\4\3\2\u008d\u008e\b\f\1\2\u008e\u0090\3\2\2\2\u008f\u008a\3\2"+
		"\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\27\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\b\r\1\2\u0095\u0096\5\b\5"+
		"\2\u0096\u0097\b\r\1\2\u0097\u009f\3\2\2\2\u0098\u0099\f\4\2\2\u0099\u009a"+
		"\7\b\2\2\u009a\u009b\5\4\3\2\u009b\u009c\b\r\1\2\u009c\u009e\3\2\2\2\u009d"+
		"\u0098\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\31\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\t\2\2\u00a3\u00a4"+
		"\5\4\3\2\u00a4\u00a5\7\n\2\2\u00a5\u00b0\5\4\3\2\u00a6\u00a7\5\34\17\2"+
		"\u00a7\u00ab\b\16\1\2\u00a8\u00aa\7\13\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad"+
		"\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00a6\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b4\b\16\1\2\u00b4\33\3\2\2\2\u00b5\u00bb\7\f\2\2\u00b6\u00b7\5\4\3"+
		"\2\u00b7\u00b8\b\17\1\2\u00b8\u00ba\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba"+
		"\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00be\u00f2\b\17\1\2\u00bf\u00c5\7\r\2\2\u00c0"+
		"\u00c1\5\4\3\2\u00c1\u00c2\b\17\1\2\u00c2\u00c4\3\2\2\2\u00c3\u00c0\3"+
		"\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00f2\b\17\1\2\u00c9\u00cf\7"+
		"\16\2\2\u00ca\u00cb\5\4\3\2\u00cb\u00cc\b\17\1\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00ca\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00f2\b\17\1\2\u00d3"+
		"\u00d9\7\17\2\2\u00d4\u00d5\5\4\3\2\u00d5\u00d6\b\17\1\2\u00d6\u00d8\3"+
		"\2\2\2\u00d7\u00d4\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00f2\b\17"+
		"\1\2\u00dd\u00e3\7\20\2\2\u00de\u00df\5\4\3\2\u00df\u00e0\b\17\1\2\u00e0"+
		"\u00e2\3\2\2\2\u00e1\u00de\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00f2\b\17\1\2\u00e7\u00ed\7\21\2\2\u00e8\u00e9\5\4\3\2\u00e9\u00ea\b"+
		"\17\1\2\u00ea\u00ec\3\2\2\2\u00eb\u00e8\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00f0\u00f2\b\17\1\2\u00f1\u00b5\3\2\2\2\u00f1\u00bf\3\2\2\2\u00f1"+
		"\u00c9\3\2\2\2\u00f1\u00d3\3\2\2\2\u00f1\u00dd\3\2\2\2\u00f1\u00e7\3\2"+
		"\2\2\u00f2\35\3\2\2\2\u00f3\u00f4\7\22\2\2\u00f4\u00f5\7\24\2\2\u00f5"+
		"\u00fb\b\20\1\2\u00f6\u00f7\7\22\2\2\u00f7\u00f8\5\4\3\2\u00f8\u00f9\b"+
		"\20\1\2\u00f9\u00fb\3\2\2\2\u00fa\u00f3\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fb"+
		"\37\3\2\2\2\u00fc\u00fd\7\23\2\2\u00fd\u00fe\7\24\2\2\u00fe\u00ff\b\21"+
		"\1\2\u00ff!\3\2\2\2\24\'\65Zgu\u0083\u0091\u009f\u00ab\u00b0\u00bb\u00c5"+
		"\u00cf\u00d9\u00e3\u00ed\u00f1\u00fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}