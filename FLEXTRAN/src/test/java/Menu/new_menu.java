package Menu;

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

public class new_menu {
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
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\Menu\\Menu report./SanMenu./New.html");

		test = report.startTest("New Menu", "Menu");

		test01 = report.startTest("New Menu with blank", "Menu");

		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://52.66.43.93:3100/admin/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("SYSTEM@tf.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[5]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[5]/ul/li[1]/a")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Seq No']")).sendKeys("1");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[2]/div/input"))
				.sendKeys("/Inprogress_transaction01");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[3]/div/input"))
				.sendKeys("AB");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[4]/div/input"))
				.sendKeys("Transactions");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[5]/div/input"))
				.sendKeys("Inprogress");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[6]/div/input"))
				.sendKeys("Transactions report");
		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,550)");
		driver.findElement(By.xpath("//button[@type='reset']")).click();

		screenshot("Mnn5");
		test.log(LogStatus.INFO, "User able to reset  value enterd in new  Menu");

		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Seq No']")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Seq No']")).sendKeys("1");

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[2]/div/input"))
				.sendKeys("/Inprogress_transaction01");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[3]/div/input"))
				.sendKeys("AB");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[4]/div/input"))
				.sendKeys("Transactions");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[5]/div/input"))
				.sendKeys("Inprogress");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[6]/div/input"))
				.sendKeys("Transactions report");
		Thread.sleep(2000);

		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,550)");

		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(12000);
		screenshot("Mnn1");
		test.log(LogStatus.INFO, "User able to creat New Menu");
		Thread.sleep(3000);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Seq No']")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Seq No']")).sendKeys("1%^^$&jjjjd)w@#$");
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("window.scrollBy(0,550)");

		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(12000);

		screenshot("Mnn6");
		test.log(LogStatus.INFO, "User can able to enter only Numbers in Sequence Text Box");
		report.endTest(test);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();

		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Seq No']")).clear();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Seq No']")).sendKeys("1");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[2]/div/input"))
				.sendKeys("/Inprogress_transaction01kdjj54747e8747383e88euie8ei2%%%$$#^&^&");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[3]/div/input"))
				.sendKeys("Inprogress_transaction01kdjj54747e8747383e88euie8ei2%%%$$#^&^&\"");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[4]/div/input"))
				.sendKeys("Inprogress_transaction01kdjj54747e8747383e88euie8ei2%%%$$#^&^&\"");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[5]/div/input"))
				.sendKeys("Inprogress_transaction01kdjj54747e8747383e88euie8ei2%%%$$#^&^&\"4477477");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[6]/div/input"))
				.sendKeys("^^%^*GHHJNNNNNNNNNNNNNNNNNNNNNNN%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%&*(00000");
		Thread.sleep(2000);

		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("window.scrollBy(0,550)");

		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(12000);
		screenshot1("Mnn2");
		test01.log(LogStatus.ERROR, "User able to creat New Menu with different charecters ");
		Thread.sleep(3000);
		report.endTest(test01);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[5]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[5]/ul/li[1]/a")).click();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(12000);
		screenshot1("Mnn3");
		test01.log(LogStatus.FAIL, "User able to creat New Menu with no data inserted");
		Thread.sleep(3000);

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
