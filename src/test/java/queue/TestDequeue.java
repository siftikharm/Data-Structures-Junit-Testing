package queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestDequeue {

	private Dequeue Queue;
	private int [] test = {Integer.MAX_VALUE , 15 , -3 , 5 , 3 , Integer.MIN_VALUE , 89 , -200 , 600 , 0 ,  11 };

	
	@BeforeEach
	void setup() {
		Queue = new Dequeue(test.length);
	}

	@Test
	void testAddLeftRight() {
		for(int i = 0 , j = Queue.capacity - 1 ; i <= test.length/2 && j > i  ; i++ , j--) {
			Queue.addLeft(test[i]);
			assertEquals(test[i] , Queue.array[Queue.rightPointer]);	
			Queue.addRight(test[j]);
			assertEquals(test[j] , Queue.array[Queue.leftPointer]);	
		}
	}
	

	
	@AfterEach
	void tearDown() {
		
	}

}
