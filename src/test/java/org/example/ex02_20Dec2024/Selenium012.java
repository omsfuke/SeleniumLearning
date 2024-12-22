package org.example.ex02_20Dec2024;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium012 {
    public void testMethod01() throws InterruptedException {
        //kia,creta - Hundai

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.youtube.com/");

        Thread.sleep(5000);
        driver.close();
        // close the current browser window  - not the full browser

        driver.quit();
        // close all the windows session - Null



    }
}
