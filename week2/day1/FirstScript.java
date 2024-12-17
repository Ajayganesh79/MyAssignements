package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		Thread.sleep(5000);
		driver.close();
		//System.out.println("The webpage title is "+driver.getTitle());
		
	}

}
