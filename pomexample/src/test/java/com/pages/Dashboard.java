package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Dashboard {
 WebDriver driver;
 By dashboardpagetitle = By.xpath("//h6[text()='Dashboard']");
 
 public Dashboard(WebDriver driver) {
	 this.driver=driver;
 }
 
 public String getHomePageText() {
	 return driver.findElement(dashboardpagetitle).getText();
 }
}
