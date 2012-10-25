import java.util.Stack;

public class Calculator {

	public static boolean handleNumber(String token, Stack<Expression> stack) {
		// try-catch to distinguish numbers from non-numbers
		try {
			int number = Integer.parseInt(token);
			stack.push(new NumberExpression(number));
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean handleOperator(String token, Stack<Expression> stack) {
		// valid operators are all one character in length
		if (token.length() != 1) {
			return false;
		}

		// switch to distinguish operators from garbage
		Operator operator;
		switch (token.charAt(0)) {
		case '+':
			operator = Operator.ADD;
			break;
		case '-':
			operator = Operator.SUBTRACT;
			break;
		case '*':
			operator = Operator.MULTIPLY;
			break;
		case '/':
			operator = Operator.DIVIDE;
			break;
		default:
			return false;
		}

		// pop two numbers off the stack and push the result
		Expression rhs = stack.pop(), lhs = stack.pop();
		stack.push(new OperationExpression(operator, lhs, rhs));
		return true;
	}

	public static Expression parse(String expression) {

		// split the expression into individual tokens
		String[] tokens = expression.split(" ");

		// construct a new expression stack
		Stack<Expression> stack = new Stack<Expression>();

		// iterate over the tokens
		for (String token : tokens) {
			if (!handleOperator(token, stack) && !handleNumber(token, stack)) {
				System.out.println(token + " is garbage");
			}
		}

		// return the result from the stack
		return stack.pop();
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

		// print the result of calculate
		Expression tree = parse(expression);
		
		int result = tree.getValue();
		System.out.println(result);
	}

}
