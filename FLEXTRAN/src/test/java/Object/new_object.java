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

public class new_object {
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
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\Object\\Object report./SanObject./New.html");

		test = report.startTest("New Object", "New");

		test01 = report.startTest("New Objectwith different Charecter", "New");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://52.66.43.93:3100/admin/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("staff@company.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[3]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[3]/ul/li[1]/a")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(2000);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();

		screenshot("On1");
		test.log(LogStatus.INFO, "User Not able to create empty Object");
		Thread.sleep(3000);

		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[3]/ul/li[1]/a")).click();

		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input"))
				.sendKeys("Actionsa1 ClickEntity");

		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/input"))
				.sendKeys("Actionsa1 ClickEntity");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(10000);

		test.log(LogStatus.INFO, "User can able to create new Object");
		screenshot("0n2");
		Thread.sleep(3000);

		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[3]/ul/li[1]/a")).click();

		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input"))
				.sendKeys("Actions005 ClickEntity");

		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/input"))
				.sendKeys("Actions005 ClickEntity");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@type='reset']")).click();

		screenshot("0n3");

		test.log(LogStatus.INFO, "User can able to reset the object");

		report.endTest(test);

		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[3]/ul/li[1]/a")).click();

		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input"))
				.sendKeys("ajaghdswe43767$#@^&**%@hddnnddi55522ldld");

		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/input"))
				.sendKeys("ajaghdswe43767$#@^&**%@hddnnddi55522ldld");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		screenshot1("0n1");

		test01.log(LogStatus.ERROR, "User can able to create new Object with different charecter");

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
