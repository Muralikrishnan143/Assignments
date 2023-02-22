package org.system;

public class Computer {
	
	public void computerModel() {
		
		System.out.println("Model");
	}
    public void computerName() {
		
		System.out.println("Name");
	}
	
	public static void main(String[] args) {
		
		Computer lenovo=new Computer();
		lenovo.computerModel();
		lenovo.computerName();
		
	}

}
