package com.Orange.Scripts;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.Orange.Generics.ReusableActions;
import com.Orange.POM.HomePage;

public class VerifyLogin extends BaseScript {

	@Test
	public void verifyLogin() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		HomePage hp=new HomePage(driver);
	
			
		ReusableActions.objectIsDisplayed(hp.welcomelink);
	}
}
