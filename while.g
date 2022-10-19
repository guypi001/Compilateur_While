grammar while;

program	:	(function program*) 
		;
		
function	:	'function' SYMBOL ':' definition;

definition
	:	'read' input '%' commands '%' 'write' output;

input	:	inputSub?;

inputSub	:	VARIABLE (',' inputSub)*;

output	:	VARIABLE (',' output)*;

commands	:	(command ( ';' commands)*)  | 'nop';

command	:	(vars (':=' exprs)+) 
		| ('if' expression 'then' commands ('else' commands)? 'fi') 
		| ( 'while' expression 'do' commands 'od')
		| ('for' expression 'do' commands 'od')
		| 'foreach' VARIABLE 'in' expression 'do' commands 'od');
vars	:	VARIABLE (',' vars)*;
exprs	:	expression (',' exprs)*;
exprBase	:	'nil' 
		| VARIABLE 
		| SYMBOL
		| ( '(' ('cons'|'list'|'hd'|'tl'|SYMBOL) lExpr ')')
		;
expression
	:	exprBase ('=?' exprBase)*;
lExpr	:	exprBase lExpr*;


VARIABLE	:	'A'..'Z' ( 'A'..'Z' | 'a'..'z' | '0'..'9' )* ('!'|'?')?;
SYMBOL	:	'a'..'z' ( 'A'..'Z' | 'a'..'z' | '0'..'9' )* ('!'|'?')?;