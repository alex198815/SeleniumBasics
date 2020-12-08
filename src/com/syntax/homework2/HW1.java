package com.syntax.homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://18.232.148.34/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Hum@nhrm123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
        Thread.sleep(2000);
        WebElement isLogoExist= driver.findElement(By.cssSelector("img[alt='OrangeHRM']"));
        boolean isDisplayed= isLogoExist.isDisplayed();
        System.out.println(isDisplayed);
        driver.quit();
    }
}


