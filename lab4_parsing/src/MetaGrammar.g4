/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar MetaGrammar;

@header {
    import java.util.*;
}

@members {
    final List<LexerRule> lexerRules = new ArrayList<LexerRule>();
    final List<ParserRule> parserRules = new ArrayList<ParserRule>();
    final List<ParserRule.RuleElement> currentVariant = new ArrayList<ParserRule.RuleElement>();
    CodeSection fields;
    String mainRule;

}


fullGrammar  : node_section? OPEN_BRACKETS LEXER_RULES_PART CLOSE_BRACKETS lexerRules OPEN_BRACKETS GRAMMAR_RULES_PART EQUALS main_rule CLOSE_BRACKETS grammarRules;
node_section : (OPEN_BRACKETS NODE_RULES_PART CLOSE_BRACKETS CODE {fields = new CodeSection($CODE.text);});
main_rule    : NODE {
                    mainRule = $NODE.text;
                    final ParserRule parserRule = new ParserRule("MAIN");
                    parserRule.addVariant(Arrays.asList(new ParserRule.RuleElement($NODE.text), new ParserRule.RuleElement("END")));
                    parserRules.add(parserRule);
               };
lexerRules   : (lexerRule SEMI)*;
lexerRule    : NODE ARROW string {lexerRules.add(new LexerRule($NODE.text, $string.text));};
grammarRules : (grammarRule SEMI)*;
grammarRule  : NODE {
                final ParserRule parserRule = new ParserRule($NODE.text);
               }
               ARROW? code? singleRule code? {
                parserRule.addVariant(new ArrayList<ParserRule.RuleElement>(currentVariant));
                currentVariant.clear();
               }
               (OR code? singleRule code? {
                parserRule.addVariant(new ArrayList<ParserRule.RuleElement>(currentVariant));
                currentVariant.clear();
               })* {parserRules.add(parserRule);} ;
code         :  CODE {System.out.println("CODE! " + $CODE.text); currentVariant.add(new ParserRule.RuleElement(new CodeSection($CODE.text)));};
singleRule   : ((NODE {currentVariant.add(new ParserRule.RuleElement($NODE.text));})+ | EPSILON {currentVariant.add(new ParserRule.RuleElement($EPSILON.text));});
string       : STRING_LITERAL;
      

NODE_RULES_PART    : 'NODE';
LEXER_RULES_PART   : 'LEXER';
GRAMMAR_RULES_PART : 'GRAMMAR';
fragment OPEN_CODE          : '{%';
fragment CLOSE_CODE         : '%}';
CODE               : OPEN_CODE .*? CLOSE_CODE;
EQUALS             : '=';
OPEN_BRACKETS      : '[';
CLOSE_BRACKETS     : ']';
SEMI               : ';';
OR                 : '|';
ARROW              : ':';
EPSILON            : 'EPS';
NODE               : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'\'')*;
fragment QUOTE              : '\'';
WS : (' ' | '\t' | '\n' | '\r')+
     -> channel(HIDDEN)
   ;
STRING_LITERAL     : QUOTE ('\\\'' | ~('\''))+ QUOTE;
 
