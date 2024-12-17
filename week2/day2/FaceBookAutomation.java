package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookAutomation 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("TestFirstname");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("TestLastname");
		WebElement dobDayDD=driver.findElement(By.xpath("//select[contains(@class, '_9407 _5dba _9hk6 _8esg')][1]"));
		Select obj_dob_daydd=new Select(dobDayDD);
		obj_dob_daydd.selectByIndex(30);
		WebElement dobMonthDD=driver.findElement(By.xpath("//select[contains(@class, '_9407 _5dba _9hk6 _8esg')][2]"));
		Select obj_dob_monthDD=new Select(dobMonthDD);
		obj_dob_monthDD.selectByVisibleText("Oct");
		WebElement dobYearDD=driver.findElement(By.xpath("//select[contains(@class, '_9407 _5dba _9hk6 _8esg')][3]"));
		Select obj_dob_ydd=new Select(dobYearDD);
		obj_dob_ydd.selectByValue("1979");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9677962520");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//span[contains(@class,'_5k_2 _5dba')][2]")).click();
		
	}

}
