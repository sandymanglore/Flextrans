package Action;

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

public class action_delet {
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
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\Action\\Action report./SanAction./Delete.html");

		test = report.startTest("Delete Application", "Delete");

		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://52.66.43.93:3100/admin/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("staff@company.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/a")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/ul/li[2]/a")).click();

		Thread.sleep(2000);
		JavascriptExecutor jsa = (JavascriptExecutor) driver;
		jsa.executeScript("window.scrollBy(0,500)");
		Thread.sleep(4000);
		Select sa = new Select(driver.findElement(By.xpath("//select[@aria-label='rows per page']")));
		sa.selectByValue("50");

		screenshot("acd1");
		test.log(LogStatus.INFO, "User able to search data by select drop down method");
		Thread.sleep(3000);

		Thread.sleep(4000);

		driver.findElement(By.xpath("//div[normalize-space()='ACTION']']")).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[normalize-space()='Delete']//i[@class='fa fa-dot-circle-o']")).click();
		Thread.sleep(3000);

		// driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();

		screenshot("acd2");
		test.log(LogStatus.INFO, "User able to click on Delete button and able to click cancel  the Actions");
		Thread.sleep(3000);

		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[normalize-space()='Delete']//i[@class='fa fa-dot-circle-o']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
		screenshot("acd3");
		test.log(LogStatus.INFO, "User able to delete data by clicking delete button");
		Thread.sleep(3000);

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
