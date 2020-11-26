package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        String title = driver.getTitle();
        if (title.equalsIgnoreCase("Web Orders")) {
            System.out.println("It is the right title");
        } else {
            System.out.println("Wrong title");

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

            Thread.sleep(3000);
            driver.findElement(By.id("ctl00_logout")).click();
            Thread.sleep(3000);
            driver.quit();

        }
    }
}
