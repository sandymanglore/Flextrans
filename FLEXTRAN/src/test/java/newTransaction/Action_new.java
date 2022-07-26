package newTransaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Action_new {
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
		 
		 
		 
		 Thread.sleep(4000);
		
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/a")).click();
		 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/ul/li[1]/a")).click();
		 
		 
		 /*ui*/
		
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[1]/div/input")).sendKeys("ACTION-10");
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[2]/div/input")).sendKeys("Add");
    	 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[3]/div[2]/fieldset/div/label/input")).click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@placeholder='Enter UI URL']")).sendKeys("WWW.action.com");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='confirm']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Enter Confirmation Message']")).sendKeys("Adding");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(" //button[@type='submit']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/ul/li[2]/a")).click();
		 Thread.sleep(2000);
		 JavascriptExecutor jsa=(JavascriptExecutor)driver;
			jsa.executeScript("window.scrollBy(0,500)");
				
	 Thread.sleep(2000);
		 driver.findElement(By.xpath(" //body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[3]/div[14]/div[1]/div[1]/div[1]")).click();
		 
	 
			
		driver.findElement(By.xpath("//button[normalize-space()='Delete']//i[@class='fa fa-dot-circle-o']")).click();
	Thread.sleep(5000);
	//	 driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
	driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
	 Thread.sleep(2000);
	driver.findElement(By.xpath("//button[normalize-space()='Edit']//i[@class='fa fa-dot-circle-o']")).click();
	Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Code']")).clear();
		Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@placeholder='Enter Code']")).sendKeys("Action_7");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		
		
		 
		 
		 
	/*	 /*product*/
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[1]/div/input")).sendKeys("Condition_02");
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[2]/div/input")).sendKeys("Add");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='productCall']")).click();
		 
		Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[4]/div/button")).click();
	    
	    Thread.sleep(5000);
	   
	   driver.findElement(By.xpath("//button[@value='12236510-f067-11ec-94b5-2398d5746b40']")).click();
			
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@name='confirm']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@placeholder='Enter Confirmation Message']")).sendKeys("Test");
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath(" //button[@type='submit']")).click();
		 Thread.sleep(8000);
	

		 
		 
		 
		 
		 
		 
		 
		 /*service*/
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/ul/li[1]/a")).click();
		 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[1]/div/input")).sendKeys("Get_02");
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[2]/div/input")).sendKeys("Add");
		 Thread.sleep(2000);
	
		 Thread.sleep(2000);
     	 driver.findElement(By.xpath("//input[@name='serviceCall']")).click();
		 
		 Thread.sleep(3000);
    	 driver.findElement(By.xpath("//input[@placeholder='Enter Service URL']")).sendKeys("WWW.action.com");
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//button[normalize-space()='SELECT']")).click();
		 Thread.sleep(2000);
				
		 driver.findElement(By.xpath("//button[@value='GET']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='confirm']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@placeholder='Enter Confirmation Message']")).sendKeys("Test");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(" //button[@type='submit']")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/ul/li[2]/a")).click();
		 Thread.sleep(2000);
		 JavascriptExecutor jsb=(JavascriptExecutor)driver;
		jsb.executeScript("window.scrollBy(0,500)");
			
		 
		 
		 
		 
		 
			
			/*Action search by data*/
			
			
		 
		 
		 
			// driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/ul/li[2]/a")).click();
			// Thread.sleep(2000);
			
			// driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("A");
			 
			// driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/input[1]")).sendKeys("S");
			// driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[7]/input[1]")).sendKeys("G");
		// driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[10]/input[1]")).sendKeys("06");
			// JavascriptExecutor jsc=(JavascriptExecutor)driver;
			//jsc.executeScript("window.scrollBy(0,700)");
			// Thread.sleep(4000);
			 
			Select sa=new Select	( driver.findElement(By.xpath("//select[@aria-label='rows per page']")));
		sa.selectByValue("10");
	}
}
