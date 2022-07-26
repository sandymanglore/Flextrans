package Application;

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

public class application_search {

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
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\Application\\Application report./SanApplication./search.html");

		test = report.startTest("Search  Application", "edit");

		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://52.66.43.93:3100/admin/#/login");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("staff@company.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//a[@href='#/application_search']")).click();

		Thread.sleep(2000);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,650)");

		Thread.sleep(5000);
		Select sa1 = new Select(driver.findElement(By.xpath("//select[@aria-label='rows per page']")));
		sa1.selectByValue("25");

		Thread.sleep(2000);
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollBy(0,200)");

		test.log(LogStatus.INFO, "User able to select value from  select drop down ");
		screenshot("aps1");
		Thread.sleep(3000);

		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,-650)");

		Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("F");

		Thread.sleep(4000);

		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/input[1]"))
				.sendKeys("15");

		Thread.sleep(4000);

		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/input[1]"))
				.sendKeys("15");

		Thread.sleep(3000);

		test.log(LogStatus.INFO, "User able to Search Data By Search by method");
		screenshot("aps2");
		Thread.sleep(2000);

		Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@class='form-control']")).clear();

		Thread.sleep(4000);

		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/input[1]"))
				.clear();

		Thread.sleep(4000);

		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/input[1]"))
				.clear();

		Thread.sleep(3000);

		test.log(LogStatus.INFO, "User able to clear search value they have enterd in search box");
		screenshot("aps3");

		report.endTest(test);

		report.flush();

		Thread.sleep(3000);
		driver.get("http://52.66.43.93:3100/admin/#/application_new");
		driver.navigate().refresh();

	}

	public static void screenshot(String fieldName) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File des = new File("./ScreenShot/" + fieldName + ".png");
		FileUtils.copyFile(src, des);
		test.log(LogStatus.INFO, test.addScreenCapture(des.getAbsolutePath()));
	}

}
