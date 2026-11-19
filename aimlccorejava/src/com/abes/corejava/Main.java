package com.abes.corejava;

public class Main {

	public static void main(String[] args) {
		 //System.out.println("Hello World");
		
		Student student1=new Student("Harshu",23455,"CSE AIML","ABESEC");
		Student student2=new Student("Nancy",23456,"CSE AIML","ABESEC");
//		student1.display();
//		student2.display();
		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		
//		System.out.println("--Student1 Details--");
//		System.out.println("Name:"+student1.name);
//		System.out.println("RollNumber:"+student1.rollNumber);
//		System.out.println("Branch:"+student1.branch);
//		System.out.println("College:"+student1.college);
//		
//		System.out.println("--Student2 Details--");
//		System.out.println("Name:"+student2.name);
//		System.out.println("RollNumber:"+student2.rollNumber);
//		System.out.println("Branch:"+student2.branch);
//		System.out.println("College:"+student2.college);

	}

}
