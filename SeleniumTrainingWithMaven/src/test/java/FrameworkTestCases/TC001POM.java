package FrameworkTestCases;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import FrameworkBase.BaseClasstTest;
import rawSelenium.BaseClass;

public class TC001POM extends BaseClasstTest {

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
		//driver.findElement(By.xpath("//a[@class='login']")).click();
		rp.link_SignIn.click();
		rp.textbox_email.sendKeys(email);
		rp.button_Submit.click();
		rp.radio_gender.click();
		rp.textbox_cfname.sendKeys(c_fname);
		rp.textbox_clname.sendKeys(c_lname);
		rp.textbox_email2.clear();
		rp.textbox_email2.sendKeys(email);
		rp.textbox_password.sendKeys(password);
		
		
		

		new Select(rp.dropdown_days).selectByIndex(Integer
				.parseInt(days));

		new Select(rp.dropdown_months).selectByIndex(Integer
				.parseInt(month));

		new Select(rp.dropdown_years).selectByValue(year);

		Thread.sleep(10000);

		rp.textbox_firstname.sendKeys(fname);
		rp.textbox_lastname.sendKeys(lname);
		rp.textbox_address1.sendKeys(address);
		rp.textbox_city.sendKeys(city);
		rp.textbox_id_state.sendKeys(state);
		rp.textbox_postcode.sendKeys(postcode);

		rp.textbox_phone_mobile.sendKeys(mobile);

		rp.button_SubmitFinal.click();

	}
}
