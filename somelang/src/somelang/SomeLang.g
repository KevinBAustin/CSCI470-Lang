grammar SomeLang;

//parser rules
program returns [Program ast]
        locals [ArrayList<Exp> list]
        @init { $list = new ArrayList<Exp>(); }:

        (e=exp { $list.add($e.ast);})* { $ast = new Program($list); }
        ;

exp returns [Exp ast]: 
	is=isexp { $ast = $is.ast; }
        |str=strexp { $ast = $str.ast; }
	|a=addexp { $ast = $a.ast; }
        | s=subexp { $ast = $s.ast; }
        | m=multexp { $ast = $m.ast; }
        | d=divexp { $ast = $d.ast; }
        | r=remexp { $ast = $r.ast; }
        | comp=compare { $ast = $comp.ast; }
        | giv=give { $ast = $giv.ast; }
        | gai=gain { $ast = $gai.ast; }
        ;

numexp returns [NumExp ast]:
	n=Number { $ast = new NumExp($n.text); }
	;

strexp returns [StrExp ast] :
 	s=String { $ast = new StrExp($s.text); } 
 	;

isexp returns [IsExp ast]:
	l=ID 'is' r=exp { $ast = new IsExp($l.text, $r.ast); }
 	;

addexp returns [AddExp ast]
        locals [ArrayList<Exp> list]:
	l=addexp 'add' r=exp { 
                        $list = new ArrayList<Exp>();
			$list.add($l.ast);
			$list.add($r.ast);
			$ast = new AddExp($list);		 
	                   }
	|num=numexp { $ast = $num.ast; }
	;

subexp returns [SubExp ast]
        locals [ArrayList<Exp> list]:
	l=subexp 'sub' r=exp { 
                        $list = new ArrayList<Exp>();
			$list.add($l.ast);
			$list.add($r.ast);
			$ast = new SubExp($list);		 
	                   }
        |num=numexp { $ast = $num.ast; }
 	;

multexp returns [MultExp ast]
        locals [ArrayList<Exp> list]:
	l=multexp 'mult' r=exp { 
                        $list = new ArrayList<Exp>();
			$list.add($l.ast);
			$list.add($r.ast);
			$ast = new MultExp($list);		 
	                   }
        |num=numexp { $ast = $num.ast; }
 	;

divexp returns [DivExp ast]
        locals [ArrayList<Exp> list]:
	l=divexp 'div' r=exp { 
                        $list = new ArrayList<Exp>();
			$list.add($l.ast);
			$list.add($r.ast);
			$ast = new DivExp($list);		 
	                   }
        |num=numexp { $ast = $num.ast; }
 	;

remexp returns [RemExp ast]
	locals [ArrayList<Exp> list]:
	l=remexp 'rem' r=exp {
                        $list = new ArrayList<Exp>();
                        $list.add($l.ast);
                        $list.add($r.ast);
                        $ast = new RemExp($list);
                           }
        |num=numexp { $ast = $num.ast; }
	;

//loosely defined. subject to change
compare returns [Compare ast]
	locals [ArrayList<Exp> list]:
	'compare' l=exp 'to' r=exp (c=conditions{$ast = $c.ast;} ('repeat')* )+ {
			$list = new ArrayList<Exp>();
                        $list.add($l.ast);
                        $list.add($r.ast);
                        $ast = new Compare($list);
				   }
	;

conditions returns [Conditions ast]:
	'if less than' ilt = iltexp { $ast = $ilt.ast; }
	|'if greater than' igt = igtexp { $ast = $igt.ast; }
	|'if eless than' elt = eltexp { $ast = $elt.ast; }
	|'if egreater than' egt = egtexp { $ast = $egt.ast; }
	|'if equal' eq = eqexp { $ast = $eq.ast; }
	|'else' e=exp { $ast = $e.ast; }
	;

iltexp returns [Ilt ast]:
	e=exp { $ast = $e.ast; }
	;
igtexp returns [Igt ast]:
        e=exp { $ast = $e.ast; }
        ;
eltexp returns [Elt ast]:
        e=exp { $ast = $e.ast; }
        ;
egtexp returns [Egt ast]:
        e=exp { $ast = $e.ast; }
        ;
eqexp returns [Eq ast]:
        e=exp { $ast = $e.ast; }
        ;

//loosely defined. subject to change
give returns [Give ast]
	locals [ArrayList<Exp> list]:
	'give' id=ID {$ast = new Give($id.text);}
	|'give' e=exp {$ast = new Give($e.text);}
	;

//loosely defined. subject to change
gain returns [Gain ast]
	locals [ArrayList<Exp> list]:
	'gain' id=ID {$ast = new Gain($id.text);}
	;

//lexer rules
ID : [^0-9(),<-=.;$"][^(),<-=.;$"]*;

Number : [0-9]+
        | [0-9]+ '.' [0-9]+
        ;

String : '"'[^"]*'"';

// skip rules
WS  :  [ \t\r\n\u000C]+ -> skip;
Line_Comment :   '//' ~[\r\n]* -> skip;
