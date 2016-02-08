import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class test {
	private WebDriver driver;
	
	@Test
	public void testHomePage(){
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Google"));
	}
	
	@BeforeTest
	public void setup(){
		driver = new FirefoxDriver();
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}

}
