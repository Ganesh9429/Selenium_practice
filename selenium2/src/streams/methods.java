package streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class methods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\udmy\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//th[@role='columnheader'][1]")).click();
		List<WebElement> originallist = driver.findElements(By.xpath("//tr/td[1]"));
	List<String> origlist =	originallist.stream().map(s->s.getText()).collect(Collectors.toList());
	List<String> shoreted  =	origlist.stream().sorted().collect(Collectors.toList());
	Assert.assertTrue(shoreted.equals(origlist));
	System.out.println("Test is passed");
	driver.close();
	}

}
