package week2.day1;

import org.openqa.selenium.By;//find element by locator using By class (By.method)
import org.openqa.selenium.WebElement;//to use WebElement for assigning a field input
import org.openqa.selenium.chrome.ChromeDriver;//Chrome driver class to load url in chrome browser

public class CreateLead
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();//create obj for the class ChromeDriver
		driver.get("http://leaftaps.com/opentaps/control/main");//load the url
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");//find username field and input demosalesmanager
		driver.findElement(By.id("password")).sendKeys("crmsfa");//find password field and input crmsfa
		driver.findElement(By.className("decorativeSubmit")).click();//find the login button and click
		driver.findElement(By.partialLinkText("CRM/SFA")).click();//find and click the link CRM/SFA
		driver.findElement(By.linkText("Create Lead")).click();//Find and click the link Create Lead
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Quality@Top");//Company name field input "Quality@Top"
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("AjayGanesh");//FirstName field input Ajayganesh
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thiyagarajan");//LastName field input Thiyagarajan
		WebElement companyTitle=driver.findElement(By.id("createLeadForm_generalProfTitle"));//Title field input Software
		companyTitle.sendKeys("SoftwareCompany");
		driver.findElement(By.className("smallSubmit")).click();//click the sumbmit button
		System.out.println("The tile is"+driver.getTitle());//Confirm by display the page title
		String generatedTitle=driver.findElement(By.id("viewLead_companyName_sp")).getText();//Read the text of the generated title
		System.out.println("The Company name and Id:"+generatedTitle);		
		Thread.sleep(4000);
		//driver.close();
		

	}

}
