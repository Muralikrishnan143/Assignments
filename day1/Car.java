package week1.day1;

public class Car {
	
	public void openTheDoor() 
	{
		System.out.println("door open");
	}
	public void sitOnTheSeat() 
	{
		System.out.println("sitting on the seat ");
	}
		public void putTheSeatBelt() 
		{
			System.out.println("wearing the seatbelt");
		}
		public void startTheCar() 
		{
			System.out.println("car is on");
		}
		public void pressClutch() 
		{
			System.out.println("Clutch pressing");
		}
		public void putTheGear() 
		{
			System.out.println("car in gear");
		}
	    public void pressAccelerator() 
	    {
			System.out.println("car moving");
		}
	    
	    public static void main(String[] args) {
	    	
	    	Car ford = new Car();
	    	
	    	ford.openTheDoor();
	    	ford.sitOnTheSeat();
	    	ford.putTheSeatBelt();
	    	ford.startTheCar();
	    	ford.pressClutch();
	    	ford.putTheGear();
	    	ford.pressAccelerator();
	    	
			
		}
	}


