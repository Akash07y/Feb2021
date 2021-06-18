package Pack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "F:\\Automation Class\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // up casting
		
		driver.get("http://desktop-b2220qc/login.do");
		
		driver.manage().window().maximize();
		
		WebElement createAcc = driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]"));

	
		for(int j = 0 ; j <3; j ++)
		{
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			File dest = new File("E:\\New folder\\Test"+j+".jpeg");
		
			FileHandler.copy(source, dest);
		
		}
//		WebElement creteAcc = driver.findElement(By.xpath("//div[text()='Create a new account']"));
//		
//		creteAcc.getText();
//		
		

	
//		//list box or drop down
//		
//		WebElement signUp = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
//		signUp.click();
//		
//		Select s = new Select(birthday_month);
//		
//		s.selectByValue("6"); // jun
//		Thread.sleep(3000);
//		
//		s.selectByVisibleText("May");  // may
//		Thread.sleep(3000);	
//		
//		s.selectByIndex(3);  // mar
//		
//		
		
		
		
		
		
		//input[@id='u_0_m_Ep']
		
//		Point p = new Point(x,y);  // x,y  
//		driver.manage().window().setPosition(p);
//		
		
		
		
		
		
		
	//	WebDriver     WebElement
		
		
		
		
		
		
	}

}
