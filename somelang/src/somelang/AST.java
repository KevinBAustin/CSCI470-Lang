public interface AST {
	public static abstract class ASTNode implements AST {
		public abstract <T> T accept(Visitor<T> visitor, Env env);
	}
	public static class Program extends ASTNode {
		Exp _e;

		public Program(Exp e) {
			_e = e;
		}

		public Exp e() {
			return _e;
		}
		
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}
	public static abstract class Exp extends ASTNode {

	}

	public static abstract class CompoundArithExp extends Exp {
		List<Exp> _rest;

		public CompoundArithExp() {
			_rest = new ArrayList<Exp>();
		}

		public CompoundArithExp(Exp fst) {
			_rest = new ArrayList<Exp>();
			_rest.add(fst);
		}

		public CompoundArithExp(List<Exp> args) {
			_rest = new ArrayList<Exp>();
			for (Exp e : args)
				_rest.add((Exp) e);
		}

		public CompoundArithExp(Exp fst, List<Exp> rest) {
			_rest = new ArrayList<Exp>();
			_rest.add(fst);
			_rest.addAll(rest);
		}

		public CompoundArithExp(Exp fst, Exp second) {
			_rest = new ArrayList<Exp>();
			_rest.add(fst);
			_rest.add(second);
		}

		public Exp fst() {
			return _rest.get(0);
		}

		public Exp snd() {
			return _rest.get(1);
		}

		public List<Exp> all() {
			return _rest;
		}

		public void add(Exp e) {
			_rest.add(e);
		}
		
	}

	/*Insert other functionalities here*/

	public static class NumExp extends Exp {
		double _val;

		public NumExp(double v) {
			_val = v;
		}

		public double v() {
			return _val;
		}
		
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public static class StrExp extends Exp {
		String _val;

		public StrExp(String v) {
			_val = v;
		}

		public String v() {
			return _val;
		}
		
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public static class NullExp extends Exp {
		private Exp _arg; 
		public NullExp(Exp arg){
			_arg = arg;
		}
		public Exp arg() { return _arg; }
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public static class AddExp extends CompoundArithExp {
		public AddExp(Exp fst) {
			super(fst);
		}

		public AddExp(List<Exp> args) {
			super(args);
		}

		public AddExp(Exp fst, List<Exp> rest) {
			super(fst, rest);
		}

		public AddExp(Exp left, Exp right) {
			super(left, right);
		}
		
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public static class SubExp extends CompoundArithExp {

		public SubExp(Exp fst) {
			super(fst);
		}

		public SubExp(List<Exp> args) {
			super(args);
		}

		public SubExp(Exp fst, List<Exp> rest) {
			super(fst, rest);
		}

		public SubExp(Exp left, Exp right) {
			super(left, right);
		}
		
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public static class DivExp extends CompoundArithExp {
		public DivExp(Exp fst) {
			super(fst);
		}

		public DivExp(List<Exp> args) {
			super(args);
		}

		public DivExp(Exp fst, List<Exp> rest) {
			super(fst, rest);
		}

		public DivExp(Exp left, Exp right) {
			super(left, right);
		}
		
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public static class MultExp extends CompoundArithExp {
		public MultExp(Exp fst) {
			super(fst);
		}

		public MultExp(List<Exp> args) {
			super(args);
		}

		public MultExp(Exp fst, List<Exp> rest) {
			super(fst, rest);
		}

		public MultExp(Exp left, Exp right) {
			super(left, right);
		}
		
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public static class RemExp extends CompoundArithExp {
		public RemExp(Exp fst) {
			super(fst);
		}

		public RemExp(List<Exp> args) {
			super(args);
		}

		public RemExp(Exp fst, List<Exp> rest) {
			super(fst, rest);
		}

		public RemExp(Exp left, Exp right) {
			super(left, right);
		}
		
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}
	
	public static class Compare extends CompoundArithExp {
		public Compare(Exp fst) {
			super(fst);
		}

		public Compare(List<Exp> args) {
			super(args);
		}

		public Compare(Exp fst, List<Exp> rest) {
			super(fst, rest);
		}

		public Compare(Exp left, Exp right) {
			super(left, right);
		}
		
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public static class GiveExp extends CompoundArithExp {
		public GiveExp(Exp fst) {
			super(fst);
		}

		public GiveExp(List<Exp> args) {
			super(args);
		}

		public GiveExp(Exp fst, List<Exp> rest) {
			super(fst, rest);
		}

		public GiveExp(Exp left, Exp right) {
			super(left, right);
		}
		
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public static class GainExp extends CompoundArithExp {
		public GainExp(Exp fst) {
			super(fst);
		}

		public GainExp(List<Exp> args) {
			super(args);
		}

		public GainExp(Exp fst, List<Exp> rest) {
			super(fst, rest);
		}

		public GainExp(Exp left, Exp right) {
			super(left, right);
		}
		
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public static class IsExp extends Exp {
		String _name;
		Exp _value_exp; 
		
		public IsExp(String name, Exp value_exp) {
			_name = name;
			_value_exp = value_exp;
		}
		
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
		
		public String name() { return _name; }
		
		public Exp value_exp() { return _value_exp; }

	}

  public interface Visitor <T> {
    public T visit(AST.AddExp e, Env env);
	  public T visit(AST.UnitExp e, Env env);
	  public T visit(AST.NumExp e, Env env);
	  public T visit(AST.StrExp e, Env env);
	  public T visit(AST.BoolExp e, Env env);
	  public T visit(AST.DivExp e, Env env);
	  public T visit(AST.MultExp e, Env env);
	  public T visit(AST.Program p, Env env);
	  public T visit(AST.SubExp e, Env env);
	  public T visit(AST.RemExp e, Env env);
	  public T visit(AST.Compare e, Env env);
	  public T visit(AST.GiveExp e, Env env);
	  public T visit(AST.GainExp e, Env env);
	  public T visit(AST.IsExp e, Env env);
	  public T visit(AST.NullExp e, Env env);
  }
}
