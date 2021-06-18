package pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClass1 {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private HomePage  homePage;
	SoftAssert soft ;
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("launch the browser & enter Facebook URL");
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Class\\chromedriver.exe");
		driver = new ChromeDriver();  // up castin
		driver.get("http://desktop-b2220qc/login.do");
		soft = new SoftAssert();
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		loginPage = new LoginPage(driver);
		loginPage.sendUserName("admin");
		loginPage.sendPassword("manager");
		loginPage.clickOnLoginButton();
	}

	
	@Test
	public void verifyTaskLink() throws InterruptedException {
		System.out.println("Verify Task button");
		homePage  = new HomePage(driver);
		Thread.sleep(3000);
		homePage.clickOnTask();
		String url = driver.getCurrentUrl();
		
		///boolean result = url.equals("http://desktop-b2220qc/tasks/");
		
		
		soft.(url, "http://desktop-b2220qc/tasks/"); // true  (Same) ---> test - Pass
		Assert.assertNotEquals("Velocity", "Velocity");
		System.out.println("test done");

		soft.assertTrue(condition);
		soft.assertFalse(condition);
		
		assertEquals()
		assertNotEquals()
		assertTrue()
		assertFalse()
		fail()
		
		assertAll()
	}
	
//	@Test
//	public void verifyReportLink() throws InterruptedException {
//		Thread.sleep(5000);
//		System.out.println("Verify Report button");
//		homePage  = new HomePage(driver);
//		Thread.sleep(3000);
//		homePage.clickONReport();
//		String url = driver.getCurrentUrl();
//		Assert.assertEquals(url, "http://desktop-b2220qc/reports/reports.do"); // true  (Same) ---> test - Pass
//
//	}
//	
//	@Test
//	public void verifyUserLink() throws InterruptedException {
//		Thread.sleep(5000);
//		System.out.println("Verify User button");
//		homePage  = new HomePage(driver);
//		Thread.sleep(3000);
//		homePage.clickOnUser();
//		String url = driver.getCurrentUrl();
//		
//		Assert.assertEquals(url, "http://desktop-b2220qc/administration/userlist.do"); // true  (Same) ---> test - Pass
//
//	}
//	
	@AfterMethod
	public void AfterMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		homePage.clickOnLogOut();
		Thread.sleep(3000);
	}
	
	@AfterClass
	public void AfterClass()
	{
		soft.assertAll();
		//driver.close();
	}
	
}
