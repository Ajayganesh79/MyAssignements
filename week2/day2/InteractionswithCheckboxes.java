package week2.day2;

import org.openqa.selenium.Alert;//Use this class when handling with alert messages
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionswithCheckboxes
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[@class='ui-chkbox-label'])[1]")).click();//Click checkbox basic
		driver.findElement(By.xpath("//span[text()='Ajax']/parent::div")).click();//Child to parent used in Xpath
		Thread.sleep(4000);
		//Read the result message which shows as checked
		String resultMessage=driver.findElement(By.xpath("//span[contains(@class,'ui-growl-title')]")).getText();
		System.out.println("The Initial Status of the Notificatin Checkbox is :"+" "+resultMessage);
		driver.findElement(By.xpath("//span[text()='Ajax']/parent::div")).click();//again click the same checkbox ajax
		Thread.sleep(4000);
		//Read the result message which shows as unchecked
		String resultMessage1=driver.findElement(By.xpath("//span[contains(@class,'ui-growl-title')]")).getText();
		System.out.println("The Current Status of the Notificatin Checkbox is :"+" "+resultMessage1);
		WebElement course1=driver.findElement(By.xpath("(//label[@for='j_idt87:basic:3'])"));//select csharp
		course1.click();
		driver.findElement(By.xpath("//label[@for='j_idt87:basic:0']")).click();//select java lang
		driver.findElement(By.xpath("//label[@for='j_idt87:basic:4']")).click();//Select others		
		
		
		
	}

}
