package customer;

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

public class new_customer {

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
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\customer\\customer report./SanObject./new.html");

		test = report.startTest("New Customer", "Customer");
		test01 = report.startTest("New Customer", "Customer");

		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://52.66.43.93:3100/admin/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("staff@company.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[13]/a")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[13]/ul/li/a")).click();

		Thread.sleep(15000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input"))
				.sendKeys("AQabc@gmail");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/input"))
				.sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[3]/div/input"))
				.sendKeys("ab");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[4]/div/input"))
				.sendKeys("123456");
		Thread.sleep(2000);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='reset']")).click();

		test.log(LogStatus.INFO, "Able to click on reset button ");

		screenshot("Csn1");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='reset']")).click();

		test.log(LogStatus.INFO, "Not able to create new customer with empty data but required valid data");

		screenshot("Csn2");

		Thread.sleep(8000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input"))
				.sendKeys("Hoypgoj9@gmail");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/input"))
				.sendKeys("yesno1");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[3]/div/input"))
				.sendKeys("pl");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[4]/div/input"))
				.sendKeys("1354939");
		Thread.sleep(2000);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		test.log(LogStatus.INFO, "able to create new customer with valid data ");

		screenshot("Cns3");

		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[13]/ul/li/a")).click();

		Thread.sleep(8000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input"))
				.sendKeys("AQhjabc77i@gmail12fddeee");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/input"))
				.sendKeys("abdcjh7yfifg#$c");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[3]/div/input"))
				.sendKeys("abF$jrtt$he%%FR");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[4]/div/input"))
				.sendKeys("12345678667ddgtt5$%$");
		Thread.sleep(2000);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		test01.log(LogStatus.ERROR, "Able to create new customer with differnt values required validation message");

		screenshot1("csn4");

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
