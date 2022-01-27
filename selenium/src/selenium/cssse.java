package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
	List<WebElement> list=	driver.findElements(By.cssSelector("ul[class='top-menu']>li>a"));
	System.out.println("Count"+list.size());
	for(WebElement printlist :list) {
		System.out.println(printlist.getText());
		
	}
	driver.get("http://demowebshop.tricentis.com/");
	
	}

}
