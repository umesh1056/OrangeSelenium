package com.Orange.Scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Orange.Generics.Constant;
import com.Orange.Generics.Excel;


public class BaseScript implements Constant{
	public WebDriver driver;
	@BeforeTest
	public void openApp() throws EncryptedDocumentException, InvalidFormatException, IOException
	
	{
		driver=new FirefoxDriver();
		String url=Excel.getCellValue(FILEPATH, "LoginPage",1,0);
		driver.get(url);
		
		
	}
	@AfterTest
	public void closeApp()
	
	{
		
		driver.close();
	}
}
