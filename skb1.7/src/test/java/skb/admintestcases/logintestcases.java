package skb.admintestcases;
//"<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >"
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import skb.base.testbase;
import skb.pages.Homepage;
import skb.pages.Logpage;

public class logintestcases extends testbase
{
  
	Logpage obj;
	public logintestcases() 
	{
		super();
		
	}
	@BeforeMethod
	public void setup()
	{
		Initialization();
		obj=new Logpage();
		
	}
	@Test(priority=0)
	public void titletest()
	{
	String expectedtitle="Smart Hospital : Hospital Management System";
	String actualtitle=obj.checkfortitle();
	Assert.assertEquals(actualtitle, expectedtitle);
	}
	//logo
	
	@Test(priority=1)
	public void logotest() 
	{
		
		Assert.assertTrue(obj.checklogo());
		//Homepage obj=new Homepage();
		
	}
	@Test(priority=2)
	
	public void login()
	{
		obj.logintest(prop.getProperty("username"),prop.getProperty("password"));
		/*public void logout11()
		{
		obj.logout11();
		}*/
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}