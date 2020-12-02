package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {


        public static void main (String[]args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("http://syntaxtechs.com/selenium-practice/index.php");
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[@id = 'btn_basic_example']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"basic\"]/div/a[1]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id = 'user-message']")).sendKeys("Amazing");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[@onclick='showInput();']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("8");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("21");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@onclick='return total()']")).click();
            Thread.sleep(1000);
            driver.quit();
        }
    }

