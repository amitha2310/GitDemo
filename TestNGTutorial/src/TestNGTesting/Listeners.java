package TestNGTesting;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("i have starting execution");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//screenshot code
		//response if API is failed
		System.out.println("I failed executed listeners passcode" );
	}
}
