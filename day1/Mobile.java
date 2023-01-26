package week1.day1;

public class Mobile {
	
	public  void sendFiles()
	{
		System.out.println("to file send");
	};
	public  void shareHotspot()
	{
		System.out.println("to share internet");
	};
	public  void call()
	{
		System.out.println("to communicate");
	};
	public  void clickPowerbutton()
	{
		System.out.println("to mobile on");
	};
	public  void openCamera()
	{
		System.out.println("open to clik photos");
	};
	
	public static void main(String[] args) {
		
		Mobile redmi=new Mobile();
		
		redmi.sendFiles();
		redmi.shareHotspot();
		redmi.call();
		redmi.clickPowerbutton();
		redmi.openCamera();
		
	}

}
