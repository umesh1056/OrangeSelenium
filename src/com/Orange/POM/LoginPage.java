package com.Orange.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	@FindBy(id="txtUsername")
	public WebElement untbox;
	
	
	@FindBy(id="txtPassword")
	public WebElement pwdtbox;
	
	
	@FindBy(id="btnLogin")
	public WebElement loginbtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
