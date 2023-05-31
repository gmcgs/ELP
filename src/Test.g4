grammar Test;

//script instrucao*
script: constante* '-''-'+ propriedade* '-'+ instrucao*;

//constante
constante: identificador ':' value;
value: NUMBER | COLOR_LITERAL+ ;

//propriedade falta no mínimo 2 (--)
propriedade: identif ':' valor;

valor:VAL|first+'~'first+ ;

//instrução
instrucao: colorCommand | loopCommand | drawCommand | ifCommand;

colorCommand: 'color' identificador;

//while?
loopCommand:'for' identif 'in' '[' name',' name ('['|']') algo* '-';

drawCommand:VAL;

algo: loopCommand| ifCommand | elseifCommand |elseCommand | statement;

ifCommand: 'if' if+ condition if+;
elseifCommand:'else-if' if+ condition if+;
elseCommand:'else';
statement: 'fill' identificador;

square: 'square'figure+ ',' figure+;
rectangule: 'rectangle' figure+ ',' figure+ '~' figure+ ;
circle:;
elipse:;
seq:;


first:name binaryOperator|name ;
identificador: VAL;
identif: SVAL;
name:VAL|NUMBER;
if:cond binaryOperator|cond|binaryOperator cond|parenteses ;
figure:cond binaryOperator|cond;
cond:SVAL|VAL|NUMBER ;
parenteses: '('|')';
binaryOperator: '+' | '-' | '*' | '/' | '%'  ;
condition: '<'|'>'|'=' ;
SVAL:[a-z][a-z0-9]*;
//não há limite de 3 valores para a cor
COLOR_LITERAL: '|' [0-9]+ '|';
VAL:[A-Z][A-Z0-9]*;
NUMBER: [0-9]+;



//DIMENSION_LITERAL: ;

WS: [ \t\r\n]+ -> skip;