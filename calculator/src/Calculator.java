
public class Calculator {

	/**
	 * Takes a postfix-notation expression and outputs its value.
	 * @param args the postfix-notation expression
	 */
	public static void main(String[] args) {

		// make sure we have exactly one command-line argument
		if (args.length != 1) {
			System.err.println("usage: Calculator <expression>");
			return;
		}

		// get the command-line argument from the array
		String expression = args[0];

		// split the expression into individual tokens
		String[] tokens = expression.split(" ");

		// iterate over the tokens
		for (String token : tokens) {
			System.out.println(token);
			// TODO: do something interesting here!
		}
	}

}
