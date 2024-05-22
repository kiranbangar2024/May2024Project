package org.stepdefination1;

import org.openqa.selenium.WebDriver;

import baseutility.Basic_utilites;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageEleStepdef {
Basic_utilites bs=new Basic_utilites();
WebDriver driver=bs.startupmethode();
LoginPageEle loginp=new LoginPageEle(driver);

@Given("when user is on loginpage of Flipkart")
public void when_user_is_on_loginpage_of_flipkart() {

System.out.println("login pange displayed");

}

@When("user click on search")
public void user_click_on_search() {
System.out.println(loginp.isSearchDisplay());


}
@And("user search for samsung mobile")
public void user_search_for_samsung_mobile() {

loginp.EnterinSearchField();
System.out.println("search for samsung mobile");
}

@Then("homepage displyed")
public void homepage_displyed() {


}


}
