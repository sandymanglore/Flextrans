package Amount;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class demo {
	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest test;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandesh k. r\\chromedriver_win32 (12)\\chromedriver.exe");
		driver = new ChromeDriver();
		
     //report = new ExtentReports("./San./transaction.html") ;
    // report = new ExtentReports("./sbi./report.html") ; 
		// test =report.startTest("TC01","login") ;
		 //test =report.startTest("Login to Transaction framework","login") ;
		 
		 
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("http://52.66.43.93:3100/admin/#/login");
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("SYSTEM@tf.com");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		 driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();
	
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[9]/a")).click();
			
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[9]/ul/li[2]/a")).click(); 
		
		 
		 
		 Thread.sleep(8000);
		 driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Get1")	;	 
			 
		 
		 Thread.sleep(8000);
		 driver.findElement(By.xpath("//div[text()='Get1']")).click(); 
			 
			 
		 Thread.sleep(14000);
		 driver.findElement(By.xpath("//a[normalize-space()='Access']")).click();	
			
		 Thread.sleep(4000);
		 WebElement selectMyElement =driver.findElement(By.cssSelector(".css-1hwfws3.select__value-container.select__value-container--is-multi"));
		 selectMyElement.click();

		 Actions keyDown = new Actions(driver);
		 keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
		 Thread.sleep(5000);
		 JavascriptExecutor js5=(JavascriptExecutor)driver;
		 js5.executeScript("window.scrollBy(0,500)");
		  	
		
		 Thread.sleep(20000);
		 keyDown.sendKeys("").sendKeys(Keys.ENTER).build().perform();
			
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 /*
		 Thread.sleep(4000);
		 WebElement element = driver.findElement(By.xpath("//*[@class='css-bg1rzq-control select__control']"));
	        Select select = new Select(element);
	        select.selectByValue("TF Demo");
*/




	}}

		 

		 
		