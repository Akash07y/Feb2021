package pom.classes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass3 {
	
	private static final String priority = null;

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before suite TestClass3");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before Test TestClass3");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class TestClass3");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method TestClass3");
	}
	
	@Test (invocationCount = 5, priority = 3)
	public void test2()  {
		System.out.println("test 2 TestClass3");
	}
	
	@Test (timeOut = 2000)
	public void test3() throws InterruptedException {
		System.out.println("Test 3 TestClass3");
		Thread.sleep(3000);
	}
	
	
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		System.out.println("After method TestClass3");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class TestClass3");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("after Test TestClass3");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after suite TestClass3");
	}

}
