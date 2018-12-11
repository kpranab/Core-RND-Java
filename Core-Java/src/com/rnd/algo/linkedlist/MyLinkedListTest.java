package com.rnd.algo.linkedlist;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class MyLinkedListTest {

	public static void main(String[] args) {
		
		MyLinkedList list = new MyLinkedList();
		
		int loopNode = 50;
		
		list.add(20);
		list.add(30);
		list.add(loopNode);
		list.add(10);
		list.add(40);

		//list.addLast(90);
		
		
		list.addLast(loopNode);
		list.addLast(30);
		list.addLast(20);
		
		System.out.println(list);
		
		System.out.println("Is loop exists : "+list.isLoopExists());
		
		System.out.println("Middle Element on the linked list : "+list.findMiddleNode());
		
		System.out.println("Nth Node from last of the Linked list : "+list.findNthNodeFromLast(4));
		
		System.out.println("Deleted First Node : "+list.delete());
		
		System.out.println("Deleted Last Node : "+list.deleteLast());
		
		System.out.println(list);
	}
}
