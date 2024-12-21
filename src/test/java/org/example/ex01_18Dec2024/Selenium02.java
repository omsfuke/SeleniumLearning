package org.example.ex01_18Dec2024;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium02 {

    @Test
    public void test_Selenium(){

        //selenium 3
       // System.setProperty("webdriver.gecko.driver","path_to_driver");

        //selenium 4
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com/#/login");
    }
}
