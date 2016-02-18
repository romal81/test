import java.util.Date;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class test2 extends common{
	
	@Test(priority=2)
	public void search(){
		Date date = new Date();
		System.out.println("Start Time:- Test2"+driver+ date.toString());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
		WebElement searchField = driver.findElement(By.xpath("//input[@name='q']")); 
		
		if (searchField.isDisplayed()){
			//System.out.println("The field is disabled..exiting test!");
		}
		else{
		searchField.sendKeys("selenium");
		driver.findElement(By.xpath("//button[@name='btnG']")).click();
		driver.findElement(By.linkText("www.seleniumhq.org/download/")).click();
		String title = driver.getTitle();
		Assert.assertEquals("download", title);
		}
		System.out.println("Stop Time:- Test2"+driver+ date.toString());
	}
	
}
