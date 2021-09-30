package array;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class TestArray {
	
	private Array array;
	private int [] inputValues = {Integer.MAX_VALUE , 0 , 2 , 100 , Integer.MIN_VALUE , 89 , 98 , -10};
	private int [] sorted = {Integer.MIN_VALUE , -10 , 0 ,  2 ,89 , 98 , 100 , Integer.MAX_VALUE };
	private int [] test = { 0 , 2, 100 , 89 , 98 , -10}; 


	
	@BeforeEach
	public void setup() {
		array = new Array();
		
		for(int i = 0 ; i < inputValues.length ; i++) {
			Array.insert(inputValues[i] , i);
		}
	}
	
	@Test
	public void testInsertValuesInArray() {
		int [] inputs = new int[100];
		
		for(int i = 0 ; i < inputValues.length ; i++) {
			inputs[i] = inputValues[i];
		}
		
		assertArrayEquals("Arrays not Equal" , Array.array , inputs);
		assertEquals("Size not equal" , inputValues.length , Array.size , 0 );
	}
	
	
	@Test
	public void testInsertValuesInArrayNegative() {
		
		Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, new Executable() {
			int [] inputs = new int[200];
			public void execute() throws Throwable {
				for(int i = 0 ; i < inputs.length ; i++) {
					inputs[i] = i;
					Array.insert(inputs[i], i);
				}
				
				assertArrayEquals("Arrays not Equal" , Array.array , inputs);
				assertEquals("Size not equal" , inputs.length , Array.size , 0 );
			}
		});

	}
	
	@Test
	void testDeleteArrayElement() {

		Array.delete(4);
		Array.delete(0);

		for(int i  = 0 ; i< test.length ; i++)
			assertEquals(Array.array[i] , test[i]);
		
		assertEquals("Size not equal" , 6 , Array.size , 0 );
	}
	
	
	@Test
	void testLinearSearch() {
		assertTrue(Array.linearSearch(Integer.MAX_VALUE));
		assertTrue(Array.linearSearch(-10));
		assertFalse(Array.linearSearch(-50));
	}
	
	
	@Test
	void testBubbleSort() {
		Array.bubbleSort();
		for(int i = 0 ; i< sorted.length ; i++) {
			assertEquals(Array.array[i] , sorted[i]);
		}
	}

	
	@Test
	void testBinarySearch() {
		assertTrue(Array.binarySearch(Integer.MIN_VALUE , 0 , Array.size));
		assertTrue(Array.binarySearch(-10 , 0 , Array.size + 1));
		assertFalse(Array.binarySearch(-60 , 0 , Array.size + 1));
	}
	
	
	@AfterEach
	public void tearDown() {
	}
	
}
