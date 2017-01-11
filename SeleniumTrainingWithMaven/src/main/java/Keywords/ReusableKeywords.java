package Keywords;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
	
	int stepNum=1;
	
	public static List<String> report=new ArrayList<String>();
	
	public ReusableKeywords(WebDriver driver){
		this.driver=driver;
	}
	
	
	public void openUrl(String url){
		driver.get(url);
	}
	
	public void click(WebElement ele,String desc){
		try{
			this.highlightElement(ele);
			System.out.println("StepNum :"+stepNum+" "+desc+" Status Pass");
			report.add("StepNum :"+stepNum+" "+desc+" Status Pass");
		   ele.click();
		   stepNum++;
		}
		catch(Exception e){
			System.out.println("StepNum :"+stepNum+" "+desc+" Status Fail");
			report.add("StepNum :"+stepNum+" "+desc+" Status Fail");
			stepNum++;
		}
	}
	
	public void type(WebElement ele,String val,String desc){
		try{
			this.highlightElement(ele);
			System.out.println("StepNum :"+stepNum+" "+desc+" Status Pass");
			report.add("StepNum :"+stepNum+" "+desc+" Status PASS");
		   ele.sendKeys(val);;
		   stepNum++;
		}
		catch(Exception e){
			System.out.println("StepNum :"+stepNum+" "+desc+" Status Fail");
			report.add("StepNum :"+stepNum+" "+desc+" Status Fail");
			stepNum++;
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
		Thread.sleep(300);
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				element, "");

	}
	
	
}
