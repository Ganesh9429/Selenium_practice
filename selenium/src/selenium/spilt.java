package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class spilt {

	public static void main(String[] args) throws Throwable {
		FileInputStream file = new FileInputStream(".\\dataKeys\\keys.properties");
		Properties key = new Properties();
		key.load(file);
		System.setProperty(key.getProperty("Key"), key.getProperty("value"));
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		WebElement idpass = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/span"));
		String username = idpass.getText().split(" ")[3].trim();
		String pass = idpass.getText().split(" ")[7].trim();
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		driver.findElement(By.id("btnLogin")).click();

	}

}
