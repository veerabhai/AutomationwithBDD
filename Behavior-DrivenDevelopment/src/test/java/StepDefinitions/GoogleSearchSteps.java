package StepDefinitions;


import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import StepDefinitions.utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {
	
	 private WebDriver driver;

	    public GoogleSearchSteps() {
	        this.driver = DriverManager.getDriver(); // Initialize WebDriver in constructor
	        if (this.driver == null) {
	            throw new RuntimeException("WebDriver initialization failed! Driver is null.");
	        }
	    }
	
	//WebDriver driver = WebDriverManager.chromedriver().create();
	//WebDriverManager driver = null;
	  @Given("User is on Google Home Page")
	    public void user_is_on_google_home_page() {
		  System.out.println("Inside step - browser is open");
		  if (driver == null) {
	            throw new RuntimeException("WebDriver is not initialized!");
	        }
		 
			
	        driver.get("https://www.google.com");
	    }

	    @When("User enters {string} in the search box and clicks search")
	    public void user_enters_query_in_the_search_box_and_clicks_search(String query) {
	    	
	    	System.out.println("Inside step - User enters \"Cucumber BDD\" in the search box and clicks search");
	        WebElement searchBox = driver.findElement(By.name("q"));
	        searchBox.sendKeys(query);
	        searchBox.sendKeys(Keys.ENTER); // Alternatively, find the search button and click
	    }

	    @Then("Search results page is displayed")
	    public void search_results_page_is_displayed() {
	    	
	    	System.out.println("Search results page is displayed");
	        String expectedTitle = "Google Search";
	        String actualTitle = driver.getTitle();
	        assertTrue("The search results page was not displayed!", actualTitle.contains(expectedTitle));
	    }

	    @And("The title contains {string}")
	    public void the_title_contains(String expectedTitlePart) {
	    	System.out.println("The title contains \"Cucumber BDD\"");
	        String actualTitle = driver.getTitle();
	        assertTrue("The title does not contain the expected text!", actualTitle.contains(expectedTitlePart));
	    }


	
	
}
