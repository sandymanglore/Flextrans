package Simple;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class delete_simple {
	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest test;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sandesh k. r\\chromedriver_win32 (12)\\chromedriver.exe");
		driver = new ChromeDriver();

		report = new ExtentReports(
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\Simple\\Simple report./SanSimple./Delete.html");
		test = report.startTest("Delete simple", "simple");

		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://52.66.43.93:3100/admin/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("SYSTEM@tf.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[10]/a")).click();
		driver.findElement(By.xpath("//a[@href='#/simple_transaction_search']")).click();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		Thread.sleep(5000);
		Select sa = new Select(driver.findElement(By.xpath("//select[@aria-label='rows per page']")));
		sa.selectByValue("50");
		Thread.sleep(5000);

		// driver.findElement(By.xpath("//input[@class='form-control']")).click();

		driver.findElement(By.xpath("//div[normalize-space()='Get_id']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[10]/ul/li[2]/a")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("action");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[normalize-space()='action']")).click();
		// script for deactivate

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Deactivate']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Deactivate')]")).click();
		Thread.sleep(6000);
		test.log(LogStatus.ERROR, "User able not able to delete the simple transaction");
		screenshot("smd1");

		// script for delete

		Thread.sleep(25000);
		driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();

		test.log(LogStatus.ERROR, "User able not able to delete the simple transaction");
		screenshot("smd2");

		Thread.sleep(3000);
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
