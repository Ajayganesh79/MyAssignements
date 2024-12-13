package week1.day2;

public class Browser 
{
	float browserVersion;
	void launchBrowser()
	{
		System.out.println("Browser launched successfully");

	}
	void loadUrl()
	{
		System.out.println("Application URL load successfully");
	}
	
	



	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	Browser chrome=new Browser();
	Browser edge =new Browser();
    chrome.browserVersion=10.55f;
    edge.browserVersion=14.7f;
	System.out.println("-------Chromebrowser------"+"version is "+chrome.browserVersion+"\n");
	chrome.launchBrowser();
	chrome.loadUrl();	
	System.out.println("\n"+"----------Edgebrowser------"+"version is "+edge.browserVersion+"\n");
	edge.launchBrowser();
	edge.loadUrl();

	}

}
