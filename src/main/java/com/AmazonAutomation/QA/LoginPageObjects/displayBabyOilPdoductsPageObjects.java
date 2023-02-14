package com.AmazonAutomation.QA.LoginPageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.AmazonAutomation.BaseClass.BaseClass;
import com.AmazonAutomation.QA.Utility.UtilClass;

public class displayBabyOilPdoductsPageObjects extends BaseClass
{
  
	
	public displayBabyOilPdoductsPageObjects()
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
	
	 public void displayBabyoilProucts_validdata(String data)
	 {

	    
	    action=new Actions(driver);
		bestseller.click();
		babyproducts.click();
		searchBox.sendKeys(data);
		action.sendKeys(Keys.ENTER).build().perform();
		List<WebElement>listofnames=driver.findElements(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		System.out.println("Display the list under Category::"+listofnames.size());
		for(int i=0;i<listofnames.size();i++)
		{
		//System.out.println(listofnames.get(i).getText());
		
		UtilClass.raiseAssertForDataInSearchBox(listofnames.get(i).getText());
		}
	 
	 }
	 public void dropdwon_validation()
	{
		WebElement allcatageriesdropdown=driver.findElement(By.id("searchDropdownBox"));
		Select select=new Select(allcatageriesdropdown);
		select.selectByVisibleText("Baby");
		action.sendKeys(Keys.ENTER).build().perform();
		searchBox.clear();
		searchBox.sendKeys("babysoaps");
		mirror.click();
		
	}

}
