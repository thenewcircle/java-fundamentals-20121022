import java.util.Stack;

public class Calculator {

	public static boolean handleNumber(String token, Stack<Integer> stack) {
		// try-catch to distinguish numbers from non-numbers
		try {
			int number = Integer.parseInt(token);
			// TODO: push number onto stack
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean handleOperator(String token, Stack<Integer> stack) {
		// valid operators are all one character in length
		if (token.length() != 1) {
			return false;
		}

		// switch to distinguish operators from garbage
		char operator = token.charAt(0);
		switch (operator) {
		case '+':
		case '-':
		case '*':
		case '/':
			// TODO: pop two numbers, perform the op, push the result
			return true;
		default:
			return false;
		}
	}

	/**
	 * Takes a postfix-notation expression and outputs its value.
	 * 
	 * @param args
	 *            the postfix-notation expression
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

		// construct a new integer stack
		Stack<Integer> stack = new Stack<Integer>();

		// iterate over the tokens
		for (String token : tokens) {
			if (!handleNumber(token, stack) && !handleOperator(token, stack)) {
				System.out.println(token + " is garbage");
			}
		}
	}

}
