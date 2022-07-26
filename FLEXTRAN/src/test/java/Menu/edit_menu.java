package Menu;

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

public class edit_menu {
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
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\Menu\\Menu report./SanMenu./Edit.html");

		test = report.startTest("Edit Menu", "Edit");
		test01 = report.startTest("After Edit Menu enter Back button", "Edit");

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

		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[5]/ul/li[2]/a")).click();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[normalize-space()='Transactions02']")).click();

		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[normalize-space()='Edit']")).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Seq No']")).clear();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//input[@placeholder='Enter Seq
		// No']")).sendKeys("1");

		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[2]/div/input"))
				.clear();

		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[2]/div/input"))
				.sendKeys("/Inprogress_tf");

		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[3]/div/input"))
				.clear();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[3]/div/input"))
				.sendKeys("ABcd");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[4]/div/input"))
				.clear();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[4]/div/input"))
				.sendKeys("Transactions");

		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[5]/div/input"))
				.clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[5]/div/input"))
				.sendKeys("Inprogress tf");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[6]/div/input"))
				.clear();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[6]/div/input"))
				.sendKeys("Transactions report.tf");
		Thread.sleep(2000);

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(10000);
		test.log(LogStatus.INFO, "User able to click on Save button  and able to save the edit  ");
		screenshot("Mne1");

		// driver.findElement(By.xpath("//div[normalize-space()='Get']")).click();

		Thread.sleep(10000);
		driver.findElement(By.xpath("//i[@class='fa fa-user-secret fa-2x']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Previous']//i[@class='fa fa-arrow-left']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Next']")).click();

		test.log(LogStatus.INFO, "User able to click on audit and view the update  ");
		screenshot("Mne2");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@aria-hidden='true']")).click();

		report.endTest(test);

		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();

		test01.log(LogStatus.ERROR,
				"User click on edit save then click on Back button  not navigate to Menu Maintance page insted that revert back to edit page ");
		screenshot1("Mne3");

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
