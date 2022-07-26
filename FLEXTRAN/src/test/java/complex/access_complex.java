package complex;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class access_complex {
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
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\complex\\Complex report./SanComplex./Access.html");
		test = report.startTest("Access Complex", "Complex");

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

		// script foe access

		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Get_Customer");

		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"))
				.click();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[normalize-space()='Access']")).click();

		WebElement selectMyElement = driver
				.findElement(By.cssSelector(".css-1hwfws3.select__value-container.select__value-container--is-multi"));
		selectMyElement.click();

		Actions keyDown = new Actions(driver);
		// keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();

		keyDown.sendKeys("TF Demo").sendKeys(Keys.ENTER).build().perform();

		test.log(LogStatus.INFO, "User able to click on access and select acces type using select drop down method ");
		screenshot("cpac1 ");

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
