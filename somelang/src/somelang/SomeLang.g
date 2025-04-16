grammar SomeLang;

//parser rules
program returns [Program ast]
        locals [ArrayList<Exp> list]
        @init { $list = new ArrayList<Exp>(); }:

        (e=exp { $list.add($e.ast);})* { $ast = new Program($list); }
        ;

exp returns [Exp ast]: 
    	s=statement { $ast = $s.ast; }*
	;

statement returns [Statement ast]:
	is=isexp { $ast = $is.ast; }
	|act=action { $ast = $act.ast; }
	|num=Number { $ast = $num.ast; }
	|str=String { $ast = $str.ast; }
	;

isexp returns [IsExp ast]:
	l=ID 'is' r=exp { $ast = new IsExp($l.text, $r.ast); }
 	;

action returns [Action ast]:
	a=addexp { $ast = $a.ast; }
        | s=subexp { $ast = $s.ast; }
        | m=multexp { $ast = $m.ast; }
        | d=divexp { $ast = $d.ast; }
	| r=remexp { $ast = $r.ast; }
	| comp=compare { $ast = $comp.ast; }
	| give=giveexp { $ast = $give.ast; }
	| gain=gainexp { $ast = $gain.ast; }
	;

addexp returns [AddExp ast]
        locals [ArrayList<Exp> list]:
	l=exp 'add' r=exp { 
                        $list = new ArrayList<Exp>();
			$list.add($l.ast);
			$list.add($r.ast);
			$ast = new AddExp($list);		 
	                   }
	;

subexp returns [SubExp ast]
        locals [ArrayList<Exp> list]:
	l=exp 'sub' r=exp { 
                        $list = new ArrayList<Exp>();
			$list.add($l.ast);
			$list.add($r.ast);
			$ast = new SubExp($list);		 
	                   }
 	;

multexp returns [MultExp ast]
        locals [ArrayList<Exp> list]:
	l=exp 'mult' r=exp { 
                        $list = new ArrayList<Exp>();
			$list.add($l.ast);
			$list.add($r.ast);
			$ast = new MultExp($list);		 
	                   }
 	;

divexp returns [DivExp ast]
        locals [ArrayList<Exp> list]:
	l=exp 'div' r=exp { 
                        $list = new ArrayList<Exp>();
			$list.add($l.ast);
			$list.add($r.ast);
			$ast = new DivExp($list);		 
	                   }
 	;

remexp returns [RemExp ast]
	locals [ArrayList<Exp> list]:
	l=exp 'rem' r=exp {
                        $list = new ArrayList<Exp>();
                        $list.add($l.ast);
                        $list.add($r.ast);
                        $ast = new RemExp($list);
                           }
	;

//loosely defined. subject to change
compare returns [Compare ast]:
	'compare' l=exp 'to' r=exp {
			$list = new ArrayList<Exp>();
                        $list.add($l.ast);
                        $list.add($r.ast);
                        $ast = new Compare($list);
				   }
	;

//loosely defined. subject to change
give returns [Give ast]:
	'give' id=ID {
		      $list = new ArrayList<Exp>();
                      $list.add($id.ast);
                      $ast = new Give($list); 
		     }
	|'give' e=exp {
                      $list = new ArrayList<Exp>();
                      $list.add($e.ast);
                      $ast = new Give($list);
                     }
	;

//loosely defined. subject to change
gain returns [Gain ast]:
	'gain' id=ID{
		     $list = new ArrayList<Exp>();
		     $list.add($id.ast);
		     $ast = new Gain($list);
	    	    }
	|'gain' e=exp {
                      $list = new ArrayList<Exp>();
                      $list.add($e.ast);
                      $ast = new Give($list);
                     }
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
