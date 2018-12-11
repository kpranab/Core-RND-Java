package com.rnd.algo.linkedlist;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class MyLinkedListTest {

	public static void main(String[] args) {
		
		MyLinkedList list = new MyLinkedList();

		list.add(20);
		list.add(30);
		list.add(10);
		list.add(40);

		list.addLast(90);

		System.out.println(list);
	}
}
