package synchronize;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class explicit_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
  driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
  
  driver.findElement(By.id("reveal")).click();
  WebElement data = wait.until(
		    ExpectedConditions.visibilityOfElementLocated(By.id("revealed"))
		);
  data.sendKeys("krishna");
 System.out.println(data.getAttribute("value"));


  //WebElement wait = wait.until()
	}

}
