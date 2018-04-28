package com.Orange.Generics;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ReusableActions {
	
	public static void setValue(WebElement element,String value )
	{
		
		element.sendKeys(value);
	}
	public static void clickButton(WebElement element)
	{
		
		element.click();
		//element.click();
		
		
	}
	
	public static void objectIsDisplayed(WebElement element)
	{
		if(element.isDisplayed())
		{
			Assert.assertTrue(true);
		}
		
	}
	public static String returnFolderPath()
	{
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_mm_dd_hh_mm:ss");
		String dformat = (dateFormat.format(now)).replace(":", "_");
		
		
		File f=new File("E:\\SeleniumeFrameWorkQSP\\OrangeHRM\\Screenshots\\Screenshots"+dformat);
		
		f.mkdirs();
		return f.getAbsolutePath();
		
	}
	
}
