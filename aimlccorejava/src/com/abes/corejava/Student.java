package com.abes.corejava;

public class Student extends Object {

		String name;
		long rollNumber;
		String branch;
		String college;
		
		
		public Student(String name,long rollNumber,String branch,String college){
			this.name=name;
			this.rollNumber=rollNumber;
			this.branch=branch;
			this.college=college;
		}
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("RollNumber:"+rollNumber);
		System.out.println("Branch:"+branch);
		System.out.println("College:"+college);
		
	}

}
