

public class ClassStack {
	private Class cl;	
	LinkList li = new LinkList();
	private Node top;

	public void push(Class cl) {
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

	public Class getCl() {
		return cl;
	}

	public void setCl(Class cl) {
		this.cl = cl;
	}




}
