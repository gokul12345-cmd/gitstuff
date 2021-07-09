package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMloginfb {

		@FindBy (xpath="//input[@name='email']")
		private WebElement username;
		
		@FindBy (xpath="//input[@name='pass']")
		private WebElement password;
		
		@FindBy (xpath="//button[@name='login']")
		private WebElement login;
		
		@FindBy (xpath="(//a[@role='button'])[3]")
		private WebElement createNewAcc;
		
		public POMloginfb(WebDriver driver1) {
			PageFactory.initElements(driver1, this);
		}
		
		public void username1(String username2) {
			username.sendKeys(username2);
		}
		public void password1(String password2) {
			password.sendKeys(password2);
		}
		
		public void login() {
			login.click();
		}
		/*public void createNewAcc() {
			createNewAcc.click();
		}*/
		
	}


