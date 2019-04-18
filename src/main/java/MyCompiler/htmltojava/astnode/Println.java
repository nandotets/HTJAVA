package MyCompiler.htmltojava.astnode;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Println implements ASTNode {

	private ASTNode data;
	
	public Println(ASTNode data) {
		super();
		this.data = data;
	}

	@Override
	public Object execute(Map<String, Object> varIntTable, Map<String, Object> varCharTable) {
		try {
			File arquivo = new File("test/HTJAVA_GENERATED.java");
			FileWriter fw = new FileWriter(arquivo, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("System.out.println(\""+data.execute(varIntTable, varCharTable)+"\"");
			bw.newLine();
			bw.close();
			fw.close();
		} catch(IOException ex){
		};
		return null;
	}
}
