grammar XPath;

@header {
package main.antlr;
}

ap      : doc '/' rp      # ChildrenAP
        | doc '//' rp     # DescendantsAP
        ;

doc     : 'doc("' fileName '")'  # DocName
        ;

rp      : tagName               # TagNameRP
        | '*'                   # WildcardRP
        | '.'                   # SelfRP
        | '..'                  # ParentRP
        | 'text()'              # TextRP
        | '@' attName           # AttributeRP
        | '(' rp ')'            # ParenthesesRP
        | rp '/' rp             # ChildrenRP
        | rp '//' rp            # DescendantsRP
        | rp '[' f ']'          # FilteredRP
        | rp ',' rp             # ConcatRP
        ;

f       : rp                    # RpFilter
        | rp EQ rp              # EqualFilter
        | rp IS rp              # IsFilter
        | '(' f ')'             # ParenthesesFilter
        | rp '=' stringConstant # StringEqualFilter
        | f 'and' f             # AndFilter
        | f 'or' f              # OrFilter
        | 'not' f               # NotFilter
        ;

EQ      : '=' | 'eq';
IS      : '==' | 'is';

STRING    : [a-zA-Z0-9_-]+;
FILENAME    : [a-zA-Z0-9._]+;
fileName    : FILENAME;
tagName     : STRING;
attName     : STRING;
stringConstant  : ('"' STRING '"') | ('\'' STRING '\'');

WS      : [ \t\r\n]+ -> skip;