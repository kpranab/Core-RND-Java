package com.rnd.algo.linkedlist;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class MyLinkedList {
	
	//Declare a head
	private Node head;
	
	/**
	 * @return true/false
	 * if head is null then list is empty
	 */
	public boolean isEmpty(){
		return head == null;
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
	
	/**
	 * Delete the first Node
	 */
	public int delete() {
		Node temp = head;//Assign head to a temp node
		head = head.next;//Assign next node to head
		return temp.data;
	}
	
	/**
	 * Delete the last Node
	 */
	public int deleteLast() {
		Node temp = head;
		while(temp.next.next != null){//Iterate to the last node
			temp = temp.next;
		}
		int deletedElement = temp.next.data;
		temp.next = null;//Assign null to the last node
		return deletedElement;
	}
	
	/**
	 * @return middle element of the linked list using 2 pointers
	 */
	public int findMiddleNode() {
		Node firstPointer, slowPointer; //Create two pointers first(2 move) and slow(1 move)
		firstPointer=slowPointer = head; //Assign Head to both pointers
		//When 1st pointer reaches to end then the 2nd pointer will be on the middle of the linked list
		while(firstPointer!= null && firstPointer.next != null && slowPointer != null) {
			firstPointer = firstPointer.next.next;//Move 2 times
			slowPointer = slowPointer.next;//Move 1 times
		}
		return slowPointer.data;//reaches on middle
	}
	
	/**
	 * @return Nth Node from last of the linked list
	 */
	public int findNthNodeFromLast(int n) {
		//Create two pointers and assign head
		Node fistPointer = head;
		Node secondPointer = head;
		for(int i=1;i<n;i++) //move 1st pointer to the nth node
			fistPointer = fistPointer.next;
		while(fistPointer.next != null) {//Iterate 1st pointer till end
			//Move both pointers when 1st will reach at end second will be on the nth node from last
			fistPointer = fistPointer.next;
			secondPointer = secondPointer.next;
		}
		return secondPointer.data;//return data
	}
	
	/**
	 * @return true/false if there is a loop exists 
	 */
	public boolean isLoopExists() {
		//Create 2 pointers and assign head
		Node firstPointer = head;
		Node slowPointer = head;
		while(slowPointer != null && firstPointer != null && firstPointer.next != null) {
			//Move first pointer 2times and slow pointer 1 times
			firstPointer = firstPointer.next.next;
			slowPointer = slowPointer.next;
			//when slow pointer match to first pointer then there is a loop
			if(slowPointer.data == firstPointer.data) {
				return true;
			}
		}
		return false;
	}
	
	public void reverseList() {
		Node prvNode = null;
		Node curNode = head;
		Node nxtNode = null;
		while(curNode != null) {
			nxtNode = curNode.next;
			curNode.next = prvNode;
			prvNode = curNode;
			curNode = nxtNode;
		}
		head = prvNode;
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

//Create class Node with next and data, And initialize data with constructor and point next to learn
class Node{
	int data;
	Node next;
	Node(int element){
		this.data = element;
		next = null;
	}
}
