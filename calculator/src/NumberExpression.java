public class NumberExpression implements Expression {
	private final int value;

	public NumberExpression(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
