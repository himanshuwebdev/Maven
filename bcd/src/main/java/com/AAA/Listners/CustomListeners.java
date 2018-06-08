package com.AAA.Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.AAA.base.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class CustomListeners extends TestBase implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("8=>8=>8=>8=>8=>8=>");
		test=report.startTest(result.getName().toUpperCase());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("8=>8=>8=>8=>8=>8=>");
		test.log(LogStatus.PASS,result.getName().toUpperCase()+" pass");
		report.endTest(test);
		report.flush();
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("8=>8=>8=>8=>8=>8=>");
		test.log(LogStatus.FAIL,result.getName().toUpperCase()+" fail");
		report.endTest(test);
		report.flush();
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("8=>8=>8=>8=>8=>8=>");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("8=>8=>8=>8=>8=>8=>");
		
	}

}
