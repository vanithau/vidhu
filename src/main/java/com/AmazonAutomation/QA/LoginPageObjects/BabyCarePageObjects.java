package com.AmazonAutomation.QA.LoginPageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.AmazonAutomation.BaseClass.BaseClass;
import com.AmazonAutomation.QA.Utility.UtilClass;

public class BabyCarePageObjects extends BaseClass
{
	public  BabyCarePageObjects()
	{
		 PageFactory.initElements(driver, this);
	}	 
		 
	  @FindBy(xpath="//div[@id='nav-xshop']//a[text()='Best Sellers']")
	  private WebElement bestseller;
	  @FindBy(xpath="//div[@class='_p13n-zg-nav-tree-all_style_zg-browse-group__88fbz']//a[text()='Baby Products']")
	  private WebElement babyproducts;
	  @FindBy(xpath="//div[@class='_p13n-zg-nav-tree-all_style_zg-browse-item__1rdKf _p13n-zg-nav-tree-all_style_zg-browse-height-large__1z5B8']//a[text()='Baby Care']") 
	  private WebElement babyCare;
	  @FindBy(xpath="//div[@id='nav-subnav']//a[@aria-label='Activity & Entertainment']//span[1]")
	  private WebElement ActivityAndEntertainment;
	  @FindBy(xpath="//div[@class='a-checkbox a-checkbox-fancy aok-float-left apb-browse-refinements-checkbox']//label//i[@class='a-icon a-icon-checkbox']")
	  private WebElement Checkboxses;
	  @FindBy(xpath="//li[@id='p_72/1318476031']//section[@aria-label='4 Stars & Up']")
	  private WebElement stars4Up;
	  @FindBy(xpath="//li[@id='p_36/2485524031']//span[@class='a-list-item']//a//span[text()='Under ₹500']")
	  private WebElement Under500;
	  @FindBy(xpath="//div[@id='search']//div[@class='sg-col-inner']//div[@class='a-section a-spacing-small a-spacing-top-small']//span")
	  private WebElement result;
	  // Searchbox
	  @FindBy(xpath="//div[@id='nav-search']//descendant::div[@class='nav-search-field ']//child::input[@id='twotabsearchtextbox']")
	  private WebElement searchBox;
	   
	  //Mirror
	  @FindBy(xpath="//div[@class='nav-right']//descendant::span[@id='nav-search-submit-text']//input[@id='nav-search-submit-button']")
	  private WebElement mirror;

	  /*
	   * Author: vanitha 
	   * Date:6/02/2023
	   * Parameters:
	   * Description: Beseller Option display the Baby Products and check the checkbox, Display the 4+ Rating and
	   * display the Under 500 Products 
	   * 
	   */
	  
	  public void babyCare()
	  {
		  bestseller.click();
		  babyproducts.click();
		  babyCare.click();
		  ActivityAndEntertainment.click();
		  Checkboxses.click();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  stars4Up.click();
		  try {
			//UtilClass.takeSnapShot(driver, "rating.png");
		     }
		   catch (Exception e) {
			
			e.printStackTrace();
		}
		  /*String message= result.getText();
		  System.out.println("The Message of  result " + message);
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  Under500.click();*/	 	 
	  }
}
