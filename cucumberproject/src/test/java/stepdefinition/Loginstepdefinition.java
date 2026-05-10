package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstepdefinition {
WebDriver driver;
public void setup() {
	driver.manage().window().maximize();
	driver.get("https://demoblaze.com/");
}

	@Given("User is on Home Page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		
  driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
driver.findElement(By.xpath("//input[@id=\"loginusername\"]")).sendKeys("admin");
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id=\"loginpassword\"]")).sendKeys("admin");

	}

	@Then("User should be able to login Successfully")
	public void user_should_be_able_to_login_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();

	}



}
