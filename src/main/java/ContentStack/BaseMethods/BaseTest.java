package ContentStack.BaseMethods;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	protected WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}
	@BeforeMethod
	public void setDriver() throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\ContentStack\\Driver\\chromedriver.exe");
		
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://www.contentstack.com/");
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
