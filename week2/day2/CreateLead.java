package week2.day2;

import org.openqa.selenium.By;//using By class when find the element using By - 2
import org.openqa.selenium.WebElement;// Declare any element to a WebElement datatype -3
import org.openqa.selenium.chrome.ChromeDriver;//to use the ChromeDriver class -  1
import org.openqa.selenium.support.ui.Select;//for using the Select class for locate dropdown field - 4

public class CreateLead 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// load the application url
		driver.get("http://leaftaps.com/opentaps/");
		// locate the username field
		WebElement usernameField = driver.findElement(By.id("username"));
		// enter the input as demosalesmanager for usernameField
		usernameField.sendKeys("demosalesmanager");
		// locate the password field and enter the password as crmsfa
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//locate the login button and click
		driver.findElement(By.className("decorativeSubmit")).click();
		//to get the title of the webpage -> getTitle() and returnType as string
		//String title = driver.getTitle();
		//System.out.println("Title is "+title);
		//locate the CRM/SFA link and click
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ajayganesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thiyagarajan");
		WebElement sourceEle=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceDD=new Select(sourceEle);
		sourceDD.selectByIndex(4);
		WebElement marketingCamp=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select markCA=new Select(marketingCamp);
		markCA.selectByVisibleText("Automobile");
		WebElement ownerShip=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownerS=new Select(ownerShip);
		ownerS.selectByValue("OWN_CCORP");
		driver.findElement(By.className("smallSubmit")).click();		
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.quit();
		
	}

}
