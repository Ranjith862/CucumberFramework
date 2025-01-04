package stepDefinitionPackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableWithHeaderDef {
	WebDriver driver;

	@Given("Im in login page")
	public void im_in_login_page() {
		String driverPath = "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("I enter below credentials")
	public void i_enter_below_credentials(DataTable dataTable) {
		List<Map<String, String>> credentials = dataTable.asMaps(String.class, String.class);
		String uname = credentials.get(0).get("Username");
		String pword = credentials.get(0).get("Password");

		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		username.sendKeys(uname);
		password.sendKeys(pword);

	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
	}

	@Then("I will see the Dashboad")
	public void i_will_see_the_dashboad() {
		WebElement dashBoard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		Assert.assertTrue("Not displayed", dashBoard.isDisplayed());
		driver.quit();
	}

}
