package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VvTrackLoginPage {

    public VvytrackCarsPage vvytrackCarsPage;

    public VvTrackLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "prependedInput")
    public WebElement inputUsername;


    @FindBy (id = "prependedInput2")
    public WebElement inputPassword;

    @FindBy (id = "_submit")
    public WebElement loginBtn;

    public void login(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginBtn.click();
    }

    
}
