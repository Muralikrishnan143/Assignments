package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Murali");
		
		driver.findElement(By.name("lastname")).sendKeys("krishnan");
		
		driver.findElement(By.name("reg_email__")).sendKeys("877893245");
	
		driver.findElement(By.name("reg_passwd__")).sendKeys("Murali123@");
		
		WebElement findElement = driver.findElement(By.name("birthday_day"));
		
		Select SelectName=new Select(findElement);
		SelectName.selectByIndex(15);
		
		WebElement ele = driver.findElement(By.name("birthday_month"));
		Select name=new Select(ele);
		name.selectByValue("3");	
		
		WebElement findElement2 = driver.findElement(By.name("birthday_year"));
		Select name2=new Select(findElement2);
		name2.selectByValue("1999");
	
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();

		//driver.close();
	}

}
