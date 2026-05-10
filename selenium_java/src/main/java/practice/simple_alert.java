package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simple_alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://omayo.blogspot.com/#");
		 
		 WebElement simple = driver.findElement(By.cssSelector("input#alert1"));
		 simple.click();
		 Alert alert = driver.switchTo().alert();
		
		 
		 System.out.println(alert.getText());
		 alert.dismiss();
	}

}
