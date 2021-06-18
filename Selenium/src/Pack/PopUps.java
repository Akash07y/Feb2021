package Pack;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUps {
	
	static ChromeDriver Chromebrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Class\\chromedriver.exe");
		
		ChromeDriver driver1 = new ChromeDriver();  // up casting
		
		return driver1;
	}
	
	static FirefoxDriver Firefoxbrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Class\\chromedriver.exe");
		
		FirefoxDriver driver2 = new FirefoxDriver();  // up casting
		
		return driver2;
	}
	
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "F:\\Automation Class\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();  // up casting
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	driver.manage().window().maximize();
	
	WebElement createAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	createAcc.click();
	Thread.sleep(3000);
	WebElement termsLink = driver.findElement(By.xpath("(//a[text()='Terms'])[2]"));
	WebElement dataPolicyLink = driver.findElement(By.xpath("//a[text()='Data Policy']"));
	WebElement coockiesLink = driver.findElement(By.xpath("//a[text()='Cookie Policy']"));

	termsLink.click();
	dataPolicyLink.click();
	coockiesLink.click();
	
	String mainPageAddr = driver.getWindowHandle();  //MAIN page\
	
	System.out.println(driver.getWindowHandle());
	
	ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
	System.out.println(mainPageAddr);
	System.out.println(addr.get(0));
	System.out.println(addr.get(1));
	System.out.println(addr.get(2));
	System.out.println(addr.get(3));

	System.out.println(driver.getCurrentUrl());
	driver.switchTo().window(addr.get(1));
//	System.out.println(driver.getCurrentUrl());
//	driver.switchTo().window(addr.get(2));
//	System.out.println(driver.getCurrentUrl());
//	driver.switchTo().window(addr.get(3));
//	System.out.println(driver.getCurrentUrl());
	}
}




//frame

    // iframe



    // iframe 





















