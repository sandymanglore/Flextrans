package newTransaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Complex_new {
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
		 
		 
		 
		 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[9]/a")).click();
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[9]/ul/li[1]/a")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input")).sendKeys("Get_Customer");
			
         Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[3]/div/input")).sendKeys("Get_Customer");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@type='reset']")).click();
		//	Thread.sleep(2000);
		//	 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[9]/ul/li[2]/a")).click(); 
			
		
		 
		 
		 
		 Thread.sleep(8000);
			 driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Get_Customer")	;	 
			 
			 Thread.sleep(4000);
			 driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]")).click();
			 
			 
			 Thread.sleep(4000);
			 driver.findElement(By.xpath("//button[normalize-space()='Edit']")).click();	 
			 
			Thread.sleep(8000);
			 driver.findElement(By.xpath("//button[@type='reset']")).click();	 
			 
			// Thread.sleep(8000);
			// driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();	 
		//	 Thread.sleep(4000);
		//	 driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();	 
			 
			 Thread.sleep(8000);
			 driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();	 
			 
			 Thread.sleep(8000);
			 driver.findElement(By.xpath("//button[normalize-space()='Add Step']")).click();	 
			 
			 
			 Thread.sleep(8000);
			 driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/button[1]")).click();	 
			 
			 Thread.sleep(8000);
			 driver.findElement(By.xpath("//button[normalize-space()='SUCCESS']")).click();
			 
			 
			 Thread.sleep(8000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Delay...']")).sendKeys("1"); 
			 
			 
			 
			 Thread.sleep(8000);
			 driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[2]/div[1]/button[1]")).click();	 
			 
			 
			 
			 Thread.sleep(8000);
			 driver.findElement(By.xpath("//button[@value='14ba7b20-4505-11ea-bbcf-5d4de099df61']")).click();	 
			 
			 
			 
			 Thread.sleep(8000);
			driver.findElement(By.xpath("//button[@type='reset']")).click();	 
				 
			// Thread.sleep(8000);
			//	driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();	 
					 
			 
			Thread.sleep(8000);
			 driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();	 
			 
			 
		 
		 /*
		   Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[9]/ul/li[2]/a")).click(); 
			
		 Thread.sleep(8000);
		 driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("a")	;	 
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[2]/div/div[1]/div")).click();
		 
		 
		 
		 
		 
			Thread.sleep(8000);
				 driver.findElement(By.xpath("//button[normalize-space()='Deactivate']")).click();	 
				 
				 Thread.sleep(8000);
				driver.findElement(By.xpath("//button[contains(text(),'Deactivate')]")).click();	 
				 
			 
				 Thread.sleep(8000);
				driver.findElement(By.xpath("//button[normalize-space()='Visualize']")).click();	 
		 
		 
		 Thread.sleep(8000);
		 driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();	 
			 
		  Thread.sleep(8000);
		driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();	 
		
		 
		 
		 
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//a[normalize-space()='Access']")).click();	
		 
		
	 WebElement selectMyElement =driver.findElement(By.cssSelector(".css-1hwfws3.select__value-container.select__value-container--is-multi"));
	 selectMyElement.click();

	 Actions keyDown = new Actions(driver);
	// keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
	 keyDown.sendKeys("BANK DEMO").build().perform();
		

	     	 */
		 
		 
		 
	}
		 
}
