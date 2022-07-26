package complex;

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

public class addstep_complex {
	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest test, test01, test02, test03, test04, test05, test06, test07, test08, test09, test11, test10,
			test12;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sandesh k. r\\chromedriver_win32 (12)\\chromedriver.exe");
		driver = new ChromeDriver();

		report = new ExtentReports(
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\complex\\Complex report./SanComplex./Add.html");
		test = report.startTest("Add Complex", "Complex");

		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.get("http://52.66.43.93:3100/admin/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("SYSTEM@tf.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[9]/a")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[9]/ul/li[2]/a")).click();

		// script for add step
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("G");

		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[8]/div/div[1]/div"))
				.click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[normalize-space()='Add Step']")).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/button[1]"))
				.click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[normalize-space()='SUCCESS']")).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Delay...']")).sendKeys("1");

		Thread.sleep(8000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[2]/div[1]/button[1]"))
				.click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@value='14ba7b20-4505-11ea-bbcf-5d4de099df61']")).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
		test.log(LogStatus.INFO, "User  able to add steps to complex transaction ");
		screenshot("cpa1");

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("G");

		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[8]/div/div[1]/div"))
				.click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[normalize-space()='Add Step']")).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@type='reset']")).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
		Thread.sleep(5000);
		test.log(LogStatus.INFO, "User not able to add steps with empty data ");
		screenshot("cpa2");

		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();

		report.endTest(test);

		report.flush();

	}

	public static void screenshot(String fieldName) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File des = new File("./ScreenShot/" + fieldName + ".png");
		FileUtils.copyFile(src, des);
		test.log(LogStatus.INFO, test.addScreenCapture(des.getAbsolutePath()));
	}

}
