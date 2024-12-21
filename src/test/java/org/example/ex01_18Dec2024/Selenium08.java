package org.example.ex01_18Dec2024;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium08 {

    @Test
    public void testMethod01(){

        //EdgeOptions -> It will help you to set the browser
        // options to browser
        //window - sizee
        //headless mode - if not UI  THEN fAST EXECUTION
        // Full ui mode - default - UI BROWSER
        //incognito mode - switcvh
        //add extentions -

        EdgeOptions edgeoptions = new EdgeOptions();
//        edgeoptions.addArguments("--start-maximized");
        edgeoptions.addArguments("--window-size=800,600");
        edgeoptions.addArguments("--headless");
        edgeoptions.addArguments("--incognito");

        EdgeDriver driver = new EdgeDriver(edgeoptions);
        driver.get("https://app.vwo.com/#/login");

    }
}
