package practice;

import java.util.List;
import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://omayo.blogspot.com/#");
		 
		List <WebElement> table = driver.findElements(By.xpath("//table[@id='table1']/thead//tr//th"));
		 
		for(WebElement heading : table) {
			System.out.println(heading.getText());
		}
	}

}
