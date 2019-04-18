package MyCompiler.htmltojava.astnode;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class VarDecl implements ASTNode {

	private String name;
	private String type;
	
	public VarDecl(String type, String name) {
		super();
		this.type = type.replace(">", "");
		this.type = (this.type).replace("<", "");
		this.name = name;
	}

	@Override
	public Object execute(Map<String, Object> varIntTable, Map<String, Object> varCharTable) {
		//valor default arbitrario na declaracao da variavel
		if(type.equals("int")){
			if(varIntTable.containsKey(name)){
				System.err.println("Variavel '"+name+"' declarada mais de uma vez.");
				System.exit(1);
			}
			varIntTable.put(name, new Object());
		} else if (type.equals("char")){
			if(varCharTable.containsKey(name)){
				System.err.println("Variavel '"+name+"' declarada mais de uma vez.");
				System.exit(1);
			}
			varCharTable.put(name, new Object());
		}
		try {
			File arquivo = new File("test/HTJAVA_GENERATED.java");
			FileWriter fw = new FileWriter(arquivo, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(type+" "+name+";");
			bw.newLine();
			bw.close();
			fw.close();
		} catch(IOException ex){};
		return null;
	}

}
