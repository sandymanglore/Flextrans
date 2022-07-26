package Simple;

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

public class new_simple {

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
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\Simple\\Simple report./SanSimple./New.html");
		test = report.startTest("New simple", "Simple");

		test01 = report.startTest("New Simple", "Simple");

		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://52.66.43.93:3100/admin/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("SYSTEM@tf.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[10]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[10]/ul/li[1]/a")).click();
		// script for reset

		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input"))
				.sendKeys("Get_id");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='reset']")).click();
		Thread.sleep(2000);

		test.log(LogStatus.INFO, "User able to reset the value ");
		screenshot("smn1 ");

		// script for emty data
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		test01.log(LogStatus.ERROR, "User creating new  blank simple transaction with no data   ");
		screenshot1("smn2 ");

		Thread.sleep(12000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// script for create new
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input"))
				.sendKeys("Get_id");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		test.log(LogStatus.INFO, "User able to create new simple transaction ");
		screenshot("smn3 ");

		Thread.sleep(12000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// script for random number characters
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input"))
				.sendKeys("Gedhdjsyydhsgjsahhhzvfs#$$%^%$@Fgshsh00nNJKK*&&*");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		test01.log(LogStatus.ERROR, "User able to create new simple transaction with random charecters");
		screenshot1("smn4 ");

		Thread.sleep(12000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// script for duplicate

		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input"))
				.sendKeys("Get_id");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		test01.log(LogStatus.ERROR, "User creating new data  but data name already there ");
		screenshot1("smn5 ");

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
