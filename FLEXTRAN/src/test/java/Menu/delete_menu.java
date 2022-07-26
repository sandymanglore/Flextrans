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

public class delete_menu {
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
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\Menu\\Menu report./SanMenu./Delete.html");

		test = report.startTest("Delete Menu", "Delete");

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
		driver.findElement(By.xpath("//div[normalize-space()='Transaction']")).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();

		test.log(LogStatus.INFO, "User click on delete button and cancel the Menu ");
		screenshot("Mned1");

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();

		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();

		Thread.sleep(3000);
		test.log(LogStatus.INFO, "User click on delete button and delete the Menu ");
		screenshot("Mned2");

		report.endTest(test01);

		report.flush();

	}

	public static void screenshot(String fieldName) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File des = new File("./ScreenShot/" + fieldName + ".png");
		FileUtils.copyFile(src, des);
		test.log(LogStatus.INFO, test.addScreenCapture(des.getAbsolutePath()));
	}
}
