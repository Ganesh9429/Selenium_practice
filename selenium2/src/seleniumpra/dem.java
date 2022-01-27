package seleniumpra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dem {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\udmy\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		System.out.println("What is the titile of this page:-");
		System.out.println(driver.getTitle());
		System.out.println("hit the url :-  https://www.google.co.in");
		System.out.println("Current url : "+driver.getCurrentUrl());
		System.out.println("page source");
	//	System.out.println(driver.getPageSource());
		driver.get("https://www.youtube.com");
		System.out.println("Current url : "+driver.getCurrentUrl());
System.out.println("back");
		driver.navigate().back();
		System.out.println("Current url : "+driver.getCurrentUrl());
		System.out.println("forward");

		driver.navigate().forward();
		System.out.println("again back");

		System.out.println("Current url : "+driver.getCurrentUrl());


driver.close();
		System.out.println("programe end********");
	}

}
 	