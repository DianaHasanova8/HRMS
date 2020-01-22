package com.hrms.testbase;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.hrms.utils.CommonMethods;

public class Listener extends BaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Tets Started" + result.getName());
		CommonMethods.takeScreenshot(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed" + result.getName());
		CommonMethods.takeScreenshot("passed/"+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed" + result.getName());
		CommonMethods.takeScreenshot("failed/"+result.getName());
	}

	public void onTestSkipper(ITestResult result) {
		System.out.println("Test skipped" + result.getName());
	}
}
