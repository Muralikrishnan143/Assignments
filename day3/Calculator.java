package week1.day2;

public class Calculator {
	
	public void addTwoNum(int a, int b)
	{
	      int c=a+b;
	      System.out.println("add "+c);
	}
	
	public void subTwoNum(int d,int e)
	{
	      
	      int f=d-e;
	      System.out.println("sub "+f);
	}
	public void mulTwoNum(double g,double h)
	{
	      
	      double i=g*h;
	      System.out.println("mul "+i);
	}
	public void divTwoNum(float x,float y)
	{
	      
	      float o=x/y;
	      System.out.println("div "+o);
	}
	
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.addTwoNum(40, 50);
		calc.subTwoNum(400, 500);
		calc.mulTwoNum(678.78, 56.89);
		calc.divTwoNum(67.89f, 45.4f);
	}

}