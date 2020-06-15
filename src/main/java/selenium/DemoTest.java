package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {
	
	@Test
	public void test() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Downloads\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ocf.berkeley.edu/~ppnguyen/interview/test.html");
		//WebDriver wd = (WebDriver) driver.findElement(By.id("164"));
		//WebDriver wd = (WebDriver) driver.findElement(By.xpath("//*[@id='806']/text()");
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		List<WebElement> list = driver.findElements(By.id("content"));
		
		for (int i = 0; i < list.size(); i++) {
			if (i == 1) {
				String str = list.get(i).toString();
				System.out.println(str);
			}
		}
		driver.quit();
		//System.out.println(wd.toString());
	}

}
