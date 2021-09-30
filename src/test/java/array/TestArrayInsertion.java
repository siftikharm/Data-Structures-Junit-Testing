package array;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestArrayInsertion {

	private ArrayInsertion Arr;
	private int [] inputValues = {Integer.MAX_VALUE , 0 , 2 , 100 , Integer.MIN_VALUE , 89 , 98 , -10};
	private int [] test = { 0 , 2, 100 , 89 , 98 , -10}; 
	
	@Before
	public void setUp() throws Exception {
		Arr = new ArrayInsertion();

	}

	@Test
	public void testArrayInsertion() {

		ArrayInsertion.insert(test , Integer.MAX_VALUE , 0 );
		ArrayInsertion.insert(test , Integer.MIN_VALUE , 4 );
		
		for(int i = 0 ; i < test.length ; i++) {
			assertEquals(test[i] , inputValues[i]);
		}
		
	}
	
	@After
	public void tearDown() throws Exception {
	}



}
