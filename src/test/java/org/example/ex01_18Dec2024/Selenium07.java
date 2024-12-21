package org.example.ex01_18Dec2024;

import org.openqa.selenium.edge.EdgeDriver;

import javax.swing.*;

public class Selenium07 {

    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.quit();
    }
}
