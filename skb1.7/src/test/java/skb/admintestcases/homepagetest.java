package skb.admintestcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import skb.base.testbase;
import skb.pages.Homepage;
import skb.pages.Logpage;

	public class homepagetest extends testbase
	{
	  
		Logpage log;
		Homepage home;
		public homepagetest() 
		{
			super();
			
		}
		@BeforeMethod
		public void setup()
		{
			Initialization();
			log=new Logpage();
		home=log.logintest(prop.getProperty("username"),prop.getProperty("password"));
		}
		@Test(priority=1)
		public void homepagetitle()
		{
		String expectedtitle="Smart Hospital Management System";
		String actualtitle=home.checkhomepagetitle();
		Assert.assertEquals(actualtitle, expectedtitle);
		}
		//logo
		
		@Test(priority=2)
		public void checkuserlabel() 
		{
			
			Assert.assertTrue(home.usernametest());
		
			
		}
		@Test(priority=3)
		public void checkfrontofficeclick()
		{
			home.clickfrontoffice();	
		}
		@AfterMethod
		public void AfterMethod()
		{
			driver.close();
		}
	}


