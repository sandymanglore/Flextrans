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
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class application_edit {

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
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\Application\\Application report./SanApplication./EDIT.html");

		test = report.startTest("Edit Application", "edit");
		test01 = report.startTest("After save edit enter Back Buttton", "edit");

		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://52.66.43.93:3100/admin/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("staff@company.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//a[@href='#/application_search']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='TF Demo']")).click();

		Thread.sleep(8000);

		driver.findElement(By.xpath("//button[normalize-space()='Edit']")).click();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//input[@placeholder='Enter Application Name']")).clear();
		Thread.sleep(8000);

		driver.findElement(By.xpath("//input[@placeholder='Enter Application Name']")).sendKeys("TF Demo123");

		Thread.sleep(4000);

		// driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();

		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

		Thread.sleep(12000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[4]/ul/li[1]/a")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[4]/ul/li[2]/a")).click();

		Thread.sleep(3000);

		test.log(LogStatus.INFO, "User able to click on edit and able to save the edited ");
		screenshot("ape1");

		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[normalize-space()='TF Demo123']")).click();

		Thread.sleep(10000);
		driver.findElement(By.xpath("//i[@class='fa fa-user-secret fa-2x']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Previous']//i[@class='fa fa-arrow-left']")).click();
		test.log(LogStatus.INFO, "User able to click audit and viw the updated status ");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
		screenshot("ape2");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@aria-hidden='true']")).click();

		report.endTest(test);

		Thread.sleep(12000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[4]/ul/li[2]/a")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='BANK DEMO']")).click();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[normalize-space()='Edit']")).click();
		Thread.sleep(8000);

		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(13000);
		screenshot1("ape3");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();
		Thread.sleep(3000);
		screenshot1("ape4");

		test01.log(LogStatus.ERROR,
				"User click on edit save then click on Back button  not navigate to Application Maintance page insted that revert back to edit page "
						+ report.getReportId());

		Thread.sleep(3000);

		report.endTest(test01);
		report.flush();

		driver.get("http://52.66.43.93:3100/admin/#/application_new");
		driver.navigate().refresh();

		/*
		 * Thread.sleep(3000);
		 * 
		 * driver.findElement(By.xpath("//a[@href='#/application_search']")).click();
		 * 
		 * Thread.sleep(2000); driver.findElement(By.xpath(
		 * "//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[18]/div/div[2]"
		 * )).click();
		 * 
		 * 
		 * Thread.sleep(8000);
		 * 
		 * driver.findElement(By.xpath("//button[normalize-space()='Edit']")).click();
		 * Thread.sleep(10000);
		 * 
		 * 
		 * Thread.sleep(10000);
		 * 
		 * driver.findElement(By.xpath("//input[@placeholder='Enter Application Name']")
		 * ).clear();
		 * 
		 * 
		 * Thread.sleep(8000);
		 * 
		 * driver.findElement(By.xpath("//input[@placeholder='Enter Application Name']")
		 * ).
		 * sendKeys("Teejkk8884****$$#33Teing    @12344447         tkTestsing@12344447t8                      588jshdhhdhjdyeejjdjdjj                   duejkkTestsing@12344447t8588jshdh               hdhjdyeejjdjdjjduejkkTestsing@12344447t8588jshdhhdhjdyeejjdjdjjduejkkTestsing@12344447t8588jshdhhdhjdyeejjdjdjjduejkkFLEXTRAN_009"
		 * );
		 * 
		 * screenshot("ape5"); Thread.sleep(8000);
		 * 
		 * 
		 * 
		 * 
		 * screenshot("ape5");
		 * 
		 * test01.log(LogStatus.ERROR,"User edited the value by entering length value "
		 * +report.getReportId());
		 */

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
