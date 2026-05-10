package selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
public class relative_locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 
 driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
  WebElement Firstname= driver.findElement(By.xpath("//*[@id=\"post-body-299858861183690484\"]/div/form/div[1]/input[1]"));
  Firstname.sendKeys("Krishna");
  
  WebElement fname_above= driver.findElement(with(By.tagName("input")).above(Firstname));
  
	}

}
