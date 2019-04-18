package MyCompiler.htmltojava.astnode;

import java.util.Map;

public class Multiplication implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
		
	public Multiplication(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	@Override
	public Object execute(Map<String, Object> varIntTable, Map<String, Object> varCharTable) {
		return (int)operand1.execute(varIntTable, varCharTable) * (int)operand2.execute(varIntTable, varCharTable);
	}
}
