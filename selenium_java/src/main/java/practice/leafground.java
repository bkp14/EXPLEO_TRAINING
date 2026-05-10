package practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class leafground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://leafground.com/window.xhtml");
		 
		
		 driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		 Set<String> newAllwindowhandles = driver.getWindowHandles();
    
		 Iterator<String> iterator = newAllwindowhandles.iterator();
		 String mainwindow=iterator.next();
		 String childwindow=iterator.next();
		 for(String i: newAllwindowhandles) {
			 if(!(i.equals(mainwindow))) {
			driver.switchTo().window(i);
			driver.close();
			 }
		 }

	}

}

/*launch new browser and open 
 * switch iframne use any locate
 * */
