package seleniumpra;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tetscase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\udmy\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		System.out.println(" Number Link on this page :- "+ driver.findElements(By.tagName("a")).size());
	WebElement footerdriver=	driver.findElement(By.id("gf-BIG"));
	System.out.println("Numbe of link in this footer page :- "+footerdriver.findElements(By.tagName("a")).size());
	WebElement ffdriver =footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	System.out.println("No. of link in this footer 1st coulunm :->  "+ffdriver.findElements(By.tagName("a")).size());
	int sizelink =ffdriver.findElements(By.tagName("a")).size();
	for(int i=1;i<sizelink;i++) {
		String key =Keys.chord(Keys.CONTROL,Keys.ENTER);
		ffdriver.findElements(By.tagName("a")).get(i).sendKeys(key);
	}
	Set<String> window =driver.getWindowHandles();
	 Iterator<String> it = window.iterator();
	while(it.hasNext()) {
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
	}
	
	}

}
