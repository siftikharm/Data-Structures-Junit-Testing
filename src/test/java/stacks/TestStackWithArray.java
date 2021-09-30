package stacks;

import static org.junit.Assert.*;

import java.util.concurrent.ThreadLocalRandom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestStackWithArray {

	private StackWithArray stack;
	private int[] test  = new int[100];;
	
	public int getRandom() {
		return ThreadLocalRandom.current().nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	@Before
	public void setUp() throws Exception {
		stack = new StackWithArray();
		for(int i = 0 ; i < test.length ; i++) {
			test[i] = getRandom();
			StackWithArray.push(test[i]);
		}

		StackWithArray.push(getRandom());
	}
	
	@Test
	public void testPush_Pop() {
		StackWithArray.display();
		for(int j = test.length - 1 ; j != -1 ; j--) {
			assertEquals(test[j] , StackWithArray.pop());
		}
		
		StackWithArray.pop();
	}


	@After
	public void tearDown() throws Exception {
	}


}
