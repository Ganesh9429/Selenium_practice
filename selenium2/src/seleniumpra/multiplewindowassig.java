package seleniumpra;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindowassig {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\udmy\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/windows");
		driver.findElement(By.linkText("Click Here")).click();
		String parent = driver.getWindowHandle();
	
		 Set<String> multiwindow= driver.getWindowHandles();
		 Iterator<String> it = multiwindow.iterator();
		String parentId= it.next();
		String childId	= it.next();
		System.out.println(parent);
		System.out.println(parentId);
		
		driver.switchTo().window(childId);
		String child = driver.findElement(By.tagName("h3")).getText();
		System.out.println("Child windows note : "+child);
		driver.switchTo().window(parentId);
		String parent1 = driver.findElement(By.tagName("h3")).getText();
		System.out.println("Parent windows notw : "+parent1);
		driver.quit();

	}

}
