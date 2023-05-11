package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@name='Gender' and @value='F']")
    WebElement femaleRadio;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameLink;

    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameLink;

    @FindBy(xpath = "//input[contains(@id,'E')]")
    WebElement emailLink;

    @FindBy(xpath = "//input[@name='Password']")
    WebElement passwordLink;

    @FindBy(xpath = "//input[@name='ConfirmPassword']")
    WebElement confirmPasswordLink;
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement registerButton;

    @FindBy(xpath = "//div[text()='Your registration completed']")
    WebElement registerMessage;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueLink;
    @FindBy(xpath = "//h1")
    WebElement headingText;
    @FindBy(xpath = "//span[@data-valmsg-for='FirstName']")
    WebElement firstNameMessage;
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameMessage;
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailMessage;
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordMessage;
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordMessage;
    @FindBy(name = "DateOfBirthDay")
    WebElement dateLink;
    @FindBy(name = "DateOfBirthMonth")
    WebElement monthLink;
    @FindBy(name = "DateOfBirthYear")
    WebElement yearLink;
    public String getHeadingText(){
        CustomListeners.test.log(Status.PASS, "Get text " + headingText);
        Reporter.log("Get text " + headingText.toString());
        return getTextFromElement(headingText);
    }
    public void selectGender(){
        clickOnElement(femaleRadio);
        CustomListeners.test.log(Status.PASS, "click on " + femaleRadio);
        Reporter.log("Click on " + femaleRadio.toString());
    }
    public void enterFirstname(String name){
        sendTextToElement(firstNameLink,name);
        CustomListeners.test.log(Status.PASS, "Enter " + name + " to " + firstNameLink);
        Reporter.log("Enter " + name + firstNameLink.toString());
    }
    public void enterLastname(String name){
        sendTextToElement(lastNameLink,name);
        CustomListeners.test.log(Status.PASS, "Enter " + name + " to " + lastNameLink);
        Reporter.log("Enter " + name + lastNameLink.toString());
    }
    public void selectDate(String date){
        selectByValueFromDropDown(dateLink,date);
        CustomListeners.test.log(Status.PASS, "Select " + date + " to " + dateLink);
        Reporter.log("Enter " + date + dateLink.toString());
    }
    public void selectMonth(String month){
        selectByVisibleTextFromDropDown(monthLink,month);
        CustomListeners.test.log(Status.PASS, "Select " + month + " to " + monthLink);
        Reporter.log("Enter " + month + monthLink.toString());
    }
    public void selectYear(String year){
        selectByValueFromDropDown(yearLink,year);
        CustomListeners.test.log(Status.PASS, "Select " + year + " to " + yearLink);
        Reporter.log("Enter " + year + yearLink.toString());
    }
    public void enterEmail(String email){
        sendTextToElement(emailLink,email);
        CustomListeners.test.log(Status.PASS, "Enter " + email + " to " + emailLink);
        Reporter.log("Enter " + email + emailLink.toString());
    }
    public void enterPassword(String password){
        sendTextToElement(passwordLink,password);
        CustomListeners.test.log(Status.PASS, "Enter " + password + " to " + passwordLink);
        Reporter.log("Enter " + password + passwordLink.toString());
    }
    public void enterConfirmPassword(String password){
        sendTextToElement(confirmPasswordLink,password);
        CustomListeners.test.log(Status.PASS, "Enter " + password + " to " + confirmPasswordLink);
        Reporter.log("Enter " + password + confirmPasswordLink.toString());
    }
    public void clickOnRegister(){
        clickOnElement(registerButton);
        CustomListeners.test.log(Status.PASS, "Click on " + registerButton);
        Reporter.log("Click on " + registerButton.toString());
    }
    public String getRegisterMessage(){
        CustomListeners.test.log(Status.PASS, "Get Message " + registerMessage);
        Reporter.log("Get message " + registerMessage.toString());
        return getTextFromElement(registerMessage);
    }
    public void clickOnContinue(){
        clickOnElement(continueLink);
        CustomListeners.test.log(Status.PASS, "Click on " + continueLink);
        Reporter.log("Click on " + continueLink.toString());
    }
    public String getFirstNameError(){
        CustomListeners.test.log(Status.PASS, "Get text " + firstNameMessage);
        Reporter.log("Get text " + firstNameMessage.toString());
        return getTextFromElement(firstNameMessage);
    }
    public String getLastNameError(){
        CustomListeners.test.log(Status.PASS, "Get text " + lastNameMessage);
        Reporter.log("Get text " + lastNameMessage.toString());
        return getTextFromElement(lastNameMessage);
    }
    public String getEmailError(){
        CustomListeners.test.log(Status.PASS, "Get text " + emailMessage);
        Reporter.log("Get text " + emailMessage.toString());
        return getTextFromElement(emailMessage);
    }
    public String getPasswordError(){
        CustomListeners.test.log(Status.PASS, "Get text " + passwordMessage);
        Reporter.log("Get text " + passwordMessage.toString());
        return getTextFromElement(passwordMessage);
    }
    public String getConfirmPasswordError(){
        CustomListeners.test.log(Status.PASS, "Get text " + confirmPasswordMessage);
        Reporter.log("Get text " + confirmPasswordMessage.toString());
        return getTextFromElement(confirmPasswordMessage);
    }
}
