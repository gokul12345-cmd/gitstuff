package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class day2 {
	@BeforeTest
	public void done1() {
		System.out.println("first execution");
	}
	@Test(groups= {"Smoke"})
	public void method() {
		System.out.println("method demo");
	}
	@AfterClass
	@Test
	public void method1() {
		System.out.println("testing");
	}
	@BeforeMethod
	@Test(timeOut =4000)
	public void mock() {
		System.out.println("before mock are run ");
	}
//	@Test(dependsOnMethods= {"Smoke"})
	public void mock4() {
		System.out.println("dependsonmethods in smoke");
		
	}
	@Parameters({"url"})
	@Test
	public void parameter(String urlname) {
		System.out.println(urlname);
		
	}

}
