package newTransaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Object_new {
	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest test;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandesh k. r\\chromedriver_win32 (12)\\chromedriver.exe");
		driver = new ChromeDriver();
		
    
		 
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("http://52.66.43.93:3100/admin/#/login");
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("staff@company.com");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		 driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();
		 
		 
		 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[3]/a")).click();

		   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[3]/ul/li[1]/a")).click();
		   Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input")).sendKeys("Action ClickEntity");

		  
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/input")).sendKeys("Action ClickEntity");
		  Thread.sleep(2000);
		// driver.findElement(By.xpath("//button[@type='submit']")).click();
		   Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@href='#/object_search']")).click();
			 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[@class='rt-tbody']//div[3]//div[1]//div[1]//div[1]")).click();
			 
			  Thread.sleep(9000);
				 driver.findElement(By.xpath("//button[normalize-space()='Add Action']")).click();
			   Thread.sleep(3000);
				  driver.findElement(By.xpath("//div[@class='btn-group']//button[@type='button'][normalize-space()='Select']")).click();
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("//button[@value='a1c7341c-78ba-4369-9f7c-de536ea0eb39']")).click();
			  
			  Thread.sleep(3000);
				  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[2]/div/div[2]/div/div/button")).click();
				  
				  Thread.sleep(3000);
				  driver.findElement(By.xpath("//button[@value='ONLY_ONCE']")).click();
				  
				  

     		  Thread.sleep(3000);
			 driver.findElement(By.xpath("//button[@class='d-flex pull-right mr-2 btn btn-danger btn-sm']")).click();
				  
				  Thread.sleep(5000);
				//  driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
				  
				  
				  
			 Thread.sleep(3000);
			driver.findElement(By.xpath("//button[normalize-space()='Edit']")).click();
				
				  
					 
			 Thread.sleep(8000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Object Name']")).clear();
						 
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Object Name']")).sendKeys("Action_01 Entity");
						  

		     Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@placeholder='Enter key']")).clear();
								 
		    Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@placeholder='Enter key']")).sendKeys("Action_01 Entity");
								  
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
								  					   
			 Thread.sleep(3000);
		//	driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
								  			  
			 Thread.sleep(6000);	  
				 
			 
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
								  			  
			 
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();	  
				  
			Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@href='#/object_search']")).click();
				  
			/*	  
			Thread.sleep(5000);
	     	driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("C");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='form-control']")).clear();
				 
			  
				  
			 Thread.sleep(2000);
		    driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/input[1]")).sendKeys("C");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/input[1]")).clear();
					 			 
			
			Thread.sleep(2000);
		    driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[4]/input[1]")).sendKeys("06");
			Thread.sleep(2000);
		    driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[4]/input[1]")).clear();
				 
			 
		  Thread.sleep(2000);
		   driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/input[1]")).sendKeys("06");
				 
				 	 		 	 
			*/
				  
	}
		  
}
