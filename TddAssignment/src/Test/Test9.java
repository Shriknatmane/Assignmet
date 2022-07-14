package Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Code.Assignment9;
class Test9 {

	@Test
	void test() {
		assertEquals("This Green car",Assignment9.removespechar("This@Green$car-"));
	}

}