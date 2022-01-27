package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkarklist {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\excutable\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		List<WebElement> list =driver.findElements(By.cssSelector("div._331-kn._2tvxW>div>div>div>a div.xtXmba"));
		System.out.println("count : "+list.size());
		for(WebElement uplist : list) {
			System.out.println(uplist.getText());
		}
		WebElement lk;
	List<WebElement> li=	driver.findElements(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span"));
		for(WebElement lk : li) {
			System.out.println(lk.getText());
		}
		if(lk.contains("Login")) {
			driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > button")).click();
		}
	
		//div/div/div/button
		//span[text()='Login']
	}

}
