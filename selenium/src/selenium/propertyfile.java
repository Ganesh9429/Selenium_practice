package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class propertyfile {

	public static void main(String[] args) throws Throwable {
		FileInputStream file = new FileInputStream(".\\dataKeys\\keys.properties");
		Properties key = new Properties();
		key.load(file);
		System.setProperty(key.getProperty("Key"), key.getProperty("value"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(key.getProperty("url"));
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys(key.getProperty("Fname"));
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(key.getProperty("Lname"));
		driver.findElement(By.cssSelector("[ng-model='Adress']")).sendKeys(key.getProperty("Address"));
		driver.findElement(By.cssSelector("[type='email']")).sendKeys(key.getProperty("Email"));
		driver.findElement(By.cssSelector("[type='tel']")).sendKeys(key.getProperty("Phone"));
		driver.findElement(By.cssSelector("input[value='Male']")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("msdd")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, Keys.END));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='English']")).click();
		Select s = new Select(driver.findElement(By.id("Skills")));
		s.selectByValue(key.getProperty("Skills"));
		WebElement country = driver.findElement(By.cssSelector("span[role='combobox']"));
		country.click();
		country.sendKeys(key.getProperty("Country"));
		country.sendKeys(Keys.ENTER);
		Select s1 = new Select(driver.findElement(By.id("yearbox")));
		s1.selectByVisibleText("1999");
		s1 = new Select(driver.findElement(By.cssSelector("[placeholder='Month']")));
		s1.selectByVisibleText("February");
		s1 = new Select(driver.findElement(By.id("daybox")));
		s1.selectByVisibleText("4");
		driver.findElement(By.id("firstpassword")).sendKeys(key.getProperty("Password"));
		driver.findElement(By.id("secondpassword")).sendKeys(key.getProperty("Password"));
		Thread.sleep(5000);
		driver.close();

	}

}
