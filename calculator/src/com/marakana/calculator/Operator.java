package com.marakana.calculator;

public enum Operator {
	ADD {
		public int operate(int lhs, int rhs) {
			return lhs + rhs;
		}
	},
	SUBTRACT {
		public int operate(int lhs, int rhs) {
			return lhs - rhs;
		}
	},
	MULTIPLY {
		public int operate(int lhs, int rhs) {
			return lhs * rhs;
		}
	},
	DIVIDE {
		public int operate(int lhs, int rhs) {
			return lhs / rhs;
		}
	};
	public abstract int operate(int lhs, int rhs);
}
