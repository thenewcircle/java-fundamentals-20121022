public class ProjectorBag {
	String color;
	double size;
	String material;
	boolean open;
	Projector projector;

	void open() {
		open = true;
	}

	void close() {
		open = false;
	}

	Projector removeProjector() {
		Projector projector = this.projector;
		this.projector = null;
		return projector;
	}

	void insertProjector(Projector projector) {
		this.projector = projector;
	}
}
