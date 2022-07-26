package Object;

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

public class Object_addaction {
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
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\Object\\Object report./SanObject./Add.html");

		test = report.startTest("Add Action to Object", "add");

		// report = new ExtentReports("C:\\Users\\Sandesh k.
		// r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\Object\\Object
		// report./San1./Add action.html") ;
		//
		// test =report.startTest("Add action to Object","Add") ;
		// test01 =report.startTest("Delete Action added Object","Delete") ;

		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://52.66.43.93:3100/admin/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("SYSTEM@tf.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[3]/a")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='#/object_search']")).click();

		Thread.sleep(7000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[3]/div[6]/div[1]/div[2]"))
				.click();

		Thread.sleep(9000);
		driver.findElement(By.xpath("//button[normalize-space()='Add Action']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='btn-group']//button[@type='button'][normalize-space()='Select']"))
				.click();
		Thread.sleep(3000);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@value='a1c7341c-78ba-4369-9f7c-de536ea0eb39']")).click();

		screenshot("oa1");
		test.log(LogStatus.INFO, "User  able to Select Action  from DropDown");

		Thread.sleep(3000);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[2]/div/div[2]/div/div/button"))
				.click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@value='ONLY_ONCE']")).click();
		screenshot("oa2");
		test.log(LogStatus.INFO, "User  able to Select Execution Type from DropDown");

		Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[3]/button[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

		test.log(LogStatus.INFO, "User   able to save using save button");
		Thread.sleep(1000);
		screenshot("oa3");

		// Thread.sleep(1000);
		// driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();

		Thread.sleep(9000);
		driver.findElement(By.xpath("//button[normalize-space()='Add Action']")).click();

		Thread.sleep(9000);
		driver.findElement(By.xpath("//button[@class='d-flex pull-right mr-2 btn btn-danger btn-sm']")).click();
		Thread.sleep(4000);
		screenshot("oa4");
		test.log(LogStatus.INFO, "User  able to click on cancel button ");

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
