public class ProjectorBag {
	private String color;
	private double size;
	private String material;
	private boolean open;
	private Projector projector;

	public ProjectorBag(String color, double size, String material) {
		this.color = color;
		this.size = size;
		this.material = material;
	}

	public void open() {
		open = true;
	}

	public void close() {
		open = false;
	}

	public Projector removeProjector() {
		Projector projector = this.projector;
		this.projector = null;
		return projector;
	}

	public void insertProjector(Projector projector) {
		if (projector.isOn()) {
			throw new IllegalStateException();
		}
		this.projector = projector;
	}

	public String getColor() {
		return color;
	}

	public double getSize() {
		return size;
	}

	public String getMaterial() {
		return material;
	}

}
