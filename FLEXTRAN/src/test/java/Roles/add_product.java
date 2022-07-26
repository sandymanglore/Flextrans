package Roles;

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

public class add_product {
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
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\Roles\\Roles report./SanRoles./prd,ae,menu.html");
		test = report.startTest("produtc,Access,menu Roles", "Roles");

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

		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[normalize-space()='Company Head01']")).click();

		Thread.sleep(15000);

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[normalize-space()='Add Product']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"))
				.click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@value='0e509eb0-3d1a-11ea-b181-7948736d054a']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@value='b631c650-3d1e-11ea-b181-7948736d054a']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		// driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
		Thread.sleep(15000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");

		test.log(LogStatus.INFO, " Able to select and add products from select drop down");
		screenshot("Rlpam2");
		Thread.sleep(5000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-1500)");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Add Access']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"))
				.click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@value='48d1cb89-079d-4984-9915-7442a8d821ed']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Select']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@value='596c1a9c-036c-473d-952e-ef0d9ff9c13c']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(15000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,600)");

		test.log(LogStatus.INFO, " Able to select and add Access from select drop down");
		screenshot("Rlpam3");
		Thread.sleep(5000);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,-600)");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Add Menu']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Select']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@value='db17da14-c652-4dd2-a6aa-9f356a34ee3c']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(15000);
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollBy(0,1400)");
		Thread.sleep(2000);
		test.log(LogStatus.INFO, " Able to select and add Menu from select drop down");
		screenshot("Rlpam4");
		Thread.sleep(6000);
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,-1400)");

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
