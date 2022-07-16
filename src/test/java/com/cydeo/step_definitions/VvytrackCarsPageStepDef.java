package com.cydeo.step_definitions;

import com.cydeo.pages.VvTrackLoginPage;
import com.cydeo.pages.VvytrackCarsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;

public class VvytrackCarsPageStepDef {

    VvytrackCarsPage vvytrackCarsPage = new VvytrackCarsPage();


    @Given("user is on the Cars page")
    public void user_is_on_the_cars_page() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));

        vvytrackCarsPage.login(ConfigurationReader.getProperty("vytrack.username"), ConfigurationReader.getProperty("vvytrack.password"));
        Thread.sleep(3000);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(vvytrackCarsPage.fleetIcon).perform();
        vvytrackCarsPage.vehicleBtn.click();
        Thread.sleep(5000);


    }
    @When("user clicks refresh button")
    public void user_clicks_refresh_button() {
        vvytrackCarsPage.refreshBtn.click();
    }
    @Then("page should be refresh")
    public void page_should_be_refresh() {
        vvytrackCarsPage.refreshBtn.isEnabled();
    }
    @When("user clicks Export Grid button")
    public void user_clicks_export_grid_button() throws InterruptedException {

        vvytrackCarsPage.exportGridBtn.click();
        Thread.sleep(5000);
    }
    @Then("user should see Export Grid dropdown popup")
    public void user_should_see_export_grid_dropdown_popup() throws InterruptedException {

        System.out.println("vvytrackCarsPage.exportGridDropdown.isDisplayed() = " + vvytrackCarsPage.exportGridDropdown.isDisplayed());


    }

    @Then("user sees the Export Grid dropdown on the left side of the page")
    public void user_sees_the_export_grid_dropdown_on_the_left_side_of_the_page() {

        Point point = (vvytrackCarsPage.exportGridDropdown).getLocation();
        int xcord = point.getX();
        double sm = xcord / 37.7952;
        if (sm <= 15) {
            System.out.println("Position of the webElement is on the left of the page");
        } else {
            System.out.println("Position of the webElement is on the right side of the page");
        }

    }

    @Then("User should be able to see Refresh Button on the left side of the Reset button")
    public void user_should_be_able_to_see_refresh_button_on_the_left_side_of_the_reset_button() {

        Point point = (vvytrackCarsPage.refreshBtn).getLocation();
        int xcordRefreshBtn = point.getX();

        Point point1 = (vvytrackCarsPage.resetBtn).getLocation();
        int xcordResetBtn = point1.getX();

        if (xcordRefreshBtn < xcordResetBtn){
            System.out.println("Refresh button is on the left of the Reset button");
        }else{
            System.out.println("Refresh button is on the right of the Reset button");

        }

    }

    @Then("User should see Grid Settings on the right side of the Reset button")
    public void user_should_see_grid_settings_on_the_right_side_of_the_reset_button() {

        Point point = (vvytrackCarsPage.gridSettingBtn).getLocation();

        int xcordGridSetting = point.getX();

        Point point1 = (vvytrackCarsPage.resetBtn).getLocation();
        int xcordResetBtn = point1.getX();

        if (xcordGridSetting > xcordResetBtn){
            System.out.println("Grid Settings button is on the right side of the Reset button");
        }else{
            System.out.println("Grid Settings button is on the left side of the Reset button");
        }

    }

}
