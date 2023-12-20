import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiDivTest {

	@Test
	void test() 
	{
		MultiDiv obj1 = new MultiDiv();
		int expected = 25;
		int actual = obj1.mult(2,3,4);
		assertEquals(expected, actual);
	
	}

	@Test
	void test1()
	{
		MultiDiv obj1 = new MultiDiv();
		int expected = 4;
		int actual = obj1.div(5,10);
		assertEquals(expected, actual);
	}
}
