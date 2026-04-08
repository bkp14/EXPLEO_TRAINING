package selenium_java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
public class linkedin_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 
 driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
 WebElement email = driver.findElement(By.cssSelector("input#username"));
 email.sendKeys("prasathkrishna002@gmail.com");
 
 WebElement password= driver.findElement(By.cssSelector("input#password"));
 password.sendKeys("Shingekinokyojin@4");
 
 WebElement signin = driver.findElement(By.cssSelector("button[type^=sub]"));
 signin.click();
 
 WebElement name = driver.findElement(By.cssSelector("._3d498c28._994ab483._215cc371._00d6c8f2.c404bb8a.d443cf91.d2a74372._18e3eda6._6e3e183c"));
 String s = name.getText();
 if(s.equals("B.krishna prasath")) {
	 System.out.println("login successful");
 }
 else {
	 System.out.println("failed");
 }
 
		 }

}
