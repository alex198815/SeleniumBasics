package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://syntaxtechs.com/selenium-practice/index.php");

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[id='btn_basic_example']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#basic > div > a:nth-child(1)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[id^='user']")).sendKeys(" Selenium ");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#get-input > button")).click();
        driver.quit();
    }
}
