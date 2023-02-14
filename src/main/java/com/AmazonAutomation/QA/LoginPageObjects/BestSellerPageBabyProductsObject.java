package com.AmazonAutomation.QA.LoginPageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import com.AmazonAutomation.BaseClass.BaseClass;
import com.AmazonAutomation.QA.Utility.UtilClass;

public class BestSellerPageBabyProductsObject extends BaseClass 
{
 
	public  BestSellerPageBabyProductsObject()
	{
		 PageFactory.initElements(driver, this);
	}
	
	
	 @FindBy(xpath="//div[@id='nav-xshop']//a[text()='Best Sellers']")
	  private WebElement bestseller;
	 @FindBy(xpath="//div[@class='_p13n-zg-nav-tree-all_style_zg-browse-group__88fbz']//a[text()='Baby Products']")
	  private WebElement babyproducts;
	  @FindBy(xpath="//a[@class='a-link-normal']//div[@class='_cDEzb_p13n-sc-css-line-clamp-3_g3dy1']")
	  private WebElement names;
	  
	  //baby@Toddler Toys
	  @FindBy(xpath="//div[@class='_p13n-zg-nav-tree-all_style_zg-browse-item__1rdKf _p13n-zg-nav-tree-all_style_zg-browse-height-large__1z5B8']//a[text()='Baby & Toddler Toys']")
	  private WebElement BabyToddlerToy;
	  //display the price
	  @FindBy(xpath="//div[@class='_cDEzb_p13n-sc-price-animation-wrapper_3PzN2']//descendant::span[@class='a-size-base a-color-price']")
	  private WebElement price;
	 //Swing bouncers 
	  @FindBy(xpath="//div[@class='_p13n-zg-nav-tree-all_style_zg-browse-item__1rdKf _p13n-zg-nav-tree-all_style_zg-browse-height-large__1z5B8']//a[text()='Swings, Bouncers & Rockers']")
	  private WebElement SwingsRockers;
	     //nav gate to next page
	  @FindBy(xpath="//div[@class='a-text-center']//ul[@class='a-pagination']//li[@class='a-last']//a")
	  private WebElement nextPage;
	  @FindBy(xpath="//div[@class='s-desktop-width-max sg-row-align-items-center s-wide-grid-style-t1 s-wide-grid-style sg-row']//div[@class='a-section a-spacing-small a-spacing-top-small']")
	  private WebElement message;
	   //@FindBy(xpath="//div[@class='s-desktop-width-max sg-row-align-items-center s-wide-grid-style-t1 s-wide-grid-style sg-row']//descendant::div[@class='a-section a-spacing-small a-spacing-top-small']")
	    //private WebElement message;
	    @FindBy(xpath="//div[@class='s-no-outline']//span[contains(text(),'No')]")
	    private WebElement noresult;
	     
	     // Searchbox
	    @FindBy(xpath="//div[@id='nav-search']//descendant::div[@class='nav-search-field ']//child::input[@id='twotabsearchtextbox']")
	    private WebElement searchBox;
	    
	    //Mirror
	    @FindBy(xpath="//div[@class='nav-right']//descendant::span[@id='nav-search-submit-text']//input[@id='nav-search-submit-button']")
	    private WebElement mirror;
	  
	  SoftAssert softAssert = new SoftAssert();
	  
	  
	  /*
	   * Author: vanitha 
	   * Date:
	   * Parameters:
	   * Description:
	   * 
	   */
	public void babyproduct() throws Exception
	{
		 bestseller.click();
		 babyproducts.click();
		 UtilClass.takeSnapShot(driver, "Img1.png");
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 List<WebElement> s =driver.findElements(By.xpath("//a[@class='a-link-normal']//div[@class='_cDEzb_p13n-sc-css-line-clamp-3_g3dy1']"));
		 //System.out.println("Display the list under Category::"+s.size());
		 for(int j=0;j<s.size();j++)
		 {
	       System.out.println(s.get(j).getText());
		 }	
		 searchBox.sendKeys("swing cradle for baby 0 to 2 years");
		 mirror.click();
		 UtilClass.raiseAssertForDataInSearchBox(message.getText());
		 //UtilClass.takeSnapShot(driver, "resutltforSwings.png");
		 
	}
	  /*
	   * Author: vanitha 
	   * Date:
	   * Parameters:
	   * Description:
	   * 
	   */
	   public void babyToys()
	   {
		 bestseller.click();
		 babyproducts.click();
		 BabyToddlerToy.click();
		 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		 List<WebElement> price=driver.findElements(By.xpath("//div[@class='_cDEzb_p13n-sc-price-animation-wrapper_3PzN2']//descendant::span[@class='a-size-base a-color-price']"));
		 //System.out.println("The baby Toddler Toys display the price " +price.size());
		 for(int i=0;i<price.size();i++)
		 {
			 System.out.println(price.get(i).getText());
		 }	 
	   }
	  /*
	   * Author: vanitha 
	   * Date:
	   * Parameters:
	   * Description:Display the 4.5Rating count
	   * 
	   */
	  public void displayratings() throws Exception
	  {
		 
		 bestseller.click();
		 babyproducts.click();
		 BabyToddlerToy.click();
		 UtilClass.takeSnapShot(driver, "ToddlerToysPage.png");
		 searchBox.sendKeys("swing cradle for baby 0 to 5 years");
		 mirror.click();
		 UtilClass.raiseAssertForDataInSearchBox(message.getText());
		 List<WebElement> rating=driver.findElements(By.xpath("//i[@class='a-icon a-icon-star-small a-star-small-4-5 aok-align-top']//span[@class='a-icon-alt']"));
		 System.out.println("Rating of 4.5 toys " +rating.size());	
		 /*String diplayrating=driver.getTitle();
		 String expectedresult="Amazon.in Bestsellers: The most popular items in Baby & Toddler Toys";
		 softAssert.assertEquals(diplayrating,expectedresult,"Tittle mismatched");
		 softAssert.assertAll("Asseris done and Messages are written to testNG report")	;*/	 
	  }

	  /*
	   * Author: vanitha 
	   * Date:6/02/2023
	   * Parameters:
	   * Description:BestSeller page Baby products 
	   * 
	   */ 
	  public void SwingsBouncersAndRockers() throws Exception
	  {
		
		 bestseller.click();
		 babyproducts.click();
		 BabyToddlerToy.click(); 
		 SwingsRockers.click();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 nextPage.click();
		 UtilClass.takeSnapShot(driver, "displaynextpage.png");
		 
	 }
	  
	
}
	  
