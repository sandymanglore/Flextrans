package End_to_end_Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import reusable.PropertiesOperation;

public class TF_demo {

	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest test;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sandesh k. r\\chromedriver_win32 (12)\\chromedriver.exe");
		driver = new ChromeDriver();

		report = new ExtentReports(
				"C:\\Users\\Sandesh k. r\\eclipse-workspace\\FLEXTRAN\\src\\test\\java\\End_to_end_Test\\process report./SanReport./Report.html");

		test = report.startTest("End to End Process Report", "Report");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String url = PropertiesOperation.getPropertyValueByKeys("url");
		driver.get(url);

		driver.manage().window().maximize();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("SYSTEM@tf.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();
		Thread.sleep(4000);
		test.log(LogStatus.INFO, "Enterd valid User Id and Password and Click on submit login to page");
		screenshot("R1");

		// Application

		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[4]/ul/li[1]/a")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div/div/input"))
				.sendKeys("Trans7");

		Thread.sleep(3000);
		// driver.findElement(By.xpath("//button[@type='reset']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(15000);

		test.log(LogStatus.INFO, "Able to create new application");
		screenshot("R2");

		// Simple Transaction
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[10]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[10]/ul/li[1]/a")).click();

		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input"))
				.sendKeys("Set7");

		Thread.sleep(2000);
		// driver.findElement(By.xpath("//button[@type='reset']")).click();

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(12000);
		test.log(LogStatus.INFO, "Able to create new Simple Transaction");
		screenshot("R3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Add Step']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Select']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='SUCCESS']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Delay...']")).sendKeys("1");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Function...']")).sendKeys("action");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Function Class...']")).sendKeys("adding");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter API...']")).sendKeys("/org.qa");

		Thread.sleep(3000);
		// driver.findElement(By.xpath("//button[@type='reset']")).click();

		test.log(LogStatus.INFO, "Able to add Steps in Simple Transaction");
		screenshot("R4");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();

		Thread.sleep(13000);

		// Complex transaction

		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[9]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[9]/ul/li[1]/a")).click();

		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input"))
				.sendKeys("Get15");

		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[3]/div/input"))
				.sendKeys("Get15");

		Thread.sleep(2000);
		// driver.findElement(By.xpath("//button[@type='reset']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(12000);
		test.log(LogStatus.INFO, "Able to Create New Complex Transaction");
		screenshot("R5");

		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[normalize-space()='Add Step']")).click();

		Thread.sleep(12000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/button[1]"))
				.click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='SUCCESS']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Delay...']")).sendKeys("1");

		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[2]/div[1]/button[1]"))
				.click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[text()='Set7']")).click();
		test.log(LogStatus.INFO, "Able to Add steps in Complex transaction");
		screenshot("R6");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();

		Thread.sleep(15000);
		driver.findElement(By.xpath("//a[normalize-space()='Access']")).click();
		Thread.sleep(5000);
		WebElement selectMyElement = driver
				.findElement(By.cssSelector(".css-1hwfws3.select__value-container.select__value-container--is-multi"));
		selectMyElement.click();

		Actions keyDown = new Actions(driver);
		// keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
		Thread.sleep(18000);
		test.log(LogStatus.INFO, "Able give  Access by selecting application from Select drop down Method");
		screenshot("R17");

		keyDown.sendKeys("Trans7").sendKeys(Keys.ENTER).build().perform();

		Thread.sleep(5000);

		// Action

		Thread.sleep(4000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/ul/li[1]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[1]/div/input"))
				.sendKeys("A11 add");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[2]/div/input"))
				.sendKeys("A11 add");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[3]/div[2]/fieldset/div/label/input"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter UI URL']")).sendKeys("WWW.action.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='confirm']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Confirmation Message']")).sendKeys("Adding");
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //button[@type='submit']")).click();
		test.log(LogStatus.INFO, "Able to Create New Action");
		screenshot("R7");
		Thread.sleep(13000);

		// Object

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[3]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[3]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input"))
				.sendKeys("A11 ClickEntity");
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/input"))
				.sendKeys("A11 ClickEntity");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(3000);
		Thread.sleep(12000);
		test.log(LogStatus.INFO, "Able to Create New Object");
		screenshot("R8");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Add Action']")).click();
		Thread.sleep(13000);
		driver.findElement(By.xpath("//div[@class='btn-group']//button[@type='button'][normalize-space()='Select']"))
				.click();
		Thread.sleep(3000);

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='A11 add - A11 add']")).click();
		Thread.sleep(3000);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[2]/div/div[2]/div/div/button"))
				.click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@value='ONLY_ONCE']")).click();

		test.log(LogStatus.INFO, "Able to Add action to New Object");
		screenshot("R9");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(13000);

		// Menu

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[5]/ul/li[1]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[2]/div/input"))
				.sendKeys("IN");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[3]/div/input"))
				.sendKeys("AB");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[4]/div/input"))
				.sendKeys("ab");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[5]/div/input"))
				.sendKeys("Inprogress tf");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[6]/div/input"))
				.sendKeys("Transasct report");
		Thread.sleep(2000);

		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,550)");

		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(12000);

		test.log(LogStatus.INFO, "Able to Create New Menu");
		screenshot("R10");

		// Roles

		Thread.sleep(4000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[7]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[7]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div/div/input"))
				.sendKeys("Head");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(15000);
		test.log(LogStatus.INFO, "Able to Create New Roles");
		screenshot("R11");

		driver.findElement(By.xpath("//button[normalize-space()='Add Product']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"))
				.click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Trans7']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Get15']")).click();

		test.log(LogStatus.INFO, "Able to add Product to Roles");
		screenshot("R12");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

		Thread.sleep(13000);
		driver.findElement(By.xpath("//button[normalize-space()='Add Access']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"))
				.click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='A11 ClickEntity']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Select']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='A11 add']")).click();

		test.log(LogStatus.INFO, "Able to Add access to Roles");
		screenshot("R13");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

		Thread.sleep(13000);
		driver.findElement(By.xpath("//button[normalize-space()='Add Menu']")).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[normalize-space()='Select']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@value='35493e70-09d5-11ed-b418-1d3f2bb2aadb']")).click();

		test.log(LogStatus.INFO, "Able to add Menu to Roles");
		screenshot("R14");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

		Thread.sleep(12000);

		// Branch

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[8]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[8]/ul/li[1]/a")).click();

		Thread.sleep(2000);

		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input"))
				.sendKeys("PUNE");

		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/input"))
				.sendKeys("Comp");
		Thread.sleep(2000);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		test.log(LogStatus.INFO, "Able to create new branch");
		screenshot("R15");

		Thread.sleep(8000);

		// user

		Thread.sleep(4000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[6]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[6]/ul/li[1]/a")).click();
		Thread.sleep(2000);

		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input"))
				.sendKeys("ab23@gmail.com");
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/input"))
				.sendKeys("aboc56");
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[3]/div/input"))
				.sendKeys("elJg");
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[4]/div/input"))
				.sendKeys("7555797889");
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[5]/div/input"))
				.sendKeys("K5");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(12000);
		test.log(LogStatus.INFO, "Able to create new User");
		screenshot("R16");

		driver.findElement(By.xpath("//button[normalize-space()='Add Role']")).click();

		Thread.sleep(8000);

		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[text()='Trans7']")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[text()='PUNE']")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[text()='Head']")).click();

		Thread.sleep(4000);

		// driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();

		Thread.sleep(4000);
		test.log(LogStatus.INFO, "Able to add Role to New User");
		screenshot("R17");

		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

		Thread.sleep(10000);

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
