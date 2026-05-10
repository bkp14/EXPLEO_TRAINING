package com.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
	WebDriver driver;
	public void setup() {
		
		  driver.manage().window().maximize();
		  driver.get("https://www.demoblaze.com/");
		  driver.findElement(By.xpath("//a[text()='Log in']"));
		  }
}
