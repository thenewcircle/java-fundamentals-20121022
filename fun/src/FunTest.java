import static org.junit.Assert.*;

import org.junit.Test;


public class FunTest {

	@Test
	public void test() {
		// projector needs a lens
		Lens l = new Lens();

		// attach lens to projector
		Projector p = new Projector();
		p.attachLens(l);

		// insert projector in bag
		ProjectorBag b = new ProjectorBag();
		b.insertProjector(p);

		// undo all that hard work
		Projector p2 = b.removeProjector();
		Lens l2 = p2.removeLens();

		// we should get back the same objects we put in!
		assertSame(p2, p);
		assertSame(l2, l);
	}

	@Test(expected = IllegalStateException.class)
	public void insertingProjectorThatIsOnShouldThrowIllegalStateException() {
		// projector needs a lens
		Lens l = new Lens();

		// attach lens to projector
		Projector p = new Projector();
		p.attachLens(l);

		// turn projector on, and insert in bag
		p.switchOn();
		ProjectorBag b = new ProjectorBag();
		b.insertProjector(p);
	}

}
