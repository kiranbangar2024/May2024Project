package org.stepdefination1;

import org.openqa.selenium.WebDriver;

import baseutility.Basic_utilites;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {
	Basic_utilites bs=new Basic_utilites();
	WebDriver driver=bs.startupmethode();
	LoginPageEle loginp=new LoginPageEle(driver);
	HomePage homepage=new HomePage(driver);
	
	@Given("user is on HomePage of Flipkart")
	public void when_user_is_on_home_page_of_flipkart() {
		loginp.EnterinSearchField();
	}

	@When("user scrolls down the page")
	public void user_scrolls_down_the_page() {
		homepage.Scroll_Down1();
	    
	    
	}

	@And("user Clicks on next button till the last page")
	public void user_clicks_on_next_button_till_the_last_page() {
	    
	    
	}

	@Then("last page will display")
	public void last_page_will_display() {
	    
	}
}
