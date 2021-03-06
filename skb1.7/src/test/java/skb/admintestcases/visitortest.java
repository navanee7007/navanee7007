package skb.admintestcases;

import org.testng.annotations.Test;

import skb.base.testbase;
import skb.pages.Homepage;
import skb.pages.Logpage;
import skb.pages.frontofficepage;
import skb.pages.visitorbookpagebook;
import skb.util.ReadExcel;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class visitortest extends testbase
{
	 Logpage log;
	 Homepage home;
	 frontofficepage front;
	 visitorbookpagebook visit;
    
   //  pick
	 String sheetName ="datas";
	public visitortest()
	{
		super();
		
	}
	  @BeforeMethod
	  public void beforeMethod()
	  {
		    Initialization();
			log=new Logpage();
			home=log.logintest(prop.getProperty("username"),prop.getProperty("password"));
			front=home.clickfrontoffice();
		    visit=front.clickvisitorbook();
		  
		  
	  }
	 @DataProvider 
	 public Object[][] getVISTestData()
	  { 
		  Object data[][] =ReadExcel.getTestData(sheetName);
		  return data; 
		  }
	 
     @Test(dataProvider="getVISTestData")
     public void addvisitor(String args[]) 
     {
    	/* Assert.assertTrue(visit.usernametest2());
    	 visit.clickvisitorbook();
    	 Assert.assertTrue(visit.usernametest3());*/
         visit.detail(args);
     }
	/* @Test(priority=1)
		public void checkuserlabel2() 
		{
			
			Assert.assertTrue(visit.usernametest2());
		
        }
	 @Test(priority=2)
		public void checkaddvisitorsclick1()
		{
			visit.clickvisitorbook();	
		}
	 @Test(priority=3)
		public void checkuserlabel3() 
		{
			
			Assert.assertTrue(visit.usernametest3());
		
		}
	 @Test //(priority=4) 
	 public void details1()
	 {
		
		 visit.detail();
	 }*/
	 
	 
	 
	
	
	  @AfterMethod
	  public void afterMethod() 
	  {
		  driver.close();
	  }

}
