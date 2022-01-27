package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listprint {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/digital-downloads");
		List<WebElement> data =driver.findElements(By.cssSelector("div.block.block-category-navigation > div.listbox > ul > li"));
		System.out.println("size of CATEGORIES list :- "+data.size()); 
		for(WebElement list:data) {
			System.out.println(list.getText());
		}
		driver.close();
	}

}
