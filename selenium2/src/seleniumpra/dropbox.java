package seleniumpra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\udmy\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		WebElement adult =driver.findElement(By.xpath("//*[@data-testid='home-page-travellers']"));
		adult.click();
		WebElement click = driver.findElement(By.xpath("//*[@data-testid='Adult-testID-plus-one-cta']"));
		
		for (int i =0;i<4;i++) {
			click.click();
		}
	driver.findElement(By.xpath("//*[@data-testid='home-page-travellers-done-cta']")).click();
	
	System.out.println("no. of totoal adults passaenger  "+adult.getText());
	}

}
