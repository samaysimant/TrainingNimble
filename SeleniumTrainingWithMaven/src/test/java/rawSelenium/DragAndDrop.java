package rawSelenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop extends BaseClass {
	

	
	@Test
	public void learncomplexactions() throws Exception{
		//setup
		
		
		//Test
		driver.get("http://html5demos.com/drag#");
		Actions act=new Actions(driver);
		
		WebElement from = driver.findElement(By.xpath("//a[@id='one']"));
		highlightElement(from);
		WebElement to = driver.findElement(By.id("bin"));
		highlightElement(to);
		System.out.println(from.getTagName());
		//act.dragAndDrop(from, to).build().perform();
		act.clickAndHold(from).moveToElement(to).release(to).build().perform();
		Thread.sleep(2000);
		//Tear down
		driver.quit();
	}
	
	

}
