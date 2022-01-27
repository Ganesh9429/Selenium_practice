package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		
		
		List<WebElement> name=driver.findElements(By.cssSelector("div.navbar-collapse.collapse.navbar-right > ul > li>a"));
		System.out.println("Count of options :-"+name.size());
		for(WebElement link : name){
			System.out.println(link.getText());
		}
		
		
		/*
System.out.println(driver.findElement(By.linkText("Home")).getText());
System.out.println(driver.findElement(By.linkText("Register")).getText());
System.out.println(driver.findElement(By.linkText("WebTable")).getText());
System.out.println(driver.findElement(By.linkText("SwitchTo")).getText());
System.out.println(driver.findElement(By.linkText("Widgets")).getText());
System.out.println(driver.findElement(By.linkText("Interactions")).getText());
System.out.println(driver.findElement(By.linkText("Video")).getText());
System.out.println(driver.findElement(By.linkText("WYSIWYG")).getText());
System.out.println(driver.findElement(By.linkText("More")).getText());
System.out.println(driver.findElement(By.linkText("Practice Site")).getText());
//or

System.out.println("Nex method*************************");
System.out.println(driver.findElement(By.cssSelector("div.navbar-collapse.collapse.navbar-right > ul > li:nth-child(1) > a")).getText());
System.out.println(driver.findElement(By.cssSelector("div.navbar-collapse.collapse.navbar-right > ul > li:nth-child(2) > a")).getText());
System.out.println(driver.findElement(By.cssSelector("div.navbar-collapse.collapse.navbar-right > ul > li:nth-child(3) > a")).getText());
System.out.println(driver.findElement(By.cssSelector("div.navbar-collapse.collapse.navbar-right > ul > li:nth-child(4) > a")).getText());
System.out.println(driver.findElement(By.cssSelector("div.navbar-collapse.collapse.navbar-right > ul > li:nth-child(5) > a")).getText());
System.out.println(driver.findElement(By.cssSelector("div.navbar-collapse.collapse.navbar-right > ul > li:nth-child(6) > a")).getText());
System.out.println(driver.findElement(By.cssSelector("div.navbar-collapse.collapse.navbar-right > ul > li:nth-child(7) > a")).getText());
System.out.println(driver.findElement(By.cssSelector("div.navbar-collapse.collapse.navbar-right > ul > li:nth-child(8) > a")).getText());
System.out.println(driver.findElement(By.cssSelector("div.navbar-collapse.collapse.navbar-right > ul > li:nth-child(9) > a")).getText());
System.out.println(driver.findElement(By.cssSelector("div.navbar-collapse.collapse.navbar-right > ul > li:nth-child(10) > a")).getText());

*/


	}}


	
	


