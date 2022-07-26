package newTransaction;

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

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Create_new {
	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest test,test01,test02,test03,test04,test05,test06,test07,test08,test09,test11,test10,test12;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandesh k. r\\chromedriver_win32 (12)\\chromedriver.exe");
		driver = new ChromeDriver();
		
     report = new ExtentReports("./San./Flextron.html") ;

		 test =report.startTest("Creating New Data Using Flextranapplication","Creation") ;
		 
		 
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 try {
			driver.get("http://52.66.43.93:3100/admin/#/login");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			 
			 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("staff@company.com");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@1234");
			 driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div/div/div[4]/div/button")).click();
			// Thread.sleep(5000);
				
			 test.log(LogStatus.INFO,"user clicked on  login button with entering valid User Id and Passsword");
			 ScreenShot("login");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 test.log(LogStatus.ERROR,"Error in clickin method:"+e.getMessage());
			
		}
		 //report.endTest(test);
		
		 
		 /*
		 
		 
		 /*Action*/
		// test01 =report.startTest("Creating New Action","Action") ;
		 
		 Thread.sleep(5000);
		
		 try {
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/a")).click();
			 
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/ul/li[1]/a")).click();
			 
			 
			 
			
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[1]/div/input")).sendKeys("ACTION-1");
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[2]/div/input")).sendKeys("Add");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[3]/div[2]/fieldset/div/label/input")).click();
			Thread.sleep(2000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter UI URL']")).sendKeys("WWW.action.com");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//input[@name='confirm']")).click();
			 driver.findElement(By.xpath("//input[@placeholder='Enter Confirmation Message']")).sendKeys("Adding");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(" //button[@type='submit']")).click();
			 Thread.sleep(8000);
		
			 test.log(LogStatus.INFO,"User Creating New Action");
			 ScreenShot("Action");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 test.log(LogStatus.ERROR,"Error in TypeIN method:"+e.getMessage());
			
		}
		 
		// report.endTest(test01);
		 report.endTest(test);
		   

		   report.flush();

		 
		 /*
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[1]/div/input")).sendKeys("Condition_02");
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[2]/div/input")).sendKeys("Add");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='productCall']")).click();
		 
		Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/form/div/div[2]/div[4]/div/button")).click();
	    
	    Thread.sleep(5000);
	   
	   driver.findElement(By.xpath("//button[@value='12236510-f067-11ec-94b5-2398d5746b40']")).click();
			
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@name='confirm']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@placeholder='Enter Confirmation Message']")).sendKeys("Test");
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath(" //button[@type='submit']")).click();
		 Thread.sleep(8000);
		 
		 */
		 
		 
		 
		 
		 
		 
		 
		 /*object*/
		 
		 
		// test02 =report.startTest("Creating New Object","Object") ;
		 
		 Thread.sleep(8000);
		 
		 try {
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[3]/a")).click();

			   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[3]/ul/li[1]/a")).click();
			   Thread.sleep(2000);
			  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input")).sendKeys("Action4 ClickEntity");

			  
			  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/input")).sendKeys("Action4 ClickEntity");
			  Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			   Thread.sleep(8000);
			   test.log(LogStatus.INFO,"User Creating New Object");
			   ScreenShot("Object");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 test.log(LogStatus.ERROR,"Error in TypeIN method:"+e.getMessage());
				
		}
		   
		 //  report.endTest(test02);
		   
		   
		   
		   /*application*/
		   
		   
		   
		 //  test03 =report.startTest("Creating New Application","Application") ;
		   Thread.sleep(8000);
		   
			try {
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[4]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[4]/ul/li[1]/a")).click();
						
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div/div/input")).sendKeys("FLEXTRAN_4");
   Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
   
				 Thread.sleep(8000);
				 test.log(LogStatus.INFO,"User Creating New Application");
				 ScreenShot("Application");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				 test.log(LogStatus.ERROR,"Error in TypeIN method:"+e.getMessage());
			}
		   
		   
			// report.endTest(test03);
		   
		   
		   
			 
			 
		   
		   /*menu*/
		//	 test04 =report.startTest("Creating New Menu","Menu") ;
			 
		   Thread.sleep(8000);
			 try {
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[5]/a")).click();
					

					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[5]/ul/li[1]/a")).click();

					Thread.sleep(2000);
//	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[1]/div/input")).sendKeys("1");
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[2]/div/input")).sendKeys("/Inprogress_transaction4");
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[3]/div/input")).sendKeys("AB");
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[4]/div/input")).sendKeys("Transaction4");
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[5]/div/input")).sendKeys("Inprogress");
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div[2]/div[6]/div/input")).sendKeys("Transaction4 report");
					Thread.sleep(2000);

					 JavascriptExecutor jse = (JavascriptExecutor)driver;
					 jse.executeScript("window.scrollBy(0,550)"); 
					//driver.findElement(By.xpath("//button[@type='reset']")).click();
					
					Thread.sleep(4000);
             driver.findElement(By.xpath("//button[@type='submit']")).click();
             Thread.sleep(8000);

            test.log(LogStatus.INFO,"User Creating New Menu");
            ScreenShot("Menu");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				 test.log(LogStatus.ERROR,"Error in TypeIN method:"+e.getMessage());
			}
				
				

			// report.endTest(test04);
			 
			 
			 
			 
			 
			 
			 
				/*user*/
			 
			// test05 =report.startTest("Creating New User","User") ;
				 Thread.sleep(8000);
				 
				 try {
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[6]/a")).click();
						

						driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[6]/ul/li[1]/a")).click();
						Thread.sleep(2000);
						driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input")).sendKeys("ab4@gmail.com");
						Thread.sleep(2000);
						driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/input")).sendKeys("abcd4");
						driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[3]/div/input")).sendKeys("efg");
						driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[4]/div/input")).sendKeys("758797889");
						driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[5]/div/input")).sendKeys("4r5");
						Thread.sleep(2000);
					//	driver.findElement(By.xpath("//button[@type='reset']")).click();
						
						Thread.sleep(3000);
						driver.findElement(By.xpath("//button[@type='submit']")).click();
						
						Thread.sleep(8000);
						 test.log(LogStatus.INFO,"User Creating New User");
						 ScreenShot("User");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					test.log(LogStatus.ERROR,"Error in TypeIN method:"+e.getMessage());
				}
				
				
				// report.endTest(test05);
				
				
				
				
				/*roles*/
				 
		//		 test06 =report.startTest("Creating New Roles","Roles") ;
				
				 Thread.sleep(9000);
				 
				 try {
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[7]/a")).click();
						
						driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[7]/ul/li[1]/a")).click();
						Thread.sleep(2000);
						driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div/div/input")).sendKeys("Company Branch");
						Thread.sleep(2000);
						//driver.findElement(By.xpath("//button[@type='reset']")).click();
						driver.findElement(By.xpath("//button[@type='submit']")).click();
						Thread.sleep(8000);
						test.log(LogStatus.INFO,"User Creating New Roles");
						 ScreenShot("Roles");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					test.log(LogStatus.ERROR,"Error in TypeIN method:"+e.getMessage());
				}
					 
				// report.endTest(test06);
					
					
				 
				 
				 
				 
					
					/*branch*/
				// test07 =report.startTest("Creating New Branch","Branch") ;
					try {
						Thread.sleep(8000);
                      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[8]/a")).click();
						
						driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[8]/ul/li[1]/a")).click();
						
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input")).sendKeys("Banglore");
						
						driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/input")).sendKeys("Company8");
						Thread.sleep(2000);
                 //driver.findElement(By.xpath("//button[@type='reset']")).click();
                   Thread.sleep(2000);
						

                driver.findElement(By.xpath("//button[@type='submit']")).click();
						
                    Thread.sleep(8000);
                    test.log(LogStatus.INFO,"User Creating New Branch");
                    ScreenShot("Branch");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						test.log(LogStatus.ERROR,"Error in TypeIN method:"+e.getMessage());
					}
				
					
					// report.endTest(test07);
					
					
			
					 
					 
					 
			/*complex*/
			
				//	 test08 =report.startTest("Creating New Complex","Complex") ;
			Thread.sleep(8000);
			 try {
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[9]/a")).click();
					
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[9]/ul/li[1]/a")).click();
					
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input")).sendKeys("Get_Customer04");
					
				 Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[3]/div/input")).sendKeys("Get_Customer04");
				// Thread.sleep(2000);
				// driver.findElement(By.xpath("//button[@type='reset']")).click();
				Thread.sleep(2000);
					 driver.findElement(By.xpath("//button[@type='submit']")).click();
				 
						Thread.sleep(8000);
						test.log(LogStatus.INFO,"User Creating New Complex");
						 ScreenShot("Complex");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				test.log(LogStatus.ERROR,"Error in TypeIN method:"+e.getMessage());
			}
	//		 report.endTest(test08);
			 
			 
			 
			 
			 
			 
			 
			 
			 /*simple*/
		//	 test09 =report.startTest("Creating New Simple","Simple") ;
			 Thread.sleep(8000);
			 
				try {
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[10]/a")).click();
					
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[10]/ul/li[1]/a")).click();
     	Thread.sleep(1000);
          driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input")).sendKeys("Get04");

              //Thread.sleep(2000);
          //		 driver.findElement(By.xpath("//input[@placeholder='Enter status']")).clear();

        Thread.sleep(2000);
         driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(8000);
          //driver.findElement(By.xpath("//button[@type='reset']")).click();
           test.log(LogStatus.INFO,"User Creating New Simple");
           ScreenShot("Simple");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					test.log(LogStatus.ERROR,"Error in TypeIN method:"+e.getMessage());
				}

	        
	        
			//	 report.endTest(test09);
	        
	        
	        
	        
	        

			/*History*/
	 
		Thread.sleep(8000);
		 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[11]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[11]/ul/li/a")).click();
         Thread.sleep(3000);

			  






			/*Transaction*/


    //  test10=report.startTest("Creating New Transaction","Transaction") ;
       try {
		Thread.sleep(8000);

		   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[12]/a")).click();
		    Thread.sleep(3000);
		     driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[12]/ul/li/a")).click();
		   Thread.sleep(3000);
		   Thread.sleep(3000); 

		  driver.findElement(By.xpath("//body//div[@id='root']//div[@role='presentation']//div[@role='presentation']//div[@role='presentation']//div[1]//pre[1]")).click();
		   Thread.sleep(3000); 

		   Thread.sleep(3000); 
		  driver.findElement(By.xpath("//button[normalize-space()='Refresh']")).click();
		  Thread.sleep(3000); 
		 driver.findElement(By.xpath("//button[normalize-space()='Send']")).click();

		 Thread.sleep(3000); 
		 driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
			Thread.sleep(8000);
		 test.log(LogStatus.INFO,"User Creating New Transaction");
		 ScreenShot("Transaction");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		test.log(LogStatus.ERROR,"Error in TypeIN method:"+e.getMessage());
	}

     //  report.endTest(test10);
       

       
       
       
       
/*customer*/
  //     test11=report.startTest("Creating New Customer","Customer") ;
   try {
	Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[13]/a")).click();
		
	   Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/ul/li[13]/ul/li/a")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input")).sendKeys("lmn@gmail");
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/input")).sendKeys("Aqr");
	   Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[3]/div/input")).sendKeys("op");
	  Thread.sleep(1000);
	   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]/div[1]/div/div/div[2]/div[4]/div/input")).sendKeys("12344");
	   Thread.sleep(2000);
		
		
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(9000);
	 test.log(LogStatus.INFO,"User Creating New Customer");
	 ScreenShot("Action");
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	test.log(LogStatus.ERROR,"Error in TypeIN method:"+e.getMessage());
}
	
   report.endTest(test);
   

   report.flush();



			
}


	public static void ScreenShot(String findname)throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("./Screenshot/"+findname+".png");
		FileUtils.copyFile(src, des);
		test.log(LogStatus.INFO,test.addScreenCapture(des.getAbsolutePath()));
	}

	

}



