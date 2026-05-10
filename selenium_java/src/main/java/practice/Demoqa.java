package practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class Demoqa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 driver.get("https://demoqa.com/browser-windows");
 
 String mainwindow = driver.getWindowHandle();
 System.out.println(mainwindow);
 
 Set<String> allwindowhandles = driver.getWindowHandles();
 System.out.println("count of window : "+allwindowhandles.size());
 //open a child window
 driver.findElement(By.id("windowButton")).click();
 //count of windows,changed from 1 to 2
 Set<String> newAllwindowhandles = driver.getWindowHandles();
 System.out.println("count of window : "+newAllwindowhandles.size());
 
 //get detail of parent window
 mainwindow = driver.getWindowHandle();
 System.out.println("parenthandle: "+mainwindow); 
 
 Iterator<String> iterator = newAllwindowhandles.iterator();
  mainwindow=iterator.next();
 String childwindow=iterator.next();
 System.out.println("parentwindow: "+mainwindow);
 System.out.println("childwindow: "+childwindow);

driver.switchTo().window(childwindow);

WebElement text = driver.findElement(By.id("sampleHeading"));
System.out.println("child_title : "+text.getText());

driver.close();

driver.switchTo().window(mainwindow);
System.out.println("parent title"+ driver.getTitle());

driver.quit();
	}

}
