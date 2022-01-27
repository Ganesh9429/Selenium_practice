package seleniumpra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\udmy\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("#email")).sendKeys("This is my code");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456789");
		//driver.findElement(By.id("email")).sendKeys("This is my first code");
		//driver.findElement(By.id("pass")).sendKeys("Thisismyfirstcode");
		 driver.findElement(By.name("login")).click();
		 System.out.println("What is the error  : "+driver.findElement(By.className("_9ay7")).getText());
		//driver.findElement(By.linkText("Forgotten password?")).click();
	//	driver.findElement(By.cssSelector("#identify_email")).sendKeys("Yes i am done");
	//	driver.findElement(By.xpath("//*[@id='did_submit']")).click(); 
		// driver.quit();
		// driver.findElement(By.xpath("//*[@id='loginbutton']")).click();

	}

}
