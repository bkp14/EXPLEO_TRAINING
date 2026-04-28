package logcreation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected static WebDriver d;

    @BeforeMethod
    public void beforeTest() {
        d = new ChromeDriver();
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        d.get("https://tutorialsninja.com/demo/index.php");
    }

    @AfterClass
    public void afterTest() {
        if (d != null) {
            d.quit();
        }
    }
}