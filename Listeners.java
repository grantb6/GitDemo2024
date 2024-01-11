package Test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener
public class Listeners implements ITestListener {

	//Similar to @BeforeTest
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	//When your test passes, this method will get executed i.e. when the test is a success
	//Only used when writing reports e.g. HTML report
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//Whatever is written here will get executed
		
		//System.out.println("Successfully executed Listeners Pass code");
	}

	//When your test fails, this method will be invoked
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//Whatever is written here will get executed
		//To get screenshot when test fails
		System.out.println("Unsuccessfully executed Listeners Pass code" + result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}


}
