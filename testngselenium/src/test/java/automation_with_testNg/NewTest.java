package automation_with_testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	 WebDriver driver ;
	 @BeforeMethod(dependsOnGroups={"smoke","aegression"})
	public void setup() {
	driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.get("https://www.demoblaze.com/");
	}
	
  @Test(groups="smoke")
  public void validlogincheck() {
	 
	   
	    driver.findElement(By.cssSelector("a.nav-link[data-target='#logInModal']")).click();
	   
	   WebElement user =  driver.findElement(By.cssSelector("input#loginusername"));
	   user.sendKeys("admin");
	   WebElement password =     driver.findElement(By.cssSelector("input#loginpassword"));
	   password.sendKeys("admin");

	   driver.findElement(By.xpath("//button[text()='Log in']")).click();
	   
	   WebElement value = driver.findElement(By.xpath("//a[text()='Welcome admin']"));
	   String s =value.getText();
	   if(s.equals("Welcome admin")) {
		   System.out.println(s);
		   System.out.println("login successful");
		   

	   }
	   else {
		   System.out.println("login not successful");

	   }
	 
  }
  @Test(groups="aegression")
  public void invalidtest() {
	  driver.findElement(By.cssSelector("a.nav-link[data-target='#logInModal']")).click();

	    driver.findElement(By.id("loginusername")).sendKeys("admn");
	    driver.findElement(By.id("loginpassword")).sendKeys("admi12n");

	    driver.findElement(By.xpath("//button[text()='Log in']")).click();

	  
  }

  @Test(groups="aegression")
  public void invalidtest1() {
	  driver.findElement(By.cssSelector("a.nav-link[data-target='#logInModal']")).click();

	    driver.findElement(By.id("loginusername")).sendKeys("admddn");
	    driver.findElement(By.id("loginpassword")).sendKeys("adi12n");

	    driver.findElement(By.xpath("//button[text()='Log in']")).click();

	    
  }

@Test(dependsOnGroups={"smoke"})
public void groupscheck(){
	System.out.println("resgression is checked");
}
  @AfterMethod(dependsOnGroups={"smoke","aegression"})
  public void afterTest() {
	  driver.quit();
  }
  
  
}
