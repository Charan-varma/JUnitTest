package JUnitTestingPackage;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		
		JUnitTesting junitString = new JUnitTesting();
		
		String result = junitString.addStrings("Software","Engineering");
		assertEquals("SoftwareEngineering", result);
		
	}

}
