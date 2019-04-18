grammar htjava;

@parser::header{
	import java.util.Map;
	import java.util.HashMap;
	import java.util.ArrayList;
	import java.io.File;
	import java.io.FileWriter;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import MyCompiler.htmltojava.astnode.*;
}
@parser::members{
	Map<String, Object> varIntTable = new HashMap<String, Object>();
	Map<String, Object> varCharTable = new HashMap<String, Object>();
}

htjava: HTJAVA_INI
	{
		ArrayList<ASTNode> body = new ArrayList<>();
		Map<String, Object> varIntTable = new HashMap<String, Object>();
		Map<String, Object> varCharTable = new HashMap<String, Object>();
		try{
			File arquivo = new File("test/HTJAVA_GENERATED.java");
			FileWriter fw = new FileWriter(arquivo);
			BufferedWriter bw = new BufferedWriter(fw);	arquivo.createNewFile();
			bw.write("//-- Codigo gerado por HTJAVA --");
			bw.newLine();
			bw.write("//-- by: Fernando T.D.Shinohara --");
			bw.newLine();
			bw.close();
			fw.close();
		} catch (IOException ex){}
		
	}(sentence {body.add($sentence.node);
	})* HTJAVA_END {
		for(ASTNode n : body){
			n.execute(varIntTable, varCharTable);
		}
	};

sentence returns [ASTNode node]: 
	println {$node=$println.node;} 
	| conditional {$node=$conditional.node;}
	| var_decl {$node=$var_decl.node;}
	| var_assign {$node=$var_assign.node;}
; 


println returns [ASTNode node]: PRINT_INI expression PRINT_END
	{$node = new Println($expression.node);}
	;

conditional returns [ASTNode node]: 
	IF_INI expression
	{
		List<ASTNode> body = new ArrayList<ASTNode>();
	}
	(s1=sentence {body.add($s1.node);})* IF_END
	ELSE_INI
	{
		List<ASTNode> elseBody = new ArrayList<ASTNode>();
	}
	(s2=sentence{elseBody.add($s2.node);})* ELSE_END
	{
		$node = new If($expression.node, body, elseBody);
	}
	; 
	
var_decl returns [ASTNode node]:
	VAR_INI VAR_TYPE ID VAR_END {
		$node = new VarDecl($VAR_TYPE.text, $ID.text);
	}
;

var_assign returns [ASTNode node]:
	VAR_ASSIGN_INI ID VAR_ASSIGN_END expression VAR_END {
		$node = new VarAssign($ID.text, $expression.node);
	}
;

expression returns [ASTNode node]:
	t1=factor{$node = $t1.node;} 
	(PLUS t2=factor{$node = new Addition($node, $t2.node);})*;

factor returns [ASTNode node]:
	t1=term{$node = $t1.node;} 
	(MULT t2=term{$node = new Multiplication($node, $t2.node);})*;

term returns [ASTNode node]:
	NUMBER {$node = new Constant(Integer.parseInt($NUMBER.text));}
	| CHAR {$node = new Charact($CHAR.text);}
	| BOOLEAN {$node = new Constant(Boolean.parseBoolean($BOOLEAN.text));}
	| ID {$node = new VarRef($ID.text);}
	| TEXTT {$node = new Text($TEXTT.text);}
	;
	
HTJAVA_INI: '<htjava>';
HTJAVA_END: '</htjava>';
VAR_ASSIGN_INI: '<var';
VAR_ASSIGN_END: '>';
VAR_INI: '<var>';
VAR_TYPE: '<int>' | '<char>';
VAR_END: '</var>';
PRINT_INI: '<print>';
PRINT_END: '</print>';


IF_INI: '<if>';
IF_END: '</if>';
ELSE_INI: '<else>';
ELSE_END: '</else>';
OPERATORS: '+' | '-' | '*' | '/';

PAR_OPEN: '(';
PAR_CLOSE: ')';
ASP_S: '\'';
ASP_D: '\"';

BOOLEAN: 'true' | 'false';

CHAR: ASP_S [a-zA-Z_0-9] ASP_S;
TEXTT: ASP_D [a-zA-Z_0-9]* ASP_D;
ID: [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER: [0-9]+;
WS: [ \n\t\r]+ -> skip;