package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assigactitime {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".pwdfield")).sendKeys("manager");
		driver.findElement(By.id("loginButtonContainer")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("container_tasks")).click();
		String url=driver.getTitle();
		String url1="actiTIME - Task List";
		System.out.println("Validation of page : "+url.equals(url1));
		driver.findElement(By.className("addNewButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("createNewTasks")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(" div.customerProjectSelectorPlaceholder > div > table > tbody > tr:nth-child(1) > td:nth-child(1) > div > div > div.comboboxButton > div.dropdownButton")).click();
		driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div/div[2]/div/div[1]/div/div[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[3]/td[1]/div/div/div[1]/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[3]/td[1]/div/div/div[2]/div/div[1]/div/div[4]")).click();
		driver.findElement(By.cssSelector(" tr:nth-child(1) > td.billingTypeCell > div.typeOfWorkButton.editable")).click();
		driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[3]/div/div[1]/table/tbody/tr[1]/td[5]/div[1]/div/div/div[1]/div/div[11]/div")).click();
		driver.findElement(By.cssSelector(" tr:nth-child(1) > td.nameCell.first > input")).sendKeys("Testing");
		driver.findElement(By.xpath("//div[text()='Create Tasks']")).click();
		List<WebElement> list = driver.findElements(By.cssSelector(" div.namesContainer"));
		for(int i =0;i<list.size();i++) {
			if(list.get(i).getText()=="Testing") {
				System.out.println("task is created or not:-True");
				break;
			}
		}
		driver.findElement(By.cssSelector(" div.createdTasksTableContainer > table > tbody > tr > td.selection > div > div")).click();
		driver.findElement(By.cssSelector(".delete")).click();
		driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
		for(int i =0;i<list.size();i++) {
			if(list.get(i).getText()=="Testing") {
				System.out.println("task is created or not:-True");
				break;
			}
		}
					
		}
		
		
		
		
		
}

