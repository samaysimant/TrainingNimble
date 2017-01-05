package rawSelenium;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegisterNornamSeleniumActs extends BaseClass{
	
	Random  random=new Random();
	
	
	
  @Test
  public void f() throws InterruptedException {
	  int val=random.nextInt((99999 - 9) + 1)+1;
	  String email="testnimble"+val+"@gmail.com";
	  
	  driver.get("http://automationpractice.com/index.php");
	  driver.findElement(By.xpath("//a[@class='login']")).click();
	  driver.findElement(By.id("email_create")).sendKeys(email);
	  
	  
	  
	  driver.findElement(By.name("SubmitCreate")).click();
	  driver.findElement(By.id("id_gender1")).click();
	  driver.findElement(By.name("customer_firstname")).sendKeys("Ricky");
	  driver.findElement(By.id("customer_lastname")).sendKeys("Pati");
	  
	  
	  
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("email")).sendKeys(email);
	  
	  
	  driver.findElement(By.id("passwd")).sendKeys("sandy123");
	  
	  // OLD ways*********
	//  driver.findElement(By.xpath("//select[@id='days']")).sendKeys("8");
	 // driver.findElement(By.xpath("//select[@id='days']/option[@value='3']")).click();
	//select[@id='days']/option[@value='3']
	//  driver.findElement(By.id("months")).sendKeys("June");
	//  driver.findElement(By.id("years")).sendKeys("1988");
	  
	  //*new way
	  //select value from dropdown 
	  
	  new Select(driver.findElement(By.id("days"))).selectByVisibleText("2  ");
	  
	  new Select(driver.findElement(By.id("months"))).selectByIndex(4);
	  
	  new Select(driver.findElement(By.id("years"))).selectByValue("2015");
	  
	  Thread.sleep(10000);
	  
	  
	  driver.findElement(By.id("firstname")).sendKeys("Ricky");
	  driver.findElement(By.id("lastname")).sendKeys("Pati");
	  driver.findElement(By.id("address1")).sendKeys("Jefferson Road Rubi Layout");
	  driver.findElement(By.id("city")).sendKeys("Bangalore");
	  driver.findElement(By.id("id_state")).sendKeys("California");
	  driver.findElement(By.id("postcode")).sendKeys("87656");
	  
	  driver.findElement(By.id("phone_mobile")).sendKeys("9878765653");
	 
	  driver.findElement(By.id("submitAccount")).click();
	  
	  
	 
	  
  }
}
