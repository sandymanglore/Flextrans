package newTransaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class User_new {
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
		 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[6]/a")).click();
			

			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[6]/ul/li[1]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input")).sendKeys("ab02@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/input")).sendKeys("abc02");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[3]/div/input")).sendKeys("efg");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[4]/div/input")).sendKeys("758797889");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[5]/div/input")).sendKeys("4r5");
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//button[@type='reset']")).click();
			
			//Thread.sleep(3000);
	    	//driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//a[@href='#/user_search']")).click();
			/*
	    	Thread.sleep(2000);
	    	JavascriptExecutor js3=(JavascriptExecutor)driver;
	    	js3.executeScript("window.scrollBy(0,650)");
	    	
	    	Thread.sleep(5000);
	    	Select sa=new Select	( driver.findElement(By.xpath("//select[@aria-label='rows per page']")));
	    	sa.selectByValue("25");
	    	
	    	Thread.sleep(2000);
	    	JavascriptExecutor js4=(JavascriptExecutor)driver;
	    	js4.executeScript("window.scrollBy(0,300)");
			
			
	    	Thread.sleep(2000);
			
	    	driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
	    	
*/
	    	Thread.sleep(2000);
			
	    	driver.findElement(By.xpath("//div[normalize-space()='abc02']")).click();
	    	
	    	Thread.sleep(9000);
	    	
	    	driver.findElement(By.xpath("//button[normalize-space()='Edit']")).click();
         
	    	Thread.sleep(8000);
		    	
		    driver.findElement(By.xpath("//input[@placeholder='Enter Last Name...']")).clear();
		    
          Thread.sleep(5000);
	    	
	    driver.findElement(By.xpath("//input[@placeholder='Enter Last Name...']")).sendKeys("ghjk");
	    	
	    Thread.sleep(4000);
		    	
		 driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
		   
		 Thread.sleep(4000);
	    	
		// driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		       		
		 Thread.sleep(4000);
	    	
		 driver.findElement(By.xpath("//button[normalize-space()='Add Role']")).click();
			   	
		 Thread.sleep(4000);
	    	
		 driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
		 Thread.sleep(4000);
	    	
		 driver.findElement(By.xpath("//button[@value='82fd0e30-ebd0-11ec-b9f7-75f3b330edd0']")).click();
			   		   		
		 Thread.sleep(4000);
	    	
		 driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
			   		   		
		 Thread.sleep(4000);
	    	
		 driver.findElement(By.xpath("//button[@value='f7e042f0-196d-11e9-95b2-39097592ab88']")).click();
			  		
		 Thread.sleep(4000);
	    	
		 driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/button[1]")).click();
		 Thread.sleep(4000);
	    	
		 driver.findElement(By.xpath("//button[@value='e0c0cd90-4727-11ea-a010-07650f535359']")).click();
		
		 Thread.sleep(4000);
	    	
		 driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
		 
		//Thread.sleep(4000);
	    	
	// driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		 
		 Thread.sleep(8000);
	    	
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		  
		 
		 Thread.sleep(4000);
	    	
		 driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
		 
		 
		 
		 Thread.sleep(9000);
	    	
	    	driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
	    	
	        Thread.sleep(6000);
	    		
	        	driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click(); 
	    	
	        	
	        
	   /* 	
          Thread.sleep(6000);
			
	    	driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
	    	
        Thread.sleep(6000);
			
	    	driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click(); 
	    	
	    	
       Thread.sleep(6000);
			
	   driver.findElement(By.xpath("//button[normalize-space()='Disable']")).click();
	   Thread.sleep(6000);
		
	   driver.findElement(By.xpath("//button[contains(text(),'Disable')]")).click();
	    	 	 
	    driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	    
	    Thread.sleep(6000);
		
    	driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
    	
    Thread.sleep(6000);
		
    	driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click(); 
    	*/
	    	/*
	    	
	        Thread.sleep(6000);
			
	   	driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("a");  	
	    	
	    	 Thread.sleep(6000);
				
		   driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/input[1]")).sendKeys("a");  	
		   Thread.sleep(6000);
					
		   driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/input[1]")).sendKeys("g");  	
			    		
       Thread.sleep(6000);
				
		  	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/input[1]")).sendKeys("7");  	
	    	
	    	
	    	*/
	}

		 

}
