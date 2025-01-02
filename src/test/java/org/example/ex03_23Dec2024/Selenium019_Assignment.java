package org.example.ex03_23Dec2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium019_Assignment {

    @Test
    public void testmethod01() throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--maximized-window");

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement link = driver.findElement(By.linkText("Make Appointment"));
        link.click();

        WebElement username = driver.findElement(By.id("txt-username"));
        WebElement password = driver.findElement(By.id("txt-password"));
        WebElement login = driver.findElement(By.id("btn-login"));

        username.sendKeys("John Doe");
        Thread.sleep(3000);
        password.sendKeys("ThisIsNotAPassword");
        Thread.sleep(3000);
        login.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
        driver.quit();

    }
}
