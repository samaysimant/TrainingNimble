package FrameworkPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwitchWindowPO {
	
	WebDriver driver;
	
	public SwitchWindowPO(WebDriver driver2){
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(linkText="Sign in")
//	public WebElement link_signIn;
	
	@FindBy(xpath="//span[.='HOME']/..")
	public WebElement tab_home;
	
	@FindBy(id="button1")
	public WebElement button_switch;
	
	@FindBy(xpath="//div[@id='content']/h1")
	public WebElement tab_content;
	
	
}
