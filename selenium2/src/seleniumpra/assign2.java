package seleniumpra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assign2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\udmy\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.findElement(By.className("homeCalender")).click();
		driver.findElement(By.className("DayPicker-Day--today")).click();
	WebElement adult=	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[5]/div/div[1]/select"));
		Select s = new Select(adult);
		s.selectByValue("4");
		WebElement Childern = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[5]/div/div[3]/select"));
		s = new Select(Childern);
		s.selectByIndex(2);
		driver.findElement(By.className("hover:td-underline")).click();
		driver.findElement(By.className("bg-primary-500")).click();
		System.out.println(driver.findElement(By.className("to-ellipsis")).getText());
		
		
	}

}
