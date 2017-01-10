package Keywords;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;

//import com.sun.jna.platform.FileUtils;

public class ReusableKeywords {
	WebDriver driver;
	String reportPath = "D:\\Reports";
	int stepNum = 0;

	public ReusableKeywords(WebDriver driver) {
		this.driver = driver;

	}

	public void openUrl(String url) {
		driver.get(url);
	}

	public void click(WebElement ele) {
		try {
			highlightElement(ele);
			ele.click();
			takescreenshot(reportPath + "\\" + stepNum + ".jpg");
		} catch (Exception e) {
  e.printStackTrace();
		} finally {
			stepNum++;
		}

	}

	public void type(WebElement ele, String val) {
		highlightElement(ele);
		ele.sendKeys(val);
	}

	public void mousehover(WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
	}

	public String getText(WebElement ele) {
		highlightElement(ele);
		return ele.getText();
	}

	public void selectByValue(WebElement ele, String value) {
		highlightElement(ele);
		new Select(ele).selectByValue(value);

	}

	public void selectByIndex(WebElement ele, int index) {
		highlightElement(ele);
		new Select(ele).selectByIndex(index);

	}

	public void selectByVisibletext(WebElement ele, String value) {
		highlightElement(ele);
		new Select(ele).selectByVisibleText(value);

	}

	public String getAttribute(WebElement ele, String key) {
		highlightElement(ele);
		return ele.getAttribute(key);
	}

	private void highlightElement(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				element, "color: yellow; border: 5px solid yellow;");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				element, "");

	}

	public void takescreenshot(String path) throws IOException {
		File scrFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(path));

	}
	
	public void acceptAlert(){
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void rejectAlert(){
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	public void switchFrame(String frameid){
		driver.switchTo().frame(frameid);
	}
	
	public void switchFrame(WebElement ele){
		driver.switchTo().frame(ele);
	}
	
	public void switchFrame(int id){
		driver.switchTo().frame(id);
	}

}
