package org.dep;

import org.college.College;

public class Department extends College {
	
	public void deptName()
	{
		System.out.println("CSE");
	}
	public void deptHod()
	{
		System.out.println("balaji");
	}
	
	public static void main(String[] args) {
		
		Department cse=new Department();
		cse.deptName();
		cse.deptHod();
		
	}

}
