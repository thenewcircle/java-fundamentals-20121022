public class Lens {
	private double zoom;
	private double focus;

	public Lens(double zoom, double focus) {
		this.zoom = zoom;
		this.focus = focus;
	}

	public double getZoom() {
		return zoom;
	}

	public void setZoom(double zoom) {
		this.zoom = zoom;
	}

	public double getFocus() {
		return focus;
	}

	public void setFocus(double focus) {
		this.focus = focus;
	}

}
