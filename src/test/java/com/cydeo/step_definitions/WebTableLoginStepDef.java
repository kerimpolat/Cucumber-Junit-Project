package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLoginStepDef {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    @When("user enters below credentials")
    public void user_enters_below_credentials(Map<String, String> credentials) {
       webTableLoginPage.login(credentials.get("username"),credentials.get("password") );
    }

    @When("user enters username {string}, password {string} and login")
    public void user_enters_username_password_and_login(String username, String password) {
    webTableLoginPage.login(username, password);
    }

    @Given("user is on web table login page")
    public void user_is_on_web_table_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.app.url"));
    }
    @When("user enters username {string}")
    public void user_enters_username(String username) {
    webTableLoginPage.inputUsername.sendKeys(username);
    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
    webTableLoginPage.inputPassword.sendKeys(password);
    }


    @And("user clicks login button")
    public void userClicksLoginButton() {
        webTableLoginPage.loginBtn.click();
    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));
    }


}
