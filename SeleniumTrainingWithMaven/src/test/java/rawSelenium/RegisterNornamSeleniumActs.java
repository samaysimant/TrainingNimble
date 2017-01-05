package rawSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterNornamSeleniumActs extends BaseClass{
  @Test
  public void f() {
	  driver.get("http://automationpractice.com/index.php");
	  driver.findElement(By.xpath("//a[@class='login']")).click();
	  driver.findElement(By.id("email_create")).sendKeys("jhbl1221@gmail.com");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.name("SubmitCreate")).click();
	  driver.findElement(By.id("id_gender1")).click();
	  driver.findElement(By.name("customer_firstname")).sendKeys("Ricky");
	  driver.findElement(By.id("customer_lastname")).sendKeys("Pati");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("email")).sendKeys("jhbl1221@gmail.com");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.id("passwd")).sendKeys("sandy123");
	  driver.findElement(By.xpath("//select[@id='days']")).sendKeys("8");
	  driver.findElement(By.id("months")).sendKeys("June");
	  driver.findElement(By.id("years")).sendKeys("1988");
	  driver.findElement(By.id("firstname")).sendKeys("Ricky");
	  driver.findElement(By.id("lastname")).sendKeys("Pati");
	  driver.findElement(By.id("address1")).sendKeys("Jefferson Road Rubi Layout");
	  driver.findElement(By.id("city")).sendKeys("Bangalore");
	  driver.findElement(By.id("id_state")).sendKeys("California");
	  driver.findElement(By.id("postcode")).sendKeys("87656");
	  
	  driver.findElement(By.id("phone_mobile")).sendKeys("9878765653");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.id("submitAccount")).click();
	  
	  
	  Thread.sleep(30000);
	  
  }
}
