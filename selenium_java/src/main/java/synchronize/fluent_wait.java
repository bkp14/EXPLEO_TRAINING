package synchronize;

import java.time.Duration;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluent_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
		
		  Wait<WebDriver> wait =
			        new FluentWait<>(driver)
			            .withTimeout(Duration.ofSeconds(2))
			            .pollingEvery(Duration.ofMillis(300))
			            .ignoring(ElementNotInteractableException.class);

			    wait.until(
			        d -> {
			          revealed.sendKeys("Displayed");
			          return true;
			        });
	}

}
