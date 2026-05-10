package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contacttable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		WebElement user= driver.findElement(By.cssSelector("input#email"));
		user.sendKeys("demouser@gmail.com");
		
		WebElement user1= driver.findElement(By.cssSelector("input#password"));
		user1.sendKeys("1234567");
		
		WebElement submit = driver.findElement(By.cssSelector("button#submit"));
		submit.click();
		List <WebElement> tabler = driver.findElements(By.xpath("//table[@id='myTable']//tr"));
		int r = tabler.size();
		List <WebElement> tablec = driver.findElements(By.xpath("//table[@id='myTable']//tr[@class]//td"));
		int c = tablec.size();
		System.out.println(c);
		WebElement data ;

	for(int i=1;i<=r;i++) {
			
			for(int j=1;j<=c-1;j++) {
				if(i==1) {
					data=driver.findElement(By.xpath("//table[@id='myTable']//thead//tr//th["+j+"]"));
					System.out.print(data.getText()+" ");

				}
				else {
					
				data=driver.findElement(By.xpath("//table[@id='myTable']//tr[@class]//td["+(j+1)+"]"));
				System.out.print(data.getText()+" ");
				}
			}
			System.out.println();
		}
	


		
	}

}
