package FrameworkPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	WebDriver driver;
	
	public RegistrationPage(WebDriver driver2){
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(linkText="Sign in")
//	public WebElement link_signIn;
	
	@FindBy(xpath="//a[@class='login']")
	public WebElement link_SignIn;
	
	@FindBy(id="email_create")
	public WebElement textbox_email;
	
	@FindBy(name="SubmitCreate")
	public WebElement button_Submit;
	
	@FindBy(id="id_gender1")
	public WebElement radio_gender;
	//-----------------------------
	@FindBy(name="customer_firstname")
	public WebElement textbox_cfname;
	
	
	@FindBy(id="customer_lastname")
	public WebElement textbox_clname;
	
	
	@FindBy(id="email")
	public WebElement textbox_email2;
	
	@FindBy(id="passwd")
	public WebElement textbox_password;
	
	@FindBy(id="days")
	public WebElement dropdown_days;
	
	@FindBy(id="months")
	public WebElement dropdown_months;
	
	
	@FindBy(id="years")
	public WebElement dropdown_years;
	
	
	@FindBy(id="firstname")
	public WebElement textbox_firstname;
	
	@FindBy(id="lastname")
	public WebElement textbox_lastname;
	
	@FindBy(id="address1")
	public WebElement textbox_address1;
	
	@FindBy(id="city")
	public WebElement textbox_city;
	
	@FindBy(id="id_state")
	public WebElement textbox_id_state;
	
	@FindBy(id="postcode")
	public WebElement textbox_postcode;
	
	@FindBy(id="phone_mobile")
	public WebElement textbox_phone_mobile;
	
	@FindBy(id="submitAccount")
	public WebElement button_SubmitFinal;
	
	
	
	
	
	
	
	

}
