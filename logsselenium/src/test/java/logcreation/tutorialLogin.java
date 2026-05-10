package logcreation;


import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import logcreation.validData;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

@Listeners(DemoListener.class)
public class tutorialLogin extends BaseTest {

    private static Logger log = LogManager.getLogger(tutorialLogin.class);

    @Test(dataProvider = "validData", dataProviderClass = validData.class)
    public void valid_login(String username, String password) {

        d.findElement(By.xpath("//span[@class='caret']")).click();
        d.findElement(By.linkText("Login")).click();

        d.findElement(By.name("email")).sendKeys(username);
        d.findElement(By.name("password")).sendKeys(password);
        d.findElement(By.xpath("//input[@value='Login']")).click();

        String expected = "Edit your account information";
        String actual = d.findElement(By.linkText(expected)).getText();

        Assert.assertEquals(actual, expected);
        log.info("Login successful");
    }

    @Test(dataProvider = "InvalidData", dataProviderClass = validData.class)
    public void invalid_login(String username, String password) {

        d.findElement(By.xpath("//span[@class='caret']")).click();
        d.findElement(By.linkText("Login")).click();

        d.findElement(By.name("email")).sendKeys(username);
        d.findElement(By.name("password")).sendKeys(password);
        d.findElement(By.xpath("//input[@value='Login']")).click();

        String expected = "Warning: No match for E-Mail Address and/or Password.";
        String actual = d.findElement(By.cssSelector(".alert-danger")).getText();

        Assert.assertTrue(actual.contains(expected));
    }

    @Parameters({"ValidKeyword"})
    @Test
    public void searchValid(String keyword) {

        WebElement search = d.findElement(By.name("search"));
        search.sendKeys(keyword);
        search.sendKeys(Keys.ENTER);

        Assert.assertEquals("iMac",
                d.findElement(By.linkText("iMac")).getText());

        log.info("Search successful");
    }

    @Parameters({"InvalidKeyword"})
    @Test
    public void searchInvalid(String keyword) {

        WebElement search = d.findElement(By.name("search"));
        search.sendKeys(keyword);
        search.sendKeys(Keys.ENTER);

        String expected = "There is no product that matches the search criteria.";
        String actual = d.findElement(By.xpath("//p[contains(text(),'no product')]")).getText();

        Assert.assertTrue(actual.contains(expected));
    }
}
