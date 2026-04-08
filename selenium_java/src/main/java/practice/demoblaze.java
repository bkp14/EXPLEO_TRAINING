package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   driver.get("https://www.demoblaze.com/");
   
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
   driver.quit();
	}

}
