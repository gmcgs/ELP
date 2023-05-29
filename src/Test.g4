grammar Test;

//script
script: constante* propriedade* instrucao*;

//constante
constante: identificador ':' value;



//propriedade '-'{2,}significa no mínimo 2 (--)
propriedade: '-'{2,} identificador ':' value '-'{2,};

//instrução
instrucao: ;

identificador:;
value: NUMBER | COLOR_LITERAL | DIMENSION_LITERAL;

NUMBER: [0-9]+;
COLOR_LITERAL: '|' [0-9]{1,3} '|';
DIMENSION_LITERAL: ;