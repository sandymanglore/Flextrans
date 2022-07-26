package User;

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

public class search_user {
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
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\User\\user report./SanUser./search.html");
		test = report.startTest("Search User", "User");
		test01 = report.startTest("Search User", "User");

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

		// script for search

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='#/user_search']")).click();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");

		Thread.sleep(5000);
		Select sa = new Select(driver.findElement(By.xpath("//select[@aria-label='rows per page']")));
		sa.selectByValue("100");

		// test.log(LogStatus.INFO,"User able to search data by select drop down
		// method");
		// screenshot("sms1");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-800)");

		test.log(LogStatus.INFO, "user able search data by selecton drop down method ");
		screenshot("Uss5");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("a");

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/input[1]"))
				.sendKeys("a");

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/input[1]"))
				.sendKeys("e");

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/input[1]"))
				.sendKeys("7");

		test.log(LogStatus.INFO, "user able search data by typing in search box");
		screenshot("Uss4");

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
