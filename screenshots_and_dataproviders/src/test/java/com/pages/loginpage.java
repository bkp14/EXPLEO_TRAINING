package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginpage {
	 WebDriver driver;
	@BeforeMethod
	public void setup() {
		
		  driver.manage().window().maximize();
		  driver.get("https://www.demoblaze.com/");
		  driver.findElement(By.xpath("//a[text()='Log in']"));
		  }
  @Test
  public void validlogin () {
	  driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("admin");
	  driver.findElement(By.xpath("//button[text()='Log in']")).click();
 
  }
  @Test
  public void invalidlogin () {
	  driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("admn");
	  driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("admin");
	  driver.findElement(By.xpath("//button[text()='Log in']")).click();
 
  }
  @AfterTest
  public void close() {
	  driver.quit();
  }
}
