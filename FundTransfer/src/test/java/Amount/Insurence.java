package Amount;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Insurence {
static WebDriver driver;
static ExtentReports report;
static ExtentTest test;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandesh k. r\\Downloads\\chromedriver_win32 (13)\\chromedriver.exe");
		driver = new ChromeDriver();
		  
		 
		// report = new ExtentReports("./San./happy.html") ;
		 
		// test =report.startTest("TC01","register") ;
		 driver.get("https://demo.guru99.com/insurance/v1/register.php");
		 Thread.sleep(3000);
		driver.manage().window().maximize();
		//Select dd=new Select( driver.findElement(By.xpath("//*[@id=\"user_title\"]")));
		//dd.selectByValue("Mrs");
		//driver.findElement(By.xpath("//input[@id='user_firstname']")).sendKeys("abc");
		//driver.findElement(By.xpath("//input[@id='user_surname']")).sendKeys("bd");
		//driver.findElement(By.xpath("//input[@id='user_phone']")).sendKeys("1234567");
		// Thread.sleep(3000);
		// WebElement dateBox1 = driver.findElement(By.xpath("//input[@id='ToDate']"));
	      //  dateBox1.sendKeys("15012022");
		// Select dd1=new Select( driver.findElement(By.xpath("//select[@id='user_dateofbirth_1i']")));
		//	dd1.selectByValue("1995");
		//	Thread.sleep(3000);
		//	Select dd2=new Select( driver.findElement(By.xpath("//select[@id='user_dateofbirth_2i']")));
		//	dd2.selectByVisibleText("March");
		////	Thread.sleep(3000);
		//	Select dd3=new Select( driver.findElement(By.xpath("//select[@id='user_dateofbirth_3i']")));
			//dd3.selectByValue("24");
			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id=\"licencetype_t\"]")).click();
	//	Select dd4=new Select(driver.findElement(By.xpath("//*[@id=\"user_licenceperiod\"]")));
	//	dd4.selectByVisibleText("4");
		//Thread.sleep(2000);
		//Select dd6=new Select( driver.findElement(By.xpath("//select[@id='user_occupation_id']")));
		//dd6.selectByVisibleText("Engineer");
		//driver.findElement(By.xpath("//input[@id='user_address_attributes_street']")).sendKeys("abc");
		//driver.findElement(By.xpath("//input[@id='user_address_attributes_city']")).sendKeys("abc");
		//driver.findElement(By.xpath("//input[@id='user_address_attributes_county']")).sendKeys("abc");
		//driver.findElement(By.xpath("//input[@id='user_address_attributes_postcode']")).sendKeys("abc113");
		//driver.findElement(By.xpath("//input[@id='user_user_detail_attributes_email']")).sendKeys("abc@gmail.com");
		//driver.findElement(By.xpath("//input[@id='user_user_detail_attributes_password']")).sendKeys("abc@12");
		//driver.findElement(By.xpath("//input[@id='user_user_detail_attributes_password_confirmation']")).sendKeys("abc@12");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[5]/input[2]")).click();
		
		
		
		// driver.get("https://demo.guru99.com/insurance/v1/register.php");
		 Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/a")).click();
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc@12");
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]")).click();
		
		//*[@id="quotation_breakdowncover"]
		Thread.sleep(2000);

		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,200)");
		 Thread.sleep(2000);
		Select sa=new Select( driver.findElement(By.xpath("//select[@id='quotation_breakdowncover']")));
		sa.selectByVisibleText("Roadside");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='quotation_windscreenrepair_t']")).click();
		driver.findElement(By.xpath("//input[@id='quotation_incidents']")).sendKeys("accident");
		driver.findElement(By.xpath("//input[@id='quotation_vehicle_attributes_registration']")).sendKeys("MTR1235");
		driver.findElement(By.xpath("//input[@id='quotation_vehicle_attributes_mileage']")).sendKeys("23");
		driver.findElement(By.xpath("//input[@id='quotation_vehicle_attributes_value']")).sendKeys("5000000");
		Thread.sleep(2000);
		Select sa1=new Select( driver.findElement(By.xpath("//select[@id='quotation_vehicle_attributes_parkinglocation']")));
		sa1.selectByVisibleText("Private Property");
		
		Thread.sleep(2000);
		Select sa3=new Select( driver.findElement(By.xpath("//select[@id='quotation_vehicle_attributes_policystart_1i']")));
		sa3.selectByValue("2022");
		Thread.sleep(2000);
		Select dc=new Select( driver.findElement(By.xpath("//select[@id='quotation_vehicle_attributes_policystart_2i']")));
		dc.selectByVisibleText("March");
		Thread.sleep(2000);
		Select sa4=new Select( driver.findElement(By.xpath("//select[@id='quotation_vehicle_attributes_policystart_3i']")));
		sa4.selectByValue("24");
		
		driver.findElement(By.xpath("	//*[@id=\"new_quotation\"]/div[8]/input[1]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"new_quotation\"]/div[8]/input[3]")).click();
		Thread.sleep(3000);
		driver.navigate().to("https://demo.guru99.com/insurance/v1/header.php");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]")).click();
		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"tabs-3\"]/form/input[1]")).sendKeys("12421");
		
		driver.findElement(By.xpath("//input[@id='getquote']")).click();
		
		Thread.sleep(3000);
		driver.navigate().to("https://demo.guru99.com/insurance/v1/header.php");
		
		driver.findElement(By.xpath("//a[@id='ui-id-4']")).click();
		
		driver.findElement(By.xpath("//a[@id='ui-id-5']")).click();
		
	}

}
