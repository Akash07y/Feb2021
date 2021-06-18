package pom.classes;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {
	
		private static final String priority = null;

		@BeforeSuite
		public void beforeSuite()
		{
			System.out.println("before suite TestClass1");
		}
		
		@BeforeTest
		public void beforeTest()
		{
			System.out.println("before Test TestClass");
		}
		
		@BeforeClass
		public void beforeClass()
		{
			System.out.println("before class TestClass");
		}
		
		@BeforeMethod
		public void beforeMethod()
		{
			System.out.println("before method TestClass");
		}
		
		@Test (invocationCount = 5, priority = 3)
		public void test2()  {
			System.out.println("test 2 TestClass");
			ASSERTIONS	
		}
		
		@Test (timeOut = 2000)
		public void test3() throws InterruptedException  {
			System.out.println("Test 3 TestClass");
			Thread.sleep(3000);
		}
		
		
		@AfterMethod
		public void afterMethod() throws InterruptedException
		{
			System.out.println("After method TestClass");
		}
		
		@AfterClass
		public void afterClass()
		{
			System.out.println("after class TestClass");
		}
		
		@AfterTest
		public void afterTest()
		{
			System.out.println("after Test TestClass");
		}
		
		@AfterSuite
		public void afterSuite()
		{
			System.out.println("after suite TestClass");
		}
		
	}





