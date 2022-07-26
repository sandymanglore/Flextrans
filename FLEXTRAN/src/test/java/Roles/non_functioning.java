package Roles;

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

public class non_functioning {
	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest test, test01, test02, test03, test04, test05, test06, test07, test08, test09, test11, test10,
			test12;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sandesh k. r\\chromedriver_win32 (12)\\chromedriver.exe");
		driver = new ChromeDriver();

		report = new ExtentReports(
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\Roles\\Roles report./SanRoles./Non functioning.html");
		test = report.startTest("Non functioning Roles", "Roles");

		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.get("http://52.66.43.93:3100/admin/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("staff@company.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[7]/a")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='#/roles_search']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='CEO']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Enable NetBanking']")).click();
		test.log(LogStatus.ERROR, "Not able to open Enable Netbanking");
		screenshot("rlf1");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Do AML Check']")).click();
		test.log(LogStatus.ERROR, "Not able to open DO AML Check");
		screenshot("rlf2");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Attach Debit Card']")).click();
		test.log(LogStatus.ERROR, "Not able to open  Attach Debit Card ");
		screenshot("rlf3");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Get Menu']")).click();
		test.log(LogStatus.ERROR, "Not able to open Get Menu ");
		screenshot("rlf4");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Customer On-Boarding']")).click();
		test.log(LogStatus.ERROR, "Not able to open Customer On-Boarding");
		screenshot("rlf5");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Search Person']")).click();
		test.log(LogStatus.ERROR, "Not able to open Search Person");
		screenshot("rlf6");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Perform KYC']")).click();
		test.log(LogStatus.ERROR, "Not able to open  Perform KYC");
		screenshot("rlf7");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Photo-Upload']")).click();
		test.log(LogStatus.ERROR, "Not able to open Photo-Upload");
		screenshot("rlf8");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Search Customer']")).click();
		test.log(LogStatus.ERROR, "Not able to open Search Customer");
		screenshot("rlf9");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Customer Get']")).click();
		test.log(LogStatus.ERROR, "Not able to open Customer Get");
		screenshot("rlf10");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Open Account']")).click();
		test.log(LogStatus.ERROR, "Not able to open  Open Account");
		screenshot("rlf11");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Create New Customer']")).click();
		test.log(LogStatus.ERROR, "Not able to open on Create New Customer");
		screenshot("rlf12");

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
