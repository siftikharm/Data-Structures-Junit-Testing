package linkedLists;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import linkedLists.Linkedlist1;
import linkedLists.CircularLinkedList.Node;

class TestLinkedList1 {
	
	private Linkedlist1 List;
	private int [] insert = {Integer.MIN_VALUE, 3, 5, -3, 15, Integer.MAX_VALUE} ;
	private int [] test = {Integer.MAX_VALUE , 15 , -3 , 5 , 3 , Integer.MIN_VALUE};
	
	
	private void clearList(Linkedlist1 list) {
		
		Linkedlist1 node = new Linkedlist1(); 
		node = list.headPointer;
		while(list.tailPointer != null ) {
			node.headPointer = null;
			node.tailPointer = null;
			node.data = 0;
			node = node.nextPointer;
		}
		
	}

	
	@BeforeEach
	void setUp() throws Exception {
		List = new Linkedlist1();	

	}


	@Test
	public void testPushFront_topBack_topFront() throws Exception {
		for(int i = 0 ; i < test.length ; i++) {
			List.pushFront(insert[i]);
		}
		
		Linkedlist1 node = new Linkedlist1();
		node = List.headPointer;
		for(int i = 0 ; i < test.length && node != List.tailPointer ; i++ ) {
			assertEquals(test[i] , node.data );
			node = node.nextPointer;
		}
		
		assertEquals(test[0] , List.topFront());
		assertEquals(test[test.length - 1] , List.topBack());
		
	}
	
	@Test
	public void testPushBackAndPopFront() throws Exception {
		clearList(List);	
	
		for(int i = 0 ; i < insert.length ; i++) {
			List.pushBack(insert[i]);
		}
		
		Linkedlist1 node1 =  new Linkedlist1();
		node1 = List.headPointer;
		
		for(int i = 0 ; i < insert.length && node1 != List.tailPointer ; i++ ) {
			assertEquals(insert[i] , node1.data );
			List.popFront();
			assertEquals(insert[i+1] , List.headPointer.data);
			node1 = node1.nextPointer;
		}
	
	}
		
	
	@AfterEach
	void tearDown() throws Exception {
	}



}
