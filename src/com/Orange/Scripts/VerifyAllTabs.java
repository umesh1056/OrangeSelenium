package com.Orange.Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.Orange.POM.HomePage;

public class VerifyAllTabs extends BaseScript {

	@Test
	public void testVerifyAllTabs()
	{
		HomePage hp=new HomePage(driver);
		
		hp.allElementsDisplay();
		
		/*ReusableActions.objectIsDisplayed(hp.admintab);
		ReusableActions.objectIsDisplayed(hp.pimtab);
		ReusableActions.objectIsDisplayed(hp.leavetab);
		ReusableActions.objectIsDisplayed(hp.timetab);
		ReusableActions.objectIsDisplayed(hp.recttab);
		ReusableActions.objectIsDisplayed(hp.perftab);
		ReusableActions.objectIsDisplayed(hp.dashtab);
		ReusableActions.objectIsDisplayed(hp.dirtab);*/
		
	}
}
