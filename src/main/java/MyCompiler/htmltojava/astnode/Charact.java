package MyCompiler.htmltojava.astnode;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Charact implements ASTNode {

	private Object value;
	
	public Charact(Object value) {
		super();
		this.value = value;
	}

	@Override
	public Object execute(Map<String, Object> varIntTable, Map<String, Object> varCharTable) {
		try {
			File arquivo = new File("test/HTJAVA_GENERATED.java");
			FileWriter fw = new FileWriter(arquivo, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(value.toString()+" ");
			bw.close();
			fw.close();
		} catch(IOException ex){};
		return value;
	}

}
