package seleniumpra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\udmy\\chromedriver.exe");
		WebDriver driv = new ChromeDriver();
		driv.get("https://www.youtube.com/");
		System.out.println(driv.getTitle());
		System.out.println("Actual URL  "+driv.getCurrentUrl());
		System.out.println("Excepted URL  :-https://www.youtube.com/");
		driv.findElement(By.name("search_query")).sendKeys("Pushpa hindi trailer");
		driv.findElement(By.id("search-icon-legacy")).click();
	//	driv.findElement(By.id("dismissible")).click();		
		
	}

}
