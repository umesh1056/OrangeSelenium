package com.Orange.Generics;

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

}
