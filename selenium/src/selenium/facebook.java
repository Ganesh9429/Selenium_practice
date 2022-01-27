package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String s1 = "Facebook – log in or sign up";
	String s2=	driver.getTitle();
	System.out.println("Current Page Title : "+s2);
	System.out.println("Current page title is equal to expected title or not : "+s1.equals(s2));
	driver.close();
	
	
	}

}
