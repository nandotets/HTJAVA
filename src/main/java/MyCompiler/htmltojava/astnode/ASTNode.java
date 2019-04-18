package MyCompiler.htmltojava.astnode;

import java.util.Map;

public interface ASTNode {
	
	public Object execute(Map<String, Object> varIntTable, Map<String, Object> varCharTable);

}
