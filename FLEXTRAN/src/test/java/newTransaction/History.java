package newTransaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class History {

	
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
		 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[11]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[11]/ul/li/a")).click();
Thread.sleep(5000);

Thread.sleep(2000);

driver.findElement(By.xpath("//body/div[@id='root']/div[@class='app']/div[@class='app-body']/main[@class='main']/div[@class='container-fluid']/div/div[@class='card-accent-primary card']/div[@class='card-body']/div[@class='ReactTable -striped -highlight']/div[@role='grid']/div[@class='rt-tbody']/div[1]/div[1]/div[1]")).click();

/*
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("G");

Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("G");
Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("C");
*/

	}

}
