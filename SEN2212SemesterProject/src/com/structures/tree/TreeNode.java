package com.structures.tree;
import com.structures.school.Class;

public class TreeNode {
	private Class cl;
	private TreeNode left;
	private TreeNode right;

	public TreeNode( Class newclass) {
		cl=newclass;
		left= null;
		right= null;
	}
	
	
	public  Class getclass() {
		return cl;
	}
	public void setElement(Class newclass) {
		cl=newclass;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode newLeft) {
		left = newLeft;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode newRight) {
		right = newRight;
	}
}
