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

public class new_complex {
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
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\complex\\Complex report./SanComplex./New.html");
		test = report.startTest("Edit user", "user");

		test01 = report.startTest("Edit user", "User");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://52.66.43.93:3100/admin/#/login");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("SYSTEM@tf.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[9]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[9]/ul/li[1]/a")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		test.log(LogStatus.INFO, "User not  able to create new complex transaction with no data entered");
		screenshot("cpn1");
		// Script for creating new complex with no data
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[9]/ul/li[1]/a")).click();

		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input"))
				.sendKeys("Get_Details11");

		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[3]/div/input"))
				.sendKeys("Get_Details11");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(12000);
		test.log(LogStatus.INFO, "User  able to create new complex transaction by entering data");
		screenshot("cpn2");
		// Script for creating new complex with data
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[9]/ul/li[1]/a")).click();

		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input"))
				.sendKeys(
						"Complex1# Trans1actions - Names - DEBITCARD ISSUEDDEBITCARD ISSUEDDEBITCARD ISSUEDDEBITCARD ISSUED");

		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[3]/div/input"))
				.sendKeys(
						"Complex1#Tran1sactions - Names- DEBITCARD#$@%^ ISSUEDDEBITCARD ISSUEDDEBITCARD ISSUEDDEBITCARD ISSUED");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(14000);
		test01.log(LogStatus.ERROR,
				"User  able to create new complex transaction by entering randum number alphabet charecters data");
		screenshot1("cpn3");
		// Script for creating new complex with multiple charecters

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[9]/ul/li[1]/a")).click();

		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[3]/div/input"))
				.sendKeys("Get_Cuostomer026");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		// driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();

		Thread.sleep(15000);
		test01.log(LogStatus.ERROR,
				"User  able to create new complex transaction by entering data in type and make name as empty");
		screenshot1("cpn5");

		// Script for creating new complex by entering type
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[9]/ul/li[1]/a")).click();

		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input"))
				.sendKeys("Get_Customer00216");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		test.log(LogStatus.INFO,
				"User not able to create new complex transaction by entering data in Name and make Type as empty");
		screenshot("cpn6");
		// Script for creating new complex by entering name

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[9]/ul/li[1]/a")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Enter status']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		test.log(LogStatus.INFO, "User  not able to create new complex transaction by removing status ");
		screenshot("cpn4");
		// Script for make status clear and create
		Thread.sleep(8000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[9]/ul/li[1]/a")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Enter status']")).clear();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Enter status']")).sendKeys("Yes");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		test.log(LogStatus.INFO, "User not able to create new complex transaction by entering Invalid status");
		screenshot("cpn7");
		// Script for Invalid status
		Thread.sleep(8000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[9]/ul/li[1]/a")).click();

		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input"))
				.sendKeys("Get_Customer012");

		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[3]/div/input"))
				.sendKeys("Get_Customer012");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='reset']")).click();

		// Script for reset
		test.log(LogStatus.INFO, "User able to click on reset  button and able to reset the value  ");
		screenshot("cpn8");
		Thread.sleep(3000);

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
