/**
 * 
 */
package com.rnd.algo.stack;

import java.util.Arrays;

import javax.tools.Diagnostic;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class CustomStack {
	
	int size;
	int []arr;
	int top;
	
	public CustomStack(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull(){
		return size-1 == top;
	}
	
	public int peek(){
		return arr[top];
	}
	
	public void push(int element){
		if(!isFull()){
			top++;
			arr[top] = element;
			System.out.println("Pushed element : "+element);
		}else{
			System.out.println("Stack is full");
		}
	}
	
	public int pop(){
		if(!isEmpty()){
			int returnTop = top;
			top--;
			System.out.println("Poped element : "+arr[returnTop]);
			return arr[returnTop];
		}else{
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	public void display(){
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		CustomStack stack = new CustomStack(2);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);

		stack.display();
		
		stack.pop();
				
		System.out.println("Peeked element : "+stack.peek());
		
		
		
	}

}
