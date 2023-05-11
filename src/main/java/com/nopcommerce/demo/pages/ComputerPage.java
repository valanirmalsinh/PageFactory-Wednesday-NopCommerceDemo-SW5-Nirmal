package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktop;
    @CacheLookup
    @FindBy(linkText = "Notebooks")
    WebElement notebooks;
    @CacheLookup
    @FindBy(linkText = "Software")
    WebElement software;
    @FindBy(xpath = "//h1")
    WebElement headingText;
    public String getHeadingText(){
        CustomListeners.test.log(Status.PASS, "Get text " + headingText);
        Reporter.log("Get text " + headingText.toString());
        return getTextFromElement(headingText);
    }
    public void clickOnDesktop(){
        clickOnElement(desktop);
        CustomListeners.test.log(Status.PASS, "Click on " + desktop);
        Reporter.log("Click on " + desktop.toString());
    }
    public void clickOnNotebook(){
        clickOnElement(notebooks);
        CustomListeners.test.log(Status.PASS, "Click on " + notebooks);
        Reporter.log("Click on " + notebooks.toString());
    }
    public void clickOnSoftware(){
        clickOnElement(software);
        CustomListeners.test.log(Status.PASS, "Click on " + software);
        Reporter.log("Click on " + software.toString());
    }
}
