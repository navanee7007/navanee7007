package skb.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import skb.base.testbase;
import skb.util.Datepicker;
import skb.util.commonutility;

public class visitorbookpagebook extends testbase 
{
	 Datepicker d1=new Datepicker();
	@FindBy(xpath="/html/body/div[1]/div[1]/section/div/div/div/div[1]/h3")WebElement visitorlist;
	@FindBy(xpath="/html/body/div[1]/div[1]/section/div/div/div/div[1]/div/a")WebElement addvisitor1;
	@FindBy(xpath="/html/body/div[1]/div[1]/section/div/div/div/div[1]/div/a")WebElement addvisitor2;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[1]/div[1]/div[1]/div/select")WebElement purpose;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[1]/div[1]/div[2]/div/input")WebElement name;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[1]/div[2]/div[1]/div/input")WebElement phone;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[1]/div[2]/div[2]/div/input")WebElement id;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[1]/div[3]/div[1]/div/input")WebElement NOP;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[1]/div[5]/textarea")WebElement note;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[2]/button")WebElement save;
	@FindBy(xpath=("/html/body/div[3]/div/div/div[2]/form/div[1]/div[6]/div/div/input"))WebElement upload;
	@FindBy(xpath=("//input[@id='date']"))WebElement date;
	
	public visitorbookpagebook() 
	{
		PageFactory.initElements(driver,this);
	}
	
    public void clickvisitorbook()
	
	{
		addvisitor1.click();
	 	
	}
	public boolean usernametest2()
	 {
		   
		   boolean logo=visitorlist.isDisplayed();
		   return logo;
		   
	}
	public boolean usernametest3()
	 {
		   
		   boolean logo=addvisitor2.isDisplayed();
		   return logo;
		   }
	
	public void detail(String data[]) 
	{
	       
		   addvisitor1.click();
		  // String var=new String("E:\\selenium\\chitta.pdf");
		   try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       
		   purpose.click();
		   Select obj=new Select(purpose);
		   obj.selectByVisibleText(data[0]);
		   name.sendKeys(data[1]);
		   phone.sendKeys(data[2]);
		   id.sendKeys(data[3]);
		   NOP.sendKeys(data[4]);
		   note.sendKeys(data[5]);
		   
		   date.click();
		  
		   d1.datpicker(data[6]);
		
		   //commonutility.mouseclick(upload);
		  // commonutility.upload(var);
		   save.click();
		   
		   
		 
		   
		   
		   
		}


}
