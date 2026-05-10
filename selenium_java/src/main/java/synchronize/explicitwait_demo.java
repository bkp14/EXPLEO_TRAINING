package synchronize;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
public class explicitwait_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");

  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
  
  
//  WebElement bt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timerButton")));
 // bt.click();
  
  WebElement bt1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("alert2")));
  bt1.click();
  
  
	}
	
	

}
