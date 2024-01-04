import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClassATest {

	@Test
	void testAdd()
	
	{
		ClassA obj1 = new ClassA();
		int expected = 7;
		int actual = obj1.add(4,3);
	    assertEquals(expected, actual);
			
	}

	@Test
	void testMult()
	
	{
		ClassA obj1 = new ClassA();
		int expected = 24;
		int actual = obj1.mult(4,3,2);
	    assertEquals(expected, actual);
			
	}
	
	@Test
	void testDiv()
	
	{
		ClassA obj1 = new ClassA();
		int expected = 0;
		int actual = obj1.div(4,8);
	    assertEquals(expected, actual);
			
	}


}
