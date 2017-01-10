package rawSelenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	
	public WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() {

	  
	  //Chrome
	  System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
	  driver=new ChromeDriver();
	  
	  //FF
	//  System.setProperty("webdriver.gecko.driver", "./lib/geckodriver.exe");
	//  driver=new FirefoxDriver();
	  
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
  
  public void wait(int time_in_ms){
	  try {
		Thread.sleep(time_in_ms);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
	public void takescreenshot(String fileName) throws IOException {
		File scrFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:\\"+fileName+".jpg"));

	}

	public void highlightElement(WebElement element)
			throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				element, "color: yellow; border: 5px solid yellow;");
		Thread.sleep(3000);
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				element, "");

	}

}
