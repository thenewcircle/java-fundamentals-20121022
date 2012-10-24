public class Projector {
	private boolean on;
	private Lens lens;

	public Projector(Lens lens) {
		this.lens = lens;
	}

	public void attachLens(Lens lens) {
		this.lens = lens;
	}

	public Lens removeLens() {
		Lens lens = this.lens;
		this.lens = null;
		return lens;
	}

	public boolean isOn() {
		return on;
	}

	public void switchOn() {
		if (lens == null) {
			throw new IllegalStateException();
		}
		on = true;
	}

	public void switchOff() {
		on = false;
	}
}
