package com.tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.Dashboard;
import com.pages.LoginPage;

public class BaseTest {
    public static Logger log = LogManager.getLogger(BaseTest.class);

	public  WebDriver driver;
  LoginPage objlogin;
  Dashboard objdashboard;
  
@BeforeMethod
  public void setup() {
    log.info("Launching browser");
	  driver = new ChromeDriver();
      log.debug("Maximizing window");

	  driver.manage().window().maximize();
      log.debug("Setting implicit wait");

	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      log.info("Opening application URL");

	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
  }
  @AfterMethod
  
  public void close() {
	  driver.close();
  }
}
