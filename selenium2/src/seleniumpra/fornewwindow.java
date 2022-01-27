package seleniumpra;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fornewwindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\udmy\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.switchTo().newWindow(Window.WINDOW);// FOR NEW WINDOW 
	//	driver.switchTo().newWindow(WindowType.TAB);//FOR NEW TAB IN BROWSER
	WebElement s=	driver.findElement(By.id(""));
			

	}

}
