package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;//To use the select class and its methods for locate dropdown field

public class CreateAccount
{

	public static void main(String[] args) throws InterruptedException 
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
		driver.findElement(By.id("accountName")).sendKeys("A.Arunkumar");//Field Accountname AjayGaensh
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");//Description as Selenium Automation Tester
		//Select "ComputerSoftware" as the industry.
		WebElement industryDD=driver.findElement(By.name("industryEnumId"));
		Select obj_industry_dd=new Select(industryDD);
		obj_industry_dd.selectByIndex(3);
		//select Select "S-Corporation" as ownership using SelectByVisibleText. 
		WebElement ownerShipDD=driver.findElement(By.name("ownershipEnumId"));//locate the onwership dropdown and assign to an WebElement
		Select obj_ownship_dd=new Select(ownerShipDD);//create object for Select class and pass the WebElement as argument
		obj_ownship_dd.selectByVisibleText("S-Corporation");
		//Select "Employee" as the source using SelectByValue. 
		WebElement sourceDD=driver.findElement(By.name("dataSourceId"));
		Select obj_source_dd=new Select(sourceDD);
		obj_source_dd.selectByValue("LEAD_EMPLOYEE");
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
		WebElement marketCampgnDD =driver.findElement(By.id("marketingCampaignId"));
		Select obj_markcampg_dd=new Select(marketCampgnDD);
		obj_markcampg_dd.selectByIndex(6);
		//Select "Texas" as the state/province using SelectByValue. 
		WebElement stateDD=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select obj_state_dd=new Select(stateDD);
		obj_state_dd.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();//click create account button
		//Declare a string varialbe accName to store the test value generated after click the create account button
		String accName=driver.findElement(By.xpath("//span[contains(text(),'A.Arunkumar')]")).getText();
		System.out.println("The Account Holder Name is: "+accName);
		Thread.sleep(4000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("The Account Holder Name is: "+accName);
	}

}
