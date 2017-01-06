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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChildWindows extends BaseClass {

	
@Test
	public void learncomplexactions() throws Exception {
		
		// Test
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");

		
		highlightElement(driver.findElement(By.id("button1")));
		driver.findElement(By.id("button1")).click();

		Object[] currentWindow = driver.getWindowHandles().toArray();

		// String ParentWindow=currentWindow[0].toString();
		// String ChildWindow=currentWindow[1].toString();

		driver.switchTo().window(currentWindow[1].toString());
		
		
		driver.manage().window().maximize();
		highlightElement(driver.findElement(By.xpath("//span[.='HOME']/..")));
		driver.findElement(By.xpath("//span[.='HOME']/..")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(currentWindow[0].toString());
		
		
		highlightElement(driver
				.findElement(By.xpath("//div[@id='content']/h1")));
		String actText = driver
				.findElement(By.xpath("//div[@id='content']/h1")).getText();
		String expText = "Switch Windows";
		
		Assert.assertTrue(actText.contains(expText));

		driver.quit();
	}



}
