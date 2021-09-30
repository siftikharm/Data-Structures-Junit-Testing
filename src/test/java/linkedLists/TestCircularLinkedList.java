package linkedLists;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestCircularLinkedList {

	private CircularLinkedList List;
	private int [] insert = {Integer.MIN_VALUE, 3, 5, -3, 15, Integer.MAX_VALUE} ;
	private int [] test = {Integer.MAX_VALUE , 15 , -3 , 5 , 3 , Integer.MIN_VALUE};
	
	
	@BeforeEach
	void setup() {
		List = new CircularLinkedList();	
	}
	
	@Test
	public void testPushFront() {
		for(int i = 0 ; i < test.length ; i++) {
			CircularLinkedList.pushFront(insert[i]);
		}
		
		CircularLinkedList.Node node = List.head;
		for(int i = 0 ; i < test.length && node.next != List.head ; i++ ) {
			assertEquals(test[i] , node.key);
			node = node.next;
		}
	
	}
	
	@Test
	public void testPushBackAndPopFront() {
		for(int i = 0 ; i < test.length ; i++) {
			CircularLinkedList.pushBack(insert[i]);
		}
		
		CircularLinkedList.Node node = List.head;
		for(int i = 0 ; i < test.length && node.next != List.head ; i++ ) {
			assertEquals(insert[i] , node.key);
			List.popFront();
			assertEquals(insert[i+1] , List.head.key);
			node = node.next;
		}
	
	}
	
	@Test
	public void testPopBack() {
		
		for(int i = 0 ; i < test.length ; i++) {
			CircularLinkedList.pushFront(insert[i]);
		}

		CircularLinkedList.Node node = List.head;
		
		while(node.next.next != List.head ) {
			node = node.next;
		}
		
		List.popBack();
		assertEquals(test[test.length - 2] , node.key);

	}
		
	
	@AfterEach
	void tearDown() {
		
	}

}
