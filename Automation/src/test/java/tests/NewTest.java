package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	static WebDriver driver;
  @Test
  public void login() throws InterruptedException  {
	  System.setProperty("webdriver.chrome.driver", ".\\exefiles\\geckodriver.exe");  
	     
      WebDriver driver = new FirefoxDriver();
//      driver.manage().window().maximize();
    
     driver.get("Rest Call.com");
      driver.get("https://google.com");
  }}
      
      
	  
	  
  /*}
  @Test(priority = 1 )
  public void dropdownSelect() throws InterruptedException  {
	  
	  driver.findElement(By.id("exampleInputEmail1")).sendKeys("testing@istarindia.com");
      driver.findElement(By.id("exampleInputPassword1")).sendKeys("test123");
	  driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/form/button")).click();
	  Thread.sleep(2000);
	  Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:4200/#/dashboard");
	  Thread.sleep(2000);
	 
	  
	  
	  
	    }	

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }}
*/