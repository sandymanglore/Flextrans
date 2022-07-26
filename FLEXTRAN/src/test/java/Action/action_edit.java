package Action;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class action_edit {
	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest test, test01;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sandesh k. r\\chromedriver_win32 (12)\\chromedriver.exe");
		driver = new ChromeDriver();
		report = new ExtentReports(
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\Action\\Action report./SanAction./Edit.html");

		test = report.startTest("Edit Action", "edit");
		// test01 =report.startTest("After save edit enter BackButtton","edit") ;

		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://52.66.43.93:3100/admin/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("staff@company.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/a")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/ul/li[2]/a")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//div[normalize-space()='ACTION-06']")).click();

		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[normalize-space()='Edit']//i[@class='fa fa-dot-circle-o']")).click();

		Thread.sleep(12000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Code']")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Code']")).sendKeys("Get2");

		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Action Name']")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Action Name']")).sendKeys("Add");

		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='serviceCall']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Service URL']")).clear();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Service URL']")).sendKeys("WWW.action.com");

		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Confirmation Message']")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Confirmation Message']")).sendKeys("Adding");

		Thread.sleep(2000);
		// driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

		Thread.sleep(12000);

		test.log(LogStatus.INFO, "User able to click on edit and able to save the edited ");
		screenshot("ane1");

		Thread.sleep(3000);

		report.endTest(test);

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/ul/li[2]/a")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[normalize-space()='Get']")).click();

		Thread.sleep(10000);
		driver.findElement(By.xpath("//i[@class='fa fa-user-secret fa-2x']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Previous']//i[@class='fa fa-arrow-left']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Next']")).click();

		test.log(LogStatus.INFO, "User able to click on audit and view the update  ");
		screenshot("ane2");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@aria-hidden='true']")).click();

		Thread.sleep(3000);

		// report.endTest(test);

		/*
		 * 
		 * driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();
		 * Thread.sleep(5000);
		 * 
		 * 
		 * test.log(LogStatus.
		 * INFO,"User click on edit save then click on Back button Navigate to Object maintanance page "
		 * );
		 * 
		 * screenshot("oe3");
		 * 
		 * 
		 * 
		 */

		Thread.sleep(12000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();

		screenshot("ane3");

		test.log(LogStatus.INFO,
				"User click on edit save then click on Back button and it will navigating to Action maintanace page ");

		report.endTest(test);
		report.flush();

	}

	public static void screenshot(String fieldName) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File des = new File("./ScreenShot/" + fieldName + ".png");
		FileUtils.copyFile(src, des);
		test.log(LogStatus.INFO, test.addScreenCapture(des.getAbsolutePath()));
	}
	/*
	 * public static void screenshot1(String fieldName) throws IOException { File
	 * src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); File des =
	 * new File("./ScreenShot/"+fieldName+".png"); FileUtils.copyFile(src, des);
	 * test01.log(LogStatus.INFO,test01.addScreenCapture(des.getAbsolutePath()));
	 */

}
