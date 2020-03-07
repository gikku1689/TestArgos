package pages;

import driverfactory.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Resultspage extends Driver {

    public String getSearchTitle()
    {
        return driver.findElement(By.className("search-title__term")).getText();

    }
}