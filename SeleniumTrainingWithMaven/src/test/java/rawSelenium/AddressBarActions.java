package rawSelenium;

import org.testng.annotations.Test;



public class AddressBarActions extends BaseClass{
	
	
	
	
  @Test
  public void testAllAdressBar() {
	  
	  //1 Load a URL
	  
	  driver.get("https://www.facebook.com/");
	  
	  // 2nd way to load
	  
	  driver.navigate().to("https://www.google.co.in");
	  
	  // Go Back
	  
	  driver.navigate().back();
	  
	  //Get the Current URL
	  
	  String url=driver.getCurrentUrl();
	  System.out.println("The currsent url is at "+url);
	  
	  //1 step forward
	  
	  driver.navigate().forward();
	  
	  
	  String url2=driver.getCurrentUrl();
	  System.out.println("The currsent url is at "+url2);
	  
	  //Lets check the page title
	  
	  String title=driver.getTitle();
	  
	  System.out.println("The page title is "+title);
	  
	  //Refresh
	  
	  driver.navigate().refresh();
	  
	  
	  
	  
  }
 

}
