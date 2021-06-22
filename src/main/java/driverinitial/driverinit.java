package driverinitial;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverinit {
	public WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public  WebDriver driverget(){
		System.setProperty("webdriver.gecko.driver","D:\\lenovo\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}	
}
