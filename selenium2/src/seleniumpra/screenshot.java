package seleniumpra;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\udmy\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http\\:www.google.com");
		File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("E:\\selenium scrrenshot\\screenshot.png"));
	}

}
