package testNGPackage;

import org.testng.annotations.*;

public class MethodTest {
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	@BeforeMethod
	public void beforeClass()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void afterClass()
	{
		System.out.println("After Method");
	}

}
