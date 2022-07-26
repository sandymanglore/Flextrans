package Amount;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class insurancepart2 {
	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest test;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandesh k. r\\Downloads\\chromedriver_win32 (13)\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("https://secureformsolutions.com/form/insurancewebsitedemo.com/life");
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		 Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("ds");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("55555");
		 Thread.sleep(2000);
		Select dd=new Select(driver.findElement(By.xpath("//*[@id=\"basics_div\"]/form/fieldset/label[4]/div[2]/select")));
		dd.selectByVisibleText("John Doe");
		driver.findElement(By.xpath("//button[@id='sfs-one-start']")).click();	
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='applicant_address']")).sendKeys("Mangalore");
		driver.findElement(By.xpath("//input[@id='applicant_city']")).sendKeys(" ab");
		Select dd1=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[1]/div[6]/div[2]/select")));
		dd1.selectByVisibleText("Indiana");
		Thread.sleep(2000);
		Select dd3=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[1]/div[8]/div[2]/select")));
		dd3.selectByVisibleText("Male");
		Thread.sleep(2000);
		Select sd=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[1]/div[9]/div[2]/select[1]")));
		sd.selectByVisibleText("February");
		Select sd1=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[1]/div[9]/div[2]/select[2]")));
		sd1.selectByVisibleText("10");
		Select sd2=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[1]/div[9]/div[2]/select[3]")));
		sd2.selectByVisibleText("2018");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[1]/div[10]/div[2]/input")).sendKeys(" 5.8");
		driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[1]/div[11]/div[2]/input")).sendKeys(" 71");
		Thread.sleep(2000);
		Select s=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[1]/div[12]/div[2]/select")));
		s.selectByVisibleText("Technology");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		// js.executeScript("window.scrollBy(0,550)"); 
		Thread.sleep(3000);
		Select s1=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[2]/div[1]/div[2]/select")));
		s1.selectByVisibleText("Term 20 Years");
		Select s2=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[2]/div[2]/div[2]/select")));
		s2.selectByVisibleText("$15,000,000");
		Select s3=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[2]/div[3]/div[2]/select")));
		s3.selectByVisibleText("GMAC");
		Thread.sleep(3000);
		Select s4=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[3]/div[1]/div[2]/select")));
		s4.selectByVisibleText("No");
		
		Select s5=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[3]/div[2]/div[2]/select")));
		s5.selectByVisibleText("No");
		
		
		Select s6=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[3]/div[3]/div[2]/select")));
		s6.selectByVisibleText("No");
		Thread.sleep(3000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,50)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/div[3]/input")).click();
		Thread.sleep(2000);
		Select r=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[1]/div[1]/div[2]/select")));
		r.selectByVisibleText("Yes");
		
		Select r1=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[1]/div[2]/div[2]/select")));
		r1.selectByVisibleText("No");
		Thread.sleep(2000);
		Select r2=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[1]/div[3]/div[2]/select")));
		r2.selectByVisibleText("No");
		
		Select r3=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[1]/div[4]/div[2]/select")));
		r3.selectByVisibleText("No");
		
		Select r4=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[1]/div[5]/div[2]/select")));
		r4.selectByVisibleText("No");
		
		Select r5=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[1]/div[6]/div[2]/select")));
		r5.selectByVisibleText("No");
		Thread.sleep(2000);
		Select r6=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[1]/div[7]/div[2]/select")));
		r6.selectByVisibleText("No");
		Thread.sleep(2000);
		Select r7=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[1]/div[8]/div[2]/select")));
		r7.selectByVisibleText("No");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[1]/div[9]/div[2]/textarea")).sendKeys("Hobbies");
		Thread.sleep(3000);
		Select r8=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[2]/label[2]/div[2]/select")));
		r8.selectByVisibleText("Google");
		Thread.sleep(3000);
		Select r9=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[2]/label[3]/div[2]/select")));
		r9.selectByVisibleText("Text Message");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[2]/label[4]/div[2]/textarea")).sendKeys("Life Insurance");
		
		driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/div[3]/input")).click();
		
		JavascriptExecutor jse1=(JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,200)");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"skrollr-body\"]/div[5]/div[2]/div/a")).click();
	
		JavascriptExecutor jse2=(JavascriptExecutor)driver;
		jse2.executeScript("window.scrollBy(0,200)");
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/a")).click();
		
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("demo");
		
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("ds");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("55555");
		 Thread.sleep(2000);
			Select d=new Select(driver.findElement(By.xpath("//*[@id=\"basics_div\"]/form/fieldset/label[4]/div[2]/select")));
			d.selectByVisibleText("John Doe");
			driver.findElement(By.xpath("//button[@id='sfs-one-start']")).click();	
			JavascriptExecutor jse3=(JavascriptExecutor)driver;
			jse3.executeScript("window.scrollBy(0,200)");
			driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("Mangalore");
			Select t=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset/div[8]/div[2]/select[1]")));
			t.selectByVisibleText("February");
			Select t1=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset/div[8]/div[2]/select[2]")));
			t1.selectByVisibleText("25");
			Select t2=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset/div[8]/div[2]/select[3]")));
			t2.selectByVisibleText("2001");
			Thread.sleep(2000);
			Select ss1=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset/div[9]/div[2]/select")));
			ss1.selectByVisibleText("Scientist");
			Thread.sleep(3000);
			Select ss2=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset/div[10]/div[2]/select")));
			ss2.selectByVisibleText("Some College");
			Thread.sleep(3000);
			Select r61=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset/div[12]/div[2]/select")));
			r61.selectByVisibleText("No");
			Thread.sleep(3000);
			Select r62=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset/div[13]/div[2]/select")));
			r62.selectByVisibleText("House");
			Thread.sleep(3000);
			Select r63=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset/div[14]/div[2]/select")));
			r63.selectByVisibleText("Own");
			JavascriptExecutor jse4=(JavascriptExecutor)driver;
			jse4.executeScript("window.scrollBy(0,200)");
			Thread.sleep(3000);
			Select r64=new Select(driver.findElement(By.xpath("//*[@id=\"yar\"]")));
			r64.selectByVisibleText("15");
			Thread.sleep(3000);
			Select r65=new Select(driver.findElement(By.xpath("//*[@id=\"gender\"]")));
			r65.selectByVisibleText("Male");
			JavascriptExecutor jse5=(JavascriptExecutor)driver;
			jse5.executeScript("window.scrollBy(0,200)");
			Thread.sleep(3000);
			Select r66=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset/div[17]/div[2]/select")));
			r66.selectByVisibleText("Single");
			
			driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/div[5]/input")).click();
			Thread.sleep(2000);
			
			
			Select j=new Select(driver.findElement(By.xpath("//*[@id=\"Number_of_Vehicles\"]")));
			j.selectByVisibleText("2");
			Thread.sleep(2000);
			JavascriptExecutor jse21=(JavascriptExecutor)driver;
			jse21.executeScript("window.scrollBy(0,400)");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles1\"]/fieldset/div[1]/div[2]/input")).sendKeys("4")	;
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles1\"]/fieldset/div[2]/div[2]/input")).sendKeys("Hyundai")	;
			driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles1\"]/fieldset/div[3]/div[2]/input")).sendKeys("2018")	;
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			
			Select j1=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles1\"]/fieldset/div[4]/div[2]/select")));
			j1.selectByVisibleText("Hatchback");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles1\"]/fieldset/div[5]/div[2]/input")).sendKeys("petrol")	;
			Thread.sleep(2000);
			JavascriptExecutor jse22=(JavascriptExecutor)driver;
			jse22.executeScript("window.scrollBy(0,500)");
			
			Select j2=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles1\"]/fieldset/div[6]/div[2]/select")));
			j2.selectByVisibleText("Owned");
			
			driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles1\"]/fieldset/div[9]/div[2]/input")).sendKeys("30000km")	;
			
			driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles1\"]/fieldset/div[10]/div[2]/input")).sendKeys("2")	;
			
			//*[@id="divNumber_of_Vehicles1"]/fieldset/div[11]/div[2]/input
			driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles1\"]/fieldset/div[11]/div[2]/input")).sendKeys("40km")	;
			Thread.sleep(2000);
			JavascriptExecutor jse23=(JavascriptExecutor)driver;
			jse23.executeScript("window.scrollBy(0,400)");
			
			driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles1\"]/fieldset/div[12]/div[2]/input")).sendKeys("750")	;
			Thread.sleep(2000);
			
			Select j3=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles1\"]/fieldset/div[13]/div[2]/select")));
	
			j3.selectByVisibleText("To/From Work");
			Thread.sleep(2000);
			
			Select j4=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles1\"]/fieldset/div[14]/div[2]/select")));
			j4.selectByVisibleText("Parking Lot");
			
			// Actions a=new Actions(driver);
			// a.moveToElement(driver.findElement(By.xpath("//*[@id=\'center_column\']/ul/li[1]/div/div[1]/div/a[1]/img"))).build().perform();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles1\"]/fieldset/div[15]/div[2]/select/option[4]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles1\"]/fieldset/div[16]/div[2]/select/option[3]")).click();
			Thread.sleep(2000);
			
			Select j5=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles1\"]/fieldset/div[17]/div[2]/select")));
			j5.selectByVisibleText("Yes");
			JavascriptExecutor jse24=(JavascriptExecutor)driver;
			jse24.executeScript("window.scrollBy(0,200)");
			
			Thread.sleep(2000);
			Select j6=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles1\"]/fieldset/div[18]/div[2]/select")));
			j6.selectByVisibleText("No");
			
			Thread.sleep(2000);
			Select j7=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles1\"]/fieldset/div[19]/div[2]/select")));
			j7.selectByVisibleText("No");
			
			Thread.sleep(2000);
			Select j8=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles1\"]/fieldset/div[20]/div[2]/select")));
			j8.selectByVisibleText("No");
			
			Thread.sleep(2000);
			Select j9=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles1\"]/fieldset/div[21]/div[2]/select")));
			j9.selectByVisibleText("0");
			Thread.sleep(2000);
			
			JavascriptExecutor jse25=(JavascriptExecutor)driver;
			jse25.executeScript("window.scrollBy(0,400)");
			
			Select j10=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles1\"]/fieldset/div[22]/div[2]/select")));
			j10.selectByVisibleText("50");
			Thread.sleep(2000);
			Select j11=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles1\"]/fieldset/div[23]/div[2]/select")));
			j11.selectByVisibleText("No");
			Thread.sleep(2000);
			Select j12=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles1\"]/fieldset/div[24]/div[2]/select")));
			j12.selectByVisibleText("No");
			
			Thread.sleep(2000);
			
			Select j13=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles1\"]/fieldset/div[25]/div[2]/select")));
			j13.selectByVisibleText("Yes");
			
			///
			
			
			driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles2\"]/fieldset/div[1]/div[2]/input")).sendKeys("1")	;
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles2\"]/fieldset/div[2]/div[2]/input")).sendKeys("Yamaha")	;
			driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles2\"]/fieldset/div[3]/div[2]/input")).sendKeys("2021")	;
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			
			Select u1=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles2\"]/fieldset/div[4]/div[2]/select")));
			u1.selectByVisibleText("Hatchback");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles2\"]/fieldset/div[5]/div[2]/input")).sendKeys("petrol")	;
			Thread.sleep(2000);
			JavascriptExecutor jse31=(JavascriptExecutor)driver;
			jse31.executeScript("window.scrollBy(0,500)");
			
			Select j30=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles2\"]/fieldset/div[6]/div[2]/select")));
			j30.selectByVisibleText("Owned");
			
			driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles2\"]/fieldset/div[9]/div[2]/input")).sendKeys("10000km")	;
			
			driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles2\"]/fieldset/div[10]/div[2]/input")).sendKeys("2")	;
			
			//*[@id="divNumber_of_Vehicles1"]/fieldset/div[11]/div[2]/input
			driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles2\"]/fieldset/div[11]/div[2]/input")).sendKeys("90km")	;
			Thread.sleep(2000);
			JavascriptExecutor jse203=(JavascriptExecutor)driver;
			jse203.executeScript("window.scrollBy(0,400)");
			
			driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles2\"]/fieldset/div[12]/div[2]/input")).sendKeys("5650")	;
			Thread.sleep(2000);
			
			Select j34=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles2\"]/fieldset/div[13]/div[2]/select")));
	
			j34.selectByVisibleText("To/From Work");
			Thread.sleep(2000);
			
			Select j40=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles2\"]/fieldset/div[14]/div[2]/select")));
			j40.selectByVisibleText("Parking Lot");
			
			// Actions a=new Actions(driver);
			// a.moveToElement(driver.findElement(By.xpath("//*[@id=\'center_column\']/ul/li[1]/div/div[1]/div/a[1]/img"))).build().perform();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles2\"]/fieldset/div[15]/div[2]/select/option[4]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles2\"]/fieldset/div[16]/div[2]/select/option[3]")).click();
			Thread.sleep(2000);
			
			Select j50=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles2\"]/fieldset/div[17]/div[2]/select")));
			j50.selectByVisibleText("Yes");
			JavascriptExecutor jse240=(JavascriptExecutor)driver;
			jse240.executeScript("window.scrollBy(0,200)");
			
			Thread.sleep(2000);
			Select j60=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles2\"]/fieldset/div[18]/div[2]/select")));
			j60.selectByVisibleText("No");
			
			Thread.sleep(2000);
			Select j70=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles2\"]/fieldset/div[19]/div[2]/select")));
			j70.selectByVisibleText("No");
			
			Thread.sleep(2000);
			Select j80=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles2\"]/fieldset/div[20]/div[2]/select")));
			j80.selectByVisibleText("No");
			
			Thread.sleep(2000);
			Select j90=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles2\"]/fieldset/div[21]/div[2]/select")));
			j90.selectByVisibleText("0");
			Thread.sleep(2000);
			
			JavascriptExecutor jse250=(JavascriptExecutor)driver;
			jse250.executeScript("window.scrollBy(0,400)");
			
			Select j100=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles2\"]/fieldset/div[22]/div[2]/select")));
			j100.selectByVisibleText("50");
			Thread.sleep(2000);
			Select j110=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles2\"]/fieldset/div[23]/div[2]/select")));
			j110.selectByVisibleText("No");
			Thread.sleep(2000);
			Select j120=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles2\"]/fieldset/div[24]/div[2]/select")));
			j120.selectByVisibleText("No");
			
			Thread.sleep(2000);
			
			Select j130=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Vehicles2\"]/fieldset/div[25]/div[2]/select")));
			j130.selectByVisibleText("Yes");
			
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/div[8]/input")).click();
			
			
			
			driver.findElement(By.xpath("//*[@id=\"fname1\"]")).sendKeys("bmw");
			
			driver.findElement(By.xpath("//*[@id=\"lname1\"]")).sendKeys("ah");
			
			driver.findElement(By.xpath("//*[@id=\"ss_number\"]")).sendKeys("23");
			Thread.sleep(2000);
			Select sd12=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Drivers1\"]/fieldset/div[3]/div[2]/select[1]")));
			sd12.selectByVisibleText("May");
			Thread.sleep(2000);
			Select sd13=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Drivers1\"]/fieldset/div[3]/div[2]/select[2]")));
			sd13.selectByVisibleText("25");
			Thread.sleep(2000);
			Select sd21=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Drivers1\"]/fieldset/div[3]/div[2]/select[3]")));
			sd21.selectByVisibleText("2001");
			Thread.sleep(2000);
			JavascriptExecutor j250=(JavascriptExecutor)driver;
			j250.executeScript("window.scrollBy(0,200)");

			Thread.sleep(2000);
			
			Select w=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Drivers1\"]/fieldset/div[4]/div[2]/select")));
			w.selectByVisibleText("Male");
			Thread.sleep(2000);
			Select w1=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Drivers1\"]/fieldset/div[5]/div[2]/select")));
			w1.selectByVisibleText("Single");
			
			Thread.sleep(2000);
			
			Select w2=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Drivers1\"]/fieldset/div[6]/div[2]/select")));
			w2.selectByVisibleText("Sibling");
			
			Thread.sleep(2000);
			Select w3=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Drivers1\"]/fieldset/div[7]/div[2]/select")));
			w3.selectByVisibleText("Active/Valid");
			
			Thread.sleep(2000);

			Select w4=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Drivers1\"]/fieldset/div[8]/div[2]/select")));
			w4.selectByVisibleText("Maine");
			
			Thread.sleep(2000);
			JavascriptExecutor j20=(JavascriptExecutor)driver;
			j20.executeScript("window.scrollBy(0,200)");

			driver.findElement(By.xpath("//*[@id=\"divNumber_of_Drivers1\"]/fieldset/div[9]/div[2]/input")).sendKeys("01238697");
			Thread.sleep(2000);
			
			Select w5=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Drivers1\"]/fieldset/div[10]/div[2]/select")));
			w5.selectByVisibleText("No");
			
			Thread.sleep(2000);

			Select w6=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Drivers1\"]/fieldset/div[11]/div[2]/select")));
			w6.selectByVisibleText("Lawyer");
			Thread.sleep(2000);
			Select w7=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Drivers1\"]/fieldset/div[12]/div[2]/select")));
			w7.selectByVisibleText("Yes");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"divNumber_of_Drivers1\"]/fieldset/div[13]/div[2]/input")).sendKeys("LIC");
			Thread.sleep(2000);
			JavascriptExecutor j207=(JavascriptExecutor)driver;
			j207.executeScript("window.scrollBy(0,200)");
			Thread.sleep(2000);
			Select w8=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Drivers1\"]/fieldset/div[14]/div[2]/select")));
			w8.selectByVisibleText("Some College");
			
			Select w81=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Drivers1\"]/fieldset/div[15]/div[2]/select")));
			w81.selectByVisibleText("4 Hyundai 2018");
			
			
			driver.findElement(By.xpath("//*[@id=\"divNumber_of_Drivers1\"]/fieldset/div[16]/div[2]/input")).sendKeys("18");
			
			
			driver.findElement(By.xpath("//*[@id=\"divNumber_of_Drivers1\"]/fieldset/div[17]/div[2]/select/option[2]")).click();
			
			
			driver.findElement(By.xpath("//*[@id=\"divNumber_of_Drivers1\"]/fieldset/div[18]/div[2]/select/option[11]")).click();
			Thread.sleep(2000);
			
			Select w9=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Drivers1\"]/fieldset/div[19]/div[2]/select")));
			w9.selectByVisibleText("No");
			JavascriptExecutor j206=(JavascriptExecutor)driver;
			j206.executeScript("window.scrollBy(0,100)");
			Thread.sleep(2000);
			Thread.sleep(2000);
			Select w10=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Drivers1\"]/fieldset/div[20]/div[2]/select")));
			w10.selectByVisibleText("No");
			
		
			
			Thread.sleep(2000);
			Select w11=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Drivers1\"]/fieldset/div[21]/div[2]/select")));
			w11.selectByVisibleText("No");
			
		
			Thread.sleep(2000);
			Select w12=new Select(driver.findElement(By.xpath("//*[@id=\"divNumber_of_Drivers1\"]/fieldset/div[22]/div[2]/select")));
			w12.selectByVisibleText("No");
			
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/div[8]/input")).click();
			

			Thread.sleep(2000);
			Select w132=new Select(driver.findElement(By.xpath("//*[@id=\"form_div\"]/form/fieldset[1]/div[1]/div[2]/select")));
			w132.selectByVisibleText("$50000/$100000");
			
			
			
	}

}
;