package com.rizqifauzan.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumHelper {

    public WebDriver driver;

    public SeleniumHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void setText(By by, String text){
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }
}
