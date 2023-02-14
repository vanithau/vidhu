package com.AmazonAutomation.QA.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AmazonAutomation.BaseClass.BaseClass;
import com.AmazonAutomation.QA.LoginPageObjects.LoginPageObjects;

public class LoginPageTestCase extends BaseClass
{
	LoginPageObjects objlogin;
	@BeforeMethod
	public void creatObjects()
	{
		objlogin= new   LoginPageObjects ();
		
	}
	 @Test(priority=0)
	  public void launchandLogin() throws Exception
	  {
		  objlogin.launchApplication();
	  }
	 @Test(priority=1)
	  public void Login() throws Exception
	  {
		 
		  objlogin.login();
	  }
	 @Test(priority=2)
	 public void signout()
	 {
		 objlogin.logOut();
	 }
}
