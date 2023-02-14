package com.AmazonAutomation.QA.Utility;

import com.aventstack.extentreports.ExtentTest;

public class ExtentTestFactory 
{
 
  private ExtentTestFactory () 
  {
	  
  }
  
  
  private static ExtentTestFactory instance=new ExtentTestFactory();
  
  public static ExtentTestFactory getInstance()
  {
	return instance;
  }
  
  
  ThreadLocal<ExtentTest> extentTest=new ThreadLocal<ExtentTest>();
  
  public ExtentTest getExtent()
  {
	  return extentTest.get();
  }
  
  
  public void setExtent(ExtentTest extent)
  {
	  extentTest.set(extent);
  }
}
