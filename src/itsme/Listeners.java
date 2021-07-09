package itsme;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListeners is Interface to implement listeners
public class Listeners implements ITestListener {
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("I successfully implemented");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("i test failure the system method");
	}
	

}
