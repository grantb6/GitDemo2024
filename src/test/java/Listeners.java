
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.base;

//ITestListener
public class Listeners implements ITestListener {

	// to access base methods
	base b = new base();

	// Similar to @BeforeTest
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	}

	// When your test passes, this method will get executed i.e. when the test is a
	// success
	// Only used when writing reports e.g. HTML report
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		// Whatever is written here will get executed

		// System.out.println("Successfully executed Listeners Pass code");
	}

	// When your test fails, this method will be invoked i.e. triggered

	// When your test fails, this method gets invoked and failure captured in
	// screenshot
	// Failure captured in result
	// To get the test name that failed,
	public void onTestFailure(ITestResult result) {

		try {
			// pass it into argument
			b.getScreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		// Whatever is written here will get executed
		// To get screenshot when test fails
		System.out.println("Unsuccessfully executed Listeners Pass code" + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
