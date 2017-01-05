package rawSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AdvancedSelenium extends BaseClass{
  @Test
  public void f() {
	  
	  driver.get("http://automationpractice.com");
	  
	  WebElement women=driver.findElement(By.xpath("//a[@title='Women']"));
	  WebElement tshirts=driver.findElement(By.xpath("//a[@title='T-shirts']"));
	  Actions act=new Actions(driver);
	  
	  act.moveToElement(women).build().perform();
	  wait(2000);
	  int xcoo=tshirts.getLocation().x;
	  System.out.println("X coord :"+xcoo);
	  System.out.println("Size of tshirts "+tshirts.getSize());
	  
	  wait(10000);
	  
  }
}
