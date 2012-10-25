public class ProjectorBag implements Bag {
	private final Color color;
	private final double size;
	private final String material;
	private boolean open;
	private Projector projector;

	public ProjectorBag(Color color, double size, String material) {
		this.color = color;
		this.size = size;
		this.material = material;
	}

	public boolean isOpen() {
		return open;
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

	public Color getColor() {
		return color;
	}

	public double getSize() {
		return size;
	}

	public String getMaterial() {
		return material;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result
				+ ((material == null) ? 0 : material.hashCode());
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
		ProjectorBag other = (ProjectorBag) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (Double.doubleToLongBits(size) != Double
				.doubleToLongBits(other.size))
			return false;
		return true;
	}

}
