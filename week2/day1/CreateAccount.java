package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");//find username field and input demosalesmanager
		driver.findElement(By.id("password")).sendKeys("crmsfa");//find password field and input crmsfa
		driver.findElement(By.className("decorativeSubmit")).click();//find the login button and click
		driver.findElement(By.partialLinkText("CRM/SFA")).click();//find and click the link CRM/SFA
		WebElement account=driver.findElement(By.linkText("Accounts"));//Find the Accounts link from the tab , assign to a WebElement
		account.click();//click the Accounts link by using the variable account
		driver.findElement(By.partialLinkText("Create Account")).click();//Click the link Create account
		driver.findElement(By.id("accountName")).sendKeys("AjayGanesh1");//Field Accountname AjayGaensh
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");//Description as Selenium Automation Tester
		driver.findElement(By.id("numberEmployees")).sendKeys("25");//Number of employees field input 25
		driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");//OffieSiteName field input LeafTaps
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("The Page name is: "+driver.getTitle());
		//String accountName=driver.findElement(By.className("AjayGanesh1  (11212)")).getText();
		//System.out.println("The Account Holder name is :"+accountName);
		
		
	}

}
