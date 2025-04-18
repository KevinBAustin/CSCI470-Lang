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
		RULE_program = 0, RULE_exp = 1, RULE_numexp = 2, RULE_strexp = 3, RULE_isexp = 4, 
		RULE_addexp = 5, RULE_subexp = 6, RULE_multexp = 7, RULE_divexp = 8, RULE_remexp = 9, 
		RULE_compare = 10, RULE_conditions = 11, RULE_iltexp = 12, RULE_igtexp = 13, 
		RULE_eltexp = 14, RULE_egtexp = 15, RULE_eqexp = 16, RULE_give = 17, RULE_gain = 18;
	public static final String[] ruleNames = {
		"program", "exp", "numexp", "strexp", "isexp", "addexp", "subexp", "multexp", 
		"divexp", "remexp", "compare", "conditions", "iltexp", "igtexp", "eltexp", 
		"egtexp", "eqexp", "give", "gain"
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
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__15) | (1L << T__16) | (1L << ID) | (1L << Number) | (1L << String))) != 0)) {
				{
				{
				setState(38);
				((ProgramContext)_localctx).e = exp();
				 _localctx.list.add(((ProgramContext)_localctx).e.ast);
				}
				}
				setState(45);
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
		public IsexpContext is;
		public StrexpContext str;
		public AddexpContext a;
		public SubexpContext s;
		public MultexpContext m;
		public DivexpContext d;
		public RemexpContext r;
		public CompareContext comp;
		public GiveContext giv;
		public GainContext gai;
		public IsexpContext isexp() {
			return getRuleContext(IsexpContext.class,0);
		}
		public StrexpContext strexp() {
			return getRuleContext(StrexpContext.class,0);
		}
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
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exp);
		try {
			setState(78);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				((ExpContext)_localctx).is = isexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).is.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				((ExpContext)_localctx).str = strexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).str.ast; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				((ExpContext)_localctx).a = addexp(0);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).a.ast; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				((ExpContext)_localctx).s = subexp(0);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).s.ast; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				((ExpContext)_localctx).m = multexp(0);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).m.ast; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
				((ExpContext)_localctx).d = divexp(0);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).d.ast; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
				((ExpContext)_localctx).r = remexp(0);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).r.ast; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(69);
				((ExpContext)_localctx).comp = compare();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).comp.ast; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(72);
				((ExpContext)_localctx).giv = give();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).giv.ast; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(75);
				((ExpContext)_localctx).gai = gain();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).gai.ast; 
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
		enterRule(_localctx, 4, RULE_numexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
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
		enterRule(_localctx, 6, RULE_strexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
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
		enterRule(_localctx, 8, RULE_isexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			((IsexpContext)_localctx).l = match(ID);
			setState(87);
			match(T__0);
			setState(88);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_addexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(92);
			((AddexpContext)_localctx).num = numexp();
			 ((AddexpContext)_localctx).ast =  ((AddexpContext)_localctx).num.ast; 
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
					setState(95);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(96);
					match(T__1);
					setState(97);
					((AddexpContext)_localctx).r = exp();
					 
					                                  ((AddexpContext)_localctx).list =  new ArrayList<Exp>();
					          			_localctx.list.add(((AddexpContext)_localctx).l.ast);
					          			_localctx.list.add(((AddexpContext)_localctx).r.ast);
					          			((AddexpContext)_localctx).ast =  new AddExp(_localctx.list);		 
					          	                   
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_subexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(106);
			((SubexpContext)_localctx).num = numexp();
			 ((SubexpContext)_localctx).ast =  ((SubexpContext)_localctx).num.ast; 
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
					setState(109);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(110);
					match(T__2);
					setState(111);
					((SubexpContext)_localctx).r = exp();
					 
					                                  ((SubexpContext)_localctx).list =  new ArrayList<Exp>();
					          			_localctx.list.add(((SubexpContext)_localctx).l.ast);
					          			_localctx.list.add(((SubexpContext)_localctx).r.ast);
					          			((SubexpContext)_localctx).ast =  new SubExp(_localctx.list);		 
					          	                   
					}
					} 
				}
				setState(118);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_multexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(120);
			((MultexpContext)_localctx).num = numexp();
			 ((MultexpContext)_localctx).ast =  ((MultexpContext)_localctx).num.ast; 
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
					setState(123);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(124);
					match(T__3);
					setState(125);
					((MultexpContext)_localctx).r = exp();
					 
					                                  ((MultexpContext)_localctx).list =  new ArrayList<Exp>();
					          			_localctx.list.add(((MultexpContext)_localctx).l.ast);
					          			_localctx.list.add(((MultexpContext)_localctx).r.ast);
					          			((MultexpContext)_localctx).ast =  new MultExp(_localctx.list);		 
					          	                   
					}
					} 
				}
				setState(132);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_divexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(134);
			((DivexpContext)_localctx).num = numexp();
			 ((DivexpContext)_localctx).ast =  ((DivexpContext)_localctx).num.ast; 
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
					setState(137);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(138);
					match(T__4);
					setState(139);
					((DivexpContext)_localctx).r = exp();
					 
					                                  ((DivexpContext)_localctx).list =  new ArrayList<Exp>();
					          			_localctx.list.add(((DivexpContext)_localctx).l.ast);
					          			_localctx.list.add(((DivexpContext)_localctx).r.ast);
					          			((DivexpContext)_localctx).ast =  new DivExp(_localctx.list);		 
					          	                   
					}
					} 
				}
				setState(146);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_remexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(148);
			((RemexpContext)_localctx).num = numexp();
			 ((RemexpContext)_localctx).ast =  ((RemexpContext)_localctx).num.ast; 
			}
			_ctx.stop = _input.LT(-1);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
					setState(151);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(152);
					match(T__5);
					setState(153);
					((RemexpContext)_localctx).r = exp();

					                                  ((RemexpContext)_localctx).list =  new ArrayList<Exp>();
					                                  _localctx.list.add(((RemexpContext)_localctx).l.ast);
					                                  _localctx.list.add(((RemexpContext)_localctx).r.ast);
					                                  ((RemexpContext)_localctx).ast =  new RemExp(_localctx.list);
					                                     
					}
					} 
				}
				setState(160);
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
		enterRule(_localctx, 20, RULE_compare);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__6);
			setState(162);
			((CompareContext)_localctx).l = exp();
			setState(163);
			match(T__7);
			setState(164);
			((CompareContext)_localctx).r = exp();
			setState(173); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(165);
					((CompareContext)_localctx).c = conditions();
					((CompareContext)_localctx).ast =  ((CompareContext)_localctx).c.ast;
					setState(170);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(167);
							match(T__8);
							}
							} 
						}
						setState(172);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(175); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

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
		public IltexpContext ilt;
		public IgtexpContext igt;
		public EltexpContext elt;
		public EgtexpContext egt;
		public EqexpContext eq;
		public ExpContext e;
		public IltexpContext iltexp() {
			return getRuleContext(IltexpContext.class,0);
		}
		public IgtexpContext igtexp() {
			return getRuleContext(IgtexpContext.class,0);
		}
		public EltexpContext eltexp() {
			return getRuleContext(EltexpContext.class,0);
		}
		public EgtexpContext egtexp() {
			return getRuleContext(EgtexpContext.class,0);
		}
		public EqexpContext eqexp() {
			return getRuleContext(EqexpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conditions);
		try {
			setState(203);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(T__9);
				setState(180);
				((ConditionsContext)_localctx).ilt = iltexp();
				 ((ConditionsContext)_localctx).ast =  ((ConditionsContext)_localctx).ilt.ast; 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(T__10);
				setState(184);
				((ConditionsContext)_localctx).igt = igtexp();
				 ((ConditionsContext)_localctx).ast =  ((ConditionsContext)_localctx).igt.ast; 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				match(T__11);
				setState(188);
				((ConditionsContext)_localctx).elt = eltexp();
				 ((ConditionsContext)_localctx).ast =  ((ConditionsContext)_localctx).elt.ast; 
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				match(T__12);
				setState(192);
				((ConditionsContext)_localctx).egt = egtexp();
				 ((ConditionsContext)_localctx).ast =  ((ConditionsContext)_localctx).egt.ast; 
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				match(T__13);
				setState(196);
				((ConditionsContext)_localctx).eq = eqexp();
				 ((ConditionsContext)_localctx).ast =  ((ConditionsContext)_localctx).eq.ast; 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 6);
				{
				setState(199);
				match(T__14);
				setState(200);
				((ConditionsContext)_localctx).e = exp();
				 ((ConditionsContext)_localctx).ast =  ((ConditionsContext)_localctx).e.ast; 
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

	public static class IltexpContext extends ParserRuleContext {
		public Ilt ast;
		public ExpContext e;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IltexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iltexp; }
	}

	public final IltexpContext iltexp() throws RecognitionException {
		IltexpContext _localctx = new IltexpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_iltexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			((IltexpContext)_localctx).e = exp();
			 ((IltexpContext)_localctx).ast =  ((IltexpContext)_localctx).e.ast; 
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

	public static class IgtexpContext extends ParserRuleContext {
		public Igt ast;
		public ExpContext e;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IgtexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igtexp; }
	}

	public final IgtexpContext igtexp() throws RecognitionException {
		IgtexpContext _localctx = new IgtexpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_igtexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			((IgtexpContext)_localctx).e = exp();
			 ((IgtexpContext)_localctx).ast =  ((IgtexpContext)_localctx).e.ast; 
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

	public static class EltexpContext extends ParserRuleContext {
		public Elt ast;
		public ExpContext e;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public EltexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eltexp; }
	}

	public final EltexpContext eltexp() throws RecognitionException {
		EltexpContext _localctx = new EltexpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_eltexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			((EltexpContext)_localctx).e = exp();
			 ((EltexpContext)_localctx).ast =  ((EltexpContext)_localctx).e.ast; 
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

	public static class EgtexpContext extends ParserRuleContext {
		public Egt ast;
		public ExpContext e;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public EgtexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_egtexp; }
	}

	public final EgtexpContext egtexp() throws RecognitionException {
		EgtexpContext _localctx = new EgtexpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_egtexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			((EgtexpContext)_localctx).e = exp();
			 ((EgtexpContext)_localctx).ast =  ((EgtexpContext)_localctx).e.ast; 
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

	public static class EqexpContext extends ParserRuleContext {
		public Eq ast;
		public ExpContext e;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public EqexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqexp; }
	}

	public final EqexpContext eqexp() throws RecognitionException {
		EqexpContext _localctx = new EqexpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_eqexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			((EqexpContext)_localctx).e = exp();
			 ((EqexpContext)_localctx).ast =  ((EqexpContext)_localctx).e.ast; 
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
		enterRule(_localctx, 34, RULE_give);
		try {
			setState(227);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(T__15);
				setState(221);
				((GiveContext)_localctx).id = match(ID);
				((GiveContext)_localctx).ast =  new Give((((GiveContext)_localctx).id!=null?((GiveContext)_localctx).id.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(T__15);
				setState(224);
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
		enterRule(_localctx, 36, RULE_gain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__16);
			setState(230);
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
		case 5:
			return addexp_sempred((AddexpContext)_localctx, predIndex);
		case 6:
			return subexp_sempred((SubexpContext)_localctx, predIndex);
		case 7:
			return multexp_sempred((MultexpContext)_localctx, predIndex);
		case 8:
			return divexp_sempred((DivexpContext)_localctx, predIndex);
		case 9:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u00ec\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3Q\n\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7g"+
		"\n\7\f\7\16\7j\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bu\n\b\f\b\16"+
		"\bx\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0083\n\t\f\t\16\t\u0086"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0091\n\n\f\n\16\n\u0094"+
		"\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u009f\n\13\f\13"+
		"\16\13\u00a2\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ab\n\f\f\f\16\f"+
		"\u00ae\13\f\6\f\u00b0\n\f\r\f\16\f\u00b1\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u00ce\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00e6"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\2\7\f\16\20\22\24\25\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&\2\2\u00ef\2-\3\2\2\2\4P\3\2\2\2\6R\3\2\2\2"+
		"\bU\3\2\2\2\nX\3\2\2\2\f]\3\2\2\2\16k\3\2\2\2\20y\3\2\2\2\22\u0087\3\2"+
		"\2\2\24\u0095\3\2\2\2\26\u00a3\3\2\2\2\30\u00cd\3\2\2\2\32\u00cf\3\2\2"+
		"\2\34\u00d2\3\2\2\2\36\u00d5\3\2\2\2 \u00d8\3\2\2\2\"\u00db\3\2\2\2$\u00e5"+
		"\3\2\2\2&\u00e7\3\2\2\2()\5\4\3\2)*\b\2\1\2*,\3\2\2\2+(\3\2\2\2,/\3\2"+
		"\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\b\2\1\2\61\3\3\2"+
		"\2\2\62\63\5\n\6\2\63\64\b\3\1\2\64Q\3\2\2\2\65\66\5\b\5\2\66\67\b\3\1"+
		"\2\67Q\3\2\2\289\5\f\7\29:\b\3\1\2:Q\3\2\2\2;<\5\16\b\2<=\b\3\1\2=Q\3"+
		"\2\2\2>?\5\20\t\2?@\b\3\1\2@Q\3\2\2\2AB\5\22\n\2BC\b\3\1\2CQ\3\2\2\2D"+
		"E\5\24\13\2EF\b\3\1\2FQ\3\2\2\2GH\5\26\f\2HI\b\3\1\2IQ\3\2\2\2JK\5$\23"+
		"\2KL\b\3\1\2LQ\3\2\2\2MN\5&\24\2NO\b\3\1\2OQ\3\2\2\2P\62\3\2\2\2P\65\3"+
		"\2\2\2P8\3\2\2\2P;\3\2\2\2P>\3\2\2\2PA\3\2\2\2PD\3\2\2\2PG\3\2\2\2PJ\3"+
		"\2\2\2PM\3\2\2\2Q\5\3\2\2\2RS\7\25\2\2ST\b\4\1\2T\7\3\2\2\2UV\7\26\2\2"+
		"VW\b\5\1\2W\t\3\2\2\2XY\7\24\2\2YZ\7\3\2\2Z[\5\4\3\2[\\\b\6\1\2\\\13\3"+
		"\2\2\2]^\b\7\1\2^_\5\6\4\2_`\b\7\1\2`h\3\2\2\2ab\f\4\2\2bc\7\4\2\2cd\5"+
		"\4\3\2de\b\7\1\2eg\3\2\2\2fa\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\r"+
		"\3\2\2\2jh\3\2\2\2kl\b\b\1\2lm\5\6\4\2mn\b\b\1\2nv\3\2\2\2op\f\4\2\2p"+
		"q\7\5\2\2qr\5\4\3\2rs\b\b\1\2su\3\2\2\2to\3\2\2\2ux\3\2\2\2vt\3\2\2\2"+
		"vw\3\2\2\2w\17\3\2\2\2xv\3\2\2\2yz\b\t\1\2z{\5\6\4\2{|\b\t\1\2|\u0084"+
		"\3\2\2\2}~\f\4\2\2~\177\7\6\2\2\177\u0080\5\4\3\2\u0080\u0081\b\t\1\2"+
		"\u0081\u0083\3\2\2\2\u0082}\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3"+
		"\2\2\2\u0084\u0085\3\2\2\2\u0085\21\3\2\2\2\u0086\u0084\3\2\2\2\u0087"+
		"\u0088\b\n\1\2\u0088\u0089\5\6\4\2\u0089\u008a\b\n\1\2\u008a\u0092\3\2"+
		"\2\2\u008b\u008c\f\4\2\2\u008c\u008d\7\7\2\2\u008d\u008e\5\4\3\2\u008e"+
		"\u008f\b\n\1\2\u008f\u0091\3\2\2\2\u0090\u008b\3\2\2\2\u0091\u0094\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\23\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0095\u0096\b\13\1\2\u0096\u0097\5\6\4\2\u0097\u0098\b\13\1\2"+
		"\u0098\u00a0\3\2\2\2\u0099\u009a\f\4\2\2\u009a\u009b\7\b\2\2\u009b\u009c"+
		"\5\4\3\2\u009c\u009d\b\13\1\2\u009d\u009f\3\2\2\2\u009e\u0099\3\2\2\2"+
		"\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\25"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\t\2\2\u00a4\u00a5\5\4\3\2\u00a5"+
		"\u00a6\7\n\2\2\u00a6\u00af\5\4\3\2\u00a7\u00a8\5\30\r\2\u00a8\u00ac\b"+
		"\f\1\2\u00a9\u00ab\7\13\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00af\u00a7\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\b\f\1\2\u00b4\27\3\2\2"+
		"\2\u00b5\u00b6\7\f\2\2\u00b6\u00b7\5\32\16\2\u00b7\u00b8\b\r\1\2\u00b8"+
		"\u00ce\3\2\2\2\u00b9\u00ba\7\r\2\2\u00ba\u00bb\5\34\17\2\u00bb\u00bc\b"+
		"\r\1\2\u00bc\u00ce\3\2\2\2\u00bd\u00be\7\16\2\2\u00be\u00bf\5\36\20\2"+
		"\u00bf\u00c0\b\r\1\2\u00c0\u00ce\3\2\2\2\u00c1\u00c2\7\17\2\2\u00c2\u00c3"+
		"\5 \21\2\u00c3\u00c4\b\r\1\2\u00c4\u00ce\3\2\2\2\u00c5\u00c6\7\20\2\2"+
		"\u00c6\u00c7\5\"\22\2\u00c7\u00c8\b\r\1\2\u00c8\u00ce\3\2\2\2\u00c9\u00ca"+
		"\7\21\2\2\u00ca\u00cb\5\4\3\2\u00cb\u00cc\b\r\1\2\u00cc\u00ce\3\2\2\2"+
		"\u00cd\u00b5\3\2\2\2\u00cd\u00b9\3\2\2\2\u00cd\u00bd\3\2\2\2\u00cd\u00c1"+
		"\3\2\2\2\u00cd\u00c5\3\2\2\2\u00cd\u00c9\3\2\2\2\u00ce\31\3\2\2\2\u00cf"+
		"\u00d0\5\4\3\2\u00d0\u00d1\b\16\1\2\u00d1\33\3\2\2\2\u00d2\u00d3\5\4\3"+
		"\2\u00d3\u00d4\b\17\1\2\u00d4\35\3\2\2\2\u00d5\u00d6\5\4\3\2\u00d6\u00d7"+
		"\b\20\1\2\u00d7\37\3\2\2\2\u00d8\u00d9\5\4\3\2\u00d9\u00da\b\21\1\2\u00da"+
		"!\3\2\2\2\u00db\u00dc\5\4\3\2\u00dc\u00dd\b\22\1\2\u00dd#\3\2\2\2\u00de"+
		"\u00df\7\22\2\2\u00df\u00e0\7\24\2\2\u00e0\u00e6\b\23\1\2\u00e1\u00e2"+
		"\7\22\2\2\u00e2\u00e3\5\4\3\2\u00e3\u00e4\b\23\1\2\u00e4\u00e6\3\2\2\2"+
		"\u00e5\u00de\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e6%\3\2\2\2\u00e7\u00e8\7"+
		"\23\2\2\u00e8\u00e9\7\24\2\2\u00e9\u00ea\b\24\1\2\u00ea\'\3\2\2\2\r-P"+
		"hv\u0084\u0092\u00a0\u00ac\u00b1\u00cd\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}