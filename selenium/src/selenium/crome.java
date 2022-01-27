package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class crome {

	public static void main(String[] args) {
	/*	System.setProperty("webdriver.chrome.driver",".\\excutable\\chromedriver.exe" );
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.get("https://translate.google.co.in/");
		
		
		System.setProperty("webdriver.gecko.driver",".\\excutable\\geckodriver.exe" );
		FirefoxDriver fdriver = new FirefoxDriver();
		fdriver.get("https://translate.google.co.in/");*/
		
		
		System.setProperty("webdriver.ie.driver", ".\\excutable\\IEDriverServer.exe");
		InternetExplorerDriver idriver=new InternetExplorerDriver();
		idriver.get("https://translate.google.co.in/");
	//	idriver.close();

	}

}
