package com.AmazonAutomation.QA.LoginPageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.AmazonAutomation.BaseClass.BaseClass;
import com.AmazonAutomation.QA.Utility.UtilClass;

public class BabyShoesPageObjects extends BaseClass
{
   public  BabyShoesPageObjects()
   {
	   PageFactory.initElements(driver, this);
   }
   // BestSeller Page
    @FindBy(xpath="//div[@id='nav-xshop']//a[text()='Best Sellers']")
    private WebElement bestseller;
    //babyProducts
	@FindBy(xpath="//div[@class='_p13n-zg-nav-tree-all_style_zg-browse-group__88fbz']//a[text()='Baby Products']")
    private WebElement babyproducts;  
    //Navgate to babyShoes page in best seller page option in baby Products 
    @FindBy(xpath="//descendant::div[@class='_p13n-zg-nav-tree-all_style_zg-browse-group__88fbz']//div[@class='_p13n-zg-nav-tree-all_style_zg-browse-item__1rdKf _p13n-zg-nav-tree-all_style_zg-browse-height-large__1z5B8']//child::a[text()='Baby Shoes']") 
    private WebElement babyshoes;
   
    // Searchbox
    @FindBy(xpath="//div[@id='nav-search']//descendant::div[@class='nav-search-field ']//child::input[@id='twotabsearchtextbox']")
    private WebElement searchBox;
    
    //Mirror
    @FindBy(xpath="//div[@class='nav-right']//descendant::span[@id='nav-search-submit-text']//input[@id='nav-search-submit-button']")
    private WebElement mirror;
    //message display
    @FindBy(xpath="//div[@class='s-desktop-width-max sg-row-align-items-center s-wide-grid-style-t1 s-wide-grid-style sg-row']//div[@class='a-section a-spacing-small a-spacing-top-small']")
    private WebElement message;
  //  @FindBy(xpath="//div[@class='s-desktop-width-max sg-row-align-items-center s-wide-grid-style-t1 s-wide-grid-style sg-row']//descendant::div[@class='a-section a-spacing-small a-spacing-top-small']")
    //private WebElement message;
    @FindBy(xpath="//div[@class='s-no-outline']//span[contains(text(),'No')]")
    private WebElement noresult;
    
    /*
	 * Author:
	 * Date:
	 * Parameters:
	 * Description:
	 */
   public void searchValiddata(String data)
   {
	   
	   bestseller.click();
	   babyproducts.click();
	   babyshoes.click();
	   searchBox.sendKeys(data);
	   mirror.click();
	   try {
			UtilClass.takeSnapShot(driver, "validdatamessage.png");
		  } 
		   catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	    message.click();
	    String result=message.getText();
	    System.out.println(result);
	    //System.out.println(message.isDisplayed());
	    UtilClass.raiseAssertForDataInSearchBox(message.getText());   
   }
   /*
	 * Author:
	 * Date:
	 * Parameters:
	 * Description:
	 */
   public void searchInvaliddata(String data)
   {
	   bestseller.click();
	   babyproducts.click();
	   babyshoes.click();
	   searchBox.sendKeys(data);
	   mirror.click();
	   UtilClass.raiseAssertForDataInSearchBox(noresult.getText());
	   try {
		     UtilClass.takeSnapShot(driver, "invaliddatamessage.png");
	      } 
	   catch (Exception e) 
	   {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
   
 }
