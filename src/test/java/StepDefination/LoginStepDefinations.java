package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinations {
	WebDriver driver = null;
	@Given("User open the browser")
	public void user_open_the_browser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dudekula.anwar\\eclipse-workspace\\cucumberframework\\src\\test\\resources\\Drivers\\chromedriver.exe"); 
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	} 

	@Given("User should be on LoginPage")
	public void user_should_be_on_login_page() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		System.out.println("User on login page");
	   Thread.sleep(4000);    
	}

	@When("User should enters username and password")
	public void user_should_enters_username_and_password() {
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	}

	@When("Click on Login")
	public void click_on_login() {
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	@Then("user should be on Homepage")
	public void user_should_be_on_homepage() {
	    
	}
}
