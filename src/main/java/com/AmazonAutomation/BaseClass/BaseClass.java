package com.AmazonAutomation.BaseClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

	  import org.openqa.selenium.WebDriver;
	  import org.openqa.selenium.chrome.ChromeDriver;
	  import org.openqa.selenium.edge.EdgeDriver;
	  import org.openqa.selenium.firefox.FirefoxDriver;
	  import org.openqa.selenium.ie.InternetExplorerDriver;
      import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
      import org.testng.asserts.SoftAssert;

import com.AmazonAutomation.QA.Utility.WebEventListener;
import com.aventstack.extentreports.ExtentReports;

         import io.github.bonigarcia.wdm.WebDriverManager;

	  public class BaseClass 
	  {
	    
	  		 public static WebDriver driver;
	  		 public static Properties prop;
	  		 public static String propertyFilePath="C:\\AmazonAutomation\\AmazonAutomation\\src\\main\\java\\com\\AmazonAutomation\\QA\\ConfigProperty\\configprop";
	  		 public static String applicationURL;
	  		 public static SoftAssert softAssert ;
	  		 public static ExtentReports extentReports;
	  	      public static Actions action;
	  	      public static WebEventListener eventListener;
	  	    public static  EventFiringWebDriver e_driver;
	  			  		  		 
	  		 public BaseClass()
	  		 {
	  			 try
	  			 {
	  			 File file = new File(propertyFilePath);
	  			 FileInputStream fis =	new FileInputStream(file);
	  			 System.out.println(fis);
	  			 prop = new Properties();
	  			 prop.load(fis);
	  			 }
	  			 catch(FileNotFoundException e)
	  			 {
	  				 e.printStackTrace();
	  			 }
	  			 catch(IOException e)
	  			 {
	  				 e.printStackTrace();
	  			 }
	  			softAssert=new SoftAssert();
	  			
	  		 }
	  		 @BeforeSuite
	  		 public  static void initilize()
	  		 {
	  			if(prop.getProperty("browserToExcute").equalsIgnoreCase("Chrome")==true)
	  			 {
	  				 WebDriverManager.chromedriver().setup();
	  				 driver =new ChromeDriver();
	  			 }
	  			 else if(prop.getProperty("browserToExcute").equalsIgnoreCase("firefox")==true)
	  			 {
	  				 WebDriverManager.firefoxdriver().setup();
	  			 		driver =new FirefoxDriver(); 
	  			 }
	  			 else if(prop.getProperty("browserToExcute").equalsIgnoreCase("edge")==true)
	  			 {
	  				 WebDriverManager.edgedriver().setup();
	  			 		driver =new EdgeDriver(); 
	  			 }
	  			 else if(prop.getProperty("browserToExcute").equalsIgnoreCase("ie")==true)
	  			 {
	  				 WebDriverManager.iedriver().setup();
	  			 		driver =new InternetExplorerDriver(); 
	  			 }
	  			e_driver = new EventFiringWebDriver(driver);
	  			//Now create object of EventListenerHandler to register it with EventFiringWebDriver
	  			eventListener= new WebEventListener();
	  			e_driver.register(eventListener);
	  			driver=e_driver;
	  			driver.manage().window().maximize();
	  			
	  		 }
	  	
	  		/*@AfterSuite
  			public void tearDown()
	  		{
  			   driver.close();
  			}*/
	  		 
	  		/* @Test
	  		 @Parameters({("browserToExcute")})
	  		 public void initilize(String browserDetails)
	  		 {
	  			if(browserDetails.equalsIgnoreCase("Chrome")==true)
	  			 {
	  				 WebDriverManager.chromedriver().setup();
	  				 driver =new ChromeDriver();
	  			 }
	  			 else if(browserDetails.equalsIgnoreCase("firefox")==true)
	  			 {
	  				 WebDriverManager.firefoxdriver().setup();
	  			 		driver =new FirefoxDriver(); 
	  			 }
	  			 else if(browserDetails.equalsIgnoreCase("edge")==true)
	  			 {
	  				 WebDriverManager.edgedriver().setup();
	  			 		driver =new EdgeDriver(); 
	  			 }
	  			 else if(browserDetails.equalsIgnoreCase("ie")==true)
	  			 {
	  				 WebDriverManager.iedriver().setup();
	  			 		driver =new InternetExplorerDriver(); 
	  			 }
	  			driver.manage().window().maximize();
	  		 }*/
	  	
}
