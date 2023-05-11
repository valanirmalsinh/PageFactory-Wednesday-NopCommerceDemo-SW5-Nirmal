package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    @FindBy(linkText = "Log in")
    WebElement loginLink;
    @CacheLookup
    @FindBy(xpath = "//a[starts-with(text(),'Reg')]")
    WebElement registerLink;
    @CacheLookup
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement logoLink;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutLink;
    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-account']")
    WebElement myAccountLink;
    @CacheLookup
    @FindBy(linkText = "Computers")
    WebElement computerLink;
    @CacheLookup
    @FindBy(linkText = "Electronics")
    WebElement electronicLink;
    @CacheLookup
    @FindBy(linkText = "Apparel")
    WebElement apparelLink;
    @CacheLookup
    @FindBy(linkText = "Digital downloads")
    WebElement digitalDownloadLink;
    @CacheLookup
    @FindBy(linkText = "Books")
    WebElement booksLink;
    @CacheLookup
    @FindBy(linkText = "Jewelry")
    WebElement jewelryLink;
    @CacheLookup
    @FindBy(linkText = "Gift Cards")
    WebElement giftCardLink;
    public void clickOnLogout(){
        clickOnElement(logOutLink);
        CustomListeners.test.log(Status.PASS, "Click on " + logOutLink);
        Reporter.log("Click on " + logOutLink.toString());
    }
    public void clickOnLoginLink(){
        clickOnElement(loginLink);
        CustomListeners.test.log(Status.PASS, "Click on " + loginLink);
        Reporter.log("Click on " + loginLink.toString());
    }
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
        CustomListeners.test.log(Status.PASS, "Click on " + registerLink);
        Reporter.log("Click on " + registerLink.toString());
    }
    public void clickOnLogo(){
        clickOnElement(logoLink);
        CustomListeners.test.log(Status.PASS, "Click on " + logoLink);
        Reporter.log("Click on " + logoLink.toString());
    }
    public void clickMyAccount(){
        clickOnElement(myAccountLink);
        CustomListeners.test.log(Status.PASS, "Click on " + myAccountLink);
        Reporter.log("Click on " + myAccountLink.toString());
    }
    public void mouseHoverOnComputer(){
        mouseHoverToElement(computerLink);
        CustomListeners.test.log(Status.PASS, "Mouse hover " + computerLink);
        Reporter.log("Mouse Hover " + computerLink.toString());
    }
    public void clickOnComputer(){
        clickOnElement(computerLink);
        CustomListeners.test.log(Status.PASS, "Click on " + computerLink);
        Reporter.log("Click on " + computerLink.toString());
    }
    public void mouseHoverOnElectronic(){
        mouseHoverToElement(electronicLink);
        CustomListeners.test.log(Status.PASS, "Mouse hover " + electronicLink);
        Reporter.log("Mouse Hover " + electronicLink.toString());
    }
    public void mouseHoverOnApparel(){
        mouseHoverToElement(apparelLink);
        CustomListeners.test.log(Status.PASS, "Mouse hover " + apparelLink);
        Reporter.log("Mouse Hover " + apparelLink.toString());
    }
    public void mouseHoverOnDigitalDownload(){
        mouseHoverToElement(digitalDownloadLink);
        CustomListeners.test.log(Status.PASS, "Mouse hover " + digitalDownloadLink);
        Reporter.log("Mouse Hover " + digitalDownloadLink.toString());
    }
    public void mouseHoverOnBooks(){
        mouseHoverToElement(booksLink);
        CustomListeners.test.log(Status.PASS, "Mouse hover " + booksLink);
        Reporter.log("Mouse Hover " + booksLink.toString());
    }
    public void mouseHoverOnJewelry(){
        mouseHoverToElement(jewelryLink);
        CustomListeners.test.log(Status.PASS, "Mouse hover " + jewelryLink);
        Reporter.log("Mouse Hover " + jewelryLink.toString());
    }
    public void mouseHoverOnGiftCards(){
        mouseHoverToElement(giftCardLink);
        CustomListeners.test.log(Status.PASS, "Mouse hover " + giftCardLink);
        Reporter.log("Mouse Hover " + giftCardLink.toString());
    }
    public boolean logoutButtonIsDisplayed(){
        return logOutLink.isDisplayed();
    }
    public boolean loginButtonIsDisplayed(){
        return loginLink.isDisplayed();
    }
}
