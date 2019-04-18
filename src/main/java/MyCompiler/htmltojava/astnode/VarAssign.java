package MyCompiler.htmltojava.astnode;

import java.util.Map;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class VarAssign implements ASTNode {

	private String name;
	private ASTNode expression;

	public VarAssign(String name, ASTNode expression) {
		super();
		this.name = name;
		this.expression = expression;
	}

	@Override
	public Object execute(Map<String, Object> varIntTable, Map<String, Object> varCharTable) {
		if(varIntTable.containsKey(name)){
			varIntTable.put(name, expression.execute(varIntTable, varCharTable));
		} else if(varCharTable.containsKey(name)){
			varCharTable.put(name, expression.execute(varIntTable, varCharTable));
		}
		try {
			File arquivo = new File("test/HTJAVA_GENERATED.java");
			FileWriter fw = new FileWriter(arquivo, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(name+" = "+expression.execute(varIntTable, varCharTable)+";");
			bw.newLine();
			bw.close();
			fw.close();
		} catch(IOException ex){
		};
		return null;
	}

}
