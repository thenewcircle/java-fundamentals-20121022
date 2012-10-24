import static org.junit.Assert.*;

import org.junit.Test;


public class FunTest {

	@Test
	public void test() {
		ProjectorBag bag = new ProjectorBag();
		bag.color = "Black";
		bag.size = 0.3;
		bag.material = "Nylon";
		bag.open = true;
		bag.projector = new Projector();

		System.out.println(bag.color);
		System.out.println(bag.size);
		System.out.println(bag.material);
		System.out.println(bag.open);
		System.out.println(bag.projector);
		
		Projector anotherProjector = bag.projector;
		System.out.println(anotherProjector);
	}

}
