import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class ShapeTest {

	@Test
	public void areaMustBeWidthTimesHeight() {
		Rectangle r = arbitraryRectangle();
		assertEquals(r.getWidth() * r.getHeight(), r.getArea());
	}

	private static Rectangle arbitraryRectangle() {
		Random random = new Random();
		if (random.nextBoolean()) {
			return new Rectangle(random.nextInt(50), random.nextInt(50));
		} else {
			return new Square(random.nextInt(50));
		}
	}

}
