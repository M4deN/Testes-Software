package Pack1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilTest {

	@Test
	void testFatorialDeZero() {
		var util = new Util();
		var res = util.fatorial(0);
		assertEquals(1, res);
	}
	@Test
	void testFatorialDeTres() {
		var util = new Util();
		var res = util.fatorial(3);
		assertEquals(6, res);
		
	}
	
}
