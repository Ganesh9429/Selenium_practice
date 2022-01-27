package selenium;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.JavascriptExecutor;
	public class InteractableExceptResolve{
	   public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver", "D:\\udmy\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	
	      driver.get("https://login.yahoo.com/");
	   
	      WebElement m = driver.findElement(By.xpath("//input[@id='persistent']"));
	      //JavascriptExecutor to click element
	      JavascriptExecutor jse = (JavascriptExecutor) driver;
	      jse.executeScript("arguments[0].click();", m);
	      boolean b = m.isSelected();
	      if (b) {
	         System.out.println("Checkbox is not checked");
	      }else {
	         System.out.println("Checkbox is checked");
	      }
	      driver.close();
	   }
}
