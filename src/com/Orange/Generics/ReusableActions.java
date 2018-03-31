package com.Orange.Generics;

import org.openqa.selenium.WebElement;

public class ReusableActions {
	
	public static void setValue(WebElement element,String value )
	{
		
		element.sendKeys(value);
	}
	public static void clickButton(WebElement element)
	{
		
		element.click();
	}

}
