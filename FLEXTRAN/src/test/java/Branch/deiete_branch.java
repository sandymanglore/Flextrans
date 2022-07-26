package Branch;

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

public class deiete_branch {

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
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\Branch\\branch report./SanBranch./Delete branch.html");
		test = report.startTest("Delete Branch", "Branch");

		test01 = report.startTest("Delete Branch", "Branch");

		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.get("http://52.66.43.93:3100/admin/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("SYSTEM@tf.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[8]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[8]/ul/li[1]/a")).click();

		Thread.sleep(2000);

		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input"))
				.sendKeys("Banglore");

		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/input"))
				.sendKeys("Company8");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(15000);

		driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
		Thread.sleep(5000);
		test.log(LogStatus.INFO, "User able to click on delete and able to cancel delete ");
		screenshot("brd1");

		driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
		test.log(LogStatus.INFO,
				"User able to delete the new use in user maintance page if he crete new user and after click delete ");
		screenshot("brd2");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='rt-tr -even']//div[@role='gridcell'][normalize-space()='Delhi']"))
				.click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();

		test01.log(LogStatus.ERROR, "User select user from search menu then not able to delete it ");
		screenshot1("brd2");

		report.endTest(test);

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
