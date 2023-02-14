package com.AmazonAutomation.QA.TestData;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider
{
	
	 @DataProvider(name="searchValiddata")
	  public Object[] validdataforBestsellerBabyproducts() 
	  {
		  Object[] validdata = new Object[2];
		  
		  try
		  {
			  validdata[0]="babyboy";
			  validdata[1]="babyoil";
		  }
		  catch(Throwable e)
		  {
			  e.printStackTrace();
		  }
		   return validdata;
	  }
	 @DataProvider(name="searchInvaliddata")
	  public Object[] invaliddataforBestsellerBabyproducts() 
	  {
		  Object[] invaliddata = new Object[2];
		  
		  try
		  {
			  invaliddata[0]="zzzzzzzzzz45";
			  invaliddata[1]="345ygirl";
		  }
		  catch(Throwable e)
		  {
			  e.printStackTrace();
		  }
		  
		  return invaliddata;
	  }
	  @DataProvider(name="displaySoothersTeethers_validData")
	  public  Object[] displaysoothersTeethers_validData()
	  {
		  Object[] validData= new Object[1];
		  try
		  {
		     validData[0]="Soothers & Teethers";
		  }
		  catch(Throwable e)
		  {
			  e.printStackTrace();
		  }
		return validData;
	 } 
	  
	  @DataProvider(name="displaySoothersTeethers_invalidData")
	  public  Object[] displaysoothersTeethers_invalidData()
	  {
		Object[] invalidData= new Object[1];
		try
		{
		   invalidData[0]="whetehjjjjjjjjjjjjjjjjj";
		}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
		return invalidData;
	 } 
	  @DataProvider(name="displayBabyOilPdoductsPageObjects_validdata")
	  public Object[] displayBabyOilPdoductsPageObjects()
	  {
		  Object[] validData= new Object[1];
		  try
		  {
		  validData[0]="Baby oil";
		  }
		catch(Throwable e)
		{
			e.printStackTrace();
		}
		return validData;
	  }
}
