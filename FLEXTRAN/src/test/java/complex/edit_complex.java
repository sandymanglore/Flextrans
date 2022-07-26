package complex;

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

public class edit_complex {
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
				"C:\\\\Users\\\\Sandesh k. r\\\\eclipse-workspace\\\\FLEXTRAN\\\\src\\\\test\\\\java\\\\complex\\\\Complex report./SanComplex./Edit.html");
		test = report.startTest("Edit Complex", "Complex");

		// test01 =report.startTest("Search Menu","Complex") ;

		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.get("http://52.66.43.93:3100/admin/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("SYSTEM@tf.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[9]/a")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[9]/ul/li[2]/a")).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Get_Customer");

		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"))
				.click();

		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[normalize-space()='Edit']")).click();

		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[@type='reset']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();

		test.log(LogStatus.INFO, "User able to reset edit and not able to save with blank data  ");
		screenshot("cpe1");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();

		// script for reset edit and save

		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[normalize-space()='Edit']")).click();

		Thread.sleep(16000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Name...']")).clear();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Name...']")).sendKeys("Get_Customer04");

		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/form/div[2]/div[2]/div/button"))
				.click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='CLOSE']")).click();

		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Type...']")).clear();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Type...']")).sendKeys("Get_Customer04");

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

		Thread.sleep(6000);
		test.log(LogStatus.INFO, "User click edit and  select status close then its not saving ");
		screenshot("cpe2");

		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();

		// script for edit change and make status close

		Thread.sleep(16000);
		driver.findElement(By.xpath("//button[normalize-space()='Edit']")).click();

		Thread.sleep(16000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Name...']")).clear();

		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Name...']")).sendKeys("Get_Customer1");

		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/form/div[2]/div[2]/div/button"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='dropdown-item'][normalize-space()='OPEN']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Type...']")).clear();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Type...']")).sendKeys("Get_Customer1");

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		test.log(LogStatus.INFO, "User able to click edit and save the edited one ");
		screenshot("cpe3");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();

		// script for edit change and make status open

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();

		Thread.sleep(15000);
		driver.findElement(By.xpath("//i[@class='fa fa-user-secret fa-2x']")).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[normalize-space()='Previous']//i[@class='fa fa-arrow-left']")).click();
		test.log(LogStatus.INFO, "User able to click audit and viw the updated status ");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Next']")).click();
		screenshot("cpe4");
		test.log(LogStatus.INFO, "User able to click on  on audit and view the updated status ");
		// script for edit audit

		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@aria-hidden='true']")).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();
		test.log(LogStatus.INFO, "User able to click on  on audit and view the updated status ");
		screenshot("cpe5");
		// script for back button

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
