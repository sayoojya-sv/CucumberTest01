package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	@Given("The website is loaded")
	public void the_website_is_loaded() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("open");
	}

@When("user types username and password")
public void user_types_username_and_password() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("page2");
}
@When("clicks on login button")
public void clicks_on_login_button() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("page3");
}
@Then("Page redirects to homepage")
public void page_redirects_to_homepage() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("page4");
}


}
