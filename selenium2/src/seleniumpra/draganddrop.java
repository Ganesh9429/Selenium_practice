package seleniumpra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\udmy\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable");
		
		WebElement frameloc =driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frameloc);
	WebElement drag=	driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));
	Actions a = new Actions(driver);
	a.dragAndDrop(drag,drop ).build().perform();
	
	}

}
