package User;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class add_user {

	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest test;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sandesh k. r\\chromedriver_win32 (12)\\chromedriver.exe");
		driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://52.66.43.93:3100/admin/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("staff@company.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[6]/a")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='#/user_search']")).click();

		Thread.sleep(7000);

		driver.findElement(By.xpath("//div[normalize-space()='abc02']")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[normalize-space()='Add Role']")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[@value='82fd0e30-ebd0-11ec-b9f7-75f3b330edd0']")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[@value='f7e042f0-196d-11e9-95b2-39097592ab88']")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[@value='e0c0cd90-4727-11ea-a010-07650f535359']")).click();

		Thread.sleep(4000);

		// driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

	}
}
