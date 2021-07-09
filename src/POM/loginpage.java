package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class loginpage {
	private WebDriver driver;
	
      @BeforeTest
	public void launchbrower() {
    	  
    	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
  	     
    	  this.driver = new ChromeDriver();
  	      
  		driver.get("https://www.facebook.com/");
		
	}
      @Test
      public void login() {
    	  POMloginfb login1 =new POMloginfb (driver);
    	  login1.username1("gbbbhujbal@gmail.com");
    	  login1.password1("Myganesha@123");
    	  login1.login();
    	  
      }
  
}
