package com.structures.tree;
import java.util.LinkedList;

import com.structures.school.Course;

public class BinarySearchTree {

	private Node root;
	private int size;
	public BinarySearchTree(){
		root= null;
		size= 0;
	}

	private Node createNewNode(Course cl){
		return new Node(cl);
	}
	public Node getRoot() {
		return root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean insert(Node tn){
		if(root==null)
			root=createNewNode(tn.getclass());
		else{
			Node parent=null;
			Node current=root;
			while(current!=null){

				if(tn.getclass().getAvgGpa()<current.getclass().getAvgGpa()){
					parent = current;
					current = current.getLeft();
				}
				else if(tn.getclass().getAvgGpa()>current.getclass().getAvgGpa()){
					parent = current;
					current = current.getRight();
				}
				else {
					return false;
				}
			}
			if (tn.getclass().getAvgGpa() < parent.getclass().getAvgGpa()){
				parent.setLeft(tn);
			} else {
				parent.setRight(tn);
			}
		}
		return false;
	}
}
