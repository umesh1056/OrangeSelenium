package com.Orange.POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

	@FindBy(id="welcome")
	public WebElement welcomelink;
	
	@FindBy(xpath="//a//b[text()='Admin']")
	public WebElement admintab;
	
	@FindBy(xpath="//a//b[text()='PIM']")
	public WebElement pimtab;
	
	@FindBy(xpath="//a//b[text()='Leave']")
	public WebElement leavetab;
	
	@FindBy(xpath="//a//b[text()='Time']")
	public WebElement timetab;
	
	@FindBy(xpath="//a//b[text()='Recruitment']")
	public WebElement recttab;
	
	@FindBy(xpath="//a//b[text()='Performance']")
	public WebElement perftab;
	
	
	@FindBy(xpath="//a//b[text()='Dashboard']")
	public WebElement dashtab;
	
	@FindBy(xpath="//a//b[text()='Directory']")
	public WebElement dirtab;
	
	@FindBy(xpath="//a//b")
	public List<WebElement> alltabs;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void allElementsDisplay()
	{
	for(int i=0;i<alltabs.size();i++)
	{
		if(alltabs.get(i).isDisplayed())
		{
			Assert.assertTrue(true);
		}
	}
	}
}
