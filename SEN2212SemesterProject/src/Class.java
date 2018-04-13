import java.util.Random;

public class Class {
	
	// Attributes and references
	private String name;
	private LinkList list;
	private Random random;
	
	// Default constrcutor
	public Class(){
		random = new Random();
		list = new LinkList();
	}
	public LinkList getList() {
		return list;
	}

	public void setList(LinkList ll) {
		this.list = ll;
	}
	//serdar,ekin burayý yapýn
	public double getAvgGpa(){
		return random.nextDouble()*4;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {

		return list.toString();
	}

}
