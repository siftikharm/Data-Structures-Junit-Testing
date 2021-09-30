package stacks;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMyStack {

	private Mystack stack;
	private int[] test  = new int[10];;
	
	
	public int getRandom() {
		return ThreadLocalRandom.current().nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	@Before
	public void setUp() throws Exception {

		stack = new Mystack(test.length);
		for(int i = 0 ; i < test.length ; i++) {
			test[i] = getRandom();
		}
		
		for(int i =0 ; i< test.length ; i++) {
			stack.push(test[i]);
		}
		
	}

	@Test(expected = Exception.class)
	public void testPush_top_pop() throws Exception {

		for(int j = test.length -1  ; stack.size() != -1 && j!= -1 ; j--) {
			assertEquals(test[j] , stack.top());
			assertEquals(test[j] , stack.pop());
		}
		stack.displayStack();
		stack.pop();
	}
	
	@Test(expected = Exception.class)
	public void testPush_push_top_Exceptions() throws Exception {
		stack.push(getRandom());
	}


	@After
	public void tearDown() throws Exception {
	}
}
