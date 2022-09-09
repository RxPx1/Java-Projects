package debugging;

import static org.junit.Assert.*;

import org.junit.Test;

public class Squareunit {

	@Test
	public void test() {
		SomeTest obj1 = new SomeTest();
		int output_f = obj1.square(4);
		
		assertEquals(16, output_f);
	}

}
