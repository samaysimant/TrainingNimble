package FrameworkTestCases;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import FrameworkBase.BaseClasstTest;
import rawSelenium.BaseClass;

public class TC001 extends BaseClasstTest {

	Random random = new Random();

	@Test(dataProvider="DP")
	public void f(String testcaseId, String desc, String browser,

	String url, String c_fname, String c_lname, String password, String days,
			String month, String year, String fname, String lname,
			String address, String city, String state, String postcode,
			String mobile

	) throws InterruptedException {
		int val = random.nextInt((99999 - 9) + 1) + 1;
		String email = "testnimble" + val + "@gmail.com";

		driver.get(url);
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email_create")).sendKeys(email);

		driver.findElement(By.name("SubmitCreate")).click();
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.name("customer_firstname")).sendKeys(c_fname);
		driver.findElement(By.id("customer_lastname")).sendKeys(c_lname);

		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);

		driver.findElement(By.id("passwd")).sendKeys(password);

		// OLD ways*********
		// driver.findElement(By.xpath("//select[@id='days']")).sendKeys("8");
		// driver.findElement(By.xpath("//select[@id='days']/option[@value='3']")).click();
		// select[@id='days']/option[@value='3']
		// driver.findElement(By.id("months")).sendKeys("June");
		// driver.findElement(By.id("years")).sendKeys("1988");

		// *new way
		// select value from dropdown

		new Select(driver.findElement(By.id("days"))).selectByIndex(Integer
				.parseInt(days));

		new Select(driver.findElement(By.id("months"))).selectByIndex(Integer
				.parseInt(month));

		new Select(driver.findElement(By.id("years"))).selectByValue(year);

		Thread.sleep(10000);

		driver.findElement(By.id("firstname")).sendKeys(fname);
		driver.findElement(By.id("lastname")).sendKeys(lname);
		driver.findElement(By.id("address1")).sendKeys(address);
		driver.findElement(By.id("city")).sendKeys(city);
		driver.findElement(By.id("id_state")).sendKeys(state);
		driver.findElement(By.id("postcode")).sendKeys(postcode);

		driver.findElement(By.id("phone_mobile")).sendKeys(mobile);

		driver.findElement(By.id("submitAccount")).click();

	}
}
