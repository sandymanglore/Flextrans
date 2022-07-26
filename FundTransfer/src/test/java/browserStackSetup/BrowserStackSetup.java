package browserStackSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browserStackPages.BrowserStackHomePage;
import browserStackPages.BrowserStackSignUpPage;

public class BrowserStackSetup {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	String driverPath = "C:\\geckodriver.exe";
	WebDriver driver;
	BrowserStackHomePage objBrowserStackHomePage;
	BrowserStackSignUpPage objBrowserStackSignUpPage;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandesh k. r\\Downloads\\chromedriver_win32 (13)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.browserstack.com/");
	}
	@Test(priority = 1)
	public void click_on_getstarted() {
	objBrowserStackHomePage = new BrowserStackHomePage(driver);
	//objBrowserStackHomePage.Header();
	objBrowserStackHomePage.clickOn();
	}
	@Test(priority = 2)
	public void enter_userDetails() {
	objBrowserStackSignUpPage = new BrowserStackSignUpPage(driver);
//	objBrowserStackSignUpPage.veryHeader();
	objBrowserStackSignUpPage.enterFullName("TestUser");
	objBrowserStackSignUpPage.enterBusinessEmail("TestUser@gmail.com");
	objBrowserStackSignUpPage.enterPasswrod("TestUserPassword");
	
	}

}
