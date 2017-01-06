package rawSelenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Alerts extends BaseClass{
	
	
	@Test
	public void learncomplexactions() throws Exception{
		//setup
	
		
		//Test
		driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
		
		driver.findElement(By.xpath("//input[@type='button']")).click();
		
		Alert alert=driver.switchTo().alert();
     
		System.out.println(alert.getText());
      Thread.sleep(3000);
      alert.sendKeys("We are dealing with alerts");
      Thread.sleep(3000);
     // alert.accept();
      
      alert.dismiss();
      Thread.sleep(3000);
      alert.accept();



		
		driver.quit();
	}
	
	
}
