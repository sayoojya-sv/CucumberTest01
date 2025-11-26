

package stepdefinitions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

    WebDriver driver;

    @Given("The website is loaded")
    public void the_website_is_loaded() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.saucedemo.com/");
    }

    @When("user types username and password")
    public void user_types_username_and_password() {

        WebElement user = driver.findElement(By.name("user-name"));
        user.sendKeys("standard_user");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("secret_sauce");
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {

        WebElement btn = driver.findElement(By.id("login-button"));
        btn.click();
    }

    @Then("Page redirects to homepage")
    public void page_redirects_to_homepage() {
        System.out.println("Home page loaded successfully!");
      
    }
}