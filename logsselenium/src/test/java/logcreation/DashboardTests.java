package logcreation;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

@Listeners(DemoListener.class)
public class DashboardTests extends BaseTest {

    @Test(priority = 1)
    public void loginTest() {

        d.findElement(By.xpath("//span[@class='caret']")).click();
        d.findElement(By.linkText("Login")).click();

        d.findElement(By.name("email")).sendKeys("krishna@gmail.com");
        d.findElement(By.name("password")).sendKeys("Kiot1234");
        d.findElement(By.xpath("//input[@value='Login']")).click();

        String title = d.getTitle();

        Assert.assertTrue(title.contains("Account") || title.contains("My Account"));
    }
}