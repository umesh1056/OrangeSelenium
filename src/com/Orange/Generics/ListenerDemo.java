package com.Orange.Generics;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		Screenshot.takeScreenShot();
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Screenshot.takeScreenShot();
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
System.out.println("Test");
	}

}
