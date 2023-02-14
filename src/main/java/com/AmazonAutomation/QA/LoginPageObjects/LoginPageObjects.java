

package com.AmazonAutomation.QA.LoginPageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.AmazonAutomation.BaseClass.BaseClass;
import com.AmazonAutomation.QA.Utility.UtilClass;

public class LoginPageObjects extends BaseClass
{
    public LoginPageObjects()
    {
	   PageFactory.initElements(driver, this);
    }
	
      @FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1' and text()='Hello, sign in']//parent::div[@class='nav-line-1-container']") 
	  private WebElement SigninButton;
	  @FindBy(xpath="//div[@class='a-row a-spacing-base']//child::input[@type='email']")
	  private WebElement EmailorMobilephonenumber;
	  @FindBy(xpath="//span[@id='continue']//child::input[@id='continue']")
	  private WebElement Continuebutton;
	  @FindBy(xpath="//input[@type='password']//parent::div[@class='a-section a-spacing-large']//child::input[@type='password']") 
	  private WebElement Password;
	  @FindBy(xpath="//span[@class='a-button-inner']//child::input[@id='signInSubmit']")
	  private WebElement Signin;
	 
	  @FindBy(xpath="//span[@class='nav-line-2 ' and contains(text(), 'Account & Lists')]") 
	   private WebElement hoverToLogout;
	  @FindBy(xpath="//a[@id='nav-item-signout']//child::span[@class='nav-text' and contains(text(),'Sign Out')]")
	  private WebElement Signout;

		/*
		 * Author:
		 * Date:
		 * Parameters:
		 * Description:
		 */
		public void logOut() 
		{
			Actions acc = new Actions(driver);
			acc.moveToElement(hoverToLogout).build().perform();
			Signout.click();	
		}
		/*
		 * Author:
		 * Date:
		 * Parameters:
		 * Description:
		 */
	  public void launchApplication() 
	  {
		    try 
		    {
		    	driver.get(prop.getProperty("istURL"));
				UtilClass.takeScreenshotAtEndOfTest();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		   // driver.get("https://www.amazon.in/");  
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   //UtilClass.raiseAssertForDataInSearchBox( driver.getTitle());
		  
		   /*SoftAssert softAssert = new SoftAssert();
		   String amazonTitle = driver.getTitle();
		   //System.out.println(amazonTitle);
		   String expectedItem="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		   softAssert.assertEquals(amazonTitle, expectedItem,"Title mismatched");
		   System.out.println("I am after SoftAssert");
		   softAssert.assertAll("Assert is done and Messages are written to testNG report");*/
	  }
	  /*
		 * Author:
		 * Date:
		 * Parameters:
		 * Description:
		 */
	  public void login() 
	  { 
		  SigninButton.click();
		  try {
			UtilClass.takeScreenshotAtEndOfTest();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  //UtilClass.generateRandom();
		  EmailorMobilephonenumber.sendKeys(prop.getProperty("istUserName"));
		  Continuebutton.click();
		  Password.sendKeys(prop.getProperty("istPassword"));
		  Signin.click();
		  
		   /*SoftAssert softAssert = new SoftAssert();
		   String login = driver.getTitle();
		   String expectedresult="Amazon Sign In";
		   softAssert.assertEquals(login,expectedresult);
		   //System.out.println("I am after SoftAssert");
		   softAssert.assertAll("Assert is done and Messages are written to testNG report");*/
	  }
		
}

