public class Projector {
	boolean on;
	Lens lens;

	void attachLens(Lens lens) {
		this.lens = lens;
	}

	Lens removeLens() {
		Lens lens = this.lens;
		this.lens = null;
		return lens;
	}

	void switchOn() {
		on = true;
	}

	void switchOff() {
		on = false;
	}
}
