package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	@AfterTest
	public void done() {
		System.out.println("last execution ");
		
	}
	@BeforeClass
	@Test
	public void demo() {
		System.out.println("hello world");
	}
	@Test
	public void demo1() {
		System.out.println("carname");
	}

	@Test
	public void demo2() {
		System.out.println("vehicle name");
	}
	@BeforeTest
	public void test() {
		System.out.println("before test fortest");
		
	}
	@AfterMethod
	@Test
	public void after() {
		
		System.out.println("After Method");
	}
	@AfterClass
	@Test
	public void dist() {
		System.out.println("Afterclasss");
	}

}
