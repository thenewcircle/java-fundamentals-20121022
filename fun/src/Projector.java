public class Projector extends Device {
	Lens lens;

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
}
