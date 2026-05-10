package practice;

import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.get("https://leafground.com/select.xhtml;jsessionid=node0p94dc2jp47o1wf7r2k2pv7tb14556579.node0");
		   WebElement ui = driver.findElement(By.className("ui-selectonemenu"));
		   Select selectob = new Select(ui);
		   List <WebElement> list = selectob.getOptions();
		   System.out.println("dropdown size : "+list.size());
		   
		   for(WebElement i: list) {
			   System.out.println(i.getText());
		   }
		   Boolean multiple = selectob.isMultiple();
		   System.out.println("the mul options avail: "+multiple);
		   Thread.sleep(2000);

		   selectob.selectByIndex(3);
		   Thread.sleep(2000);
		   selectob.selectByContainsVisibleText("Selenium");

	}

}
