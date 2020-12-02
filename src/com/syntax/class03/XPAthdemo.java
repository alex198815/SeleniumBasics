package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPAthdemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Tester");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("test");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[contains(@type,'sub')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='ctl00_logout']")).click();
        Thread.sleep(1000);
        driver.quit();
    }

}

