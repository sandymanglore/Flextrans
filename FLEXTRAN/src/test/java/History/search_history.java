package History;

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

import reusable.PropertiesOperation;

public class search_history {

	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest test;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sandesh k. r\\chromedriver_win32 (12)\\chromedriver.exe");
		driver = new ChromeDriver();

		report = new ExtentReports(
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\History\\History report./SanObject./history.html");

		test = report.startTest("Search History", "History");

		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.manage().window().maximize();
		String url = PropertiesOperation.getPropertyValueByKeys("url");
		driver.get(url);

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("staff@company.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[11]/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[11]/ul/li/a")).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]"))
				.click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[contains(text(),'⊕')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[11]/ul/li/a")).click();

		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4000)");

		Thread.sleep(5000);
		Select sa = new Select(driver.findElement(By.xpath("//select[@aria-label='rows per page']")));
		sa.selectByValue("100");
		test.log(LogStatus.INFO, "Able to search history by using select drop down method ");

		screenshot("h21");

		// test.log(LogStatus.INFO,"user able search data by selecton drop down method
		// ");
		// screenshot("rls1");

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-4000)");

		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Get");

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/input[1]"))
				.sendKeys("Get");

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/input[1]"))
				.sendKeys("Comp");

		test.log(LogStatus.INFO, "Able to search history by entering value on search by box ");

		screenshot("h2");

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
