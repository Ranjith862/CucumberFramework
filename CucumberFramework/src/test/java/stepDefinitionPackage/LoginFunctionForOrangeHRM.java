package stepDefinitionPackage;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunctionForOrangeHRM {
	WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		String driverPath = "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("user enters the valid username and password")
	public void user_enters_the_valid_username_and_password() {
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		username.sendKeys("Admin");
		password.sendKeys("admin123");
	}

	@When("click on login button")
	public void click_on_login_button() {
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
	}

	@Then("user should be navigated to Dashboad")
	public void user_should_be_navigated_to_dashboad() {
		WebElement dashBoard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		Assert.assertTrue("Not displayed", dashBoard.isDisplayed());
		driver.quit();
	}

}
