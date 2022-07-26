package Application;

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

public class application_new {
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
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\Application\\Application report./SanApplication./NEW.html");

		test = report.startTest("Creating New blank Application", "New");
		test01 = report.startTest("Creating New Application", "New");

		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://52.66.43.93:3100/admin/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("SYSTEM@tf.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[4]/ul/li[1]/a")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div/div/input"))
				.sendKeys("FLEXTRAN_4");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='reset']")).click();
		test01.log(LogStatus.INFO, "User able to reset the enterd data ");
		screenshot1("apn3");

		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div/div/input"))
				.sendKeys("FLEXTRAN_009");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		test01.log(LogStatus.INFO, "User able to creat new application with valid data ");
		screenshot1("apn4");

		report.endTest(test);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div/div/input"))
				.sendKeys("FLEXTRAN_009");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(10000);
		test.log(LogStatus.ERROR, "User not able to creat new application  by entering data Name which already exist ");
		screenshot("apn6");

		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		test.log(LogStatus.ERROR, "User able to creat new blank application ");
		screenshot("apn1");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[4]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div/div/input"))
				.sendKeys("Teejkk8884****$$#33Teing@12344447tkTestsing@12344447k");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		test.log(LogStatus.ERROR, "User able to creat new application with random number ,charecters and alphabetics ");
		screenshot("apn2");
		report.endTest(test);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div/div/input"))
				.sendKeys("FLEXTRAN_009");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		test.log(LogStatus.ERROR, "User able to creat new application with valid data ");
		screenshot("apn4");

		report.endTest(test01);

		report.flush();

		Thread.sleep(3000);
		driver.get("http://52.66.43.93:3100/admin/#/application_new");
		driver.navigate().refresh();

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
		test01.log(LogStatus.INFO, test01.addScreenCapture(des.getAbsolutePath()));
	}
}
