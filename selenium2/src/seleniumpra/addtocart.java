package seleniumpra;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addtocart extends ChromeDriver {
	
	

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\udmy\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int j = 0;
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.cssSelector("h4.product-name"));
		
		
		
		String[] vegName  = {"Cucumber","Cauliflower","Mushroom"};
		List vegname = Arrays.asList(vegName);
		for (int i=0;i<list.size();i++) {
			
		String[] name=	list.get(i).getText().split("-");
		String formatName = name[0].trim();
		
		if(vegname.contains(formatName)) {
			j++;
			driver.findElements(By.xpath("//div[@class='product-action	']")).get(i).click();
			if(j==vegName.length) {
				break;
				
			}
		}
		}
		
	}
   
}
