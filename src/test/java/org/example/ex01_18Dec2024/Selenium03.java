package org.example.ex01_18Dec2024;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Selenium03 {

    @Test
    public void test_selenium(){

        //webdriver heriechy
        //Concept of dynamic dispatch
//        WebDriver driver = new EdgeDriver();
//        WebDriver driver1 = new FirefoxDriver();
//        WebDriver driver2 = new ChromeDriver();


//        SearchContext driver = new ChromeDriver();
//        WebDriver driver1 = new ChromeDriver();
//        RemoteWebDriver driver2 = new ChromeDriver();


//        Scenerio 1 : Do you want to run on chrome or Edge ?

        ChromeDriver driver = new ChromeDriver();

//        Scenerio 2 : Do you want to run on chrome then change to Edege?

        WebDriver driver1 = new ChromeDriver();
       WebDriver driver3 = new EdgeDriver();


//        Scenerio 3 : Do you want to run TC on Multiple browsers ?
        RemoteWebDriver driver2 = new ChromeDriver();




    }
}
