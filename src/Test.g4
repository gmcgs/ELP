grammar Test;

//script instrucao*
script: constante* propriedade* ;

//constante
constante: identificador ':' value;
identificador: VAL;
VAL:[A-Z][A-Z0-9]*;
value: NUMBER | COLOR_LITERAL+ ;


//propriedade '-'{2,}significa no mínimo 2 (--)
propriedade: '-'* identif ':' valor '-'*;
identif: SVAL;
SVAL:[a-z][a-z0-9]*;
valor: identificador|(identificador binaryOperator identificador)*;
binaryOperator: '+' | '-' | '*' | '/' | '%' | '=';

//instrução
instrucao: ;



//| DIMENSION_LITERAL

//não há limite de 3 valores para a cor
COLOR_LITERAL: '|' [0-9]+ '|';

NUMBER: [0-9]+;

//DIMENSION_LITERAL: ;

WS: [ \t\r\n]+ -> skip;