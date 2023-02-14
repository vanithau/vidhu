package com.AmazonAutomation.QA.LoginPageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.AmazonAutomation.BaseClass.BaseClass;
import com.AmazonAutomation.QA.Utility.UtilClass;

public class BabyProductsSoothersTeethersPageObjects extends BaseClass
{

	
	public BabyProductsSoothersTeethersPageObjects()
	{
		PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath="//div[@id='nav-xshop']//a[text()='Best Sellers']")
	 private WebElement bestseller;
	 @FindBy(xpath="//div[@class='_p13n-zg-nav-tree-all_style_zg-browse-group__88fbz']//a[text()='Baby Products']")
	 private WebElement babyproducts;
	   // Searchbox
	 @FindBy(xpath="//div[@id='nav-search']//descendant::div[@class='nav-search-field ']//child::input[@id='twotabsearchtextbox']")
	 private WebElement searchBox;
	    
	 //Mirror
	 @FindBy(xpath="//div[@class='nav-right']//descendant::span[@id='nav-search-submit-text']//input[@id='nav-search-submit-button']")
	 private WebElement mirror;
	 //valid data display the result message
	 @FindBy(xpath="//div[@class='sg-col-inner']//descendant::span[contains(text(),'result')]")
	 private WebElement message;
	 //invalid data display the message
	 @FindBy(xpath="//div[@class='s-no-outline']//span[contains(text(),'No')]")
	 private WebElement noresult;
	     	    
	  
		    
	
	 /*
		 * Author:
		 * Date:
		 * Parameters:
		 * Description:
		 */
	public void displaySoothersTeethers_validData(String data)
	{
		 bestseller.click();
		 babyproducts.click();
		 searchBox.sendKeys(data);
		 mirror.click();
		 UtilClass.raiseAssertForDataInSearchBox(message.getText());
		 
		    
	}
	/*
	 * Author:
	 * Date:
	 * Parameters:
	 * Description:
	 */
	public void displaySoothersTeethers_invalidData(String data)
	{
		 bestseller.click();
		 babyproducts.click();
		 searchBox.sendKeys(data);
		 mirror.click();
		 UtilClass.raiseAssertForDataInSearchBox(noresult.getText());
	
		 
		    
	}	
	
}
