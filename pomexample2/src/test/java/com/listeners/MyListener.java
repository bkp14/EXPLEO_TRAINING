package com.listeners;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.tests.BaseTest;

public class MyListener extends BaseTest implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Started : "+result.getName());
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Success fully completed : "+result.getName());
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Started : "+result.getName());
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshots/"+result.getName()+".png");
			FileUtils.copyFile(src, dest);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Started : "+result.getName());
	}
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Suite Started");
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Suite Finished");
	}
}
