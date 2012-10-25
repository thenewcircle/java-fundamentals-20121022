public class OperationExpression implements Expression {
	private final Operator op;
	private final Expression lhs, rhs;

	public OperationExpression(Operator op, Expression lhs, Expression rhs) {
		this.op = op;
		this.lhs = lhs;
		this.rhs = rhs;
	}

	public int getValue() {
		return op.operate(lhs.getValue(), rhs.getValue());
	}
}
