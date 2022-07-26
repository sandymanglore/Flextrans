package Object;

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

public class object_edit {
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
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\Object\\Object report./SanObject./Edit.html");

		test = report.startTest("Edit Object", "edit");
		// test01 =report.startTest("After save edit enter BackButtton","edit") ;

		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://52.66.43.93:3100/admin/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("staff@company.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[3]/a")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='#/object_search']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='Action04 ClickEntity']")).click();

		Thread.sleep(9000);
		driver.findElement(By.xpath("//button[normalize-space()='Edit']")).click();

		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Object Name']")).clear();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Object Name']")).sendKeys("Action05 ClickEntity");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Enter key']")).clear();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Enter key']")).sendKeys("Action");

		// Thread.sleep(3000);
		// driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

		Thread.sleep(12000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();
		Thread.sleep(3000);
		test.log(LogStatus.INFO, "User able to click on edit and able to save the edited ");
		screenshot("oe1");

		Thread.sleep(3000);

		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[normalize-space()='Action05 ClickEntity']")).click();

		Thread.sleep(10000);
		driver.findElement(By.xpath("//i[@class='fa fa-user-secret fa-2x']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Previous']//i[@class='fa fa-arrow-left']")).click();
		test.log(LogStatus.INFO, "User able to click audit and viwe the updated status ");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Next']")).click();
		screenshot("oe2");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@aria-hidden='true']")).click();

		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();
		Thread.sleep(5000);

		test.log(LogStatus.INFO,
				"User click on edit save then click on Back button Navigate to Object maintanance page ");

		screenshot("oe3");

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
