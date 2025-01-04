package stepDefinitionPackage;

import java.util.List;
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

public class DataTableWithoutHeaderDef {
	WebDriver driver;

	@Given("You are on the login page")
	public void you_are_on_the_login_page() {
		String driverPath = "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("You enter the below credentials")
	public void you_enter_the_below_credentials(DataTable dataTable) {
		List<List<String>> credentials = dataTable.asLists(String.class);
		String uname = credentials.get(0).get(0); // By index
		String pword = credentials.get(0).get(1);

		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		username.sendKeys(uname);
		password.sendKeys(pword);
	}

	@When("click on the login button")
	public void click_on_the_login_button() {
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
	}

	@Then("you should navigated to Dashboad")
	public void you_should_navigated_to_dashboad() {
		WebElement dashBoard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		Assert.assertTrue("Not displayed", dashBoard.isDisplayed());
		driver.quit();
	}

}
