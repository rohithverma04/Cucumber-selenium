package stepdefinationp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driverinitial.driverinit;
import pageobjects.flipkartpageobj;

public class stepdefinationclass extends driverinit{
	WebDriver driver=driverget();
	flipkartpageobj obj= new flipkartpageobj(driver);
	
	@Given("^User in on Flipkart site$")
	public void User_in_on_Flipkart_site() {
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("._2doB4z")).click();  //closing the popup of login
	}
	@Then("^Search for pixel 4a$")
	public void Search_for_pixel_4a() {
		obj.flipkartsearch().sendKeys("pixel 4a");
		obj.flipkartsearch().sendKeys(Keys.ENTER);
	}
	@When("^Select the varient$")
	public void Select_the_varient() {
		obj.flipkartsearch().click();
		obj.flipkartphone().click();	
	}
	@And("^Add the phone to cart$")
	public void Add_the_phone_to_cart() throws InterruptedException {
		obj.flipkartaddtocart().click();
		
	}
}
