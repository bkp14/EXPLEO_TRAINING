package automation_with_testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class assert_site {
  
	 WebDriver driver ;
	 @BeforeMethod
	public void setup() {
	driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.get("https://www.demoblaze.com/");
	}
	
@Test
public void validlogincheck() {
	 
	   
	    driver.findElement(By.cssSelector("a.nav-link[data-target='#logInModal']")).click();
	   
	   WebElement user =  driver.findElement(By.cssSelector("input#loginusername"));
	   user.sendKeys("admi");
	   WebElement password =     driver.findElement(By.cssSelector("input#loginpassword"));
	   password.sendKeys("admin");

	   driver.findElement(By.xpath("//button[text()='Log in']")).click();
	   
	   WebElement value = driver.findElement(By.xpath("//a[text()='Welcome admin']"));
	   String s =value.getText();
	  Assert.assertTrue(s.equals("Welcome admin"));
	   
	   System.out.println("Login successful");
	   
	 
}
@AfterMethod
public void close() {
	driver.quit();
}


}
