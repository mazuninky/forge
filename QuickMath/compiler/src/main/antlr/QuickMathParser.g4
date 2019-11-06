parser grammar QuickMathParser;

options { tokenVocab = QuickMathLexer; }

// SECTION: general

file
    : expression* EOF
    ;

expression
    : expression (PLUS|MINUS|MULT|DIV) expression
    | NumberLiteral
    | ID
;
