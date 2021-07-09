package Assert;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class assert_1 {
	
	private WebDriver driver;
	
	@Test
	public void demo1() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
 	     
  	  this.driver = new ChromeDriver();
	      
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		Assert.assertEquals("Facebook - ??? ?? ????? ???? ??", "Facebook - ??? ?? ????? ???? ??");
	//	Assert.assertSame(driver.getTitle(), "Facebook - ??? ?? ????? ???? ??");
	
		SoftAssert soft = new SoftAssert ();
		soft.assertAll("Facebook - ??? ?? ????? ???? ??");
		soft.assertEquals(true, false);
		soft.assertEquals("https://www.facebook.com/", "https://www.google.com/");
		System.out.println(driver.getCurrentUrl());

		driver.close();
	}


}
