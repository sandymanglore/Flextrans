package Amount;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class money {
	
	static WebDriver driver;
	
	static ExtentReports report;
	
	static ExtentTest test01;

	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

	
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandesh k. r\\Downloads\\chromedriver_win32 (13)\\chromedriver.exe");
		driver = new ChromeDriver();
		  
		 
		 report = new ExtentReports("./San./Au10.html") ;
		 
		 test01 =report.startTest("TC01","login") ;
		 
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		
		
		driver.findElement(By.xpath("//input[@class='input']")).sendKeys("venu");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("v@23");
		 Thread.sleep(2000);
		 ///String title =driver.getTitle();
			//System.out.println( title);
		 //Assert.assertEquals(title," hhgf  ");
			 
		 //System.out.println(driver.getCurrentUrl());
		 
		driver.findElement(By.xpath("//input[@class='button']")).click();
		
		test01.log(LogStatus.INFO,"user opened the parabank appllication");
		
		 screenshot("dd");

		
		
		
        //  test02 =report.startTest("TC02","account") ;
		
	
	    Thread.sleep(6000);
	   driver.findElement(By.xpath("//a[contains(text(),'Open New Account')]")).click();
	Select dd=new Select (driver.findElement(By.xpath("//select[@id='type']")));
		dd.selectByVisibleText("SAVINGS");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button']")).click();
		  
	driver.findElement(By.xpath("//a[contains(text(),'Accounts Overview')]")).click();
	Thread.sleep(3000);
   test01.log(LogStatus.INFO,"uuser click on open account to creat new account");
 screenshot("de");
  // report.endTest(test02);
	
    
   
   
  // ExtentTest test03 =report.startTest("TC03","Fund Transfer") ;
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[contains(text(),'Transfer Funds')]")).click();
		
		Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("12");
	Thread.sleep(2000);
		Select sa=new Select  (driver.findElement(By.xpath("//select[@id='fromAccountId']")));
		sa.selectByVisibleText("13677");
	 Select saa=new Select  (driver.findElement(By.xpath("//select[@id='toAccountId']")));
		saa.selectByVisibleText("13566");
		Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@class='button']")).click();
	Thread.sleep(2000);
	 test01.log(LogStatus.INFO,"user transferring fund");
	 screenshot("df");
	  // report.endTest(test03);
		
		 
		  //ExtentTest test04  =report.startTest("TC04","Bill pay") ;
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Bill Pay')]")).click();
			driver.findElement(By.xpath("//input[@class='input ng-pristine ng-untouched ng-valid ng-empty']")).sendKeys("sandy");
		   driver.findElement(By.xpath("//input[@class='input ng-pristine ng-untouched ng-valid ng-empty']")).sendKeys("Mangalore");
			driver.findElement(By.xpath("//input[@class='input ng-pristine ng-untouched ng-valid ng-empty']")).sendKeys("Mangalore");
			driver.findElement(By.xpath("//input[@class='input ng-pristine ng-untouched ng-valid ng-empty']")).sendKeys("Karnataka");
			driver.findElement(By.xpath("//input[@class='input ng-pristine ng-untouched ng-valid ng-empty']")).sendKeys("00009009");
			Thread.sleep(2000);
			driver.findElement(By.name("payee.phoneNumber")).sendKeys("2365556");
			driver.findElement(By.xpath("//input[@class='input ng-pristine ng-untouched ng-valid ng-empty']")).sendKeys("13677");
			driver.findElement(By.xpath("//input[@class='input ng-pristine ng-untouched ng-valid ng-empty']")).sendKeys("13677");
			driver.findElement(By.xpath("//input[@class='input ng-pristine ng-untouched ng-valid ng-empty']")).sendKeys("15");
			Thread.sleep(2000);
		    Select sao=new Select  (driver.findElement(By.name("fromAccountId")));
			sao.selectByVisibleText("13566");
				
		driver.findElement(By.xpath("//input[@class='button']")).click();
		Thread.sleep(2000);
	  test01.log(LogStatus.INFO,"user payed bill");
	   screenshot("dg");
	  // report.endTest(test04);
		
		 
			
			//driver.findElement(By.xpath("//a[contains(text(),'Find Transactions')]")).click();
			
		///driver.findElement(By.xpath("//a[contains(text(),'Accounts Overview')]")).click();
		//Thread.sleep(2000);
		
		//	driver.findElement(By.xpath("//a[contains(text(),'14121')]")).click();
			//Thread.sleep(3000);
			
			//driver.findElement(By.xpath("//a[contains(text(),'Funds Transfer Sent')]")).click();	
			/// Thread.sleep(2000);
			 
			/// Actions action = new Actions(driver);
			 // Thread.sleep(2000);

			 // WebElement link = driver.findElement(By.xpath("//td[@text()='14476']"));
			 
			// action.moveToElement(link).doubleClick().build().perform();
				//Thread.sleep(4000);
			// driver.findElement(By.xpath("//b[contains(text(),'Transaction ID:')]")).sendKeys(Keys.chord(Keys.CONTROL,"c"));
			  //Thread.sleep(4000);
			 //
			//	Thread.sleep(2000);
			///  driver.findElement (By.xpath("//input[@id='criteria.transactionId']")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
		 //action.release(link).release();
		 
		 
	//		 
		 // ExtentTest test05=report.startTest("TC05","trans") ;
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Find Transactions')]")).click();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='criteria.onDate']")).sendKeys("05-17-2022");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='rightPanel']/div[1]/div[1]/form[1]/div[5]/button[1]")).click();
		Thread.sleep(2000);
		  test01.log(LogStatus.INFO,"transaction");
		  screenshot("dh");
		  // report.endTest(test05);
		 
		
		   
		   
         //  	 
			 // ExtentTest test06 =report.startTest("TC06","update") ;
		
		  Thread.sleep(2000);
		  
		   driver.findElement(By.xpath("//a[contains(text(),'Update Contact Info')]")).click();
		   Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("123456");
		 

			Thread.sleep(2000);
			
		driver.findElement(By.xpath("//input[@class='button']")).click();
		Thread.sleep(2000);
			 test01.log(LogStatus.INFO,"updating contact number");
			  screenshot("di");
			  // report.endTest(test06);
			   
			   
			   
		 
			 // ExtentTest test07  =report.startTest("TC07","loan") ;
			
			     Thread.sleep(2000);
			     driver.findElement(By.xpath("//a[contains(text(),'Request Loan')]")).click();
		 
			     Thread.sleep(2000);
			  driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("15");
			 
			  Thread.sleep(2000);
				  driver.findElement(By.xpath("//input[@id='downPayment']")).sendKeys("10");
				
				 Select da=new Select  (driver.findElement(By.xpath("//select[@id='fromAccountId']")));
				da.selectByVisibleText("13677");
		 
		 
		         Thread.sleep(2000);
				
				driver.findElement(By.xpath("//input[@class='button']")).click();
				  Thread.sleep(2000);
			 test01.log(LogStatus.INFO,"applying for loan");
			  screenshot("dj");
			  // report.endTest(test07);
   
   report.endTest(test01);
  // report.endTest(test02);
		 
report.flush();
		 
	} 
		 
	
		public static void screenshot(String fieldName) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File("./ScreenShot/"+fieldName+".png");
		test01.log(LogStatus.INFO,test01.addScreenCapture(des.getAbsolutePath()));
	//test02.log(LogStatus.INFO,test02.addScreenCapture(des.getAbsolutePath()));
	
}
}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		// String title =driver.getTitle();
		// System.out.println( title);
		// Assert.assertEquals(title,"   ");
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		//
		
		 
	///	
			
			//test =report.startTest("TC04","review") ;
			//Thread.sleep(2000);
			//driver.findElement(By.xpath("//a[contains(text(),'Accounts Overview')]")).click();
			//Thread.sleep(1000);
			
			//driver.findElement(By.xpath("//a[contains(text(),'18783')]")).click();
			//Thread.sleep(2000);
			//driver.findElement(By.xpath("//a[contains(text(),'Bill Payment to sandy')]")).click();
			//Thread.sleep(2000);
			
			


