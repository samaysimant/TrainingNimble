package testNgPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class UnderStandAnnotations {
	
	
  @Test
  public void m1() {
	  System.out.println("Thios is method 1");
  }
  
  @Test
  public void m2() {
	  System.out.println("Thios is method 2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Thios is method before");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Thios is method after");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Thios is test before");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("This is fatre test");
  }

}
