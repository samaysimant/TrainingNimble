package FrameworkBase;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import DataDriven.GetData;



public class BaseClassFramework {
	
	public WebDriver driver;
	
	
	static String browser;
	
	//KEYWORD
//	public ReusableKeywords rk;
	
	//DATA DRIVEN
	GetData data;
	
	static String className;
	
	@BeforeClass(alwaysRun =true)
	public void beforeClass(){
		System.out.println("In Before Class");
		className=this.getClass().getSimpleName();
		System.out.println("The Class Name is "+className);
	}
	
	  @BeforeMethod(alwaysRun =true)
	  public void beforeMethod() {
		  
		  if(browser.equalsIgnoreCase("firefox")){
		  driver=new FirefoxDriver();
		  }
		  if(browser.equalsIgnoreCase("chrome")){
			  System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
			  driver=new ChromeDriver();
		  }
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		  
		 
	//	  rk=new ReusableKeywords(driver);
		 
		//  beforeforPageObjects();
		  
		  
	  }

	  @AfterMethod(alwaysRun =true)
	  public void afterMethod() {
		  driver.quit();
	  }
	  
	  @DataProvider(name="DP")
	  public static Object[][] getData() throws Exception{
		  Object[][] mydata=new Object[1][];
		  
		  HashMap<String,Object[]> map2=new HashMap<String,Object[]>();
		  
		  map2=GetData.readData("./src/test/resources/testdata.xls");
		  
		
		 
		  
		  mydata[0]= map2.get(className);
		  
		  
		  browser=(String) mydata[0][2];
		  
		  return mydata;
		  
	  }
	  
	 // public abstract void beforeforPageObjects();
}
