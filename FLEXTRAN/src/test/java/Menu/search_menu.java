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
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class search_menu {

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
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\Menu\\Menu report./SanMenu./Search.html");

		test = report.startTest("Search Menu", "Search");

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
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,550)");

		Thread.sleep(9000);

		test.log(LogStatus.INFO, "User able to Search Data By Search by method using select drop down method");
		screenshot("Mns3");
		Select sa = new Select(driver.findElement(By.xpath("//select[@aria-label='rows per page']")));
		sa.selectByValue("25");

		Thread.sleep(4000);
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,-550)");

		Thread.sleep(4000);

		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("0");
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[3]/input[1]"))
				.sendKeys("Tr");

		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[4]/input[1]"))
				.sendKeys("IN");

		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[5]/input[1]"))
				.sendKeys("/In");

		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[6]/input[1]"))
				.sendKeys("Tra");

		test.log(LogStatus.INFO, "User able to Search Data By Search by method");
		screenshot("Mns1");

		Thread.sleep(6000);
		driver.get("http://52.66.43.93:3100/admin/#/menu_search");
		driver.navigate().refresh();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[5]/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[5]/ul/li[2]/a")).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("//div[@class='react-switch-bg']")).click();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("0");

		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[3]/input[1]"))
				.sendKeys("Tr");

		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[4]/input[1]"))
				.sendKeys("IN");

		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[5]/input[1]"))
				.sendKeys("/In");

		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[6]/input[1]"))
				.sendKeys("Tra");

		test.log(LogStatus.INFO, "User able to Search Data By Search by method in Show factory data");
		screenshot("Mns2");

		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[5]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[5]/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[5]/ul/li[2]/a")).click();

		Thread.sleep(5000);
		driver.get("http://52.66.43.93:3100/admin/#/menu_search");
		driver.navigate().refresh();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("1");

		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='form-control']")).clear();
		Thread.sleep(4000);
		/*
		 * driver.findElement(By.xpath(
		 * "//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[3]/input[1]"
		 * )).clear();
		 * 
		 * Thread.sleep(4000); driver.findElement(By.xpath(
		 * "//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[4]/input[1]"
		 * )).clear();
		 * 
		 * 
		 * Thread.sleep(4000); driver.findElement(By.xpath(
		 * "//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[5]/input[1]"
		 * )).clear();
		 * 
		 * Thread.sleep(4000); driver.findElement(By.xpath(
		 * "//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[6]/input[1]"
		 * )).clear();
		 */

		Thread.sleep(5000);
		driver.get("http://52.66.43.93:3100/admin/#/menu_search");
		driver.navigate().refresh();

		Thread.sleep(1000);
		test.log(LogStatus.INFO, "User able to Clear data in search box");
		screenshot("Mns3");

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
