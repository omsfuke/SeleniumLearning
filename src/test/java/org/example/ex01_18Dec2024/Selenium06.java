package org.example.ex01_18Dec2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium06 {
    public static void main(String[] args) {

        WebDriver driver  = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
    }
}
