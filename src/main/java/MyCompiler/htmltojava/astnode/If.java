package MyCompiler.htmltojava.astnode;

import java.util.List;
import java.util.Map;

public class If implements ASTNode {

	private ASTNode condition;
	private List<ASTNode> body;
	private List<ASTNode> elseBody;
	
	public If(ASTNode condition, List<ASTNode> body, List<ASTNode> elseBody) {
		super();
		this.condition = condition;
		this.body = body;
		this.elseBody = elseBody;
	}

	@Override
	public Object execute(Map<String, Object> varIntTable, Map<String, Object> varCharTable) {
		if((boolean)condition.execute(varIntTable, varCharTable)){
			for(ASTNode n : body){
				n.execute(varIntTable, varCharTable);
			}
		}else{
			for(ASTNode n : elseBody){
				n.execute(varIntTable, varCharTable);
			}
		}
		return null;
	}
}
