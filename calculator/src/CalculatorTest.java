import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;


public class CalculatorTest {

	@Test
	public void handleNumberMustPushNumber() {
		Stack<Expression> stack = new Stack<Expression>();
		assertTrue(Calculator.handleNumber("5", stack));
		assertEquals(new NumberExpression(5), stack.pop());
	}

	@Test
	public void handleNumberMustNotPushGarbage() {
		Stack<Expression> stack = new Stack<Expression>();
		assertFalse(Calculator.handleNumber("garbage", stack));
		assertTrue(stack.isEmpty());
	}

	@Test
	public void handleOperatorMustPerformOperation() {
		Stack<Expression> stack = new Stack<Expression>();
		stack.push(new NumberExpression(3));
		stack.push(new NumberExpression(4));
		assertTrue(Calculator.handleOperator("*", stack));
		assertEquals(
				new OperationExpression(
						Operator.MULTIPLY,
						new NumberExpression(3),
						new NumberExpression(4)),
				stack.pop());
	}

	@Test
	public void calculatorMustEvaluateExpressionCorrectly() {
		assertEquals(-4, Calculator.parse("1 2 3 + -").getValue());
	}

}
