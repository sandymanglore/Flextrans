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

public class delete_roles {

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
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\Roles\\Roles report./SanRoles./ Delete.html");
		test = report.startTest("Delete", "Roles");

		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.get("http://52.66.43.93:3100/admin/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("staff@company.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[7]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[7]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div/div/input"))
				.sendKeys("Company Branch");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(15000);

		driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
		Thread.sleep(3000);
		test.log(LogStatus.INFO, " Able to click on delete button and able to click cancel");
		screenshot("Rld");
		driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
		Thread.sleep(1000);
		test.log(LogStatus.INFO, " Able to delete the role if we not add Access,menu,product after create new roles");
		screenshot("Rld1");

		Thread.sleep(9000);

		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Comp");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[normalize-space()='Company Staf']")).click();

		Thread.sleep(16000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,500)");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[normalize-space()='MenuEntity']")).click();

		Thread.sleep(16000);
		driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();

		test.log(LogStatus.INFO, "Able to delete the access that if assigned to Company Staff roles ");
		screenshot("Rld2");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();

		Thread.sleep(8000);

		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Comp");

		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[normalize-space()='Company Staf']")).click();

		Thread.sleep(16000);
		driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();

		test.log(LogStatus.INFO,
				"Able to delete the roles which product,Access,menu already adde we need to delete these first then we can delete roles");
		screenshot("Rld3");

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
