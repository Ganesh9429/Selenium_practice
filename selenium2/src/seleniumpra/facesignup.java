package seleniumpra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class facesignup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\udmy\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Amrendra ");
		driver.findElement(By.name("lastname")).sendKeys("Bhaubali");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("amubhau@fmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("amubhau@fmail.com");
	//	driver.findElement(By.name("reg_email__")).sendKeys("amrendrabhaubali123@gmail.com");
		 driver.findElement(By.id("password_step_input")).sendKeys("123545454");
		//driver.findElement(By.xpath("//*[@id='password_step_input']")).sendKeys("123456845");
		 
		 Select s = new Select(driver.findElement(By.id("day")));
		s.selectByValue("4");
		s.selectByIndex(2);
		s.selectByVisibleText("3");		//driver.close();
		s = new Select(driver.findElement(By.id("month")));
		s.selectByValue("2");
		s = new Select(driver.findElement(By.id("year")));
		s.selectByValue("1999");
		driver.findElement(By.xpath("//*[@id=\"u_0_w_5e\"]/span[3]/label")).click();
	}

}
