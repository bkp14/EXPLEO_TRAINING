package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot_withcondn {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.selenium.dev/");
try {
WebElement logo=driver.findElement(By.cssSelector("svg#Layer_1"));
File source = ((TakesScreenshot) logo).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(source, new File("./SeleniumScreenshots/logo"+System.currentTimeMillis()+".png"));
}
catch(Exception e) {
	System.out.println(e.getMessage());
}
System.out.println("screenshot of logo is acquired");
driver.quit();
	}
	

}
