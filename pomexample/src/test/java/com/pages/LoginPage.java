package com.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPage {

	WebDriver driver;
	By title = By.xpath("//h5[text()='Login']");
	By username = By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@name='password']");
	By login = By.xpath("//button[text()=\" Login \"]");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setUserName(String strusername) {
		driver.findElement(username).sendKeys(strusername);
	}

	public void setPassword(String strpassword) {
		driver.findElement(password).sendKeys(strpassword);
	}

	public void clicklogin() {

		driver.findElement(login).click();
	}

	public String getLoginTitle() {
		return driver.findElement(title).getText();
	}

	public void login(String strusername, String strpassword) {
		this.setUserName(strusername);
		this.setPassword(strpassword);
		this.clicklogin();
	}
}
