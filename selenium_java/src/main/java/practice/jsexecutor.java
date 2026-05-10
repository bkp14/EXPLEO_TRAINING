package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
JavascriptExecutor js = (JavascriptExecutor)driver;
String domaain = js.executeScript("return document.domain").toString();
System.out.println(domaain);


WebElement element1 = (WebElement) js.executeScript(
	    "return document.querySelector(\"input[name='name'][maxlength='10']\");");
	}

}
