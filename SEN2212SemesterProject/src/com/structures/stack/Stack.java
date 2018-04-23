package com.structures.stack;
import com.structures.linkedlist.LinkedList;
import com.structures.linkedlist.Node;
import com.structures.school.Course;

public class Stack {
	private Course cl;	
	LinkedList li = new LinkedList();
	private Node top;

	public void push(Course cl) {
		if(top==null){
			top=cl.getList().getFirst();
		}
		else{
			top=cl.getList().getFirst();

		}
	}

	public void pop() {
		while(!li.isEmpty()){
			li.deleteFirst();
		}
	}

	public void displayStack() {
		System.out.println(" Class:");
		li.displayList();
	}

	public Course getCl() {
		return cl;
	}

	public void setCl(Course cl) {
		this.cl = cl;
	}




}
