package skb.admintestcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest
{
	WebDriver driver;

  @Test
  public void f() 
  {
	  driver.get("http://triotend.com");
	  
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");

	  driver=new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.close();
	  
  }

}
