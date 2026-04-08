package synchronize;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_wait_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
  
  driver.findElement(By.cssSelector("input#adder")).click();
  
  

  WebElement box = driver.findElement(By.className("redbox"));
  String s = box.getCssValue("padding");
  System.out.println(s);
  
	}

}
