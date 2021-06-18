package pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  LoginPage{
		
	@FindBy (xpath="//input[@name='username']") 
	private WebElement user;
	
	@FindBy (xpath="//input[@name='pwd']") 
	private WebElement password;
	
	@FindBy (xpath="//a[@id='loginButton']") 
	private WebElement login;

	public LoginPage(WebDriver driver)  // driver = driver =  new ChromeDriver()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendUserName(String data) {
		user.sendKeys(data);
	}
	
	public void sendPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickOnLoginButton() {
		login.click();
	}

}
