grammar AM;

program : program_structure ;
program_structure : head (declaration)? bod ;

head : PROGRAM IDENTIFIERS ;
declaration : VAR (dec SEMICOLON)* dec ;  
bod : BODY (block | stat) ;

dec : IDENTIFIERS (COMMA IDENTIFIERS)* COLON type ;
type : INT_TYPE | BOOL_TYPE | STRING_TYPE | ARRAY LB NUM RB OF type ;
block : BEGIN (((stat | block) SEMICOLON)* (stat | block))? END ; 

stat : assignment | input | output | ifel | loop | EXIT ;
assignment : expr ASSIGN expr ;
input : READ LP (expr COMMA)* expr RP ;
output : WRITE LP (expr COMMA)? expr RP ;
ifel : IF expr THEN (stat | block)(ELSE (stat | block))? ;
loop : WHILE expr DO (stat | block) ;

expr :  ((MIN | NOT) expr | LP expr RP)
	  | expr op=(MUL | DIV | MOD) expr
	  | expr op=(ADD | MIN | CONC) expr
	  | expr op=(EQUAL | NEQUAL | LESS | MORETHAN | LEOREQ | MOOREQ) expr 
	  | expr OR expr
	  | expr AND expr
	  | (TRUE | FALSE)
	  | IDENTIFIERS LB expr RB
	  | NUM
	  | STR
	  | IDENTIFIERS
	  ; 
		
PROGRAM : 'PROGRAM' ;
INT_TYPE : 'INTEGER' ;
BOOL_TYPE : 'BOOLEAN' ;
STRING_TYPE : 'STRING' ;
ARRAY : 'ARRAY' ;
OF : 'OF' ;
READ : 'READ' ;
WRITE : 'WRITE' ;
IF : 'IF' ;
THEN : 'THEN' ;
ELSE : 'ELSE' ;
WHILE : 'WHILE' ;
DO : 'DO' ;
EXIT : 'EXIT' ;
VAR : 'VAR' ;
BODY : 'BODY' ;
BEGIN : 'BEGIN' ;
END : 'END' ;
AND : 'AND' ;
OR : 'OR' ;
NOT : 'NOT' ;
TRUE : 'TRUE' ;
FALSE : 'FALSE' ;

IDENTIFIERS : [A-Za-z_][a-zA-Z_0-9]* ;

WHITESPACES : [ \t\r\n]+ -> skip ;
COMMENTS : '{' ~[\r\n]* '}' -> skip ;

STR : '"' CHARSET (~[\r\n] | '\\"')* '"' ;
NUM : [0-9]+ ;
CONSTANTS : NUM | (TRUE | FALSE) | STR ;

MUL : '*' ;
DIV : '/' ;
MOD : '%' ;
ADD : '+' ;
MIN : '-' ;
EQUAL : '=' ;
NEQUAL : '<>' ;
LESS : '<' ;
MORETHAN : '>' ;
LEOREQ : '<=' ;
MOOREQ : '>=' ;
CONC : '|' ;
ASSIGN : ':=' ;

LP : '(' ;
RP : ')' ;
LB : '[' ;
RB : ']' ;
SEMICOLON : ';' ;
COLON : ':' ; 
COMMA : ',' ;

CHARSET : . ;