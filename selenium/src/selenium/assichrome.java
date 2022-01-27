package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assichrome {

	public static void main(String[] args) throws InterruptedException {
		//	System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
		String s2 = "https://demo.actitime.com/login.do";
		System.out.println(driver.getTitle());
		driver.get(s2);
		String s1 = driver.getTitle();
		System.out.println("Current page title  :" + driver.getTitle());
		System.out.println("Length of page title " + s1.length());

		String s3 = driver.getCurrentUrl();
		//System.out.println(s3);
		if(s2.equals(s3)) {
			System.out.println("Correct URL");
		}else {
			System.out.println("Not correct URL");
		}
		System.out.println("Expected URL is Opened or not : "+s2.equals(s3));
			String s4 = driver.getPageSource();
		System.out.println("Length of page sourse : " + s4.length());
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		
		
		
	//	driver.close();

	}

}
