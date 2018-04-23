package com.structures.main;
import java.util.Scanner;

import com.structures.school.Class;
import com.structures.school.GPA;
import com.structures.school.Student;
import com.structures.stack.ClassStack;
import com.structures.tree.BinarySearchTree;
import com.structures.tree.TreeNode;

public class Test {
	static BinarySearchTree bst=new BinarySearchTree();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		CreateSchool();

	}
	public static void CreateSchool(){
		ClassStack cs=new ClassStack();
		System.out.println("pls enter how many Student and class");
		int studentCount=sc.nextInt();
		int classCount=sc.nextInt();
		for(int i=0;i<classCount;i++){
			Class c=new Class();
			System.out.println("pls enter a class name");
			c.setName(sc.next());
			TreeNode tn=new TreeNode(c);
			for(int j=0;j<studentCount;j++){
				Student st =new Student();
				GPA gpa=new GPA();
				System.out.println("pls enter a name for the student");
				st.setName(sc.next());
				System.out.println("pls enter a Surname for the student");
				st.setSurname(sc.next());
				System.out.println("pls enter an id for the student");
				st.setSid(sc.nextInt());
				System.out.println("pls enter a gpa for the student");
				gpa.setValue(sc.nextDouble());
				if(gpa.getValue()>4 || gpa.getValue()<=0){
					System.out.println("GPA CANT BE THAT NUMBER");
					gpa=null;
				}
				else{
					st.setGpa(gpa);
				}
				c.getList().insert(st);

			}
			tn.setElement(c);
			bst.insert(tn);
		}

		System.out.println("School tree is created");
		inorder(bst.getRoot());
		


	}
	public static void inorder(TreeNode root){
		if(root==null){
			return;
		}
		else{
			inorder(root.getLeft());
			System.out.println("Class:"+root.getclass().getName()+" - AVG GPA:"+root.getclass().getAvgGpa());
			inorder(root.getRight());
		}
	}
}
