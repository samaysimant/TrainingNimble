package FrameworkTestCases;

import org.testng.annotations.Test;

import FrameworkBase.BaseClasstTest;



public class TC002 extends BaseClasstTest{
	
	
	
	
  @Test(dataProvider="DP")
  public void testAllAdressBar(
		  String tcname
		  ,String desc
		  ,String browser
		  ,String baseurl
		  
		  ) {
	  
	  
	  System.out.println("This is running test case for "+desc);
	  //1 Load a URL
	  
	  driver.get(baseurl);
	  
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
