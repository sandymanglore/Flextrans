package Action;

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

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class action_new {
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
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\Action\\Action report./SanAction./New.html");

		test = report.startTest("New Action with no Data", "New");
		test01 = report.startTest("New Action", "New");
		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.get("http://52.66.43.93:3100/admin/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("SYSTEM@tf.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/ul/li[1]/a")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(" //button[@type='submit']")).click();

		Thread.sleep(12000);
		test.log(LogStatus.ERROR, "User can able to create blank new Action");
		screenshot("acn1");

		/* script for creating blank action */

		Thread.sleep(6000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/ul/li[1]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[1]/div/input"))
				.sendKeys("ACTION-10");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[2]/div/input"))
				.sendKeys("Add");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[3]/div[2]/fieldset/div/label/input"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter UI URL']")).sendKeys("WWW.action.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='confirm']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Confirmation Message']")).sendKeys("Adding");
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //button[@class='d-flex pull-right mr-2 btn btn-danger btn-sm']")).click();

		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[3]/div[2]/fieldset/div/label/input"))
				.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='confirm']")).click();
		// Thread.sleep(12000);
		test.log(LogStatus.ERROR,
				"User not  able to reset entire data Ui,product,service  and confirm remains same after click reset new Action ");
		screenshot("anc2");

		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[1]/div/input"))
				.sendKeys("hdhhjdjsssj%%$$$##@*&^9973738383");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[2]/div/input"))
				.sendKeys("hdhhjdjsssj%%$$$##@*&^9973738383");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='productCall']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[4]/div/button"))
				.click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@value='12236510-f067-11ec-94b5-2398d5746b40']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='confirm']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='confirm']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Confirmation Message']")).sendKeys("Test");

		Thread.sleep(3000);
		driver.findElement(By.xpath(" //button[@type='submit']")).click();
		Thread.sleep(15000);

		test.log(LogStatus.ERROR, "User can able to create new Action with multiple charecter");
		screenshot("acn3");

		report.endTest(test);

		Thread.sleep(8000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/a")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/a")).click();

		Thread.sleep(6000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/ul/li[1]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[1]/div/input"))
				.sendKeys("ACTION-10");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[2]/div/input"))
				.sendKeys("Add");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[3]/div[2]/fieldset/div/label/input"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter UI URL']")).sendKeys("WWW.action.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='confirm']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Confirmation Message']")).sendKeys("Adding");
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //button[@type='submit']")).click();

		Thread.sleep(15000);
		test01.log(LogStatus.INFO, "User can able to create new Action by Clicking UI radio button");
		screenshot1("anc4");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[1]/div/input"))
				.sendKeys("Condition_02");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[2]/div/input"))
				.sendKeys("Add");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='productCall']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[4]/div/button"))
				.click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@value='12236510-f067-11ec-94b5-2398d5746b40']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='confirm']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Confirmation Message']")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //button[@class='d-flex pull-right mr-2 btn btn-danger btn-sm']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(" //button[@type='submit']")).click();

		test01.log(LogStatus.INFO, "User can able to create new Action by Clicking Product radio button");

		screenshot1("anc5");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/ul/li[1]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[1]/div/input"))
				.sendKeys("Get_02");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[2]/div/input"))
				.sendKeys("Add");
		Thread.sleep(2000);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='serviceCall']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Service URL']")).sendKeys("WWW.action.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[normalize-space()='SELECT']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@value='GET']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='confirm']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Confirmation Message']")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //button[@class='d-flex pull-right mr-2 btn btn-danger btn-sm']")).click();

		test01.log(LogStatus.INFO, "User can able to create new Action by Clicking service  radio button");

		screenshot1("anc6");

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

/*
 * 
 * Thread.sleep(2000); driver.findElement(By.xpath(
 * "//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/ul/li[2]/a")).click();
 * Thread.sleep(2000); JavascriptExecutor jsa=(JavascriptExecutor)driver;
 * jsa.executeScript("window.scrollBy(0,500)");
 */

/* product */
/*
 * Thread.sleep(2000); driver.findElement(By.xpath(
 * "//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/ul/li[1]/a")).click();
 * Thread.sleep(2000);
 * 
 * driver.findElement(By.xpath(
 * "//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[1]/div/input"
 * )).sendKeys("Condition_02"); driver.findElement(By.xpath(
 * "//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[2]/div/input"
 * )).sendKeys("Add"); Thread.sleep(2000);
 * driver.findElement(By.xpath("//input[@name='productCall']")).click();
 * 
 * Thread.sleep(5000); driver.findElement(By.xpath(
 * "//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[4]/div/button"
 * )).click();
 * 
 * Thread.sleep(5000);
 * 
 * driver.findElement(By.xpath(
 * "//button[@value='12236510-f067-11ec-94b5-2398d5746b40']")).click();
 * 
 * Thread.sleep(5000);
 * driver.findElement(By.xpath("//input[@name='confirm']")).click();
 * Thread.sleep(2000); driver.findElement(By.
 * xpath("//input[@placeholder='Enter Confirmation Message']")).sendKeys("Test")
 * ;
 * 
 * Thread.sleep(3000);
 * driver.findElement(By.xpath(" //button[@type='submit']")).click();
 * Thread.sleep(8000);
 * 
 */

/* service */
/*
 * Thread.sleep(2000); driver.findElement(By.xpath(
 * "//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/ul/li[1]/a")).click();
 * 
 * driver.findElement(By.xpath(
 * "//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[1]/div/input"
 * )).sendKeys("Get_02"); driver.findElement(By.xpath(
 * "//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[2]/div/input"
 * )).sendKeys("Add"); Thread.sleep(2000);
 * 
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("//input[@name='serviceCall']")).click();
 * 
 * Thread.sleep(3000);
 * driver.findElement(By.xpath("//input[@placeholder='Enter Service URL']")).
 * sendKeys("WWW.action.com"); Thread.sleep(4000);
 * driver.findElement(By.xpath("//button[normalize-space()='SELECT']")).click();
 * Thread.sleep(2000);
 * 
 * driver.findElement(By.xpath("//button[@value='GET']")).click();
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("//input[@name='confirm']")).click();
 * Thread.sleep(2000); driver.findElement(By.
 * xpath("//input[@placeholder='Enter Confirmation Message']")).sendKeys("Test")
 * ; Thread.sleep(2000);
 * driver.findElement(By.xpath(" //button[@type='submit']")).click();
 * Thread.sleep(4000); /* driver.findElement(By.xpath(
 * "//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/ul/li[2]/a")).click();
 * Thread.sleep(2000); JavascriptExecutor jsb=(JavascriptExecutor)driver;
 * jsb.executeScript("window.scrollBy(0,500)");
 * 
 */

// C:\Users\Sandesh k. r\eclipse-workspace\FLEXTRAN\src\test\java\Action\Action
// report
