package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//syncronise means matching the time of selenium as per application
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demosite.executeautomation.com/Login.html");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
	    driver.findElement(By.tagName("span")).click();
		
	}

}
