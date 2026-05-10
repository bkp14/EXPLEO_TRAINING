package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prompt_alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://omayo.blogspot.com/#");
		 
		 WebElement simple = driver.findElement(By.cssSelector("input#prompt"));
		 simple.click();
		 Alert alert = driver.switchTo().alert();
		 alert.sendKeys("hi mate");
		 Thread.sleep(3000);
	System.out.println(alert.getText());	 
		 alert.accept();

	}

}
