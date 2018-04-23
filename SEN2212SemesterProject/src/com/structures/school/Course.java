package com.structures.school;
import java.util.Random;

import com.structures.linkedlist.LinkedList;

public class Course {
	
	// Attributes and references
	private String name;
	private LinkedList list;
	private Random random;
	
	// Default constrcutor
	public Course(){
		random = new Random();
		list = new LinkedList();
	}
	public LinkedList getList() {
		return list;
	}

	public void setList(LinkedList ll) {
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
