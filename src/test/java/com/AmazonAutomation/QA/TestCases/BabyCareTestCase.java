package com.AmazonAutomation.QA.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AmazonAutomation.BaseClass.BaseClass;
import com.AmazonAutomation.QA.LoginPageObjects.BabyCarePageObjects;
import com.AmazonAutomation.QA.LoginPageObjects.LoginPageObjects;

public class BabyCareTestCase extends BaseClass
{
	LoginPageObjects objlogin;
	 BabyCarePageObjects BCarePG;
	@BeforeMethod
	@Test
	public void creatObjects()
	{
		objlogin = new   LoginPageObjects ();
		BCarePG =new  BabyCarePageObjects();
	}
	 @Test(priority=0)
	  public void launchandLogin() throws Exception
	  {
		  objlogin.launchApplication();
		 // objlogin.login();
	  }
	 @Test(priority=1)
	 public void babcareProducts()
	 {
		 BCarePG.babyCare();
	 }
	 @Test(priority=2)
	 public void sinout()
	 {
		 //objlogin.logOut();
	 }
	 
}
