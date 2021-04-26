package skb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import skb.base.testbase;




	 
	public class Homepage extends testbase
	{
	       @FindBy(xpath="/html/body/div[1]/header/nav/div[2]/div/div/ul/li[4]/a")WebElement profile;
	       @FindBy(xpath="/html/body/div[1]/header/nav/div[2]/div/div/ul/li[4]/ul/li/div/div[2]/h4")WebElement Text1;
	       @FindBy(xpath="/html/body/div[1]/aside/div/section/ul[2]/li[1]/a/span")WebElement front;
	       
	  
	   public Homepage()
	   {
		   PageFactory.initElements(driver, this);
		   
	   }
	  
	   public String checkhomepagetitle()
	   {
		   String title=driver.getTitle();
		return title;
		   
	   }
	  
	   public boolean usernametest()
	   {
		   profile.click();
		   boolean logo=Text1.isDisplayed();
		   return logo;
	   }
	   public frontofficepage clickfrontoffice()
	   {
	   	front.click();
	   	return new frontofficepage();
	   	
	   				
	   }

	
	    
	}

