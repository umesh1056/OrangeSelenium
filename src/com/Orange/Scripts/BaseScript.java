package com.Orange.Scripts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.Orange.Generics.Constant;
import com.Orange.Generics.Excel;
import com.Orange.Generics.ReusableActions;
import com.Orange.POM.LoginPage;


public class BaseScript implements Constant{
	public WebDriver driver;
	static //public final String folderPath=null;
	File f;
	@BeforeSuite
	public static void createFolder()
	{
		
		System.out.println("Before Suite");
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_mm_dd_hh_mm:ss");
		String dformat = (dateFormat.format(now)).replace(":", "_");
		
		
		f=new File("E:\\SeleniumeFrameWorkQSP\\OrangeHRM\\Screenshots\\Screenshots"+dformat);
		
		f.mkdirs();
		//return f.getAbsolutePath();
	}
	
	@BeforeMethod
	public void openApp() throws EncryptedDocumentException, InvalidFormatException, IOException
	
	{
		System.out.println("Before Method");
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
	
	@AfterMethod
	public void tearDown(ITestResult result)
		{
		System.out.println("After Method");
		//ReusableActions.returnFolderPath();
		
	if(ITestResult.SUCCESS==result.getStatus())
	{
	try 
	{
		
	
		//String path=ReusableActions.returnFolderPath();
	//	System.out.println(BaseScript.createFolder());
		
	// Create refernce of TakesScreenshot
	TakesScreenshot ts=(TakesScreenshot)driver;
	 
	// Call method to capture screenshot
	File source=ts.getScreenshotAs(OutputType.FILE);
	 
	// Copy files to specific location here it will save all screenshot in our project home directory and
	// result.getName() will return name of test case so that screenshot name will be same
	FileUtils.copyFile(source, new File(f.getAbsolutePath()+"\\"+result.getName()+".png"));
	 
	System.out.println("Screenshot taken");
	} 
	catch (Exception e)
	{
	 
	       System.out.println("Exception while taking screenshot "+e.getMessage());
	} 
}
		}
	
	@AfterClass
	
	public void closeApp()
	
	{
		System.out.println("After Suite");
		
		driver.close();
	}
}
