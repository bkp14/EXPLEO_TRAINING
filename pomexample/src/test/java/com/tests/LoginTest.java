package com.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.LoginPage;

public class LoginTest extends BaseTest {
    public static Logger log = LogManager.getLogger(LoginTest.class);

  @Test(priority=0)
  public void LoginTest() {
	  objlogin = new LoginPage(driver);
	  log.info("loin page title has been fetched");
	  String loginpageTitle =objlogin.getLoginTitle();
	  log.info("login page title is asserted");
	  Assert.assertTrue(loginpageTitle.contains("Login"));
  }
}
