public abstract class Bag {
	protected final double size;
	protected final Color color;
	protected boolean open;

	public Bag(double size, Color color) {
		this.size = size;
		this.color = color;
	}

	public double getSize() {
		return size;
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

	public Color getColor() {
		return color;
	}

	public abstract String getMaterial();
}
