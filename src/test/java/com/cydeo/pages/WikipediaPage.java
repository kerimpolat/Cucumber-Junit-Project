package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaPage {

    public WikipediaPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "searchInput")
    public WebElement wikiSearchBox;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement searchIcon;

    @FindBy (id = "firstHeading")
    public WebElement wikipediaMainHeader;

    @FindBy (xpath = "//div[@class='fn']")
    public WebElement imageHeader;




}
