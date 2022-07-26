package Roles;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class add_access {
	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest test, test01, test02, test03, test04, test05, test06, test07, test08, test09, test11, test10,
			test12;

	public static void main(String[] args) throws InterruptedException, IOException {
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

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[7]/a")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='#/roles_search']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='CEO']")).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[normalize-space()='Add Access']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"))
				.click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@value='48d1cb89-079d-4984-9915-7442a8d821ed']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Select']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@value='596c1a9c-036c-473d-952e-ef0d9ff9c13c']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

		// Thread.sleep(3000);
		// driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();

	}
}