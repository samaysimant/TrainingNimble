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

public class DemoTest1 {
	
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
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  //Chrome
	  System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
	  driver=new ChromeDriver();
	  
	  //FF
//	  System.setProperty("webdriver.gecko.driver", "./lib/geckodriver.exe");
//	  driver=new FirefoxDriver();
	  
	  //IE
	//  System.setProperty("webdriver.ie.driver", "./lib/IEDriverServer.exe");
	//  driver=new InternetExplorerDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  //Close the Brrwser
	  
	  driver.quit();
  }

}
