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

public class FrameandSlider extends BaseClass {
	
	
	@Test
	public void learncomplexactions() throws Exception{
		//setup
		
		//Test
		driver.get("http://jqueryui.com/slider/");
		
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		
		Actions act=new Actions(driver);
		
		WebElement bar = driver.findElement(By.id("slider"));
		
		System.out.println("Length of bar"+bar.getSize().width);
		highlightElement(bar);
		
		WebElement ele = driver.findElement(By.xpath("//div[@id='slider']/span"));
		
		highlightElement(ele);
		
		act.clickAndHold(ele).moveByOffset(250, 0).release().build().perform();
		
		
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.className("entry-title")).getText());
		//act.clickAndHold(from).moveToElement(to).release(to).build().perform();
		Thread.sleep(2000);
		//Tear down
		driver.quit();
	}
	
	

}
