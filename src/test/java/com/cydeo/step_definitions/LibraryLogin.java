package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LibraryLogin {
    @Given("User is on the library login page")
    public void user_is_on_the_library_login_page() {
        System.out.println("Given User is on the library login page");
    }
    @When("user enter librarian user name")
    public void user_enter_librarian_user_name() {
        System.out.println("When user enter librarian user name");
    }
    @When("user enter librarian password")
    public void user_enter_librarian_password() {
        System.out.println("And user enter librarian password");
    }
    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("Then user should see dashboard");
    }
    @When("user enter student user name")
    public void user_enter_student_user_name() {
        System.out.println("user enter student user name");
    }

    @When("user enter student password")
    public void user_enter_student_password() {
        System.out.println("user enter student password");
    }

    @And("user enter admin password")
    public void userEnterAdminPassword() {
        System.out.println("user enter admin password");
    }

    @When("user enter admin user name")
    public void userEnterAdminUserName() {
        System.out.println("user enter admin user name");
    }

    @Given("user is on the library login page")
    public void userIsOnTheLibraryLoginPage() {
        System.out.println("User is on the library login page");
    }
}
