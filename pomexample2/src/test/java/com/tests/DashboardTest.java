package com.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.Dashboard;
import com.pages.LoginPage;

public class DashboardTest extends BaseTest {
    public static Logger log = LogManager.getLogger(DashboardTest.class);

@Test	
  public void DashboardTest() {
		objlogin = new LoginPage(driver);
		log.info("login credentials have been passed");
		objlogin.login("Admin","admin123" );
		Dashboard objdashboard = new Dashboard(driver);
		String actual = objdashboard.getHomePageText();
		String expect = "Dashboar";
		log.info("asserted actual value and expected value");
		Assert.assertEquals(actual, expect);

  }
}
