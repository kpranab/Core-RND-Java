package com.rnd.algo.linkedlist;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class MyLinkedList {

	//Create class Node with next and data, And initialize data with constructor and point next to learn
	class Node{
		int data;
		Node next;
		Node(int element){
			this.data = element;
			next = null;
		}
	}
	
	//Declare a head
	private Node head;
	
	/**
	 * @return true/false
	 * if head is null then list is empty
	 */
	public boolean isEmpty(){
		return (head == null);
	}
	
	
	/**
	 * @return size of the list
	 * Assign head to a temp node 
	 * Iterate the node till null 
	 * Increment the count
	 */
	public int size() {
		Node sizeNode = head;
		int count = 0;
		while(sizeNode!= null) {
			++count;
			sizeNode = sizeNode.next;
		}
		return count;
	}
	
	
	/**
	 * @param element add at the starting of the Node
	 */
	public void add(int element) {
		Node newNode = new Node(element);//Create new node
		newNode.next = head;//Assign head to the next node 
		head = newNode;//Assign new node to the head
	}
	
	/**
	 * @param element at the last of the Node
	 */
	public void addLast(int element) {
		Node current = head;//Assign head to the current node 
		while(current.next != null) {//Iterate till the last node
			current =  current.next;
		}
		Node newNode = new Node(element);//create new node
		current.next = newNode;//Assign new node to the last
	}
	
	public void display() {
		Node tempNode = head;
		while(tempNode != null) {
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}
	}
	
	@Override
	public String toString() {
		Node tempNode = head;
		StringBuilder result = new StringBuilder("[");
		while(tempNode != null) {
			result.append(String.valueOf(tempNode.data)+", ");
			tempNode = tempNode.next;
		}
		if(!isEmpty()) {
			result.deleteCharAt(result.length()-1);
			result.deleteCharAt(result.length()-1);
		}
		result.append("]");
		return result.toString();
	}
}


