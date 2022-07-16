package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class GoogleSearch {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("User searches for {string} capital")
    public void user_searches_for_capital(String countryName) {
       googleSearchPage.googleSearchBox.sendKeys("What is the capital of " +countryName + Keys.ENTER);
    }
    @Then("User should see {string} in result")
    public void user_should_see_in_result(String capitalCity) {

    Assert.assertEquals(capitalCity,googleSearchPage.capitalCity.getText());
    }


    @Given("User is on Google search page")
    public void user_is_on_google_search_page() {
    Driver.getDriver().get("https://www.google.com/");

    }
    @When("User types apple in the google search box and clicks enter")
    public void user_types_apple_in_the_google_search_box_and_clicks_enter() {

        googleSearchPage.googleSearchBox.sendKeys("apple" + Keys.ENTER);
    }
    @Then("User sees apple – Google Search is in the google title")
    public void user_sees_apple_google_search_is_in_the_google_title() {
        Assert.assertEquals("Title verification is FAILED!!","apple - Google Search", Driver.getDriver().getTitle());
    }


    @When("User types {string} in the google search box and clicks enter")
    public void userTypesInTheGoogleSearchBoxAndClicksEnter(String searchKeyword) {
        googleSearchPage.googleSearchBox.sendKeys(searchKeyword + Keys.ENTER);
    }

    @Then("User sees {string} is in the google title")
    public void userSeesIsInTheGoogleTitle(String expectedTitle) {
        Assert.assertEquals("Title verification is FAILED!!",expectedTitle, Driver.getDriver().getTitle());

    }

    @Then("User should be able to search for following:")
    public void userShouldBeAbleToSearchForFollowing(List<String> searchKeywords) {
        System.out.println("searchKeywords = " + searchKeywords);
        for (String eachKeyword : searchKeywords) {
            googleSearchPage.googleSearchBox.clear();
            googleSearchPage.googleSearchBox.sendKeys(eachKeyword + Keys.ENTER);
            Assert.assertEquals(eachKeyword + " - Google Search",Driver.getDriver().getTitle());

        }
    }
}
