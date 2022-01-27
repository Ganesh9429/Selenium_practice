package seleniumpra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobatton {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "D:\\udmy\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://echoecho.com/htmlforms10.htm");
		/*If suppose their is no value atribute then ------>*/
		
	//	driver.findElement(By.xpath("//input[@value='Milk']")).click();
		int count = driver.findElements(By.xpath("//input[@name=group1")).size();
		System.out.println(count);
		for (int i = 0;i<count;i++) {
			driver.findElements(By.xpath("//input[@name=group1")).get(i).click();			
		
		}
		
		
	}

}
