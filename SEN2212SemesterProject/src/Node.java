public class Node {

	public Student st;
	public Node next;

	public Node(){

	}
	public Node(Student st){
		this.st=st;
	}
	public Node getNext(){
		return next;
	}
	public void setNext(Node next){
		this.next=next;
	}
	public Student getSt() {
		return st;
	}
	public void setSt(Student st) {
		this.st = st;
	}

	public void displayNode() {
		System.out.print(st.toString());
		System.out.print("  ");

	}
	@Override
	public String toString() {
		
		return st.toString();
	}

}
