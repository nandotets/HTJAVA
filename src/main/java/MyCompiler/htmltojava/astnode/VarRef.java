package MyCompiler.htmltojava.astnode;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class VarRef implements ASTNode {

	private String name;
	
	public VarRef(String name) {
		super();
		this.name = name;
	}

	@Override
	public Object execute(Map<String, Object> varIntTable, Map<String, Object> varCharTable) {
		if(varIntTable.containsKey(name)){
			try {
				File arquivo = new File("test/HTJAVA_GENERATED.java");
				FileWriter fw = new FileWriter(arquivo, true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(varIntTable.get(name).toString()+" ");
				bw.close();
				fw.close();
			} catch(IOException ex){};
			return varIntTable.get(name);
		} else if(varCharTable.containsKey(name)){
			try {
				File arquivo = new File("test/HTJAVA_GENERATED.java");
				FileWriter fw = new FileWriter(arquivo, true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(varCharTable.get(name).toString()+" ");
				bw.close();
				fw.close();
			} catch(IOException ex){};
			return varCharTable.get(name);
		}
		System.err.println("Variável '"+name+"' não declarada.");
		System.exit(1);
		return null;
	}

}
