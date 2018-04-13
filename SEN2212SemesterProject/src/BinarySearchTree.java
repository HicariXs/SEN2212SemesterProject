import java.util.LinkedList;

public class BinarySearchTree {

	private TreeNode root;
	private int size;
	public BinarySearchTree(){
		root= null;
		size= 0;
	}

	private TreeNode createNewNode(Class cl){
		return new TreeNode(cl);
	}
	public TreeNode getRoot() {
		return root;
	}
	public void setRoot(TreeNode root) {
		this.root = root;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean insert(TreeNode tn){
		if(root==null)
			root=createNewNode(tn.getclass());
		else{
			TreeNode parent=null;
			TreeNode current=root;
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
