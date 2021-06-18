package Pack;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Class\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // up castin	
		
		
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		//implicit Wait 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//explicit Wait
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("XPATH")));
		
		// other methods of explicit Wait

		Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))   // max waiting time
				.pollingEvery(Duration.ofSeconds(5))   // freq. to check condition 
				.ignoring(NoSuchElementException.class);  // condition 
				
						
		WebElement link = fluentwait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver1) {
				WebElement ele = driver1.findElement(By.xpath("//table[@id='customers']//tr"));
				return ele;
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		wait = new WebDriverWait(driver,30);
		

		
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
//		//WebElement rowCount = driver.findElement(By.xpath("//table[@id='customers']//tr"));
//		
//		System.out.println(rowCount.size());
//		
//		                                   //table[@id='customers']//tr/td
//		List <WebElement> cellCount =  rowCount.get(2).findElements(By.xpath("//table[@id='customers']//tr[3]/td"));
//		
//		System.out.println(cellCount.size());
//		
//		
//		String value = cellCount.get(0).getText();
//		
//		System.out.println(value);
//		
//		value = cellCount.get(1).getText();
//		
//		System.out.println(value);
//		
//		value = cellCount.get(2).getText();
//		
//		System.out.println(value);
//		
		
		
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		
		
		//table.findElement("//tbody");
		
		
		
		
		
		
		
		
		
		
		
		
//		// ScrollBy
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		Thread.sleep(5000);
//		js.executeScript("window.scrollBy(0,900)"); 
//		Thread.sleep(5000);
//		js.executeScript("window.scrollBy(0,-300)"); 
//		
//		
//		//ScrollIntoView
//		WebElement trybutton = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
//		Thread.sleep(5000);
//		js.executeScript("arguments[0].scrollIntoView(true);",trybutton); // scroll down
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		List<WebElement> listOfElemt = driver.findElements(By.xpath("//a[text()='Try it Yourself »']"));
//		int size = listOfElemt.size();
//		System.out.println("size of list is = " + size);
//		
//		listOfElemt.get(0).click();
//		listOfElemt.get(1).click();
//		listOfElemt.get(2).click();
//		listOfElemt.get(3).click();
//		
//		List<WebElement> lisOfLinks =  driver.findElements(By.tagName("a"));
//		
//		ArrayList<WebElement> lisOfLinks1 = (ArrayList<WebElement>) driver.findElements(By.tagName("a"));
//	
//		
////		System.out.println(driver.getWindowHandle());
////		System.out.println("--------------");
//		//child Brouser Habdling
//		ArrayList<String> windowAddr = new ArrayList<String> (driver.getWindowHandles());
//		
//		driver.switchTo().window(windowAddr.get(1));
//		System.out.println(driver.getCurrentUrl());
//		
//		//Iframe handling
//		WebElement iframe1 = driver.findElements(By.xpath("//iframe[@id=\"iframeResult\"]]"));
//		
//		
//		driver.switchTo().frame(iframe1);
//		//driver.switchTo().parentFrame();
//		WebElement tryButton = driver.findElement(By.xpath("//button[text()='Try it']"));
//		tryButton.click();
//		
//		//Alert Handling 
//		Alert alt = driver.switchTo().alert();
//		String text = alt.getText();
//		System.out.println(text);
//		Thread.sleep(2000);
//		alt.accept();
		
		
		
		
	}
	
	
}
