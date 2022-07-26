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

public class new_user {
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
		// report = new ExtentReports("C:\\Users\\Sandesh k.
		// r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\Simple\\Simple
		// report./SanSimple./Search.html") ;
		report = new ExtentReports(
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\User\\user report./SanUser./New.html");
		test = report.startTest("New User", "User");
		test01 = report.startTest("New User", "User");

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
		// script for reset
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='reset']")).click();

		test.log(LogStatus.INFO, "User able to reset the enterd value");
		screenshot("usn1");

		// script for new blank
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		test01.log(LogStatus.ERROR, "User able to create new user with blank data Required validation message");
		screenshot1("usn2");

		Thread.sleep(9000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();

		// script for new user

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

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(9000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();

		test.log(LogStatus.INFO, "User able to crate new user with valid data");
		screenshot("usn3");

		// script for random characters

		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input"))
				.sendKeys("ab02@gmail.com");
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/input"))
				.sendKeys("abc0222325");
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[3]/div/input"))
				.sendKeys("efg123455");
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[4]/div/input"))
				.sendKeys("zxcvbnhdffss");
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[5]/div/input"))
				.sendKeys("4r5");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(9000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();

		test01.log(LogStatus.ERROR,
				"User  able  to create new user by entering numbers in First name and last name textbox and able to enter Alphbet in Mobile Number Textbox Required validation message");
		screenshot1("usn4");

		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input"))
				.sendKeys("ab02@gmailjffhhjjj%%$#124450");
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/input"))
				.sendKeys("abc0222325^%&&$FFBHJNJJHHY&");
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[3]/div/input"))
				.sendKeys("efg123455$#@12UHJIKIBFg");
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[4]/div/input"))
				.sendKeys("zxcvbnhdffss)(88*&&%sbsnsnnsns");
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[5]/div/input"))
				.sendKeys("4r5%^^%@&&@BSHBHVVv");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();

		test.log(LogStatus.INFO,
				"User not able  to create new user with random charecters required proper validation message");
		screenshot("usn5");

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
