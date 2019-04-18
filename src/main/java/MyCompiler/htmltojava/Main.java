
package MyCompiler.htmltojava;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	private static final String EXTENSION = "hj";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

		System.out.println("Interpreting file " + program);

		htjavaLexer lexer = new htjavaLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		htjavaParser parser = new htjavaParser(tokens);

		htjavaParser.HtjavaContext tree = parser.htjava();

		htjavaCustomVisitor visitor = new htjavaCustomVisitor();
		visitor.visit(tree);

		System.out.println("Interpretation finished");

	}

}
