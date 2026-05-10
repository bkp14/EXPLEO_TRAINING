package log;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testlogcreation {

    public static Logger log = LogManager.getLogger(testlogcreation.class);
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        log.info("Launching browser");
        driver = new ChromeDriver();

        log.debug("Maximizing window");
        driver.manage().window().maximize();

        log.debug("Setting implicit wait");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        log.info("Opening application URL");
        driver.get("https://www.demoblaze.com/");
    }

    @Test
    public void validlogincheck() {

        log.info("Starting login test");

        try {
            log.debug("Clicking login button");
            driver.findElement(By.cssSelector("a.nav-link[data-target='#logInModal']")).click();

            log.debug("Entering username");
            WebElement user = driver.findElement(By.cssSelector("input#loginusername"));
            user.sendKeys("admin");

            log.debug("Entering password");
            WebElement password = driver.findElement(By.cssSelector("input#loginpassword"));
            password.sendKeys("admin");

            log.debug("Clicking login submit button");
            driver.findElement(By.xpath("//button[text()='Log in']")).click();

            log.info("Verifying login success");
            WebElement value = driver.findElement(By.xpath("//a[text()='Welcome admin']"));
            String s = value.getText();

            if (s.equals("Welcome admin")) {
                log.info("Login successful");
            } else {
                log.warn("Login text mismatch: " + s);
            }

            Assert.assertEquals(s, "Welcome admin");

        } catch (Exception e) {
            log.error("Test failed due to exception", e);
            throw e;
        }
    }

    @AfterMethod
    public void close() {
        log.info("Closing browser");
        driver.quit();
    }
}