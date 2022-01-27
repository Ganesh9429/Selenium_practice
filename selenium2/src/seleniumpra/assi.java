package seleniumpra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class assi {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\udmy\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
		checkbox1.click();
		Assert.assertFalse(checkbox1.isSelected());
		System.out.println("Is 1 st checkbox is selected  "+checkbox1.isSelected());
		WebElement checkbox2 = driver.findElement(By.id("checkBoxOption2"));
		checkbox2.click();
		System.out.println("Is 2 st checkbox is selected  "+checkbox2.isSelected());
		WebElement checkbox3 = driver.findElement(By.id("checkBoxOption3"));
		checkbox3.click();
		System.out.println("Is 3 st checkbox is selected  "+checkbox3.isSelected());
		checkbox1.click();
		checkbox2.click();
		checkbox3.click();
		System.out.println("Is 1 st checkbox is selected  "+checkbox1.isSelected());
		System.out.println("Is 2 st checkbox is selected  "+checkbox2.isSelected());
		System.out.println("Is 3 st checkbox is selected  "+checkbox3.isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());
		driver.close();
		
		
	}

}
