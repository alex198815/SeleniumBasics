package com.syntax.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.findElement(By.id("customer.firstName")).sendKeys("Alex");
        driver.findElement(By.name("customer.lastName")).sendKeys("Kozachok");
        driver.findElement(By.name("customer.address.street")).sendKeys("8888 weclir say");
        driver.findElement(By.id("customer.address.city")).sendKeys("Lorton");
        driver.findElement(By.id("customer.address.state")).sendKeys("VA");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("22079");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("7038666779");
        driver.findElement(By.id("customer.ssn")).sendKeys("555335555");
        driver.findElement(By.name("customer.username")).sendKeys("alex47748");
        driver.findElement(By.id("customer.password")).sendKeys("Koza383838");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Koza383838");
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
        driver.close();


    }
}
