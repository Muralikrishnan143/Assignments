package org.system;

public class Desktop extends Computer {
	
	public void desktopName()
	{
		System.out.println("lenovo");
	}
	public void desktopcolour()
	{
		System.out.println("black");
	}
	
	public static void main(String[] args) {
		
		Desktop lenovo =new Desktop();
		
		lenovo.desktopName();
		lenovo.desktopcolour();
		lenovo.computerName();
		lenovo.computerModel();
		
		
	}

}
