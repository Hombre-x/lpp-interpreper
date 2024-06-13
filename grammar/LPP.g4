grammar LPP ;

// Initial set of rules
program : initializations principal EOF ;

initializations : register*
                  declarations
                  ( procedure | function )*
                ;

// Reserved words
PROCEDURE : 'procedimiento' ;
FUNCTION : 'funcion' ;
REGISTER : 'registro' ;
ENTONCES : 'entonces' ;
ESCRIBA : 'escriba' ;
RETURN : 'retorne' ;
ARREGLO : 'arreglo' ;
CADENA : 'cadena' ;
LLAMAR : 'llamar' ;
SI : 'si' ;
SINO : 'sino' ;
MIENTRAS : 'mientras' ;
HAGA : 'haga' ;
REPITA : 'repita' ;
HASTA : 'hasta' ;
PARA : 'para' ;
CASO : 'caso' ;
VAR : 'var' ;
LEA : 'lea' ;
DE : 'de' ;
BOOLEAN : 'verdadero' | 'falso' ;

// Tokens:
ID : [a-zA-Z_][a-zA-Z0-9_]* ;


WS      : [ \t\r\n]+ -> skip ;
COMMENT : ( '//' ~[\r\n]*
        | '/*' .*? '*/' ) -> skip ;
INTEGER : [0-9]+ ;
REAL    : [0-9]+ '.' [0-9]+ ;
STRING  : '"' ~["]* '"' ;
CHAR    : '\'' ~['] '\'' ;

// Operators
TKN_ASSIGN : '<-' ;
TKN_COMMA : ',' ;
TKN_COLON : ':' ;
TKN_PERIOD : '.' ;


// =================================

// Declarations
declarations : declaration*;
declaration  : type ids ;

// ids : id | id TKN_COMMA ids ;
ids : ID (TKN_COMMA ID)* ;
//ids_p : TKN_COMMA ids | ;

// Types
type   : 'entero' | 'real' | 'booleano' | 'caracter' | string | array | register_type;
function_type : 'entero' | 'real' | 'booleano' | 'caracter' | string | ID ;
string : CADENA  '[' INTEGER ']' ;
array  : ARREGLO '[' array_dimenstion ']' DE type ;

array_dimenstion   : INTEGER array_dimenstion_p ;
array_dimenstion_p : TKN_COMMA array_dimenstion | ;
// params : param | param TKN_COMMA params ;
params   : param (TKN_COMMA param)* ;
//params_p : TKN_COMMA params | ;
param    : type ID
         | VAR type ID ;

// Procedures
procedures : procedure procedures | ;

// procedure  : PROCEDURE ID '(' params ')' declarations principal
//            | PROCEDURE ID declarations principal ;
procedure   : PROCEDURE ID ('(' params ')')? declarations statements ;
//procedure_p : '(' params ')' declarations statements
//            | declarations statements ;


// Functions
functions : function functions | ;
function : FUNCTION ID ('(' params ')')? (TKN_COLON function_type)? declarations function_body ;
function_body : 'inicio' actions (RETURN expr)? 'fin' ;
//         | FUNCTION ID TKN_COLON type declarations function_body
//         | FUNCTION ID '(' params ')' declarations statements ;

//function   : FUNCTION ID function_p ;
//// function_p : '(' params ')' TKN_COLON type defunction_clarations function_body
////            | '(' params ')' declarations statements
////            | TKN_COLON type declarations function_body ;
//function_p : '(' params ')' function_p2
//           | TKN_COLON function_type declarations function_body ;
//
//function_p2 : declarations function_body
//            | TKN_COLON function_type declarations function_body ;
//
//
//function_body   : 'inicio' actions function_body_p ;
//function_body_p : RETURN expr 'fin'
//                | 'fin' ;


// Registers
registers : register registers | ;
register  : REGISTER register_type register_attribute* 'fin registro' ;
register_attribute : type ID ;
register_type : ID ;


// =================================

//  Princial algorithm
principal  : statements ;

statements : 'inicio' actions 'fin' ;

// Define the actions
actions : action* ;

// Action
action : escriba
       | lea
       | llamar
       | assignment
       | if_statement
       | switch_statement
       | ciclo_mientras
       | ciclo_repita
       | ciclo_para ;

// Escriba action
escriba : ESCRIBA function_params ;

// Lea action
lea : LEA ids ;

// Llamar action
llamar   : LLAMAR llamar_p ;
llamar_p : ID function_params?
         | 'nueva_linea' ;



// Assignment

// assignment   : ID TKN_ASSIGN expr
//              | ID TKN_PERIOD register_attribute TKN_ASSIGN expr ;

assignment   : variable_access '<-' expr ;



// If statement

// if_statement : SI condition 'entonces' actions 'fin si'
//              | SI condition 'entonces' actions SINO actions 'fin si' ;

if_statement   : SI expr ENTONCES actions if_statement_p ;
if_statement_p : (SINO actions)? 'fin si' ;

// Switch statements

// switch_statement : CASO ID switch_values 'fin caso'
//                  | CASO ID switch_values SINO actions 'fin caso' ;

switch_statement   : CASO ID switch_values switch_statement_p ;
switch_statement_p : (SINO TKN_COLON actions)? 'fin caso' ;

switch_values     : (switch_value)* ;
switch_value      : values TKN_COLON actions ;
values            : value (TKN_COMMA value)* ;
value             : INTEGER | REAL | BOOLEAN | CHAR | STRING ;

//values            : INTEGER values_p
//                  | REAL values_p
//                  | BOOLEAN values_p
//                  | CHAR values_p
//                  | STRING values_p ;
//
//values_p          : TKN_COMMA values | ;// TODO: Breaks STRING recognition in <escriba>

// Ciclo mientras
ciclo_mientras : MIENTRAS expr HAGA actions 'fin mientras' ;

// Ciclo repita
ciclo_repita : REPITA actions HASTA expr ;

// Ciclo para
ciclo_para : PARA ID TKN_ASSIGN expr HASTA expr HAGA actions 'fin para' ;


// =================================




// Expressions

// expr : logical_or ;
// logical_or : logical_or 'o' logical_and | logical_and ;
// logical_and : logical_and 'y' equality | equality ;
// equality : equality equality_ops comparison | comparison ;
// equality_ops : '=' | '<>' ;
// comparison : comparison comparison_ops addition | addition ;
// comparison_ops : '<' | '>' | '<=' | '>=' ;
// addition : addition addops multiplication | multiplication ;
// addops : '+' | '-' ;
// multiplication : multiplication mulops exponentiation | exponentiation ;
// mulops : '*' | '/' | 'div' | 'mod' ;
// exponentiation   : unary '^' exponentiation | unary ;
// unary : '-' primary | primary ;
// unary_ops : '-' | '!' ;
// primary : ID | NUMBER | '(' expr ')' ;

expr             : logical_or ;

logical_or       : logical_and ('o' logical_and)* ;
//logical_or_p     : ('o' logical_and)* ;

logical_and      : equality ('y' equality)* ;
//logical_and_p    : ('y' equality)* ;
//logical_and_p    : 'y' equality logical_and_p | ;

equality         : comparison (equality_ops comparison)* ;
//equality_p       : (equality_ops comparison)* ;
//equality_p       : equality_ops comparison equality_p | ;
equality_ops     : '=' | '<>' ;

comparison       : addition (comparison_ops addition)* ;
//comparison_p     : comparison_ops addition comparison_p | ;
comparison_ops   : '<' | '>' | '<=' | '>=' ;

addition         : multiplication (add_ops multiplication)* ;
//addition_p       : add_ops multiplication addition_p | ;
add_ops          : '-' | '+' ;

multiplication   : exponentiation (mul_ops exponentiation)* ;
//multiplication_p : mul_ops exponentiation multiplication_p | ;
mul_ops          : '*' | '/' | 'div' | 'mod' ;

exponentiation   : unary (exponentiation_ops exponentiation)* ;
exponentiation_ops : '^' ;

unary            : primary | unary_ops primary ;
unary_ops        : '-' ;

primary          : INTEGER          #PRIMARY_INTEGER
                 | REAL             #PRIMARY_REAL
                 | BOOLEAN          #PRIMARY_BOOLEAN
                 | STRING           #PRIMARY_STRING
                 | CHAR             #PRIMARY_CHAR
                 | '(' expr ')'     #PRIMARY_EXPR
                 | variable_access  #PRIMARY_VARIABLE_ACCESS
                 ;

// primary_p        : ID  // Variables and cero function calls
//                  | ID '(' function_params ')' // Function calls with params
//                  | ID TKN_PERIOD ID // Register attributes
//                  | ID '[' expr ']' // Array accesss
//                  ;



variable_access   : ID variable_access_p ;
variable_access_p : function_params           // Function calls with params
                  | register_access           // Register attributes
                  | array_accesses            // Array accesss
                  |                           // Identifiers
                  ;

register_access : (TKN_PERIOD ID)+ ;

array_accesses : array_access+ ;
array_access   : '[' expr_params ']' ; // [1, 2, 3 + 5, 3][2]

function_params : '(' expr_params? ')'
                | expr_params
                ;

expr_params  : expr (TKN_COMMA expr)* ;

