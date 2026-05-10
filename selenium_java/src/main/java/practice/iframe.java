package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoqa.com/frames");

//WebElement iframe = driver.findElement(By.cssSelector("iframe#frame1"));
driver.switchTo().frame(0);
String frame_1 = driver.findElement(By.id("sampleHeading")).getText();
System.out.println(frame_1);
driver.switchTo().defaultContent();
String mainpage = driver.findElement(By.cssSelector("div#framesWrapper")).getText();
System.out.println(mainpage);
driver.switchTo().frame(1);
String frame_2 = driver.findElement(By.id("sampleHeading")).getText();
System.out.println(frame_2);
driver.quit();

	}

}
