package test;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		//System.out.println("I successfully executed Listeners Pass code");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("I failed executing Listeners Pass Code " + result.getName());
		// screenshot Code
		// response if API has failed
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
		
	}

}
