package rawSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class DemoTest1 extends BaseClass{
	
	WebDriver driver;
	
  @Test
  public void f() {
	 
	  //Open URL
	  
	  driver.get("https://www.facebook.com/");
	  
	  driver.findElement(By.id("email")).sendKeys("test1");
	  
	  driver.findElement(By.xpath("//input[@class='inputtext' and @name='pass']")).sendKeys("test2");
	  
	  driver.findElement(By.id("u_0_l")).click();
	  
	  WebElement ele=driver.findElement(By.cssSelector("._4rbf._53ij"));
	  String actText=ele.getText();
	  
	  String expText="The email address or phone number that you've entered doesn't match any account";
	  Assert.assertTrue(actText.contains(expText));
  }
  
  
 

}
