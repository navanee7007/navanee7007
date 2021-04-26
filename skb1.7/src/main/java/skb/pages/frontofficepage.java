package skb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import skb.base.testbase;

public class frontofficepage extends testbase
{
 
	@FindBy(xpath="/html/body/div[1]/div[1]/section/div/div/div/div[1]/h3")WebElement appoindetals;
	@FindBy(xpath="/html/body/div[1]/div[1]/section/div/div/div/div[1]/div/a[2]")WebElement visitorbook;
	
	
	 public frontofficepage()
	   {
		   PageFactory.initElements(driver, this);
		   
	   }
	  public boolean usernametest1()
	   {
		  
		   boolean logo=appoindetals.isDisplayed();
		   return logo;
	   }
	 
	  
	public visitorbookpagebook clickvisitorbook()
	{
	 	visitorbook.click();
	 	
	   	return new visitorbookpagebook();

		
	}
	

	}
	  
	

