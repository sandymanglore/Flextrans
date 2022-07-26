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

public class delete_user {

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
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\User\\user report./SanUser./Delete &add.html");
		test = report.startTest("Delete User", "User");
		test01 = report.startTest("Delete User", "User");

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

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[6]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		// script for delete
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input"))
				.sendKeys("ab02@gmail.com");
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/input"))
				.sendKeys("abc02");
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[3]/div/input"))
				.sendKeys("efg");
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[4]/div/input"))
				.sendKeys("758797889");
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[5]/div/input"))
				.sendKeys("4r5");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(12000);

		driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();

		Thread.sleep(6000);

		driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();

		test.log(LogStatus.INFO, "User able to delete new user if roles are not added ");
		screenshot("Usd1");

		// script for add roles

		Thread.sleep(7000);

		driver.findElement(By.xpath("//div[normalize-space()='abc1']")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[normalize-space()='Add Role']")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[@value='82fd0e30-ebd0-11ec-b9f7-75f3b330edd0']")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[@value='f7e042f0-196d-11e9-95b2-39097592ab88']")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[@value='e0c0cd90-4727-11ea-a010-07650f535359']")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

		test.log(LogStatus.INFO, "User able to  add new roles to user ");
		screenshot("Usd2");

		Thread.sleep(12000);

		driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();

		Thread.sleep(6000);

		driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();

		test01.log(LogStatus.ERROR, "User not able to delete if he add roles to user ");
		screenshot1("Usd3");

		Thread.sleep(6000);

		driver.findElement(By.xpath("//button[normalize-space()='Disable']")).click();
		Thread.sleep(6000);

		driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();

		test01.log(LogStatus.ERROR, "user not able to disable ");
		screenshot1("Use5");

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
