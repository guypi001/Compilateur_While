grammar while;



options { 
  output=AST; 
}

program	:	
		function program*
		;
		
function	:	
		'function' SYMBOL ':' definition -> definition
		;

definition
	:	
		'read' input '%' commands '%' 'write' output -> input commands output
		;

input	:	
		inputSub?
		;

inputSub	:	
		VARIABLE (','^ inputSub)*
		;

output	:	
		VARIABLE (','^ output)*
		;

commands	:	
		(command ( ';'^ commands)*)  
		| 'nop'
		;

command	:	
		(vars (':='^ exprs)+) 
		| ('if' expression 'then' commands ('else' commands)? 'fi')  ->  expression commands+
		| ( 'while' expression 'do' commands 'od') -> expression commands
		| ('for' expression 'do' commands 'od') ->  expression  ^( 'for' commands)
		| ('foreach' VARIABLE 'in' expression 'do' commands 'od') -> expression  ^( 'foreach' commands)
		;
vars	:	
		VARIABLE (','^ vars)*
		;
exprs	:	
		expression (','^ exprs)*
		;
exprBase	:	
		'nil' 
		| VARIABLE 
		| SYMBOL
		| ( '(' ('cons'|'list'|'hd'|'tl'|SYMBOL) lExpr ')') -> lExpr
		;
expression
	:	
		exprBase ('=?'^ exprBase)*
		;
lExpr	:	
		exprBase lExpr*
		;


VARIABLE	:	'A'..'Z' ( 'A'..'Z' | 'a'..'z' | '0'..'9' )* ('!'|'?')?;
SYMBOL	:	'a'..'z' ( 'A'..'Z' | 'a'..'z' | '0'..'9' )* ('!'|'?')?;