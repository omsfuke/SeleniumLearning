package org.example.ex04_30Dec2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Selenium016_Assignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.idrive360.com/enterprise/login");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usr = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));


        usr.sendKeys("augtest_040823@idrive.com");

        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("123456");

        driver.findElement(By.xpath("//button[@id='frm-btn']")).click();


      //  driver.findElement(By.xpath("//span[normalize-space()='Your free trial has expired']")).getText()
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[normalize-space()='Your free trial has expired']")));
        Assert.assertEquals(driver.getTitle(),"Your free trial has expired");
        driver.close();

    }
}
