package Amount;


	

	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;
	


public class Multipletab {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandesh k. r\\Downloads\\chromedriver_win32 (13)\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	     // driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
	      // wait of 5 seconds
	      driver.get("https://nxtgenaiacademy.com/multiplewindows/");
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      // Keys.Chord string
	      String clickl = Keys.chord(Keys.CONTROL,Keys.ENTER);
	      // open the link in new tab, Keys.Chord string passed to sendKeys
	     // driver.findElement( By.xpath("//*[text()='Terms of Use']")).sendKeys(clickl);
	      Thread.sleep(3000);
	    //  driver.findElement(  By.xpath("//*[@id=\"tocCollapse\"]/div/ul[1]/li[8]/a")).sendKeys(clickl);
	      driver.findElement(  By.xpath("//*[@id=\"button1\"]")).sendKeys(clickl);
	      Thread.sleep(6000);
	      //Select sd2=new Select(driver.findElement(By.xpath("//*[@id=\"menu-item-4131\"]/a/span")));
			//sd2.selectByValue("A To Z Automation Training");
	      JavascriptExecutor jse = (JavascriptExecutor)driver;
			 jse.executeScript("window.scrollBy(0,550)");
			 Thread.sleep(3000);
	      driver.findElement(  By.xpath("//button[contains(text(),'New Message Window')]")).sendKeys(clickl);
	   
	   }
	}