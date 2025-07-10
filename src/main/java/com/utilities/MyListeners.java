package com.utilities;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class MyListeners implements ITestListener {
	public static ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		test = Myreport.extent.createTest(result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "test passed" + result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "test failed" + result.getName());

		Screenshot ss = new Screenshot();
		String path = ss.takescreenshot(result.getName());
		   String fileName = new File(path).getName();
		   String relativePath = "Screenshot/" + fileName;
		   test.addScreenCaptureFromPath(relativePath);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "test skipped" + result.getName());

	}

	@Override
	public void onStart(ITestContext context) {
		Myreport.Setup();
	}

	@Override
	public void onFinish(ITestContext context) {
		Myreport.flushReport();

	}

}
