package Amount;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Transationframe {
	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest test,test01,test02,test03,test04,test05,test06,test07,test08,test09,test11,test10,test12;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandesh k. r\\chromedriver_win32 (12)\\chromedriver.exe");
		driver = new ChromeDriver();
		
     //report = new ExtentReports("./San./transaction.html") ;
     report = new ExtentReports("./Transaction Frame./report.html") ; 
		// test =report.startTest("TC01","login") ;
		 test =report.startTest("Login to Transaction framework","login") ;
		 
		 
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("http://52.66.43.93:3100/admin/#/login");
		 
	     //driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		 
		 try {
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("staff@company.com");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
			 driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();
			 
			 driver.manage().window().maximize();
			 test.log(LogStatus.INFO,"user clicked on  login button with entering valid User Id and Passsword");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 test.log(LogStatus.ERROR,"Error in clickin method:"+e.getMessage());
		}
		
		 report.endTest(test);
		 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		 
		 
		 
		 
		 
	/*	ACTION */
		 
		 test01 =report.startTest("Action search","action ") ;
		 
		 
		 Thread.sleep(2000);
	     try {
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
			 
			 
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div[1]/div[3]/div[1]/div/div[1]")).click();
				Thread.sleep(2000);
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,100)");
				Thread.sleep(8000);
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();
				
Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div[1]/div[3]/div[2]/div/div[1]/div")).click();
			Thread.sleep(2000);
			JavascriptExecutor js1=(JavascriptExecutor)driver;
			js1.executeScript("window.scrollBy(0,100)");
			Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div[1]/div[3]/div[3]/div/div[1]/div")).click();
Thread.sleep(2000);
JavascriptExecutor js2=(JavascriptExecutor)driver;
js2.executeScript("window.scrollBy(0,100)");
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();


Thread.sleep(2000);	 
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div[1]/div[3]/div[4]/div/div[1]/div")).click();
Thread.sleep(2000);
JavascriptExecutor js3=(JavascriptExecutor)driver;
js3.executeScript("window.scrollBy(0,100)");
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();


test01.log(LogStatus.INFO,"user clicked on action search  Showing all recorded Data ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 test01.log(LogStatus.ERROR,"Error in clickin method:"+e.getMessage());
		}

report.endTest(test01);






		 
			/*OBJECT*/		 
		 
	 test02 =report.startTest("Object search","object ") ;
	 try {
		Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[3]/a")).click();

		   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[3]/ul/li[1]/a")).click();
		   Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input")).sendKeys("hi");

		  
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/input")).sendKeys("hi");
		  Thread.sleep(2000);
			 driver.findElement(By.xpath("//button[@type='reset']")).click();
		  
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@href='#/object_search']")).click();
			 
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//div[@class='rt-tr -odd']//div[@class='rt-expander'][contains(text(),'•')]")).click();
		  Thread.sleep(7000); 
		
		

		
		  Thread.sleep(2000);
		  JavascriptExecutor js40=(JavascriptExecutor)driver;
		  js40.executeScript("window.scrollBy(0,1200)");
		  Thread.sleep(4000);

		  
   test02.log(LogStatus.INFO,"user clicked on object search Showing all recorded Data");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		 test02.log(LogStatus.ERROR,"Error in clickin method:"+e.getMessage());
	}

   report.endTest(test02);


		 
   
   
		 
			/*	APPLICATION */

		 test03 =report.startTest("Application search ","APPLICATION ") ;
Thread.sleep(2000);
try {
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[4]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[4]/ul/li[1]/a")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div/div/input")).sendKeys("hi");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='reset']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[4]/ul/li[2]/a")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[1]/div/div[1]/div")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[2]/div/div[1]/div")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();
	
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[3]/div/div[1]/div")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();
	
	test03.log(LogStatus.INFO,"user clicked on APPLICATION search Showing all recorded Data");
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	 test03.log(LogStatus.ERROR,"Error in clickin method:"+e.getMessage());
}

report.endTest(test03);

		 
		 


		 
		 
			/* MENU */
		 
		 test04=report.startTest("Menu search"," Menu") ;
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[5]/a")).click();
			

			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[5]/ul/li[1]/a")).click();

			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[1]/div/input")).sendKeys("1");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[2]/div/input")).sendKeys("w.com");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[3]/div/input")).sendKeys("@");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[4]/div/input")).sendKeys("Table");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[5]/div/input")).sendKeys("column");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[6]/div/input")).sendKeys("row");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='reset']")).click();
			
			Thread.sleep(4000);

			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[5]/ul/li[2]/a")).click();

			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[3]/div[1]/div[3]/div[1]/div/div[1]/div")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();


			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[3]/div[1]/div[3]/div[2]/div/div[1]/div")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();


			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[3]/div[1]/div[3]/div[3]/div/div[1]/div")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();


			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[3]/div[1]/div[3]/div[4]/div/div[1]/div")).click();
			//Thread.sleep(4000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();


			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[3]/div[1]/div[3]/div[5]/div/div[1]/div")).click();
			//Thread.sleep(4000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();


			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[3]/div[1]/div[3]/div[6]/div/div[1]/div")).click();
			//Thread.sleep(4000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();


			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[3]/div[1]/div[3]/div[7]/div/div[1]/div")).click();
			//Thread.sleep(4000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();


			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[3]/div[1]/div[3]/div[8]/div/div[1]/div")).click();
			//Thread.sleep(4000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();


			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[3]/div[1]/div[3]/div[9]/div/div[1]/div")).click();
			//Thread.sleep(4000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();


			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[3]/div[1]/div[3]/div[10]/div/div[1]/div")).click();
			//Thread.sleep(4000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();

			test04.log(LogStatus.INFO,"user clicked on Menu search Showing all recorded Data");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 test04.log(LogStatus.ERROR,"Error in clickin method:"+e.getMessage());
		}

		report.endTest(test04);
		


		
		

			/*	USER */
		 test05 =report.startTest("User search "," user") ;
		
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[6]/a")).click();
			

			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[6]/ul/li[1]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input")).sendKeys("hi@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/input")).sendKeys("gt");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[3]/div/input")).sendKeys("r");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[4]/div/input")).sendKeys("345");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[5]/div/input")).sendKeys("4r5");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='reset']")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[6]/ul/li[2]/a")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[1]/div/div[1]/div")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();

			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[2]/div/div[1]/div")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();

			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[3]/div/div[1]/div")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();

			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[4]/div/div[1]/div")).click();
			//Thread.sleep(4000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();

//Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[5]/div/div[1]/div")).click();
			//Thread.sleep(4000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();

			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[6]/div/div[1]/div")).click();
			//Thread.sleep(4000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();

			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[7]/div/div[1]/div")).click();
			//Thread.sleep(4000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();

			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[8]/div/div[1]/div")).click();
			///Thread.sleep(4000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();

			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[9]/div/div[1]/div")).click();
			//Thread.sleep(4000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();

			//Thread.sleep(3000);
			///driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[10]/div/div[1]/div")).click();
			//Thread.sleep(4000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();



			test05.log(LogStatus.INFO,"user clicked on user search Showing all recorded Data ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 test05.log(LogStatus.ERROR,"Error in clickin method:"+e.getMessage());
		}
	
		report.endTest(test05);



		
		
			/*	ROLE */
		
		
		 test06 =report.startTest("Role search"," role") ;
		
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[7]/a")).click();
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[7]/ul/li[1]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div/div/input")).sendKeys("hi@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='reset']")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[7]/ul/li[2]/a")).click();
			
			
			Thread.sleep(3000);

			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[1]/div/div[1]/div")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();

			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[2]/div/div[1]")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();

			
			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[3]/div/div[1]")).click();
			//Thread.sleep(4000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();

			
			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[4]/div/div[1]")).click();
			//Thread.sleep(4000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();

			
			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[5]/div/div[1]")).click();
			//Thread.sleep(4000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();

			
			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[6]/div/div[1]")).click();
			//Thread.sleep(4000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();

			
//Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[7]/div/div[1]")).click();
			//Thread.sleep(4000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();

			
			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[8]/div/div[1]")).click();
			//Thread.sleep(4000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();

			
			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[9]/div/div[1]")).click();
			//Thread.sleep(4000);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[1]/i")).click();


			test06.log(LogStatus.INFO,"user clicked on role search Showing all recorded Data ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 test06.log(LogStatus.ERROR,"Error in clickin method:"+e.getMessage());
		}
		 
		report.endTest(test06);




	 
					
			/*	BRANCH */
		
		 test07=report.startTest("Branch search","branch") ;
		
		
		
		 driver.manage().timeouts().implicitlyWait(180,TimeUnit.SECONDS);

		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[8]/a")).click();
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[8]/ul/li[1]/a")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input")).sendKeys("abc");
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/input")).sendKeys("ac");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='reset']")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[8]/ul/li[2]/a")).click();
			//
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div/div/div[1]/div")).click();
			Thread.sleep(2000);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
 //  driver.switchTo().alert().dismiss();
			
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[3]/div/button[3]")).click();
			
			test07.log(LogStatus.INFO,"user clicked on Showing all recorded Data ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 test07.log(LogStatus.ERROR,"Error in clickin method:"+e.getMessage());
		}
		 
		report.endTest(test07);

		
		
		
		/*complex */
		
		 test08=report.startTest("Complex search"," complex") ;
		 Thread.sleep(5000);
			try {
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[9]/a")).click();
				
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[9]/ul/li[1]/a")).click();
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input")).sendKeys("abc");
				
 	   Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[3]/div/input")).sendKeys("abc");
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//button[@type='reset']")).click();
				 
				Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[9]/ul/li[2]/a")).click();
				
				Thread.sleep(3000);
				   JavascriptExecutor js101=(JavascriptExecutor)driver;
				   js101.executeScript("window.scrollBy(0,700)");
				   
				   Thread.sleep(2000);
				   driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();

				   
				   Thread.sleep(2000);
				   driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
				   
				   Thread.sleep(2000);
				   driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
				   Thread.sleep(2000);
				   driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[4]/div[1]/div[1]/div[1]")).click();
				   
				   
test08.log(LogStatus.INFO,"user clicked on complex search Showing all recorded Data  ");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				 test08.log(LogStatus.ERROR,"Error in clickin method:"+e.getMessage());
			}
	
		report.endTest(test08);
		
		
		
		
		
		
		
		/*simple */
		 test09=report.startTest("Simple search"," simple") ;
		 Thread.sleep(3000);
			try {
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[10]/a")).click();
				
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[10]/ul/li[1]/a")).click();
   Thread.sleep(1000);
   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input")).sendKeys("abc");
   Thread.sleep(2000);
				 driver.findElement(By.xpath("//button[@type='reset']")).click();
   Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[10]/ul/li[2]/a")).click();
				 Thread.sleep(3000);
				   JavascriptExecutor js102=(JavascriptExecutor)driver;
				   js102.executeScript("window.scrollBy(0,700)");
				   
				   Thread.sleep(2000);
				   driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
				   Thread.sleep(2000);
				   driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[20]/div[1]/div[1]/div[1]")).click();	
				   

test09.log(LogStatus.INFO,"user clicked on simple search Showing all recorded Data ");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				 test09.log(LogStatus.ERROR,"Error in clickin method:"+e.getMessage());
			}

		report.endTest(test09);
		
		
		
		
		
		/*History */
		 test10 =report.startTest("History search","history") ;
		Thread.sleep(4000);
		try {
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[11]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[11]/ul/li/a")).click();
   Thread.sleep(1000);
   
   test10.log(LogStatus.INFO,"user clicked on history search Showing all recorded Data ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 test10.log(LogStatus.ERROR,"Error in clickin method:"+e.getMessage());
		}

	   report.endTest(test10);
		
	   
	   
		
	   /*Transaction */
		 test11 =report.startTest("Transaction new"," Transaction") ;
		Thread.sleep(4000);
		try {
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[12]/a")).click();
			   Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[12]/ul/li/a")).click();
   Thread.sleep(3000);
   JavascriptExecutor js21=(JavascriptExecutor)driver;
      js21.executeScript("window.scrollBy(0,600)");
      test11.log(LogStatus.INFO,"user clicked on Transaction new transaction ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 test11.log(LogStatus.ERROR,"Error in clickin method:"+e.getMessage());
		}

       report.endTest(test11);
       
		
		
       
       
       
       /*customers */
  	 test12 =report.startTest("Customers search"," customers") ;
		
  	 
	 Thread.sleep(4000);
		try {
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[13]/a")).click();
			
			 Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[13]/ul/li/a")).click();
			Thread.sleep(1000);
			  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input")).sendKeys("abc@gmail");
			  Thread.sleep(1000);
			  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/input")).sendKeys("abc");
			   Thread.sleep(1000);
			  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[3]/div/input")).sendKeys("ab");
			   Thread.sleep(1000);
			  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[4]/div/input")).sendKeys("1234");
			  Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@type='reset']")).click();
			 Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[13]/ul/li[2]/a")).click();
   Thread.sleep(3000);
   


  Thread.sleep(2000);
  JavascriptExecutor ja1=(JavascriptExecutor)driver;
  ja1.executeScript("window.scrollBy(0,1200)");
  Thread.sleep(4000);
  Thread.sleep(2000);
      driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();

			  Thread.sleep(2000);
			  JavascriptExecutor ja2=(JavascriptExecutor)driver;
			  ja2.executeScript("window.scrollBy(0,1200)");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();

			  Thread.sleep(2000);
			  JavascriptExecutor ja3=(JavascriptExecutor)driver;
			  ja3.executeScript("window.scrollBy(0,1200)");
      
      
      Thread.sleep(2000);
      driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();  
      Thread.sleep(2000);
      

			  Thread.sleep(2000);
			  JavascriptExecutor ja4=(JavascriptExecutor)driver;
			  ja4.executeScript("window.scrollBy(0,1200)");
			  driver.findElement(By.xpath("//button[normalize-space()='Next']")).click(); 
			  Thread.sleep(2000);
			  
			  
			  

			  Thread.sleep(2000);
			  JavascriptExecutor ja5=(JavascriptExecutor)driver;
			  ja5.executeScript("window.scrollBy(0,1200)");
      driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();  
      Thread.sleep(2000);
      

			  Thread.sleep(2000);
			  JavascriptExecutor ja6=(JavascriptExecutor)driver;
			  ja6.executeScript("window.scrollBy(0,1200)");
			  driver.findElement(By.xpath("//button[normalize-space()='Next']")).click(); 
			  Thread.sleep(2000);
      driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();  
      Thread.sleep(2000);
      

			  Thread.sleep(2000);
			  JavascriptExecutor ja7=(JavascriptExecutor)driver;
			  ja7.executeScript("window.scrollBy(0,1200)");
			  driver.findElement(By.xpath("//button[normalize-space()='Next']")).click(); 
			  Thread.sleep(2000);
      driver.findElement(By.xpath("//button[normalize-space()='Next']")).click(); 
      Thread.sleep(2000);
     

			  Thread.sleep(2000);
			  JavascriptExecutor ja8=(JavascriptExecutor)driver;
			  ja8.executeScript("window.scrollBy(0,1200)");
			  driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
  
			  Thread.sleep(2000);
			  JavascriptExecutor ja9=(JavascriptExecutor)driver;
			  ja9.executeScript("window.scrollBy(0,1200)");
			  driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
			  
			  Thread.sleep(2000);
			  JavascriptExecutor ja10=(JavascriptExecutor)driver;
			  ja10.executeScript("window.scrollBy(0,1200)");
			  driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
			  
			  Thread.sleep(2000);
			  
			  driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[6]/div[1]/div[1]/div[1]")).click();
			  Thread.sleep(6000);
			  test12.log(LogStatus.INFO,"user clicked on customer search Showing all recorded Data ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 test12.log(LogStatus.ERROR,"Error in clickin method:"+e.getMessage());
		}

	       report.endTest(test12);
	       

			 report.flush();
			 
	}
	
}
