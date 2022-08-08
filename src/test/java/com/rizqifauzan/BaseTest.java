package com.rizqifauzan;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;
    WebDriverWait w;

    @Before
    public void openWebBrowser(){
        System.out.println("Before Test");
        // lokasi web driver
        System.setProperty("webdriver.chrome.driver", "D:\\webDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        // open web tujuan : midtrans
        driver.get("https://demo.midtrans.com/#");
        driver.manage().window().maximize();
        //w = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    @After
    public void closeWebBrowser(){
        //driver.quit();
    }

}
