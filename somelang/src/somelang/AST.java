public interface AST {
	public static abstract class ASTNode implements AST {
		public abstract <T> T accept(Visitor<T> visitor, Env env);
	}


  public interface Visitor <T> {
    public T visit(AST., Env env);
  }
}
