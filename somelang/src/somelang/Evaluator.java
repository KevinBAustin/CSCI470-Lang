package somelang;

import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

import static somelang.AST.*;
import static somelang.Value.*;
import somelang.Env.*;

public class Evaluator implements AST.Visitor<Value> {


	@Override
	public Value visit(BoolExp e, Env env) {
		return new BoolVal(e.v());
	}

	@Override
    	public Value visit(Program p, Env env) {
		return (Value) p.e().accept(this, env);
	}

	Value valueOf(Program p, Env env) {
		// Value of a program in this language is the value of the expression
		return (Value) p.accept(this, env);
	}
	
	@Override
	public Value visit(AddExp e, Env env) {
		List<Exp> operands = e.all();
		double result = 0;
		for(Exp exp: operands) {
			NumVal intermediate = (NumVal) exp.accept(this, env); // Dynamic type-checking
			result += intermediate.v(); //Semantics of AddExp in terms of the target language.
		}
		return new NumVal(result);
	}

	@Override
	public Value visit(DivExp e, Env env) {
		List<Exp> operands = e.all();
		NumVal lVal = (NumVal) operands.get(0).accept(this, env);
		double result = lVal.v(); 
		for(int i=1; i<operands.size(); i++) {
			NumVal rVal = (NumVal) operands.get(i).accept(this, env);
			result = result / rVal.v();
		}
		return new NumVal(result);
	}

	@Override
	public Value visit(RemExp e, Env env) {
		List<Exp> operands = e.all();
		NumVal lVal = (NumVal) operands.get(0).accept(this, env);
		double result = lVal.v(); 
		for(int i=1; i<operands.size(); i++) {
			NumVal rVal = (NumVal) operands.get(i).accept(this, env);
			result = result % rVal.v();
		}
		return new NumVal(result);
	}

	@Override
	public Value visit(MultExp e, Env env) {
		List<Exp> operands = e.all();
		double result = 1;
		for(Exp exp: operands) {
			NumVal intermediate = (NumVal) exp.accept(this, env); // Dynamic type-checking
			result *= intermediate.v(); //Semantics of MultExp.
		}
		return new NumVal(result);
	}

  @Override
	public Value visit(SubExp e, Env env) {
		List<Exp> operands = e.all();
		NumVal lVal = (NumVal) operands.get(0).accept(this, env);
		double result = lVal.v();
		for(int i=1; i<operands.size(); i++) {
			NumVal rVal = (NumVal) operands.get(i).accept(this, env);
			result = result - rVal.v();
		}
		return new NumVal(result);
	}

	@Override
	public Value visit(IsExp e, Env env) { // New for definelang.
		String name = e.name();
		Exp value_exp = e.value_exp();
		Value value = (Value) value_exp.accept(this, env);
		return null;		
	}

	@Override
    	public Value visit(StrExp e, Env env) {
        	return new StringVal(e.v());
    	}

	@Override
	public Value visit(AST.NumExp e, Env env) {
        	return new NumVal(e.v());
    	}

	/*Comp/Give/Gain Evaluations*/
/*
	public Value visit(Compare e, Env env){
		
	}
*/
	
	public Value visit(Ilt e, Env env){
		Value.NumVal first = (Value.NumVal) e.first_exp().accept(this, env);
		Value.NumVal second = (Value.NumVal) e.second_exp().accept(this, env);
		Value.BoolVal condition = new Value.BoolVal(first.v() < second.v());
		if(condition.v())
			return (Value) e.then_exp().accept(this, env);
		else return (Value) e.else_exp().accept(this, env);
	}

	public Value visit(Igt e, Env env){
		Value.NumVal first = (Value.NumVal) e.first_exp().accept(this, env);
                Value.NumVal second = (Value.NumVal) e.second_exp().accept(this, env);
                Value.BoolVal condition = new Value.BoolVal(first.v() > second.v());

                if(condition.v())
                        return (Value) e.then_exp().accept(this, env);
                else return (Value) e.else_exp().accept(this, env);
        }
	
	public Value visit(Elt e, Env env){
		Value.NumVal first = (Value.NumVal) e.first_exp().accept(this, env);
                Value.NumVal second = (Value.NumVal) e.second_exp().accept(this, env);
                Value.BoolVal condition = new Value.BoolVal(first.v() <= second.v());

                if(condition.v())
                        return (Value) e.then_exp().accept(this, env);
                else return (Value) e.else_exp().accept(this, env);
        }
	
	public Value visit(Egt e, Env env){
		Value.NumVal first = (Value.NumVal) e.first_exp().accept(this, env);
                Value.NumVal second = (Value.NumVal) e.second_exp().accept(this, env);
                Value.BoolVal condition = new Value.BoolVal(first.v() >= second.v());

                if(condition.v())
                        return (Value) e.then_exp().accept(this, env);
                else return (Value) e.else_exp().accept(this, env);
        }
	
	public Value visit(Eq e, Env env){
		Value.NumVal first = (Value.NumVal) e.first_exp().accept(this, env);
                Value.NumVal second = (Value.NumVal) e.second_exp().accept(this, env);
                Value.BoolVal condition = new Value.BoolVal(first.v() == second.v());

                if(condition.v())
                        return (Value) e.then_exp().accept(this, env);
                else return (Value) e.else_exp().accept(this, env);
        }


	public Value visit(Give e, Env env) {
		Value exp = e.exp().accept(this, env);
		System.out.println(exp);
		return exp;
	}

	public Value visit(Gain e, Env env) {
		String name = e.name();
                Exp value_exp = e.value_exp();
                Value value = (Value) value_exp.accept(this, env);
                return null;
	}

}
