package com.AmazonAutomation.QA.Utility;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.AmazonAutomation.BaseClass.BaseClass;

	public class UtilClass extends BaseClass 
	{	     
		/**
		* This function will take screenshot
		* @param webdriver
		* @param fileWithPath
		* @throws Exception
		*/
		public static void takeScreenshotAtEndOfTest() 
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String trg=System.getProperty("User.dir");
			try {
				FileUtils.copyFile(src, new File(trg+"/screenshots/"+System.currentTimeMillis()+".png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public static void takeSnapShot(WebDriver webdriver,String filename) throws Exception
		{
			
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
		File file = scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		 FileUtils.copyFile(file,new File("./screenshots/"+filename));
		//Copy file at destination
		//FileUtils.copyFile(SrcFile, DestFile);

		}
		
		// generate unique random number generator
		public static int generateRandom()
		{
		    
		      int min = 50; // Minimum value of range
		      int max = 100; // Maximum value of range
		      // Print the min and max  
		      //System.out.println("Random value in int from "+ min + " to " + max + ":");
		      // Generate random int value from min to max
		      int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
		      // Printing the generated random numbers
		     return random_int;
		    
		}
		
		 public static void raiseAssertForDataInSearchBox(String data)
		  {
			  Pattern p = Pattern.compile("[0-9]+");
			  Matcher m = p.matcher(data);
			  int count=0;
			  while(m.find())
			  {
				  count++;
			  }
			  boolean  expectedResult= true,actualResult=true;
					  
			  if(count==0 || data.contains("No")==true)
			  	  actualResult=false;
			  try
			  {
				  takeScreenshotAtEndOfTest();
			  } 
			  catch (Exception e) 
			  {
					e.printStackTrace();
			  }
				   
			  softAssert.assertEquals(actualResult, expectedResult, "TestCase Failed For Invalid "+data);
			  softAssert.assertAll();
			  
		  }	
		
}