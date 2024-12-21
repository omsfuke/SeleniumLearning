package org.example.ex01_18Dec2024;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium01 {

    @Test
    public void test_Selenium(){

//        FirefoxDriver driver = new FirefoxDriver();
//        driver.get("https://app.vwo.com/#/login");

//        ChromeDriver driver = new ChromeDriver();

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.quit();


    }
}
