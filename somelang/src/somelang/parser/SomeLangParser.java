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
		T__17=18, ID=19, Dot=20, Number=21, String=22, TrueLiteral=23, FalseLiteral=24, 
		WS=25, Line_Comment=26;
	public static final int
		RULE_program = 0, RULE_exp = 1, RULE_boolexp = 2, RULE_numexp = 3, RULE_strexp = 4, 
		RULE_isexp = 5, RULE_addexp = 6, RULE_subexp = 7, RULE_multexp = 8, RULE_divexp = 9, 
		RULE_remexp = 10, RULE_compare = 11, RULE_conditions = 12, RULE_iltexp = 13, 
		RULE_igtexp = 14, RULE_eltexp = 15, RULE_egtexp = 16, RULE_eqexp = 17, 
		RULE_give = 18, RULE_gain = 19;
	public static final String[] ruleNames = {
		"program", "exp", "boolexp", "numexp", "strexp", "isexp", "addexp", "subexp", 
		"multexp", "divexp", "remexp", "compare", "conditions", "iltexp", "igtexp", 
		"eltexp", "egtexp", "eqexp", "give", "gain"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "'is'", "'add'", "'sub'", "'mult'", "'div'", "'rem'", "'compare'", 
		"'to'", "'repeat'", "'if less than'", "'if greater than'", "'if eless than'", 
		"'if egreater than'", "'if equal'", "'else'", "'give'", "'gain'", null, 
		"'.'", null, null, "'#t'", "'#f'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "ID", "Dot", "Number", "String", 
		"TrueLiteral", "FalseLiteral", "WS", "Line_Comment"
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
		public ExpContext e;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			((ProgramContext)_localctx).e = exp();
			 ((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).e.ast); 
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
		public BoolexpContext bl;
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
		public BoolexpContext boolexp() {
			return getRuleContext(BoolexpContext.class,0);
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
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				((ExpContext)_localctx).is = isexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).is.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				((ExpContext)_localctx).str = strexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).str.ast; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				((ExpContext)_localctx).a = addexp(0);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).a.ast; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				((ExpContext)_localctx).s = subexp(0);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).s.ast; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				((ExpContext)_localctx).m = multexp(0);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).m.ast; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
				((ExpContext)_localctx).d = divexp(0);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).d.ast; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(61);
				((ExpContext)_localctx).r = remexp(0);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).r.ast; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(64);
				((ExpContext)_localctx).comp = compare();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).comp.ast; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(67);
				((ExpContext)_localctx).giv = give();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).giv.ast; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(70);
				((ExpContext)_localctx).gai = gain();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).gai.ast; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(73);
				((ExpContext)_localctx).bl = boolexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).bl.ast; 
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

	public static class BoolexpContext extends ParserRuleContext {
		public BoolExp ast;
		public TerminalNode TrueLiteral() { return getToken(SomeLangParser.TrueLiteral, 0); }
		public TerminalNode FalseLiteral() { return getToken(SomeLangParser.FalseLiteral, 0); }
		public BoolexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexp; }
	}

	public final BoolexpContext boolexp() throws RecognitionException {
		BoolexpContext _localctx = new BoolexpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_boolexp);
		try {
			setState(82);
			switch (_input.LA(1)) {
			case TrueLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(TrueLiteral);
				 ((BoolexpContext)_localctx).ast =  new BoolExp(true); 
				}
				break;
			case FalseLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(FalseLiteral);
				 ((BoolexpContext)_localctx).ast =  new BoolExp(false); 
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
		public ArrayList<Exp> list;
		public Token n0;
		public Token n1;
		public List<TerminalNode> Number() { return getTokens(SomeLangParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(SomeLangParser.Number, i);
		}
		public TerminalNode Dot() { return getToken(SomeLangParser.Dot, 0); }
		public NumexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numexp; }
	}

	public final NumexpContext numexp() throws RecognitionException {
		NumexpContext _localctx = new NumexpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numexp);
		try {
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(T__0);
				setState(87);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(-Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(90);
				match(Dot);
				setState(91);
				((NumexpContext)_localctx).n1 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Double.parseDouble((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null)+"."+(((NumexpContext)_localctx).n1!=null?((NumexpContext)_localctx).n1.getText():null))); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				match(T__0);
				setState(94);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(95);
				match(Dot);
				setState(96);
				((NumexpContext)_localctx).n1 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Double.parseDouble("-" + (((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null)+"."+(((NumexpContext)_localctx).n1!=null?((NumexpContext)_localctx).n1.getText():null))); 
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
			setState(100);
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
			setState(103);
			((IsexpContext)_localctx).l = match(ID);
			setState(104);
			match(T__1);
			setState(105);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_addexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(109);
			((AddexpContext)_localctx).num = numexp();
			 ((AddexpContext)_localctx).ast =  ((AddexpContext)_localctx).num.ast; 
			}
			_ctx.stop = _input.LT(-1);
			setState(119);
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
					setState(112);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(113);
					match(T__2);
					setState(114);
					((AddexpContext)_localctx).r = exp();
					 
					                                  ((AddexpContext)_localctx).list =  new ArrayList<Exp>();
					          			_localctx.list.add(((AddexpContext)_localctx).l.ast);
					          			_localctx.list.add(((AddexpContext)_localctx).r.ast);
					          			((AddexpContext)_localctx).ast =  new Exp(_localctx.list);		 
					          	                   
					}
					} 
				}
				setState(121);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_subexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(123);
			((SubexpContext)_localctx).num = numexp();
			 ((SubexpContext)_localctx).ast =  ((SubexpContext)_localctx).num.ast; 
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
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
					setState(126);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(127);
					match(T__3);
					setState(128);
					((SubexpContext)_localctx).r = exp();
					 
					                                  ((SubexpContext)_localctx).list =  new ArrayList<Exp>();
					          			_localctx.list.add(((SubexpContext)_localctx).l.ast);
					          			_localctx.list.add(((SubexpContext)_localctx).r.ast);
					          			((SubexpContext)_localctx).ast =  new SubExp(_localctx.list);		 
					          	                   
					}
					} 
				}
				setState(135);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_multexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(137);
			((MultexpContext)_localctx).num = numexp();
			 ((MultexpContext)_localctx).ast =  ((MultexpContext)_localctx).num.ast; 
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
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
					setState(140);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(141);
					match(T__4);
					setState(142);
					((MultexpContext)_localctx).r = exp();
					 
					                                  ((MultexpContext)_localctx).list =  new ArrayList<Exp>();
					          			_localctx.list.add(((MultexpContext)_localctx).l.ast);
					          			_localctx.list.add(((MultexpContext)_localctx).r.ast);
					          			((MultexpContext)_localctx).ast =  new MultExp(_localctx.list);		 
					          	                   
					}
					} 
				}
				setState(149);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_divexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(151);
			((DivexpContext)_localctx).num = numexp();
			 ((DivexpContext)_localctx).ast =  ((DivexpContext)_localctx).num.ast; 
			}
			_ctx.stop = _input.LT(-1);
			setState(161);
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
					setState(154);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(155);
					match(T__5);
					setState(156);
					((DivexpContext)_localctx).r = exp();
					 
					                                  ((DivexpContext)_localctx).list =  new ArrayList<Exp>();
					          			_localctx.list.add(((DivexpContext)_localctx).l.ast);
					          			_localctx.list.add(((DivexpContext)_localctx).r.ast);
					          			((DivexpContext)_localctx).ast =  new DivExp(_localctx.list);		 
					          	                   
					}
					} 
				}
				setState(163);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_remexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(165);
			((RemexpContext)_localctx).num = numexp();
			 ((RemexpContext)_localctx).ast =  ((RemexpContext)_localctx).num.ast; 
			}
			_ctx.stop = _input.LT(-1);
			setState(175);
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
					setState(168);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(169);
					match(T__6);
					setState(170);
					((RemexpContext)_localctx).r = exp();

					                                  ((RemexpContext)_localctx).list =  new ArrayList<Exp>();
					                                  _localctx.list.add(((RemexpContext)_localctx).l.ast);
					                                  _localctx.list.add(((RemexpContext)_localctx).r.ast);
					                                  ((RemexpContext)_localctx).ast =  new RemExp(_localctx.list);
					                                     
					}
					} 
				}
				setState(177);
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
		enterRule(_localctx, 22, RULE_compare);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__7);
			setState(179);
			((CompareContext)_localctx).l = exp();
			setState(180);
			match(T__8);
			setState(181);
			((CompareContext)_localctx).r = exp();
			setState(190); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(182);
					((CompareContext)_localctx).c = conditions();
					((CompareContext)_localctx).ast =  ((CompareContext)_localctx).c.ast;
					setState(187);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(184);
							match(T__9);
							}
							} 
						}
						setState(189);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(192); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 24, RULE_conditions);
		try {
			setState(220);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(T__10);
				setState(197);
				((ConditionsContext)_localctx).ilt = iltexp();
				 ((ConditionsContext)_localctx).ast =  ((ConditionsContext)_localctx).ilt.ast; 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(T__11);
				setState(201);
				((ConditionsContext)_localctx).igt = igtexp();
				 ((ConditionsContext)_localctx).ast =  ((ConditionsContext)_localctx).igt.ast; 
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(T__12);
				setState(205);
				((ConditionsContext)_localctx).elt = eltexp();
				 ((ConditionsContext)_localctx).ast =  ((ConditionsContext)_localctx).elt.ast; 
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				match(T__13);
				setState(209);
				((ConditionsContext)_localctx).egt = egtexp();
				 ((ConditionsContext)_localctx).ast =  ((ConditionsContext)_localctx).egt.ast; 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				match(T__14);
				setState(213);
				((ConditionsContext)_localctx).eq = eqexp();
				 ((ConditionsContext)_localctx).ast =  ((ConditionsContext)_localctx).eq.ast; 
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(216);
				match(T__15);
				setState(217);
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
		enterRule(_localctx, 26, RULE_iltexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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
		enterRule(_localctx, 28, RULE_igtexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
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
		enterRule(_localctx, 30, RULE_eltexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
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
		enterRule(_localctx, 32, RULE_egtexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
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
		enterRule(_localctx, 34, RULE_eqexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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
		enterRule(_localctx, 36, RULE_give);
		try {
			setState(244);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(T__16);
				setState(238);
				((GiveContext)_localctx).id = match(ID);
				((GiveContext)_localctx).ast =  new Give((((GiveContext)_localctx).id!=null?((GiveContext)_localctx).id.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(T__16);
				setState(241);
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
		enterRule(_localctx, 38, RULE_gain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__17);
			setState(247);
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
		case 6:
			return addexp_sempred((AddexpContext)_localctx, predIndex);
		case 7:
			return subexp_sempred((SubexpContext)_localctx, predIndex);
		case 8:
			return multexp_sempred((MultexpContext)_localctx, predIndex);
		case 9:
			return divexp_sempred((DivexpContext)_localctx, predIndex);
		case 10:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34\u00fd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3O\n\3\3\4\3\4\3\4\3\4\5\4U\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5e\n\5\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bx\n"+
		"\b\f\b\16\b{\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0086\n\t\f"+
		"\t\16\t\u0089\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0094\n\n\f"+
		"\n\16\n\u0097\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a2"+
		"\n\13\f\13\16\13\u00a5\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00b0"+
		"\n\f\f\f\16\f\u00b3\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00bc\n\r\f\r"+
		"\16\r\u00bf\13\r\6\r\u00c1\n\r\r\r\16\r\u00c2\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00df\n\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00f7\n\24\3\25\3\25\3\25\3\25\3\25\2\7\16\20"+
		"\22\24\26\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\2\u0103\2"+
		"*\3\2\2\2\4N\3\2\2\2\6T\3\2\2\2\bd\3\2\2\2\nf\3\2\2\2\fi\3\2\2\2\16n\3"+
		"\2\2\2\20|\3\2\2\2\22\u008a\3\2\2\2\24\u0098\3\2\2\2\26\u00a6\3\2\2\2"+
		"\30\u00b4\3\2\2\2\32\u00de\3\2\2\2\34\u00e0\3\2\2\2\36\u00e3\3\2\2\2 "+
		"\u00e6\3\2\2\2\"\u00e9\3\2\2\2$\u00ec\3\2\2\2&\u00f6\3\2\2\2(\u00f8\3"+
		"\2\2\2*+\5\4\3\2+,\b\2\1\2,\3\3\2\2\2-.\5\f\7\2./\b\3\1\2/O\3\2\2\2\60"+
		"\61\5\n\6\2\61\62\b\3\1\2\62O\3\2\2\2\63\64\5\16\b\2\64\65\b\3\1\2\65"+
		"O\3\2\2\2\66\67\5\20\t\2\678\b\3\1\28O\3\2\2\29:\5\22\n\2:;\b\3\1\2;O"+
		"\3\2\2\2<=\5\24\13\2=>\b\3\1\2>O\3\2\2\2?@\5\26\f\2@A\b\3\1\2AO\3\2\2"+
		"\2BC\5\30\r\2CD\b\3\1\2DO\3\2\2\2EF\5&\24\2FG\b\3\1\2GO\3\2\2\2HI\5(\25"+
		"\2IJ\b\3\1\2JO\3\2\2\2KL\5\6\4\2LM\b\3\1\2MO\3\2\2\2N-\3\2\2\2N\60\3\2"+
		"\2\2N\63\3\2\2\2N\66\3\2\2\2N9\3\2\2\2N<\3\2\2\2N?\3\2\2\2NB\3\2\2\2N"+
		"E\3\2\2\2NH\3\2\2\2NK\3\2\2\2O\5\3\2\2\2PQ\7\31\2\2QU\b\4\1\2RS\7\32\2"+
		"\2SU\b\4\1\2TP\3\2\2\2TR\3\2\2\2U\7\3\2\2\2VW\7\27\2\2We\b\5\1\2XY\7\3"+
		"\2\2YZ\7\27\2\2Ze\b\5\1\2[\\\7\27\2\2\\]\7\26\2\2]^\7\27\2\2^e\b\5\1\2"+
		"_`\7\3\2\2`a\7\27\2\2ab\7\26\2\2bc\7\27\2\2ce\b\5\1\2dV\3\2\2\2dX\3\2"+
		"\2\2d[\3\2\2\2d_\3\2\2\2e\t\3\2\2\2fg\7\30\2\2gh\b\6\1\2h\13\3\2\2\2i"+
		"j\7\25\2\2jk\7\4\2\2kl\5\4\3\2lm\b\7\1\2m\r\3\2\2\2no\b\b\1\2op\5\b\5"+
		"\2pq\b\b\1\2qy\3\2\2\2rs\f\4\2\2st\7\5\2\2tu\5\4\3\2uv\b\b\1\2vx\3\2\2"+
		"\2wr\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\17\3\2\2\2{y\3\2\2\2|}\b\t"+
		"\1\2}~\5\b\5\2~\177\b\t\1\2\177\u0087\3\2\2\2\u0080\u0081\f\4\2\2\u0081"+
		"\u0082\7\6\2\2\u0082\u0083\5\4\3\2\u0083\u0084\b\t\1\2\u0084\u0086\3\2"+
		"\2\2\u0085\u0080\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\21\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\b\n\1"+
		"\2\u008b\u008c\5\b\5\2\u008c\u008d\b\n\1\2\u008d\u0095\3\2\2\2\u008e\u008f"+
		"\f\4\2\2\u008f\u0090\7\7\2\2\u0090\u0091\5\4\3\2\u0091\u0092\b\n\1\2\u0092"+
		"\u0094\3\2\2\2\u0093\u008e\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\23\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099"+
		"\b\13\1\2\u0099\u009a\5\b\5\2\u009a\u009b\b\13\1\2\u009b\u00a3\3\2\2\2"+
		"\u009c\u009d\f\4\2\2\u009d\u009e\7\b\2\2\u009e\u009f\5\4\3\2\u009f\u00a0"+
		"\b\13\1\2\u00a0\u00a2\3\2\2\2\u00a1\u009c\3\2\2\2\u00a2\u00a5\3\2\2\2"+
		"\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\25\3\2\2\2\u00a5\u00a3"+
		"\3\2\2\2\u00a6\u00a7\b\f\1\2\u00a7\u00a8\5\b\5\2\u00a8\u00a9\b\f\1\2\u00a9"+
		"\u00b1\3\2\2\2\u00aa\u00ab\f\4\2\2\u00ab\u00ac\7\t\2\2\u00ac\u00ad\5\4"+
		"\3\2\u00ad\u00ae\b\f\1\2\u00ae\u00b0\3\2\2\2\u00af\u00aa\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\27\3\2\2"+
		"\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\n\2\2\u00b5\u00b6\5\4\3\2\u00b6\u00b7"+
		"\7\13\2\2\u00b7\u00c0\5\4\3\2\u00b8\u00b9\5\32\16\2\u00b9\u00bd\b\r\1"+
		"\2\u00ba\u00bc\7\f\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00b8\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\b\r\1\2\u00c5\31\3\2\2\2\u00c6\u00c7"+
		"\7\r\2\2\u00c7\u00c8\5\34\17\2\u00c8\u00c9\b\16\1\2\u00c9\u00df\3\2\2"+
		"\2\u00ca\u00cb\7\16\2\2\u00cb\u00cc\5\36\20\2\u00cc\u00cd\b\16\1\2\u00cd"+
		"\u00df\3\2\2\2\u00ce\u00cf\7\17\2\2\u00cf\u00d0\5 \21\2\u00d0\u00d1\b"+
		"\16\1\2\u00d1\u00df\3\2\2\2\u00d2\u00d3\7\20\2\2\u00d3\u00d4\5\"\22\2"+
		"\u00d4\u00d5\b\16\1\2\u00d5\u00df\3\2\2\2\u00d6\u00d7\7\21\2\2\u00d7\u00d8"+
		"\5$\23\2\u00d8\u00d9\b\16\1\2\u00d9\u00df\3\2\2\2\u00da\u00db\7\22\2\2"+
		"\u00db\u00dc\5\4\3\2\u00dc\u00dd\b\16\1\2\u00dd\u00df\3\2\2\2\u00de\u00c6"+
		"\3\2\2\2\u00de\u00ca\3\2\2\2\u00de\u00ce\3\2\2\2\u00de\u00d2\3\2\2\2\u00de"+
		"\u00d6\3\2\2\2\u00de\u00da\3\2\2\2\u00df\33\3\2\2\2\u00e0\u00e1\5\4\3"+
		"\2\u00e1\u00e2\b\17\1\2\u00e2\35\3\2\2\2\u00e3\u00e4\5\4\3\2\u00e4\u00e5"+
		"\b\20\1\2\u00e5\37\3\2\2\2\u00e6\u00e7\5\4\3\2\u00e7\u00e8\b\21\1\2\u00e8"+
		"!\3\2\2\2\u00e9\u00ea\5\4\3\2\u00ea\u00eb\b\22\1\2\u00eb#\3\2\2\2\u00ec"+
		"\u00ed\5\4\3\2\u00ed\u00ee\b\23\1\2\u00ee%\3\2\2\2\u00ef\u00f0\7\23\2"+
		"\2\u00f0\u00f1\7\25\2\2\u00f1\u00f7\b\24\1\2\u00f2\u00f3\7\23\2\2\u00f3"+
		"\u00f4\5\4\3\2\u00f4\u00f5\b\24\1\2\u00f5\u00f7\3\2\2\2\u00f6\u00ef\3"+
		"\2\2\2\u00f6\u00f2\3\2\2\2\u00f7\'\3\2\2\2\u00f8\u00f9\7\24\2\2\u00f9"+
		"\u00fa\7\25\2\2\u00fa\u00fb\b\25\1\2\u00fb)\3\2\2\2\16NTdy\u0087\u0095"+
		"\u00a3\u00b1\u00bd\u00c2\u00de\u00f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}