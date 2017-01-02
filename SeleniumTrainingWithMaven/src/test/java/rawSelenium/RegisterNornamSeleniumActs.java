package rawSelenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterNornamSeleniumActs extends BaseClass{
  @Test
  public void f() {
	  
	  driver.get("http://automationpractice.com/index.php");
	  
	  
	  //Click om Sign In
	  
	  driver.findElement(By.cssSelector(".login")).click();
	  
	  driver.findElement(By.id("email_create")).sendKeys("test123samay@qwe.com");
	  
	  driver.findElement(By.cssSelector("button[type='submit'][name='SubmitCreate']")).click();
  }
}
