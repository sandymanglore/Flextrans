package newTransaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Application_new {
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
	 
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[4]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[4]/ul/li[1]/a")).click();

	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div/div/input")).sendKeys("dhdhhjdejjdllr42r24e4kdoeo49595858ffm,m333f,fkmfjdkidieiu48djsnni9w3hhdaiuqe3nadkjbajjzjshhjshssjsjsjsjsjjsagdddddddddddddddddddddddddddddddddduuuuuuuuuuuuuuuuuuuuuut666666688888nnnnnnnnnnnnnnnnnnnnnyyyyyyyyyyyyyyyyyyyyyyyyyyy55555555555eeeeeeeeeeeeeeeeee");
   Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
   		/*	
   driver.findElement(By.xpath("//a[@href='#/application_search']")).click();	
   Thread.sleep(2000);
   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[18]/div/div[2]")).click();	 

   
/*

	Thread.sleep(8000);
	 
    driver.findElement(By.xpath("//button[normalize-space()='Edit']")).click();
    
   // Thread.sleep(9000);
	 
   // driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
    
 //   Thread.sleep(9000);
	 
  //  driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();
    
    
    
    Thread.sleep(10000);
	 
    driver.findElement(By.xpath("//input[@placeholder='Enter Application Name']")).clear();
    
    
    Thread.sleep(8000);
	 
    driver.findElement(By.xpath("//input[@placeholder='Enter Application Name']")).sendKeys("Teejkk8884****$$#33Teing    @12344447         tkTestsing@12344447t8                      588jshdhhdhjdyeejjdjdjj                   duejkkTestsing@12344447t8588jshdh               hdhjdyeejjdjdjjduejkkTestsing@12344447t8588jshdhhdhjdyeejjdjdjjduejkkTestsing@12344447t8588jshdhhdhjdyeejjdjdjjduejkkFLEXTRAN_009");
    

    Thread.sleep(8000);
	 
   // driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
    

    Thread.sleep(4000);
	 
   driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
    
/*
   Thread.sleep(4000);
	 
   driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
   
   Thread.sleep(4000);
	 
   driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
    
	*/
	
	
	
	
	/*search box*/
	/*
	Thread.sleep(4000);
	
   driver.findElement(By.xpath("//a[@href='#/application_search']")).click();	
   
   Thread.sleep(5000);
	Select sa=new Select	( driver.findElement(By.xpath("//select[@aria-label='rows per page']")));
	sa.selectByValue("10");
	
  Thread.sleep(4000);
	
   driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("F");

	Thread.sleep(4000);
	
  driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/input[1]")).sendKeys("06");	
	
	

	Thread.sleep(4000);
	
  driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/input[1]")).sendKeys("06");	
	
	*/
   
	}}
		 
		