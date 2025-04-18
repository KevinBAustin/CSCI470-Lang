package somelang;

import java.util.List;

import somelang.AST.Exp;

public interface Value {
    public String toString();
    public 
    static class NumVal implements Value {
		private double _val;
	    public NumVal(double v) { _val = v; } 
	    public double v() { return _val; }
	    public String toString() { 
	    	int tmp = (int) _val;
	    	if(tmp == _val) return "" + tmp;
	    	return "" + _val; 
	    }
	}

    static class StringVal implements Value{
        private java.lang.String _val;
	public StringVal(String v) { _val = v; }
        public String v() { return _val; }
        public java.lang.String tostring() { return "" + _val; }
    }

    static class BoolVal implements Value {
		private boolean _val;
	    public BoolVal(boolean v) { _val = v; }
	    public boolean v() { return _val; }
	    public String tostring() { if(_val) return "#t"; return "#f"; }
	}

    public static class Error implements Value {
        private String _msg;

        public Error(String msg) {
            _msg = msg;
        }

        public String msg() {
            return _msg;
        }

        public String toString() {
            return _msg;
        }
    }
}
