package org.example.ex02_20Dec2024;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium10 {

    @Test
    public void testMethod01(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addExtensions(new File("src/test/java/org/example/ex02_20Dec2024/Adblock.crx"));

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/");

    }

}