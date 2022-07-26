package newTransaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Branch_new {
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
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[8]/a")).click();
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[8]/ul/li[1]/a")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input")).sendKeys("Delhi");
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/input")).sendKeys("Company_03");
		//	Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@type='reset']")).click();
		Thread.sleep(2000);
	    	
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    	

		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='#/branch_search']")).click();
    	
    	

				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[normalize-space()='Delhi']")).click();
		    	
		    	
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[normalize-space()='Edit']")).click();
		    	
				
				Thread.sleep(9000);
				driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).clear();
		    	

				Thread.sleep(9000);
				driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("New_Delhi");
				
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();

				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();

				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
		    	    	
	    		
			
				Thread.sleep(5000);
			//	driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
			//	Thread.sleep(5000);
			//	driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();
			//	Thread.sleep(7000);
			//	driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
				
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
		    	
			//	Thread.sleep(5000);
			//	driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
	
		
		
		/*
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Ba");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/input[1]")).sendKeys("Com");
		

		Thread.sleep(5000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/input[1]")).sendKeys("16");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/input[1]")).sendKeys("09");
		
		*/
		
		
		
		
		
	}
}
