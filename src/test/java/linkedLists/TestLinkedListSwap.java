package linkedLists;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestLinkedListSwap {

	private LinkedListSwap List;
	private int [] insert = {Integer.MIN_VALUE, 3, 5, -3, 15, Integer.MAX_VALUE} ;
	private int [] test = {Integer.MAX_VALUE , 15 , -3 , 5 , 3 , Integer.MIN_VALUE};
	
	@Before
	public void setUp() throws Exception {
		List = new LinkedListSwap();	
	}

	@Test
	public void testPushFront() {
		for(int i = 0 ; i < test.length ; i++) {
			LinkedListSwap.pushFront(insert[i]);
		}
		
		LinkedListSwap.Node node = List.head;
		for(int i = 0 ; i < test.length && node.next != null ; i++ ) {
			assertEquals(test[i] , node.key);
			node = node.next;
		}
	
	}
	
	@Test
	public void testPushBack() {
		for(int i = 0 ; i < test.length ; i++) {
			LinkedListSwap.pushBack(insert[i]);
		}
		
		LinkedListSwap.Node node = LinkedListSwap.head;
		for(int i = 0 ; i < test.length && node.next != null ; i++ ) {
			assertEquals(insert[i] , node.key);
			node = node.next;
		}
	
	}
	
	@Test
	public void testSwap() {
		
		for(int i = 0 ; i < test.length ; i++) {
			LinkedListSwap.pushFront(test[i]);
		}
		
		LinkedListSwap.swap();
		LinkedListSwap.Node node = LinkedListSwap.head;
		
		
		while(node.next != null ) {
			node = node.next;
		}

		assertEquals(test[0] , List.head.key);
		assertEquals(test[test.length - 1] , node.key);

	}

}
