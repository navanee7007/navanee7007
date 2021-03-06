package skb.admintestcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import skb.base.testbase;
import skb.pages.Homepage;
import skb.pages.Logpage;
import skb.pages.frontofficepage;

            
			public class frontofficetest extends testbase
			{
				 Logpage log;
				 Homepage home;
				 frontofficepage front;
				 
				 public frontofficetest()
				 {
					 super();
					 
				 }
				 
				 @BeforeMethod
				 public void setup()
			     {
				    Initialization();
					log=new Logpage();
					//home=new Homepage();
					home=log.logintest(prop.getProperty("username"),prop.getProperty("password"));
					front=home.clickfrontoffice();
			     }
				 @Test(priority=1)
					public void checkuserlabel1() 
					{
						
						Assert.assertTrue(front.usernametest1());
					
						
					}
				 
				 @Test(priority=2)
					public void checkvisitorsclick()
					{
						front.clickvisitorbook();	
					}
				
				 
				 @AfterMethod
					public void AfterMethod()
					{
						driver.close();
					}
			 
			}
