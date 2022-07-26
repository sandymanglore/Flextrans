package newTransaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Menu_new {
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
		 
		 
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[5]/a")).click();
			

			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[5]/ul/li[1]/a")).click();

			Thread.sleep(2000);
	//	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[1]/div/input")).sendKeys("1");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[2]/div/input")).sendKeys("/Inprogress_transaction01");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[3]/div/input")).sendKeys("AB");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[4]/div/input")).sendKeys("Transaction01");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[5]/div/input")).sendKeys("Inprogress");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[6]/div/input")).sendKeys("Transaction01 report");
			Thread.sleep(2000);

			 JavascriptExecutor jse = (JavascriptExecutor)driver;
			 jse.executeScript("window.scrollBy(0,550)"); 
			//driver.findElement(By.xpath("//button[@type='reset']")).click();
			
			Thread.sleep(4000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();

			Thread.sleep(4000);
          driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[5]/ul/li[2]/a")).click();

          Thread.sleep(4000);
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[3]/div[1]/div[3]/div[12]/div[1]/div[1]/div[1]")).click();

			
			
			Thread.sleep(7000);
	          driver.findElement(By.xpath("//button[normalize-space()='Edit']")).click();
			
			
			
			
	          Thread.sleep(10000);
	          driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
			
	          Thread.sleep(9000);
	          driver.findElement(By.xpath("//i[@class='fa fa-arrow-left']")).click();
			
	  		Thread.sleep(7000);
			
			
			/*

		    Thread.sleep(10000);
		     driver.findElement(By.xpath("//input[@placeholder='Enter Main Menu']")).clear();

			Thread.sleep(10000);
			   driver.findElement(By.xpath("//input[@placeholder='Enter Main Menu']")).sendKeys("Transactions");
			
			   Thread.sleep(6000);
			   driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
			
			
			
			/*
			  Thread.sleep(6000);
			   driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
			
			
			   Thread.sleep(6000);
			  driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
			*/
			
			
			
			
			
			
			
			/*search*/
			
			   
			   
			   
			
		//	Thread.sleep(4000);
	     //   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[5]/ul/li[2]/a")).click();	
	/*		
	        Thread.sleep(4000);
	       driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("0");
			
			
		
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[3]/input[1]")).sendKeys("Tr");
			
			
			
			
	        Thread.sleep(4000);
		       driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[4]/input[1]")).sendKeys("IN");
				
		
	        
	        Thread.sleep(4000);
		       driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[5]/input[1]")).sendKeys("/In");
				
	        Thread.sleep(4000);
		       driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[6]/input[1]")).sendKeys("Tra");
				
					
	        
	        Thread.sleep(5000);
	    	Select sa=new Select	( driver.findElement(By.xpath("//select[@aria-label='rows per page']")));
	    	sa.selectByValue("10");
	        
	        
	        */
	        
	        
		
	}
		 
		
}
