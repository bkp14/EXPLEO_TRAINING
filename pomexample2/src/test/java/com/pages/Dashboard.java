package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Dashboard extends BasePage {

 
 public Dashboard(WebDriver driver) {
	 super(driver);
 }
 @FindBy(xpath="//h6[text()='Dashboard']")
 public WebElement dashboardpagetitle;
 
 public String getHomePageText() {
	 return dashboardpagetitle.getText();
 }
}
