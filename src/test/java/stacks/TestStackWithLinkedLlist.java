package stacks;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.ThreadLocalRandom;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStackWithLinkedLlist {


	private StackWithLinkedlist stack;
	private int[] test  = new int[10];;
	
	public int getRandom() {
		return ThreadLocalRandom.current().nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	@BeforeEach
	public void setUp() throws Exception {
		stack = new StackWithLinkedlist();
		for(int i = 0 ; i < test.length ; i++) {
			test[i] = getRandom();
			StackWithLinkedlist.push(test[i]);
		}
		

	}
	
	@Test
	public void testPush_Pop() {
		StackWithLinkedlist.display();
		for(int j = test.length - 1 ; j != -1 ; j--) {
			assertEquals(test[j] , StackWithLinkedlist.top());
			assertEquals(test[j] , StackWithLinkedlist.pop());
		}
		
	}


	@AfterEach
	public void tearDown() throws Exception {
	}


}
