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
	|num=numexp { $ast = $num.ast; }
	|str=string { $ast = $str.ast; }
	;

isexp returns [IsExp ast]:
	l=ID 'is' r=exp { $ast = new IsExp($l.text, $r.ast); }
 	;

action returns [Action ast]:
	a=addexp { $ast = $a.ast; }
        | s=subexp { $ast = $s.ast; }
        | m=multexp { $ast = $m.ast; }
        | d=divexp { $ast = $d.ast; }
	| comp=compexp { $ast = $comp.ast; }
	| give=giveexp { $ast = $give.ast; }
	| gain=gainexp { $ast = $gain.ast; }
	| doe=doexp { $ast = $doe.ast; }
	;

addexp returns [AddExp ast]:
        locals [ArrayList<Exp> list]:
	l=exp 'add' r=exp { 
                        $list = new ArrayList<Exp>();
			$list.add($l.ast);
			$list.add($r.ast);
			$ast = new AddExp($list);		 
	                   }
 		;

subexp returns [SubExp ast]:
        locals [ArrayList<Exp> list]:
	l=exp 'sub' r=exp { 
                        $list = new ArrayList<Exp>();
			$list.add($l.ast);
			$list.add($r.ast);
			$ast = new SubExp($list);		 
	                   }
 		;

multexp returns [MultExp ast]:
        locals [ArrayList<Exp> list]:
	l=exp 'mult' r=exp { 
                        $list = new ArrayList<Exp>();
			$list.add($l.ast);
			$list.add($r.ast);
			$ast = new MultExp($list);		 
	                   }
 		;

divexp returns [DivExp ast]:
        locals [ArrayList<Exp> list]:
	l=exp 'div' r=exp { 
                        $list = new ArrayList<Exp>();
			$list.add($l.ast);
			$list.add($r.ast);
			$ast = new DivExp($list);		 
	                   }
 		;

