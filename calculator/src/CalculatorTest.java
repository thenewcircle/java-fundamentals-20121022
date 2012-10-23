import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;


public class CalculatorTest {

	@Test
	public void handleNumberMustPushNumber() {
		Stack<Integer> stack = new Stack<Integer>();
		assertTrue(Calculator.handleNumber("5", stack));
		assertEquals(5, (int) stack.pop());
	}

	@Test
	public void handleNumberMustNotPushGarbage() {
		Stack<Integer> stack = new Stack<Integer>();
		assertFalse(Calculator.handleNumber("garbage", stack));
		assertTrue(stack.isEmpty());
	}

	@Test
	public void handleOperatorMustPerformOperation() {
		// setup
		// do something
		// assert
	}
}
