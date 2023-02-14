package com.AmazonAutomation.QA.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AmazonAutomation.BaseClass.BaseClass;
import com.AmazonAutomation.QA.LoginPageObjects.LoginPageObjects;
import com.AmazonAutomation.QA.LoginPageObjects.displayBabyOilPdoductsPageObjects;
import com.AmazonAutomation.QA.TestData.WorkingWithDataProvider;

public class displayBabyoilProductsObjectTestCase extends BaseClass
{
	 displayBabyOilPdoductsPageObjects  BabyoilPage;
	 LoginPageObjects objlogin;
	 @BeforeMethod
	 public void createObjects()
	 {
		 BabyoilPage = new displayBabyOilPdoductsPageObjects();
		 objlogin =new  LoginPageObjects();
	 }
	 @Test(priority=0)
	  public void launchandLogin() throws Exception
	  {
		  objlogin.launchApplication();
	  }
	 @Test(priority=1)
	  public void Login() throws Exception
	  {
		 
		  //objlogin.login();
	  }
	 @Test(priority=2,dataProvider="displayBabyOilPdoductsPageObjects_validdata",dataProviderClass=WorkingWithDataProvider.class)
	 public void displayBabyoilProucts_validdata(String data)
	 {
		 BabyoilPage.displayBabyoilProucts_validdata(data);
	 }
	 @Test(priority=3)
	 public void displaydropdown()
	 {
		 BabyoilPage.dropdwon_validation();
	 }
	 @Test(priority=4,enabled=false)
	 public void signout()
	 {
		 //objlogin.logOut();
	 }
	 
}
