import static org.junit.Assert.*;

import org.junit.Test;

public class ShapeTest {

	@Test
	public void squaresMustRemainSquare() {
		Square s = new Square(10);
		s.setWidth(20);
		assertEquals(20, s.getHeight());
	}

}
