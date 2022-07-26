package Transaction;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import reusable.PropertiesOperation;

public class new_Transaction {
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

		String url = PropertiesOperation.getPropertyValueByKeys("url");
		driver.get(url);

		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("staff@company.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[12]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[12]/ul/li/a")).click();
		Thread.sleep(3000);
		Thread.sleep(3000);

		// driver.findElement(By.xpath("//body//div[@id='root']//div[@role='presentation']//div[@role='presentation']//div[@role='presentation']//div[1]//pre[1]")).click();
		// Thread.sleep(3000);

		// driver.findElement(By.xpath("//div[@class='animated fadeIn']")).click();

		// Thread.sleep(5000);
		// WebElement ss=driver.findElement(By.cssSelector(".CodeMirror-scroll"));
		// ss.clear();
		Thread.sleep(15000);

		WebElement webElement = driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div/div[6]/div[1]/div/div/div/div[5]/div[3]/pre/span"));
		webElement.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement webElement_new = driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div/div/div[6]/div[1]/div/div/div/div[5]/div[3]/pre/span"));
		webElement_new.clear();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Send']")).click();

		/*
		 * 
		 * Actions input= new Actions(driver); input.click(driver.findElement(By.xpath(
		 * "//body//div[@id='root']//div[@role='presentation']//div[@role='presentation']//div[@role='presentation']//div[1]//pre[1]"
		 * ))); input.sendKeys(Keys.CONTROL, Keys.chord("a"));
		 * input.sendKeys(Keys.BACK_SPACE); input.sendKeys("new text");
		 * 
		 * 
		 * 
		 * Thread.sleep(3000);
		 * //driver.findElement(By.xpath("//button[normalize-space()='Refresh']")).click
		 * (); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//button[normalize-space()='Send']")).click();
		 * 
		 * Thread.sleep(3000);
		 * //driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		 * JavascriptExecutor js=(JavascriptExecutor)driver;
		 * js.executeScript("window.scrollBy(0,1000)");
		 */
	}
}
