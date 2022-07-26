package Amount;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.Test;

	public class shopclue {
		static 	WebDriver driver;
		@Test(priority=1)
		public void display() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandesh k. r\\chromedriver_win32 (12)\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://automationpractice.com/index.php"); 
		  driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		 
		 // driver.findElement(By.xpath("//*[@id=\'header\']/div[2]/div/div/nav/div[1]/a")).click();
		 //  driver.findElement(By.xpath("//*[@id=\'email_create\']")).sendKeys("ajay01@gmail.com");
		 // driver.findElement(By.xpath("//*[@id=\'SubmitCreate\']/span/i")).click();
		//Thread.sleep(2000);
		//  WebElement radio1=driver.findElement(By.name("id_gender"));
		// radio1.click();
		 
		// driver.findElement(By.xpath("//*[@id=\'customer_firstname\']")).sendKeys("suru");
		// driver.findElement(By.xpath("//*[@id=\'customer_lastname\']")).sendKeys("k r");


		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("suru87@gmail.com");
		 // driver.findElement(By.xpath("//*[@id=\'passwd\']")).sendKeys("12345");
		 // Select dd=new Select(driver.findElement(By.id("days")));
		 // dd.selectByIndex(21);
		// Thread.sleep(2000);
		// Select dd1=new Select(driver.findElement(By.xpath("//*[@id=\'months\']")));
		//  dd1.selectByIndex(5);
		// Select dd2=new Select(driver.findElement(By.id("years")));
		// dd2.selectByValue("2010");
		// Thread.sleep(2000);
		//  driver.findElement(By.xpath("//*[@id=\'address1\']")).sendKeys("deee");
	//  driver.findElement(By.xpath("//*[@id=\'city\']")).sendKeys("Manglore");
		// Select dd3=new Select(driver.findElement(By.id("id_state")));
		//  dd3.selectByVisibleText("South Dakota");
		//  driver.findElement(By.xpath("//*[@id=\'postcode\']")).sendKeys("56005");
		//  driver.findElement(By.xpath("//*[@id=\'phone_mobile\']")).sendKeys("956100234");
		//  driver.findElement(By.xpath("//*[@id='alias']")).sendKeys("deee");
		//// Thread.sleep(2000);
		/// driver.findElement(By.xpath("//*[@id=\'submitAccount\']/span")).click();
		// driver.findElement(By.xpath("//*[@id=\'header\']/div[2]/div/div/nav/div[2]/a")).click();

		}
		
		
		@Test(priority=2)
		public void login() throws InterruptedException
		{ 
			
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\'header\']/div[2]/div/div/nav/div[1]/a")).click();
			 Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ajay01@gmail.com");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("12345");
			
			// Thread.sleep(2000);
			//driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		}
		
		@Test(priority=3)
		public void AddtoCart1() throws InterruptedException
		{
		   driver.findElement(By.xpath("//*[@id=\'search_query_top\']")).sendKeys("summer dresses");
		   driver.findElement(By.xpath("//*[@id=\'searchbox\']/button")).click();
		  

		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,550)"); //scroll up(-250)
		 Actions a=new Actions(driver);
		 a.moveToElement(driver.findElement(By.xpath("//*[@id=\'center_column\']/ul/li[1]/div/div[1]/div/a[1]/img"))).build().perform();


		 driver.findElement(By.xpath("//*[@id=\'center_column\']/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.linkText("Proceed to checkout")).sendKeys(Keys.ENTER);
		 Thread.sleep(5000);
		 jse.executeScript("window.scrollBy(0,550)");
		 driver.findElement(By.linkText("Proceed to checkout")).sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
			
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("ajay01@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'passwd\']")).sendKeys("12345");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='SubmitLogin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'center_column\']/form/p/button")).click();
		 Thread.sleep(3000);
			
		driver.findElement(By.xpath("//*[@id='cgv']")).click();
		 Thread.sleep(3000);
			
		driver.findElement(By.xpath("//*[@id='form']/p/button")).click();
		 Thread.sleep(3000);
			
		driver.findElement(By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")).click();
		 Thread.sleep(3000);
			
		driver.findElement(By.xpath("//*[@id='cart_navigation']/button")).click();

		   String title=driver.getTitle();
		   System.out.println(title);
		   Assert.assertEquals(title, "Order confirmation - My Store");

		 
		} 
			
			
		}