package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class pratice {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName")).sendKeys("Pushpa");
		driver.findElement(By.id("lastName")).sendKeys("Pushparaj");
		driver.findElement(By.id("userEmail")).sendKeys("pushparaj@gmail.com");
		WebElement gen = driver.findElement(By.className("custom-control"));
		Actions a = new Actions (driver);
		a.moveToElement(gen).click().sendKeys(Keys.ARROW_RIGHT).build().perform();
		driver.findElement(By.id("userNumber")).sendKeys("1234567890");
		driver.findElement(By.id("dateOfBirthInput")).click();
		WebElement month =driver.findElement(By.className("react-datepicker__month-select"));
		month.click();
		Select s = new Select(month);
		s.selectByIndex(1);
		s= new Select(driver.findElement(By.className("react-datepicker__year-select")));
		s.selectByValue("1999");
		Thread.sleep(5000);
		driver.findElement(By.className("react-datepicker__day--004")).click(); 
		driver.findElement(By.cssSelector("#subjectsInput")).sendKeys("Eng");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#subjectsInput")).sendKeys(Keys.ENTER);
		
		
	
	
	}

}
