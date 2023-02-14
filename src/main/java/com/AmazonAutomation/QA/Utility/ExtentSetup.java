package com.AmazonAutomation.QA.Utility;



import java.text.SimpleDateFormat;
import java.util.Date;




import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentSetup extends com.AmazonAutomation.BaseClass.BaseClass
{
	
	
	public  static ExtentReports setupExtentReports()
	{
		SimpleDateFormat formate=new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		Date date=new Date();
		String actualDate=formate.format(date);
		
		String reportPath="user.dir"+"/reports/ExecutionReports_"+actualDate+".html";
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(reportPath);
				extentReports=new ExtentReports();
				extentReports.attachReporter(sparkReporter);
				
				sparkReporter.config().setDocumentTitle("AmazonAutomaion_ExecutionReports");
				sparkReporter.config().setTheme(Theme.DARK);
		
		
		
		return extentReports;
	}
  
}
