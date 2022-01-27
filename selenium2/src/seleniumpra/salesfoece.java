package seleniumpra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesfoece {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\udmy\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.id("username")).sendKeys("This is my first code");
		driver.findElement(By.id("password")).sendKeys("123456789");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
	}

}
