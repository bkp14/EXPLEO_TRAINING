package practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
 Select ob = new Select(driver.findElement(By.id("search")));
 //<option value="search-alias=stripbooks">Books</option>
 ob.selectByVisibleText("Books");
 ob.selectByIndex(0);
 ob.selectByValue("search-alias=stripbooks");//value in option tag
 List <WebElement> s=ob.getOptions();
 System.out.println(s.size());
 for(WebElement options:s) {
	 System.out.println(options.getText());
 }
	}
	

}
