public enum Day {
	SUNDAY {
		public String toString() {
			return "Sunday";
		}
	},
	MONDAY {
		public String toString() {
			return "Monday";
		}
	},
	TUESDAY {
		public String toString() {
			return "Tuesday";
		}
	},
	WEDNESDAY {
		public String toString() {
			return "Wednesday";
		}
	},
	THURSDAY {
		public String toString() {
			return "Thursday";
		}
	},
	FRIDAY {
		public String toString() {
			return "Friday";
		}
	},
	SATURDAY {
		public String toString() {
			return "Saturday";
		}
	};

	public abstract String toString();

}
