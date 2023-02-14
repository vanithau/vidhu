package com.AmazonAutomation.QA.Utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.AmazonAutomation.BaseClass.BaseClass;

public class ScreenShotUtility extends BaseClass
{
	public WebDriver driver=super.driver;
	public static TakesScreenshot takeScreenShot;
	public static String screenShotSubFolderName;
	public static File sourceFile;
	public static File destFile;
	
	
 
  public  String screenShot(String fileName) 
  {
	  takeScreenShot=(TakesScreenshot)driver;
	  if(screenShotSubFolderName==null)
	  {
		  LocalDateTime myDateTime=LocalDateTime.now();
		  screenShotSubFolderName=myDateTime.format(DateTimeFormatter.ofPattern("dd-mm-yyyyHH-mm-ss"));  
	  } 
	    
	   sourceFile=takeScreenShot.getScreenshotAs(OutputType.FILE);
	    destFile=new File("./screenshots/"+screenShotSubFolderName+"/"+fileName+".png");
	   try 
	   {
		FileUtils.copyFile(sourceFile, destFile);
	   } 
	   catch (IOException e) 
	   {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   } 
	   
	   System.out.println(destFile.getPath());
	   return destFile.getAbsolutePath();
  }
}
