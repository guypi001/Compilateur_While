grammar while;

options { 
  output=AST; 
}

tokens{
	DEF;
	FOR;
	WHILE;
	FOREACH;
	FONC;
	READ_WRITE;
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

program	:	
		function program*
		;
		
function	:	
		'function' SYMBOL ':' definition -> ^(FONC SYMBOL definition)
		;
	

definition
	:	
		'read' input '%' commands '%' 'write' output ->  ^(READ_WRITE input commands output)
		;

input	:	
		inputSub?
		;

inputSub	:	
		VARIABLE (','  VARIABLE)* -> ^(VAR VARIABLE+ )
		;

output	:	
		VARIABLE (',' VARIABLE)*-> ^(VAR VARIABLE+ )
		;

commands	:	
		(command ( ';' command)*)  -> ^(COMM command+ )
		| 'nop' -> ^( NIL )
		;

command	:	
		(vars (':=' exprs)+) ->
		| ('if' expression 'then' commands ('else' commands)? 'fi')  ->  ^(IF ^(THEN expression )  ^(ELSE commands?))
		| ( 'while' expression 'do' commands 'od') -> ^(WHILE expression ^(DO commands))
		| ('for' expression 'do' commands 'od') ->  ^(FOR expression  ^( DO commands))
		| ('foreach' VARIABLE 'in' expression 'do' commands 'od') -> ^(FOREACH VARIABLE  ^(IN  expression) ^(DO commands ))
		;
vars	:	
		VARIABLE (','^ vars)* -> ^(VAR VARIABLE+ )
		;
exprs	:	
		expression (','^ exprs)* -> ^(VAR VARIABLE+ )
		;
exprBase	:	
		'nil' -> ^(NIL)
		| VARIABLE -> ^(VAR VARIABLE ) 
		| SYMBOL -> ^(SYM SYMBOL )
		| ( '(' ('cons'|'list'|'hd'|'tl'|SYMBOL) lExpr ')') -> ^(BASE lExpr )
		;
expression
	:	
		exprBase ('=?' exprBase)* -> ^('=?' exprBase+ )
		;
lExpr	:	
		exprBase+
		;


VARIABLE	:	'A'..'Z' ( 'A'..'Z' | 'a'..'z' | '0'..'9' )* ('!'|'?')?;
SYMBOL	:	'a'..'z' ( 'A'..'Z' | 'a'..'z' | '0'..'9' )* ('!'|'?')?;



