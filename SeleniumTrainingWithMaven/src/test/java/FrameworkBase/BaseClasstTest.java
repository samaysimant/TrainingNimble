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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import BASECLASS.BaseClassFramework;
import DataDriven.GetData;
import FrameworkPageObjects.RegistrationPage;



public class BaseClasstTest extends BaseClassFramework {
	
	
	public RegistrationPage rp;
	
	@BeforeTest
	public void beforeTest(){
		super.fileName="./src/test/resources/testdata.xls";
	}
	
	
	@BeforeMethod
	public void before(){
		rp=new RegistrationPage(driver);
	}
	
	
	
	
}
