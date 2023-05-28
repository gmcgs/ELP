grammar DrawGrammar;

INT: [0-9]+;
BOOL: 'true' | 'false';
PONTO2D: INT','INT;
DIMENSAO: INT'~'INT;
INTERVALO: ('[' | ']')INT', 'INT('[' | ']');
COR: (INT)?'|'INT'|'(INT)?;