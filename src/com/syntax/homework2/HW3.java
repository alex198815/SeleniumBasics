package com.syntax.homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://18.232.148.34/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[id='btnLogin']")).click();
        Thread.sleep(2000);
        WebElement errorMessage= driver.findElement(By.cssSelector("span[id= 'spanMessage']"));
        boolean isDisplayed= errorMessage.isDisplayed();
        System.out.println(isDisplayed);
        driver.quit();
    }
}

