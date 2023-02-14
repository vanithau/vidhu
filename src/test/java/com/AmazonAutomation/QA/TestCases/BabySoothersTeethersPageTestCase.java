package com.AmazonAutomation.QA.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AmazonAutomation.BaseClass.BaseClass;
import com.AmazonAutomation.QA.LoginPageObjects.BabyCarePageObjects;
import com.AmazonAutomation.QA.LoginPageObjects.BabyProductsSoothersTeethersPageObjects;
import com.AmazonAutomation.QA.LoginPageObjects.LoginPageObjects;
import com.AmazonAutomation.QA.TestData.WorkingWithDataProvider;

public class BabySoothersTeethersPageTestCase extends BaseClass
{
	LoginPageObjects objlogin;
    BabyProductsSoothersTeethersPageObjects BabySTOBJ;
	
    
    @BeforeMethod
	@Test
	public void creatObjects()
	{
		objlogin = new   LoginPageObjects ();
		 BabySTOBJ =new  BabyProductsSoothersTeethersPageObjects();
	}
	 @Test(priority=0)
	  public void launchandLogin() 
	  {
		  objlogin.launchApplication();
		 // objlogin.login();
	  }
	 @Test(priority=1,dataProvider="displaySoothersTeethers_validData", dataProviderClass=WorkingWithDataProvider.class)
	 public void displaysoothersTeethers_validData(String data)
	 {
		 BabySTOBJ.displaySoothersTeethers_validData(data); 
		 
	 }
	 @Test(priority=2,dataProvider="displaySoothersTeethers_invalidData", dataProviderClass=WorkingWithDataProvider.class)
	 public void displaysoothersTeethers_invalidData(String data)
	 {
		 BabySTOBJ.displaySoothersTeethers_invalidData(data); 
		 
	 }
	 @Test(priority=3)
	 public void signout()
	 {
		 //objlogin.logOut();
	 }
}
