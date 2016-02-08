package sample;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;
	
  @Test
  public void f() {
	  driver.get("http://www.google.com");
	  String title = driver.getTitle();
	  System.out.println("The title of google home page is - "+title);
	  Assert.assertTrue(title.contains("Google"));
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
