package com.AmazonAutomation.QA.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AmazonAutomation.BaseClass.BaseClass;
import com.AmazonAutomation.QA.LoginPageObjects.BestSellerPageBabyProductsObject;
import com.AmazonAutomation.QA.LoginPageObjects.LoginPageObjects;

public class BestSellerTestCase extends BaseClass
{
	LoginPageObjects objlogin;
	BestSellerPageBabyProductsObject bPBabyProducts;
	@BeforeMethod
	@Test
	public void creatObjects()
	{
		objlogin= new   LoginPageObjects ();
		bPBabyProducts=new BestSellerPageBabyProductsObject();
	}
	 @Test(priority=0)
	  public void launchandLogin() throws Exception
	  {
		  objlogin.launchApplication();
		  //objlogin.login();
	  }
	 @Test(priority=1)
	 public void babyProducts() throws Exception
	 {
		 bPBabyProducts.babyproduct();
	 }
	 @Test(priority=2)
	 public void babyToddlerToys()
	 {
		 bPBabyProducts.babyToys();
	 }
	 @Test(priority=3)
	 public void ratingstars() throws Exception
	 {
		 bPBabyProducts.displayratings(); 
	 }
	 @Test(priority=4)
	 public void swingRockers() throws Exception
	 {
		 bPBabyProducts.SwingsBouncersAndRockers();
	 }
	 @Test(priority=5)
	 public void signout()
	 {
		// objlogin.logOut();
	 }
}
