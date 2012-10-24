public class LaptopBag implements Bag {

	private final double size;
	private boolean open;
	private String laptop;

	public LaptopBag(double size) {
		this.size = size;
	}

	public String getColor() {
		return "black";
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

}
