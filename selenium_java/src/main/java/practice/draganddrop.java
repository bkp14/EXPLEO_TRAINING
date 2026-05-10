package practice;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://leafground.com/drag.xhtml");
		Actions act=new Actions(driver);
		WebElement drag=driver.findElement(By.xpath("//div[@id='form:drag_content']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='form:drop']"));

		act.dragAndDrop(drag,drop).perform();
	}

}
