package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiwindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://etrain.info/in");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Reservation Rules")).click();
		Set<String> list = driver.getWindowHandles();
		Iterator<String> it = list.iterator();
		String parentwindow = it.next();
		String firstChildwindow = it.next();
		System.out.println(firstChildwindow);
		System.out.println(parentwindow);
		driver.switchTo().window(firstChildwindow);
		driver.findElement(By.xpath("//a[text()='Services']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//a[text()='SMS Service']")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[text()='Services']")).click();

	//	js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//a[text()='SMS Service']")).click();
	//	driver.findElement(By.xpath("//body")).sendKeys(Keys.F5);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='www.indianrail.gov.in']")).click();
		Set<String> list1 = driver.getWindowHandles();
		Iterator<String> it1 = list1.iterator();
		 parentwindow = it.next();
		 firstChildwindow = it.next();
		 String secondChildWindow = it.next();
		System.out.println(firstChildwindow);
		System.out.println(parentwindow);
		System.out.println(secondChildWindow);
		driver.switchTo().window(secondChildWindow);
		String text = driver.findElement(By.cssSelector("div.col-md-8.col-md-push-2.text-center")).getText();
		System.out.println("Text of child window " + text);
		driver.switchTo().window(parentwindow);
		driver.findElement(By.id("rsfi2")).sendKeys("pune", Keys.chord(Keys.ARROW_DOWN, Keys.ENTER));
		driver.findElement(By.id("stnsbmtbtn")).click();

	}

}
