grammar Test;

//script instrucao*
script: constante+ div (propriedade+ div)? instrucao+ EOF;

//estrutura do script
constante: capsID ASSIGN objeto ENTER;
propriedade: lowerID ASSIGN (capsID | dim | color) ENTER;
instrucao: (colorCommand | figure | estrutura) ENTER;
div: DIV ENTER;

//instrução
colorCommand: lowerID (color | capsID);
figure: lowerID fig shape;
estrutura: ifCommand | forloop;

//figura (circulo + quadrado | retangulo + elipse)
fig: expressao COMA expressao;
shape: expressao | dim;
//falta seq de pontos

//estrutura de controlo
ifCommand: IF condicao ENTER instrucao+ (elseCommand)? END;
elseCommand: ELSE ENTER instrucao+;
condicao: val1 CONDITION val2;
forloop: FOR lowerID IN interval ENTER instrucao* END;

//constante
objeto: (expressao | BOOLEAN | point2D | dim | interval | color ) ;
point2D: expressao COMA expressao;
dim: expressao TIL expressao;
interval: BRACKET expressao COMA expressao BRACKET;
color: cut | full;
cut: VERTICAL expressao VERTICAL;
full: expressao VERTICAL expressao VERTICAL expressao;

//aux
capsID: CAPS;
lowerID: LOWER;
expressao: INT | CAPS | LOWER | operacao+;
aux: INT | CAPS | LOWER;
operacao: aux OPERATOR aux | aux OPERATOR operacao |
aux OPERATOR OPEN operacao CLOSE | operacao OPERATOR OPEN operacao CLOSE |
OPEN operacao CLOSE OPERATOR operacao | OPEN operacao CLOSE OPERATOR aux;
val1: INT|operacao+;
val2: INT|BOOLEAN|operacao+;
//operacao: aux OPERATOR aux | aux OPERATOR operacao | OPEN | CLOSE;
//OPEN aux OPERATOR aux CLOSE OPERATOR operacao| OPEN aux OPERATOR operacao CLOSE OPERATOR operacao;

//lexer
IF: 'if';
ELSE: 'else';
FOR: 'for';
IN: 'in';
BOOLEAN: 'true' | 'false';
OPERATOR: '+' | '-' | '*' | '/' | '%';
CONDITION: '==' | '!=' | '<' | '>' | '<=' | '>=';
ASSIGN: ':';
DIV: '---';
TIL: '~';
COMA: ',';
BRACKET: '[' | ']';
VERTICAL: '|';
OPEN: '(';
CLOSE: ')';
END: '_';
INT: [0-9]+;
CAPS:[A-Z][A-Z0-9]*;
LOWER:[a-z][a-z0-9]*;
ENTER: '\r' | '\r\n' | '\n';
WS: ' '+ -> skip;