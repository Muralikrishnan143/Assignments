package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Tcs");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("MuraliKrishnan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Murali");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("MR");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("software project");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("300000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("987654");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is Tcs");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("best organisation");
		driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("balaji");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("16-03-1999");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("50");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("T");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("muralirishnanrkmsh@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8778983245");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Murali");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://tcs.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("saravanan");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("balaji");
		driver.findElement(By.name("generalAddress1")).sendKeys("43/1,big street");
		driver.findElement(By.name("generalAddress2")).sendKeys("sholinghur");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Ranipet");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("631102");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("631102");
		//driver.findElement(By.className("smallSubmit")).click();
	}

}
