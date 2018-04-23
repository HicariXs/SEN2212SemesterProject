package com.structures.linkedlist;
import com.structures.school.Student;

public class LinkedList {
	private Node first = null;

	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}

	public void insert(Student st){
		Node node = new Node(st);
		Node current =new Node(st);
		if(first==null){
			this.first=node;
		}
		else{
			while (current.getNext() != null){
				current = current.getNext();
			}

			current.setNext(node);
		}}

	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		return temp;
	}

	public void displayList() {
		Node current = first;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
	}

	public boolean isEmpty() {
		return (first == null);
	}

	@Override
	public String toString() {
		String result = "";

		Node current =this.first;
		while (current != null){
			result = result + current.getSt().toString();
			current = current.getNext();
		}
		return result;
	}
}


