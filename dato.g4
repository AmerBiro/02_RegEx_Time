grammar dato;

start   : d=Time EOF;

Time:  HOUR+ SEPERATE MINUTE;

HOUR: [0-1][0-9] | [2][0-3];
SEPERATE: ':';
MINUTE: ([0][1-9]) | [1-5][0-9];

WHITESPACES: [ \t\n]+ -> skip;
Comment: ('//' (~[\n])*) -> skip;
MULTICOMMENT: ('/*' (('*' ~[/] | ~[*])*) '*/') -> skip;


