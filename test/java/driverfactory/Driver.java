package driverfactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class Driver
{
    public static WebDriver driver;

     public String Browser ="";

     public void openbrowser()
     {
         switch (Browser)
         {
             case "ie":
                 WebDriverManager.iedriver().setup();
                 driver=new InternetExplorerDriver();
                 break;
             case "firefox":
                 WebDriverManager.firefoxdriver().setup();
                 driver=new FirefoxDriver();
                 break;
             default:
                 WebDriverManager.chromedriver().setup();
                 driver=new ChromeDriver();
         }


     }
     public void maxibroweser()
     {
         driver.manage().window().maximize();
     }
     public void closebrowser()
     {
         driver.quit();
     }
     public void navigateto(String url)
     {
         driver.get(url);
     }
    public void applyImpcitWait() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }



}
