package practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selct_bystoreinlist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://leafground.com/select.xhtml;jsessionid=node0p94dc2jp47o1wf7r2k2pv7tb14556579.node0");
//WebElement search = driver.findElement(By.cssSelector("li[id='j_idt87:country_0']"));

WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//driver.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete\"]/button")).click();
WebElement kk =driver.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete_input\"]"));
kk.sendKeys("AWS", Keys.ENTER);
driver.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete\"]/button")).click();
List<WebElement> list = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"j_idt87:auto-complete_panel\"]/ul/li")));

for(WebElement i: list) {
	if(i.getText().equals("Playwright")||i.getText().equals("JMeter")) {
		i.click();
		
		Thread.sleep(300);
	}
}
List<String> ll = new ArrayList<>();
for(WebElement i:list ) {
	ll.add(i.getText());
}
Collections.sort(ll);
System.out.println(ll);
	}
 
}
