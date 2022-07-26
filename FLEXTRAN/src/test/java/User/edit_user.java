package User;

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

public class edit_user {
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
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\User\\user report./SanUser./Edit.html");
		test = report.startTest("Edit User", "User");
		test01 = report.startTest("Edit User", "User");

		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://52.66.43.93:3100/admin/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("SYSTEM@tf.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[6]/a")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='#/user_search']")).click();

		Thread.sleep(7000);

		driver.findElement(By.xpath("//div[normalize-space()='hhh']")).click();

		Thread.sleep(9000);

		// script for edit

		Thread.sleep(13000);
		driver.findElement(By.xpath("//button[normalize-space()='Edit']")).click();

		Thread.sleep(16000);

		driver.findElement(By.xpath("//input[@placeholder='Enter First Name...']")).clear();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@placeholder='Enter First Name...']")).sendKeys("Yes");

		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Last Name...']")).clear();

		Thread.sleep(6000);

		driver.findElement(By.xpath("//input[@placeholder='Enter Last Name...']")).sendKeys("ghjk");

		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile No...']")).clear();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile No...']")).sendKeys("758797889");

		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Account No...']")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Account No...']")).sendKeys("abcd@gmail.com");

		// driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(8000);
		test.log(LogStatus.INFO, "User able to click on edit able to save the data");
		screenshot("use4");

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();
		test01.log(LogStatus.ERROR, "User able to click on back button and not navigate to user maintanace page ");
		screenshot1("sme6");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='#/user_search']")).click();

		Thread.sleep(7000);

		driver.findElement(By.xpath("//div[normalize-space()='Yes']")).click();

		Thread.sleep(15000);
		driver.findElement(By.xpath("//i[@class='fa fa-user-secret fa-2x']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Previous']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Previous']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Next']")).click();
		test.log(LogStatus.INFO, "User able to click audit and viw the updated status ");
		screenshot("Use5");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@aria-hidden='true']")).click();

		// script for back button

		report.endTest(test);
		report.endTest(test01);
		report.flush();

	}

	public static void screenshot(String fieldName) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File des = new File("./ScreenShot/" + fieldName + ".png");
		FileUtils.copyFile(src, des);
		test.log(LogStatus.INFO, test.addScreenCapture(des.getAbsolutePath()));
	}

	public static void screenshot1(String fieldName) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File des = new File("./ScreenShot/" + fieldName + ".png");
		FileUtils.copyFile(src, des);
		test01.log(LogStatus.INFO, test.addScreenCapture(des.getAbsolutePath()));
	}

}
