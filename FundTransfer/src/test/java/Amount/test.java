package Amount;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class test {
	//public class Transationframe {
		static WebDriver driver;
		//static ExtentReports report;
		//static ExtentTest test,test01,test02,test03,test04,test05,test06,test07,test08,test09,test11,test10,test12;
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			//ChromeOptions options = new ChromeOptions();
			//options.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandesh k. r\\Downloads\\chromedriver_win32 (13)\\chromedriver.exe");
			driver = new ChromeDriver();
			
	     //report = new ExtentReports("./San./transaction.html") ;
	     //report = new ExtentReports("./trans./Au101.html") ; 
			// test =report.startTest("TC01","login") ;
			// test =report.startTest("TC01","login") ;
			 
			 
			//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			 driver.get("http://52.66.43.93:3100/admin/#/login");
			 
		     //driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			 
			 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("staff@company.com");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
			 driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();
			 
			 driver.manage().window().maximize();
			// test.log(LogStatus.INFO,"user clicked login button");
		
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			 
			 
			 
			 Thread.sleep(2000);
		     driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/a")).click();
			 
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/ul/li[1]/a")).click();
			
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[1]/div/input")).sendKeys("hello");
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[2]/div/input")).sendKeys("hello");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[3]/div[2]/fieldset/div/label/input")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[3]/div[3]/fieldset/div/label/input")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[3]/div[4]/fieldset/div/label/input")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[3]/button[2]")).click();
			 
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/ul/li[2]/a")).click();
			 Thread.sleep(2000);
			 
			 //test02 =report.startTest("TC03","object ") ;
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[3]/a")).click();

	   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[3]/ul/li[1]/a")).click();
	   Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input")).sendKeys("hi");

	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/input")).sendKeys("hi");
	  Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[3]/button[2]")).click();
		 
			 
			 
}}
	
