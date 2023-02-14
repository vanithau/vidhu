package com.AmazonAutomation.QA.Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.AmazonAutomation.BaseClass.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class TestListener extends BaseClass implements ITestListener
{
	public static ExtentReports report;
		static ExtentTest test;
		public ScreenShotUtility screenshot;
	
  @Override
	public void onTestStart(ITestResult result) 
  	{
		
		test=report.createTest(result.getMethod().getMethodName());
		ExtentTestFactory.getInstance().setExtent(test);
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		screenshot=new ScreenShotUtility();
		ExtentTestFactory.getInstance().getExtent().pass("test cases passed");
		ExtentTestFactory.getInstance().getExtent()
		.addScreenCaptureFromPath(screenshot.screenShot(result.getMethod().getMethodName()));
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		screenshot=new ScreenShotUtility();
		ExtentTestFactory.getInstance().getExtent().fail("testcase failed");
		ExtentTestFactory.getInstance().getExtent()
		.addScreenCaptureFromPath(screenshot.screenShot(result.getMethod().getMethodName()));
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		screenshot=new ScreenShotUtility();
		ExtentTestFactory.getInstance().getExtent().skip("testcases skiped");
		ExtentTestFactory.getInstance().getExtent()
		.addScreenCaptureFromPath(screenshot.screenShot(result.getMethod().getMethodName()));
	}

	@Override
	public void onStart(ITestContext context) 
	{
		report=ExtentSetup.setupExtentReports();
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		screenshot=new ScreenShotUtility();
		ExtentTestFactory.getInstance().getExtent().info("testcases finshed");
		ExtentTestFactory.getInstance().getExtent()
		.addScreenCaptureFromPath(screenshot.screenShot(context.getName()));
	}


}
