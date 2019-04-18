package MyCompiler.htmltojava.astnode;

import java.util.Map;

public class Text implements ASTNode {

	private Object value;
	
	public Text(Object value) {
		super();
		this.value = value;
	}

	@Override
	public Object execute(Map<String, Object> varIntTable, Map<String, Object> varCharTable) {
		return value;
	}

}
