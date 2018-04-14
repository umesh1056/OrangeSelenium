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
import com.Orange.Generics.ReusableActions;
import com.Orange.POM.LoginPage;


public class BaseScript implements Constant{
	public WebDriver driver;
	@BeforeTest
	public void openApp() throws EncryptedDocumentException, InvalidFormatException, IOException
	
	{
		driver=new FirefoxDriver();
		String url=Excel.getCellValue(FILEPATH, "LoginPage",1,0);
		driver.get(url);
		
		LoginPage lp=new LoginPage(driver);
		//HomePage hp=new HomePage(driver);
	
	  String username = Excel.getCellValue(FILEPATH, "LoginPage",1,1);
		
		String password=Excel.getCellValue(FILEPATH, "LoginPage",1,2);
		ReusableActions.setValue(lp.untbox, username);
		ReusableActions.setValue(lp.pwdtbox, password);
		
		ReusableActions.clickButton(lp.loginbtn);
		
	}
	@AfterTest
	public void closeApp()
	
	{
		
		driver.close();
	}
}
