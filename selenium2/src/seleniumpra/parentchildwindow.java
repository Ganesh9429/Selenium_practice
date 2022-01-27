package seleniumpra;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentchildwindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\udmy\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows =driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId =	it.next();
		String childId =	it.next();
		
		driver.switchTo().window(childId);

		String email =driver.findElement(By.cssSelector(".im-para.red")).getText().split(" ")[4].trim();
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(email);
	
		
		
		
		
		
		
		
		
	}

}
