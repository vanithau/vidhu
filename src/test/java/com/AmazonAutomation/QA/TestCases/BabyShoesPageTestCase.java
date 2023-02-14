package com.AmazonAutomation.QA.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AmazonAutomation.BaseClass.BaseClass;
import com.AmazonAutomation.QA.LoginPageObjects.BabyCarePageObjects;
import com.AmazonAutomation.QA.LoginPageObjects.BabyShoesPageObjects;
import com.AmazonAutomation.QA.LoginPageObjects.LoginPageObjects;
import com.AmazonAutomation.QA.TestData.WorkingWithDataProvider;

public class BabyShoesPageTestCase extends BaseClass
{
	LoginPageObjects objlogin;
	BabyShoesPageObjects BabyshoesPG;
	@BeforeMethod
	@Test
	public void creatObjects()
	{
		objlogin = new   LoginPageObjects ();
		BabyshoesPG =new  BabyShoesPageObjects();
	}
	 @Test(priority=0)
	  public void launchandLogin() 
	  {
		  objlogin.launchApplication();
		 // objlogin.login();
	  }
	 @Test(priority=1,dataProvider="searchValiddata", dataProviderClass=WorkingWithDataProvider.class)
	 public void validDataBabyBoyShoes(String data)
	 {
		 BabyshoesPG.searchValiddata(data);
	 }
	 @Test(priority=2,dataProvider="searchInvaliddata", dataProviderClass=WorkingWithDataProvider.class)
	 public void invalidData(String data)
	 {
		 BabyshoesPG.searchInvaliddata(data);
	 }
	 @Test(priority=3)
	 public void signout()
	 {
		//objlogin.logOut();
	 }

}
