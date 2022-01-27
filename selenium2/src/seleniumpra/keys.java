package seleniumpra;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\udmy\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement get =driver.findElement(By.name("q"));
		get.sendKeys("you");
		get.sendKeys(Keys.ARROW_DOWN);
		get.sendKeys(Keys.ENTER);
		
		
		
	}

}
