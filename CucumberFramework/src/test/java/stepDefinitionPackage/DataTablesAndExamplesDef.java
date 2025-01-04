package stepDefinitionPackage;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTablesAndExamplesDef {
	WebDriver driver;

	// With Examples:
	@Given("User enters in loginPage")
	public void user_enters_in_login_page() {
		String driverPath = "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("User enters valid credentials {string} and {string}")
	public void user_enters_valid_credentials_and(String uname, String pword) {
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		username.sendKeys(uname);
		password.sendKeys(pword);
	}

	@When("User clicks on the login btn")
	public void user_clicks_on_the_login_btn() {
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		driver.quit();
	}
}
