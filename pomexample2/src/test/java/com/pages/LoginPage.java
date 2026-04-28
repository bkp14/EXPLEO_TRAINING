package com.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginPage extends BasePage {

	WebDriver driver;
	

	public LoginPage(WebDriver driver) {
          super(driver);
	}
    @FindBy(name ="username")
    public WebElement username;
    @FindBy(name ="password")
    public WebElement password;
    @FindBy (xpath="//h5[text()='Login']")
    public WebElement login_text;
    @FindBy(xpath="//button[text()=\" Login \"]")
    public WebElement login;
	
	


	
	public void login(String strusername, String strpassword) {
		username.sendKeys(strusername);
		password.sendKeys(strpassword);
		login.click();
	}
	public String getLoginTitle() {
		return login_text.getText();
	}
}
