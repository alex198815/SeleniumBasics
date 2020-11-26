package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        if(title.equalsIgnoreCase("Facebook - Log In or Sign Up")) {
            System.out.println("Title is right");
        }else{
            System.out.println("Title is WRONG");
        }


        }
    }

