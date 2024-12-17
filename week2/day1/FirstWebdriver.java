package week2.day1;//user created package

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstWebdriver {//Class created FirstWebdriver

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://devweb.lovedones.ai/");
		driver.manage().window().maximize();
		WebElement signin=driver.findElement(By.partialLinkText("Sign In"));
		Thread.sleep(10000);
		signin.click();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.quit();
		

	}

}
