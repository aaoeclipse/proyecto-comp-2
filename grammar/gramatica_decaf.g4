// foo terminal [a] cero o una a* cero o mas a+ uno o mas a |b a o b (a) agrupacion a*, cero o mas a
// separadas por coma
grammar gramatica_decaf;

ide: LETTER (LETTER | DIGIT)*;

num: DIGIT (DIGIT)*;

LETTER: [a-zA-Z];

DIGIT: [0-9];

program: 'class Program {' declaration* '}' EOF;
declaration:
	structDeclaration
	| varDeclaration
	| methodDeclaration;
varDeclaration: varType ide ';' | varType ide '[' num ']' ';';
structDeclaration: 'struct ' ide '{' (varDeclaration)* '}' ';';
varType:
	('int ' | 'char ' | 'boolean ' | 'struct ' ide)
	| structDeclaration
	| 'void ';
methodDeclaration: methodType ide '(' (parameter)* ')' block;
methodType: 'int' | 'char' | 'boolean' | 'void';
parameter: parameterType ide | parameterType ide '[' ']';
parameterType: 'int' | 'char' | 'boolean';
block: '{' (varDeclaration)* (statement)* '}';
statement:
	'if' '(' expression ')' block ('else' block)? 'while' '(' expression ')' block 'while' '('
		expression ')' block 'return' expression? ';' methodCall ';' block location '=' expression (
		expression
	)? ';';
location: (ide | ide '[' expression ']') ('.' location)?;
expression:
	location
	| methodCall
	| literal
	| expression op expression
	| '-' expression
	| '!' expression
	| '(' expression ')';
methodCall: ide '(' arg* ')';
arg: expression;
op: arith_op | rel_op | eq_op | cond_op;
arith_op: '+' | '-' | '*' | '/' | '%';
rel_op: '<' | '>' | '<=' | '>=';
eq_op: '==' | '!=';
cond_op: '&&' | '||';
literal: int_literal | char_literal | bool_literal;
int_literal: num;
char_literal: LETTER;
bool_literal: 'true' | 'false';
