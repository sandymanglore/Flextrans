package Application;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class application_delete {

static WebDriver driver;
static ExtentReports report;
static ExtentTest test;
public static void main(String[] args) throws InterruptedException, IOException {
	// TODO Auto-generated method stub
	//ChromeOptions options = new ChromeOptions();
	//options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandesh k. r\\chromedriver_win32 (12)\\chromedriver.exe");
	driver = new ChromeDriver();
	report = new ExtentReports("C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\Application\\Application report./SanApplication./Delete.html") ;
	 
	 test =report.startTest("Delete Application","edit") ;
	
	 
	//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 driver.get("http://52.66.43.93:3100/admin/#/login");
	 driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	 
	 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("staff@company.com");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
	 driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[4]/a")).click();
	 driver.findElement(By.xpath("//a[@href='#/application_search']")).click();	
	 
	  Thread.sleep(3000);
		
	   driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("F");
	 
	  Thread.sleep(5000);
	   driver.findElement(By.xpath("//div[normalize-space()='FLEXTRAN_009']")).click();	 
		
	  Thread.sleep(8000);
		 
	   driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
		  Thread.sleep(5000);
	   screenshot("apd1");
	   test.log(LogStatus.INFO,"User able to click on Delete button and able to cancel the delete");
	   
	
		   driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();	 
	 
	   
	   
		
		  Thread.sleep(8000);
			 
		   driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
		   
			  Thread.sleep(4000);
	   driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
	   Thread.sleep(6000);
	   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[4]/ul/li[1]/a")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[@href='#/application_search']")).click();	
		  Thread.sleep(3000);
			
		   driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("FFLEXTRAN_009");
	   screenshot("apd2");
	   test.log(LogStatus.INFO,"User able to click on Delete button and able to Delete the Application");
		Thread.sleep(3000);
		
		report.endTest(test);
	  
	   
	   
	   
	
		report.flush();
		Thread.sleep(3000);
		driver.get("http://52.66.43.93:3100/admin/#/application_search");
		driver.navigate().refresh();
}
public static void screenshot(String fieldName) throws IOException
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File des = new File("./ScreenShot/"+fieldName+".png");
	FileUtils.copyFile(src, des);
	test.log(LogStatus.INFO,test.addScreenCapture(des.getAbsolutePath()));
}
}
