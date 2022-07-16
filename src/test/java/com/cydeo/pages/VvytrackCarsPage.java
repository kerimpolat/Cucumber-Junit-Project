package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VvytrackCarsPage extends VvTrackLoginPage{

    public VvytrackCarsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleetIcon;

    @FindBy (xpath = "//span[.='Vehicles']")
    public WebElement vehicleBtn;

    @FindBy (xpath = "//a[@title='With this button you will export the content of the grid as it appears to you, with filters and sorting applied. All pages will be exported.']")
    public WebElement exportGridBtn;

    @FindBy (xpath = "(//ul[@class='dropdown-menu'])[5]")
    public WebElement exportGridDropdown;

    @FindBy (xpath = "//a[@title='Refresh']")
    public WebElement refreshBtn;

    @FindBy (xpath = "//a[@title='Reset']")
    public WebElement resetBtn;

    @FindBy (xpath = "//a[@title='Grid Settings']")
    public WebElement gridSettingBtn;

}
