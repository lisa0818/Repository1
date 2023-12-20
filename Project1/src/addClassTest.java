import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addClassTest {
	
	@Test
	void testAdd()
	{
		addClass obj = new addClass();
		
		int expected = 7;
		int actual = obj.add(4,3);
		assertEquals(expected, actual);
	}
	
	

}
