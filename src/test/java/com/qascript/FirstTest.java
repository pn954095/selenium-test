package com.qascript;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {


    @Test
    public void OpenBrowser()  {
        WebDriver driver;
        // Mac path to chromedriver
        //System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // EC2 Amazon Linux path to chromedriver
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

        // Windows path to Chromedriver
        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        System.out.println("Web Page's Title: " + driver.getTitle());
        Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Google"));
    }


}


