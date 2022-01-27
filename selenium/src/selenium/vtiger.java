package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class vtiger {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*System.setProperty("webdriver.gecko.driver",".\\excutable\\geckodriver.exe" );
		FirefoxDriver driver = new FirefoxDriver();*/
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		System.out.println("expectedtitle = vtiger");
	
		String expectedtitle = "vtiger";
		String actualtitle = driver.getTitle();
		System.out.println("actualtitle : "+actualtitle);
		
		if(expectedtitle.equals(actualtitle)) {
			System.out.println("Title is matched with expected");
		}else {
			System.out.println("Dose not matched");
		}
		WebElement username =driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		WebElement pass = driver.findElement(By.id("password"));
		pass.clear();
		pass.sendKeys("Test@123");
		driver.findElement(By.className("button")).click();
		Thread.sleep(5000);
		String expectedtitle1 = "Dashboard";
		String actualtitle1 = driver.getTitle();
		System.out.println("expectedtitle1 = Dashboard");
		System.out.println("Actual title : "+actualtitle1);
		if(expectedtitle.equals(actualtitle)) {
			System.out.println("Title is match with expected");
		}else {
			System.out.println("Dose not matched");
		}
	
		driver.findElement(By.className("userName")).click();
		//Thread.sleep(2000);
		//WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement logout = driver.findElement(By.linkText("Sign Out"));
		//wait.until(ExpectedConditions.elementToBeClickable(logout));
		logout.click();
		driver.close();
		
	}

}
