package FrameworkTestCases;

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

import FrameworkBase.BaseClasstTest;

@Test(groups="SMOKE")
public class TC002HYB extends BaseClasstTest {

	@Test(dataProvider="DP")
	public void learncomplexactions(String tcname, String desc, String browser,
			String url

	) throws Exception {

		
		req.openUrl(url);
		req.click(sw.button_switch, "Click on The button");

		req.switchWindow(1, "Switch to 1st window");

		driver.manage().window().maximize();
		req.click(sw.tab_home, "Click on home");

		Thread.sleep(2000);

		req.switchWindow(0, "Back to parent window");

		String actText = req.getText(sw.tab_content);
		
		String expText = "Switch Windows";

		Assert.assertTrue(actText.contains(expText));

		
	}

}
