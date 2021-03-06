package skb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import skb.base.testbase;

public class Logpage extends testbase
{
      // @FindBy(css="input")WebElement logo;
       @FindBy(css="input#email")WebElement uname;
       @FindBy(css="input#password")WebElement upass;
       @FindBy(tagName="img")WebElement HSPlogo;
       @FindBy(linkText="forgotpassword")WebElement fpass;
       @FindBy(className="btn")WebElement ibtn;
      // @FindBy(className="dropdown-toggle")WebElement logut1;  
       //@FindBy(className="pull-right")WebElement logut2;
       
  
   public Logpage()
   {
	   PageFactory.initElements(driver, this);
	   
   }
   //to check title
   public String checkfortitle()
   {
	   String title=driver.getTitle();
	return title;
	   
   }
   //to validate logo
   public boolean checklogo()
   {
	   boolean logo=HSPlogo.isDisplayed();
	   return logo;
   }
  /* public void logout11()
   {
		logut1.click();
		logut2.click();
   }*/
   public Homepage logintest(String username,String password)
   {
   	uname.sendKeys(username);
   	upass.sendKeys(password);
   	ibtn.click();
   //	logut1.click();
	//logut2.click();
   	return new Homepage();
   	
   				
   }
    
}