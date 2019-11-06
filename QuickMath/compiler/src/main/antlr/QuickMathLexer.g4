lexer grammar QuickMathLexer;

WHITESPACE : ' ' -> skip ;

// SECTION: key words

//FUN: 'fun';
//RET: 'ret';
VAR: 'var';
VAL: 'val';

// SECTION: operations

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';

// SECTION: literals

ID
    :  Letter (Letter|DecDigit)*
    ;

NullLiteral
    : 'null'
    ;

NumberLiteral
    : IntegerLiteral
    |  DecDigit? '.' DecDigit+
    ;

IntegerLiteral
    : '0'
    | DecDigitNoZero DecDigit*
    ;

DoubleLiteral
    : DecDigit? '.' DecDigit+
    ;

fragment DecDigit
    : '0'..'9'
    ;

fragment DecDigitNoZero
    : '1'..'9'
    ;

fragment Letter
    : 'a'..'z'
    | 'A'..'Z'
    ;
