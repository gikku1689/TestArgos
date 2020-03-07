package pages;

import driverfactory.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Homepage extends Driver
{
    public void dosearch(String searchterm)
    {
        String searchitem ="adidas";
      driver.findElement(By.cssSelector("#searchTerm")).sendKeys(searchitem);
      driver.findElement(By.cssSelector("#searchTerm")).sendKeys(Keys.ENTER);
    }
    public String getcurrenturl()
    {
        return driver.getCurrentUrl();
    }
}
