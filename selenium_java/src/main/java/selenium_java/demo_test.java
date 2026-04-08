package selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class demo_test {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in");

        WebElement search = driver.findElement(By.name("twotabsearchtextbox"));
        search.sendKeys("laptop", Keys.ENTER);

        System.out.println("Page title is: " + driver.getTitle());

        driver.quit(); // better than close()
    }
}