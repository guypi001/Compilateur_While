grammar projet;

options {
output=AST;
}
tokens{
	DEF;
	FOR;
	WHILE;
	FOREACH;
	FONC;
	READWRITE;
	INPUT;
	OUTPUT;
	IF;
	THEN;
	ELSE;
	DO;
	IN;
	VAR;
	COMM;
	NIL;
	BASE;
	SYM;
}

program : 
		function program?;
function: 
		'function' symb ':' definition
		-> ^(FONC symb definition)
		;
definition
		: 'read' inputSub? '%' commands '%' 'write' output 
		->   ^(READWRITE  ^(INPUT inputSub?) commands ^(OUTPUT output))
		;
input 	:	 
		inputSub |;
inputSub
		: vari (',' inputSub)?
		-> ^(VAR vari+ );
output : 
		vari (',' output)?
		-> ^(VAR vari+ );
commands: 
		command (';' commands)?
		-> ^(COMM command+ );
command : 
		'nop' -> ^( NIL )
		 | vars ':=' exprs-> ^(':=' vars exprs)
		  |
		'foreach' vari 'in' expression 'do' commands 'od' -> ^(FOREACH vari  ^(IN  expression) ^(DO commands ))|
		'if' expression 'then' commands ('else' commands)? 'fi' ->  ^(IF ^(THEN expression )  ^(ELSE commands?))|
		'while' expression 'do' commands 'od' -> ^(WHILE expression ^(DO commands))|
		'for' expression 'do' commands 'od'->  ^(FOR expression  ^( DO commands));
vars :
		 vari (',' vars)? -> ^(VAR vari+ );
exprs : 
		expression (',' exprs)?;
exprBase: 
		'nil' -> ^(NIL)
		| vari -> ^(VAR vari )
		| symb -> ^(SYM symb )|
		'(' 'cons' lExpr ')' -> ^(BASE lExpr )
		| '(' 'list' lExpr ')' -> ^(BASE lExpr )
		|
		'(' 'hd' exprBase ')' -> ^(BASE exprBase )
		| '(' 'tl' exprBase ')'-> ^(BASE  exprBase)|
		('(' symb exprBase? ')') -> ^(BASE symb exprBase? )
		;
expression
		: exprBase ('=?' exprBase)?
		//-> ^('=?' exprBase+ )
		;
lExpr : 
		exprBase*;
		
symb	:	Symbol;

vari	:	Variable;

Variable
		: 'A'..'Z' ('A'..'Z'|'a'..'z'|'0'..'9')*('!'|'?') ?;
Symbol : 
		'a'..'z' ('A'..'Z'|'a'..'z'|'0'..'9')*('!'|'?') ?;
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
start : program;



