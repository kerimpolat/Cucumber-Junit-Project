package com.cydeo.step_definitions;

import com.cydeo.pages.WikipediaPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikipediaPageStepDef {

    WikipediaPage wikipediaPage = new WikipediaPage();

    @Given("user is on the wikipedia home page")
    public void user_is_on_the_wikipedia_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("wikipedia.url"));
    }
    @When("user write {string} in the wikipedia search Box")
    public void user_write_in_the_wikipedia_search_box(String search) {
        wikipediaPage.wikiSearchBox.sendKeys(search);
    }
    @When("user clicks search icon")
    public void user_clicks_search_icon() {
        wikipediaPage.searchIcon.click();
    }
    @Then("user sees {string} in the wiki title")
    public void user_sees_in_the_wiki_title(String search) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(search));
    }


    @Then("user sees Steve Jobs is in the main header")
    public void userSeesSteveJobsIsInTheMainHeader() {
        Assert.assertTrue(wikipediaPage.wikipediaMainHeader.getText().contains("Steve Jobs"));

    }

    @Then("user sees Steve Jobs is in the image header")
    public void userSeesSteveJobsIsInTheImageHeader() {
        Assert.assertEquals("Steve Jobs", wikipediaPage.imageHeader.getText());
    }
}
