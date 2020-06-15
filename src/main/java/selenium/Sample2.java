package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample2 {

	
	@Test @Ignore
	public void clickEvent() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Downloads\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("Sunitha");
		WebElement element = driver.findElement(By.xpath("//*[@title='Search']"));
		element.sendKeys("Sunitha");	
		driver.quit();
	}
	
	@Test @Ignore
	public void dropdown() {
		
			
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Downloads\\softwares\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "http://demo.guru99.com/test/newtours/register.php";
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Select drpCountry = new Select(driver.findElement(By.name("country")));
	drpCountry.selectByVisibleText("ANTARCTICA");
	driver.quit();	
	}
	
	@Test
	public void listElements(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Downloads\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://demo.guru99.com/test/newtours/register.php";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> options  = (List<WebElement>) driver.findElements(By.tagName("option"));
		System.out.println(options.size());
		
		driver.quit();	
	}
	
	@Test @Ignore
	public void multiSelect() {
			
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Downloads\\softwares\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "http://jsbin.com/osebed/2";
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Select fruits = new Select(driver.findElement(By.id("fruits")));
	fruits.selectByVisibleText("Banana");
	fruits.selectByIndex(1);
	
	driver.quit();	
	}
}
