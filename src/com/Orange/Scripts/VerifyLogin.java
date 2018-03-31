package com.Orange.Scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.Orange.Generics.Excel;
import com.Orange.Generics.ReusableActions;
import com.Orange.POM.LoginPage;

public class VerifyLogin extends BaseScript {

	@Test
	public void verifyLogin() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		
	
			String username = Excel.getCellValue(FILEPATH, "LoginPage",1,1);
		
		String password=Excel.getCellValue(FILEPATH, "LoginPage",1,2);
		ReusableActions.setValue(lp.untbox, username);
		ReusableActions.setValue(lp.pwdtbox, password);
		
		ReusableActions.clickButton(lp.loginbtn);
	}
}
