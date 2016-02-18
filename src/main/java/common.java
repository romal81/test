import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class common {
public WebDriver driver=null;
	
	@Parameters({"browser","ip","port"})
	@BeforeClass
	public void setup(String browser, String ip, String port) throws MalformedURLException{
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setBrowserName(browser);
		//capability.setPlatform(Platform.WINDOWS);
				
		driver = new RemoteWebDriver(new URL("http://".concat(ip).concat(":").concat(port).concat("/wd/hub")),capability);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}
