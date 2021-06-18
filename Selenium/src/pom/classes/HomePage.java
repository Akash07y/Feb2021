package pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private WebDriver driver;
	
	@FindBy (xpath="//a[@class='content tasks']") 
	private WebElement taskLink;
	
	@FindBy (xpath="//a[@class='content reports']") 
	private WebElement reportButton;
	
	@FindBy (xpath="//a[@class='content users']") 
	private WebElement userButton;
	
	@FindBy (xpath="//a[text()= 'Logout']") 
	private WebElement logOut;

	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnTask() {
		taskLink.click();
	}
	
	public void clickONReport()
	{
		reportButton.click();
	}
	
	public void clickOnUser() {
		userButton.click();
	}
	
	public void clickOnLogOut() {
		logOut.click();
	}

}
