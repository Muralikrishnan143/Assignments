package org.student;

import org.dep.Department;

public class Student extends Department  {

	public void studentName()
	{
		System.out.println("Murali");
	}
	public void studentId()
	{
		System.out.println("513418104303");
	}
	public void studentDept()
	{
		System.out.println("CSE");
	}

	public static void main(String[] args) {
		
		Student Mur=new Student();
		Mur.collegeName();
		Mur.collegeCode();
		Mur.collegerank();
		Mur.deptName();
		Mur.deptHod();
		Mur.studentName();
		Mur.studentId();
		Mur.studentDept();
		
		
	
	}
}
