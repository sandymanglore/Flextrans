package Branch;

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

public class edit_branch {

	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest test, test01;;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sandesh k. r\\chromedriver_win32 (12)\\chromedriver.exe");
		driver = new ChromeDriver();

		report = new ExtentReports(
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\Branch\\branch report./SanBranch./Edit branch.html");
		test = report.startTest("Edit Branch", "Branch");
		test01 = report.startTest("Edit branch", "Branch");

		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.get("http://52.66.43.93:3100/admin/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("SYSTEM@tf.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[8]/a")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='#/branch_search']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='Banglore']")).click();

		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[normalize-space()='Edit']")).click();

		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).clear();

		Thread.sleep(9000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("Banglore1");

		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Company']")).clear();

		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Company']")).sendKeys("rto");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		test.log(LogStatus.INFO, "user able to edit branch and save ");
		screenshot("bre2");

		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();
		test01.log(LogStatus.ERROR, "User able to click on back button and not navigate to Branch maintanace page ");
		screenshot1("bre3");

		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();

		Thread.sleep(15000);
		driver.findElement(By.xpath("//i[@class='fa fa-user-secret fa-2x']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Previous']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Previous']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Next']")).click();

		test.log(LogStatus.INFO, "User able to click audit and viw the updated status ");
		screenshot("brse5");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@aria-hidden='true']")).click();

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
