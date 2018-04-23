package com.structures.tree;
import com.structures.school.Course;

public class Node {
	private Course cl;
	private Node left;
	private Node right;

	public Node( Course newclass) {
		cl=newclass;
		left= null;
		right= null;
	}
	
	
	public  Course getclass() {
		return cl;
	}
	public void setElement(Course newclass) {
		cl=newclass;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node newLeft) {
		left = newLeft;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node newRight) {
		right = newRight;
	}
}
