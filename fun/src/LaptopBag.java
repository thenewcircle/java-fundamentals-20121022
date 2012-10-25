public class LaptopBag implements Bag {

	private final double size;
	private boolean open;
	private String laptop;

	public LaptopBag(double size) {
		this.size = size;
	}

	public Color getColor() {
		return Color.BLACK;
	}

	public double getSize() {
		return size;
	}

	public String getMaterial() {
		return "nylon";
	}

	public boolean isOpen() {
		return open;
	}

	public void open() {
		this.open = true;
	}

	public void close() {
		this.open = false;
	}

	public String getLaptop() {
		return laptop;
	}

	public void setLaptop(String laptop) {
		this.laptop = laptop;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(size);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LaptopBag other = (LaptopBag) obj;
		if (Double.doubleToLongBits(size) != Double
				.doubleToLongBits(other.size))
			return false;
		return true;
	}

}
