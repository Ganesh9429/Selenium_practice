package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class spil {

	public static void main(String[] args) throws Throwable {
		FileInputStream file = new FileInputStream(".\\dataKeys\\keys.properties");
		Properties key = new Properties();
		key.load(file);
		System.setProperty(key.getProperty("Key"), key.getProperty("value"));
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		String user=	driver.findElement(By.cssSelector("#login_credentials>br:nth-child(2)")).getText();
		System.out.println(user);
	//	driver.close();
		
	}

}
