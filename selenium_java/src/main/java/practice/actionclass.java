package practice;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class actionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://omayo.blogspot.com/");
		//WebElement blog = driver.findElement(By.cssSelector("span#blogsmenu"));
		 Actions act = new Actions(driver);
		 
		/* act.moveToElement(blog).perform();
			WebElement option = driver.findElement(By.xpath("//span[text()='SeleniumByArun']"));
			act.moveToElement(option).click().build().perform();

			*/
		//	WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
			//act.contextClick(search).perform();
			
			WebElement dc = driver.findElement(By.xpath("//button[text()=' Double click Here   ']"));
			act.doubleClick(dc).perform();

	}

}
