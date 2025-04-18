package somelang;

import java.util.List;

import somelang.AST.Exp;

public class Printer {
/*	public void print(Value v) {
		if(v.tostring() != "")
			System.out.println(v.tostring());
	}
*/	public void print(Exception e) {
		System.out.println(e.toString());
	}
	
	public static class Formatter implements AST.Visitor<String> {
		public String visit(AST.BoolExp e, Env env) {
			if(e.v()) return "#t";
			return "#f";
		}		
		public String visit(AST.AddExp e, Env env){
			 return null;
		}
		public String visit(AST.NumExp e, Env env){
			return "" + e.v();
		}
          	public String visit(AST.StrExp e, Env env){
			return e.v();
		}
          	public String visit(AST.DivExp e, Env env){
			return null;
		}
          	public String visit(AST.MultExp e, Env env){
			return null;
		}
          	public String visit(AST.Program p, Env env){
			return (String) p.e().accept(this, env);
		}
          	public String visit(AST.SubExp e, Env env){
			return null;
		}
          	public String visit(AST.RemExp e, Env env){
			return null;
		}
		public String visit(AST.Give e, Env env){
			return null;
		}
          	public String visit(AST.Gain e, Env env){
			return null;
		}
          	public String visit(AST.IsExp e, Env env){
			return null;
		}
          	public String visit(AST.Ilt e, Env env){
			return null;
		}
          	public String visit(AST.Igt e, Env env){
			return null;
		}
          	public String visit(AST.Elt e, Env env){
			return null;
		}
          	public String visit(AST.Egt e, Env env){
			return null;
		}
          	public String visit(AST.Eq e, Env env){
			return null;
		}
	}
}
