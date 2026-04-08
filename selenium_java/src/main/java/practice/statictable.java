package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class statictable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://omayo.blogspot.com/#");
		 
		List <WebElement> table = driver.findElements(By.xpath("//table[@id='table1']//tr"));
		int r=table.size();
		System.out.println("no.of rows: "+table.size());
		List <WebElement> table1 = driver.findElements(By.xpath("//table[@id='table1']//th"));
		int c=table1.size();
		System.out.println("no.of columns: "+table1.size());
		WebElement data ;
		for(int i=1;i<=r;i++) {
			
			for(int j=1;j<=c;j++) {
				if(i==1) {
					data=driver.findElement(By.xpath("//table[@id='table1']//thead//tr//th["+j+"]"));
					System.out.print(data.getText()+" ");

				}
				else {
				data=driver.findElement(By.xpath("//table[@id='table1']//tbody//tr["+(i-1)+"]//td["+j+"]"));
				System.out.print(data.getText()+" ");
				}
			}
			System.out.println();
		}
	}

}
