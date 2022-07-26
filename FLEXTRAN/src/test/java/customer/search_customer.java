package customer;

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

public class search_customer {

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
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\customer\\customer report./SanObject./Search.html");
		test = report.startTest("Search customer", "Search");

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

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[13]/ul/li[2]/a")).click();

		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");

		Thread.sleep(5000);
		Select sa = new Select(driver.findElement(By.xpath("//select[@aria-label='rows per page']")));
		sa.selectByValue("25");
		test.log(LogStatus.INFO, "user able search data by selecton drop down method ");
		screenshot("cns1");

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-800)");

		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("a");

		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div[3]/input"))
				.sendKeys("a");
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div[4]/input"))
				.sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div[5]/input"))
				.sendKeys("ab");
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div[6]/input"))
				.sendKeys("11");
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div[7]/input"))
				.sendKeys("11");

		test.log(LogStatus.INFO, "user able search data by typing in search box");
		screenshot("cns2");

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
