package itsme;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class me1 {
	@BeforeTest
	public void animal() {
		System.out.println("animal");
	}
	
	@BeforeMethod
	public void people() {
		System.out.println("people");
	}
	@Test(dependsOnMethods = {"bman2"})
	public void aman1() {
		System.out.println("asd");
	}
	@Test
	public void bman2() {
		System.out.println("asdf");
	}
	@Test(groups= {"smoke"})
	public void cman3() {
		System.out.println("asdfas");
	}
	@Test(groups= {"smoke"})
	public void man1() {
		System.out.println("Man1");
	}
	@Test
	public void man2(String url) {
		System.out.println(url);
	}
	@Parameters({"url"})
	@Test
	public void man3(String Urlname) {
		System.out.println(Urlname);
	}
	@AfterTest
	public void city() {
		System.out.println("city");
	}
	@AfterMethod
	public void pin() {
		System.out.println("pin");
	}

}
