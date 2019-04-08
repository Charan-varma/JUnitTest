package JUnitTestingPackage;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	void test() {
		
		JUnitTesting junit = new JUnitTesting();
		
		int result = junit.addNumbers(25,75);
		assertEquals(100, result);
		
	}

}
