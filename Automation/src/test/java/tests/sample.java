package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sample {  
    private static String userName = "testing@istarindia.com" ;
    private static String password = "test123" ;

    public static void main(String[] args) throws IOException{
       String chromeDriverPath = ".\\exefiles\\chromedriver.exe" ;
       System.setProperty("webdriver.chrome.driver", chromeDriverPath);
       ChromeOptions options = new ChromeOptions();
       options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080","--ignore-certificate-errors", "--silent");
       WebDriver driver = new ChromeDriver(options);

      // Get the login page
      driver.get("https://sales.talentify.in/#/login");
   
      // Search for username / password input and fill the inputs
      driver.findElement(By.id("exampleInputEmail1")).sendKeys(userName);
      driver.findElement(By.id("exampleInputPassword1")).sendKeys(password);

      // Locate the login button and click on it
      driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/form/button")).click();

      if(driver.getCurrentUrl().equals("")){
           System.out.println("Incorrect credentials");
           driver.quit();
           System.exit(1);
      }else{
           System.out.println("Successfuly logged in");
           
           System.out.println("Sustem is seccussfully loged into the account");
      }
      File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screenshotFile, new File("C:\\screenshots"));
        
        // Logout
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
        driver.findElement(By.xpath("//*[@id=\"dropdownMenu2\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div/div/div/button[2]")).click();
       thread.sleep(2000);
    driver.quit();
   }
}
