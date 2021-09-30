package linkedLists;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestLinkedList {

	private LinkedList List;
	private int [] insert = {Integer.MIN_VALUE, 3, 5, -3, 15, Integer.MAX_VALUE} ;
	private int [] test = {Integer.MAX_VALUE , 15 , -3 , 5 , 3 , Integer.MIN_VALUE};
	
	@Before
	public void setUp() throws Exception {
		List = new LinkedList();	
	}

	@Test
	public void testPushFront() {
		for(int i = 0 ; i < test.length ; i++) {
			LinkedList.pushFront(insert[i]);
		}
		
		LinkedList.Node node = List.head;
		for(int i = 0 ; i < test.length && node.next != null ; i++ ) {
			assertEquals(test[i] , node.key);
			node = node.next;
		}
	
	}
	
	@Test
	public void testPushBackAndPopFront() {
		for(int i = 0 ; i < test.length ; i++) {
			LinkedList.pushBack(insert[i]);
		}
		
		LinkedList.Node node = List.head;
		for(int i = 0 ; i < test.length && node.next != null ; i++ ) {
			assertEquals(insert[i] , node.key);
			List.popFront();
			assertEquals(insert[i+1] , List.head.key);
			node = node.next;
		}
	
	}
	
	@Test
	public void testPopBack() {
		
		for(int i = 0 ; i < test.length ; i++) {
			LinkedList.pushFront(insert[i]);
		}

		LinkedList.Node node = List.head;
		
		while(node.next.next != null ) {
			node = node.next;
		}
		
		List.popBack();
		assertEquals(test[test.length - 2] , node.key);
		
		node = List.head;
		while(node.next.next != null ) {
			node = node.next;
		}
		
		List.pop(4);
		assertEquals(test[test.length - 3] , node.key);

	}
	
	@After
	public void tearDown() throws Exception {
	}


}
