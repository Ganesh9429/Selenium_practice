package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String s1 = driver.getCurrentUrl();
		System.out.println(s1);
		String s2 = driver.getPageSource();
		System.out.println("Page source length of current loaded page : "+s2.length());
		driver.close();
				
		
		
	}

}
