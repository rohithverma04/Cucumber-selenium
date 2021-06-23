package pageobjects;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class flipkartpageobj {
	
WebDriver driver;
By search=By.name("q");
By phone=By.className("_4rR01T");
By addtocart=By.cssSelector(".ihZ75k");

public flipkartpageobj(WebDriver driver2) {
	this.driver=driver2;
}
public WebElement flipkartsearch(){
	return driver.findElement(search);
}
public WebElement flipkartphone(){
	return driver.findElement(phone);
}

}
