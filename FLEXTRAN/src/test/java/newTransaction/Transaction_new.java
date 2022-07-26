package newTransaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Transaction_new {
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
		 
		 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("staff@company.com");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		 driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();
		 
		 
		 Thread.sleep(3000); 
		 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[12]/a")).click();
		   Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[12]/ul/li/a")).click();
   Thread.sleep(3000);
  Thread.sleep(3000); 

 driver.findElement(By.xpath("//body//div[@id='root']//div[@role='presentation']//div[@role='presentation']//div[@role='presentation']//div[1]//pre[1]")).click();
 Thread.sleep(3000); 
/*
 Actions input= new Actions(driver);
 input.click(driver.findElement(By.xpath("//body//div[@id='root']//div[@role='presentation']//div[@role='presentation']//div[@role='presentation']//div[1]//pre[1]")));
input.sendKeys(Keys.CONTROL, Keys.chord("a")); //select all text in textbox
 input.sendKeys(Keys.BACK_SPACE); //delete it
 input.sendKeys("new text"); //enter new text
   
	
  */
 Thread.sleep(3000); 
 driver.findElement(By.xpath("//button[normalize-space()='Refresh']")).click();
 Thread.sleep(3000); 
 driver.findElement(By.xpath("//button[normalize-space()='Send']")).click();
 
 Thread.sleep(3000); 
 driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
 
	}
}
