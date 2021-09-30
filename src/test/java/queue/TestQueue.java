package queue;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestQueue {

	private Queue queue;
	private int [] test = {Integer.MAX_VALUE , 15 , -3 , 5 , 3 , Integer.MIN_VALUE , 89 , -200 , 600 , 0 ,  11 };

	@Before
	public void setUp() throws Exception {
		queue = new Queue(test.length);
		for(int i =0 ; i < test.length ; i++) {
			queue.enqueue(test[i]);
		}

	}

	@Test
	public void testEnqueueAndDeque() throws Exception {

		assertEquals(test.length , queue.size());
		
		for(int i =0 ; i < test.length ; i++) {
			assertEquals(test[i] , queue.dequeue());
		}
		
	}
	
	
	@Test(expected = Exception.class)
	public void testEnqueue() throws Exception {
		queue.enqueue(-1);
	}


	@After
	public void tearDown() throws Exception {
	}

}
