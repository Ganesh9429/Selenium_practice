package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2listprint {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com");
		Thread.sleep(5000);
		int j = 0;
		List<WebElement> list = driver.findElements(By.cssSelector("#tbodyid>div>div h4>a"));
		List<WebElement> priselist = driver.findElements(By.cssSelector("#tbodyid>div h5"));
		for (int i = 0; i < list.size(); i++) {
			System.out.print(i+")"+list.get(i).getText() + " : ");
			while (i == j) {
				System.out.println("  " + priselist.get(j).getText());
				j++;
			}
		}
		
	/*	for (int i = 0; i < list.size(); i++) {
			System.out.print(i+")"+list.get(i).getText() + " : ");
			for (int j=0;j<priselist.size();j++) {
				System.out.println(j+")"+list.get(i).getText()+"  : " + priselist.get(j).getText());
				
			}
		}*/
		
		
		 driver.findElement(By.id("next2")).click();;
		
		Thread.sleep(5000);
		int k=0;
		List<WebElement> list1 = driver.findElements(By.cssSelector("#tbodyid>div>div h4>a"));
		List<WebElement> priselist1 = driver.findElements(By.cssSelector("#tbodyid>div h5"));
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(i+")"+list1.get(i).getText() + " : ");
			while (i == k) {
				System.out.println("  " + priselist1.get(k).getText());
				k++;
			}
		}
		
		driver.close();
		
	}

}
