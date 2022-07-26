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

public class edit_simple {

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
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\Simple\\Simple report./SanSimple./Edit.html");
		test = report.startTest("Edit simple", "simple");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://52.66.43.93:3100/admin/#/login");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

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

		driver.findElement(By.xpath("//div[normalize-space()='Get_id']")).click();

		// script for edit

		Thread.sleep(9000);
		driver.findElement(By.xpath("//button[normalize-space()='Edit']")).click();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='reset']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		test.log(LogStatus.INFO, "User click edit and  select status close then its  saving ");
		screenshot("Sme1");

		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();

		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[normalize-space()='Edit']")).click();

		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Name...']")).clear();

		Thread.sleep(9000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Name...']")).sendKeys("Get_id01");

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@class='dropdown-toggle btn btn-secondary']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='dropdown-item'][normalize-space()='CLOSE']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		test.log(LogStatus.INFO, "User click edit and  select status close then its  saving ");
		screenshot("Sme2");

		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();

		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[normalize-space()='Edit']")).click();

		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Name...']")).clear();

		Thread.sleep(9000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Name...']")).sendKeys("Get_id");

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@class='dropdown-toggle btn btn-secondary']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='dropdown-item'][normalize-space()='OPEN']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		test.log(LogStatus.INFO, "User click edit and  select status open then its  saving ");
		screenshot("Sme3");

		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();

		// script for audit

		Thread.sleep(15000);
		driver.findElement(By.xpath("//i[@class='fa fa-user-secret fa-2x']")).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[normalize-space()='Previous']//i[@class='fa fa-arrow-left']")).click();
		test.log(LogStatus.INFO, "User able to click audit and viw the updated status ");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();

		test.log(LogStatus.INFO, "User able to click on  on audit and view the updated status ");
		screenshot("Sme4");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@aria-hidden='true']")).click();

		// script for back button

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();
		test.log(LogStatus.INFO, "User able to click on back button and navigate to Simple maintanace page ");
		screenshot("sme5");

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
