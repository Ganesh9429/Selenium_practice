package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listprint1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gsmarena.com/");
	List<WebElement> list=	driver.findElements(By.cssSelector("div.brandmenu-v2.light.l-box.clearfix  li > a"));
	System.out.println("Count  :-"+list.size());
	for(WebElement ulist: list) {
		System.out.println(ulist.getText());}
	driver.findElement(By.cssSelector(" div.brandmenu-v2 li:nth-child(1)>a")).click();
	List<WebElement> uplist=	driver.findElements(By.cssSelector(" ul a>strong >span"));
	System.out.println("Coununt : "+uplist.size());
	for(WebElement nwlist: uplist) {
		System.out.println(nwlist.getText());}
	
	}

}
