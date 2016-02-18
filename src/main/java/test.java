import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;




public class test extends common{
/*	public WebDriver driver=null;
	
	@Parameters({"browser","ip","port"})
	@BeforeTest
	public void setup(String browser, String ip, String port) throws MalformedURLException{
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setBrowserName(browser);
		//capability.setPlatform(Platform.WINDOWS);
				
		driver = new RemoteWebDriver(new URL("http://".concat(ip).concat(":").concat(port).concat("/wd/hub")),capability);
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}*/

	@Test(priority=1)
	public void testHomePage(){
		Date date = new Date();
		System.out.println("Start Time:- Test1"+driver+date.toString());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.guru99.com/");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Meet Guru99"));
		System.out.println("Stop Time:- Test1"+driver+date.toString());
	}

}
