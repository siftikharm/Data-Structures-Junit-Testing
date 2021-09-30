package array;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestArrayDeletion {
	
	private ArrayDeletion Arr1;
	private int [] inputValues = {Integer.MAX_VALUE , 0 , 2 , 100 , Integer.MIN_VALUE , 89 , 98 , -10};
	private int [] test = { 0 , 2, 100 , 89 , 98 , -10}; 

	@Before
	public void setUp() throws Exception {
		Arr1 = new ArrayDeletion();
	}

	
	@Test
	 public void testArrayDeletion() {
		

		ArrayDeletion.delete(inputValues , 4);
		ArrayDeletion.delete(inputValues , 0);
		
	
		for(int i = 0 ; i < test.length ; i++) {
			assertEquals(test[i] , inputValues[i]);
		}
		
	}
	
	@After
	public void tearDown() throws Exception {
	}



}
