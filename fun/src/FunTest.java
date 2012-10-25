import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class FunTest {

	@Test
	public void test() {
		// projector needs a lens
		Lens l = new Lens(1.0, 1.0);

		// attach lens to projector
		Projector p = new Projector(l);

		// insert projector in bag
		ProjectorBag b = new ProjectorBag(Color.BLACK, 1.0, "nylon");
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
		Lens l = new Lens(1.0, 1.0);

		// attach lens to projector
		Projector p = new Projector(l);

		// turn projector on, and insert in bag
		p.switchOn();
		ProjectorBag b = new ProjectorBag(Color.BLACK, 1.0, "nylon");
		b.insertProjector(p);
	}

	@Test
	public void equalLaptopBagsMustBeStructurallyEqual() {
		LaptopBag b1 = new LaptopBag(1.0);
		LaptopBag b2 = new LaptopBag(1.0);
		assertEquals(b1, b2);
	}
	
	
	public void openSomeBags() {
		Bag[] bags = { new LaptopBag(1.0), new LaptopBag(2.0),
				new ProjectorBag(Color.BLUE, 1.0, "nylon"),
				new ProjectorBag(Color.BLACK, 0.1, "corduroy"), new LaptopBag(3.0) };
		openBlackBags(bags);
	}

	public void openBlackBags(Bag[] bags) {
		for (Bag bag : bags) {
			if (bag.getColor().equals(Color.BLACK)) {
				bag.open();
			}
		}
	}

}
