package rawSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	
	WebDriver driver;
  
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
	  driver.quit();
  }

}
