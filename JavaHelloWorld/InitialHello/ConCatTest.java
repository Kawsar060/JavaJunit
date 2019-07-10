package InitialHello;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConCatTest {

	@Test
	public void ConCattest() {
		MyJUnitClass junit = new MyJUnitClass();
		String result = junit.Concat("Hello", "World");
		assertEquals("HelloWorlds", result);
	}

}
