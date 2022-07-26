package newTransaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Role_new {
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
		 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[7]/a")).click();
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[7]/ul/li[1]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div/div/input")).sendKeys("Company Head");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='reset']")).click();
			//driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href='#/roles_search']")).click();
			
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[normalize-space()='Company head']")).click();
			/*
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Enable NetBanking']")).click();
			
			
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Do AML Check']")).click();
			
			
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Attach Debit Card']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Get Menu']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Customer On-Boarding']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Search Person']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Perform KYC']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Photo-Upload']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Search Customer']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Customer Get']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Open Account']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Create New Customer']")).click();
			
			
			*/
			
			
			
		
			Thread.sleep(8000);
			driver.findElement(By.xpath("//button[normalize-space()='Add Product']")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@value='82fd0e30-ebd0-11ec-b9f7-75f3b330edd0']")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[normalize-space()='Select']")).click();
			
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@value='d0529370-fd01-11ec-9173-431252db9c51']")).click();
			
			
			
		//	Thread.sleep(3000);
	//		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
			
			
			
			
			
			Thread.sleep(8000);
			driver.findElement(By.xpath("//button[normalize-space()='Add Access']")).click();
			
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
			
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@value='48d1cb89-079d-4984-9915-7442a8d821ed']")).click();
			
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[normalize-space()='Select']")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@value='596c1a9c-036c-473d-952e-ef0d9ff9c13c']")).click();
			
			
//			Thread.sleep(3000);
	//		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
			
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
			

			
			
			Thread.sleep(8000);
			driver.findElement(By.xpath("//button[normalize-space()='Edit']")).click();
				
			

			Thread.sleep(8000);
			driver.findElement(By.xpath("//input[@placeholder='Enter Name...']")).clear();
				

			Thread.sleep(8000);
			driver.findElement(By.xpath("//input[@placeholder='Enter Name...']")).sendKeys("Company head");

			Thread.sleep(3000);
	    	driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
				

	//		Thread.sleep(3000);
	//		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
							
	
			
			
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[normalize-space()='Edit']")).click();
				
			
			
			Thread.sleep(3000);
	    	driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
				

	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();
				

	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
				

			
			
			
			

	    	Thread.sleep(8000);
	    	driver.findElement(By.xpath("//button[normalize-space()='Add Menu']")).click();
					
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//button[normalize-space()='Select']")).click();
	    	
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//button[@value='db17da14-c652-4dd2-a6aa-9f356a34ee3c']")).click();
					
			
	    	//  	Thread.sleep(3000);
	    	//  	driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();		
			
			
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
			
					
			
			Thread.sleep(9000);
	    	driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
			
	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
			
	    	
	    	
	    	
	    	
	    	
	    	
	    	/*
	    	
			Thread.sleep(5000);
	    	driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Co");
			
	
	    	
			Thread.sleep(5000);
	    	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/input[1]")).sendKeys("08");
			
	    	
	
	    	
			Thread.sleep(5000);
	    	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/input[1]")).sendKeys("08");
			
	    	*/
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	}
}

