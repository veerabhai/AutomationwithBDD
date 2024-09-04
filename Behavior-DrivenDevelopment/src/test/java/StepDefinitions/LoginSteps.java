package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	
	@Given("user is on login page")
	public void userIsOnLoginPage() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("Inside Step - user is on login page");
	}

	@When("user enters username and password")
	public void userEntersUsernameAndPassword() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Inside Step -user enters username and password");
	}

	@And("clicks on login button")
	public void clicksOnlLoginButton() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("Inside Step - clicks on login button");
	}

	@Then("user is navigated to the home page")
	public void userIsNavigatedToTheHomePage() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("Inside Step - user is navigated to the home page");
	}


}
