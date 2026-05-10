package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class webelementactions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://omayo.blogspot.com/#");

Actions act = new Actions(driver);

WebElement link = driver.findElement(By.linkText("compendiumdev"));
act.moveToElement(link).keyDown(Keys.CONTROL).click().keyUp(Keys.UP).build().perform();
String parentwindow=driver.getWindowHandle();
Set<String> windowhandle = driver.getWindowHandles();

for(String handles:windowhandle) {
	driver.switchTo().window(handles);
}
Thread.sleep(3000);
System.out.println("child window is :"+windowhandle);
driver.switchTo().window(parentwindow);

}

}
