public abstract class Bag<T> {
	protected final double size;
	protected final Color color;
	protected boolean open;
	protected T contents;

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

	public void insertContents(T contents) {
//		if (contents.isOn()) {
//			throw new IllegalStateException();
//		}
		this.contents = contents;
	}

	public T removeContents() {
		T contents = this.contents;
		this.contents = null;
		return contents;
	}

	public abstract String getMaterial();
}
