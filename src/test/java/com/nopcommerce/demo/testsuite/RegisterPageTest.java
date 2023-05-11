package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListeners.class)
public class RegisterPageTest extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;
    RegisterPage registerPage;
    SoftAssert softAssert;
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage=new LoginPage();
        homePage=new HomePage();
        registerPage=new RegisterPage();
        softAssert=new SoftAssert();
    }
    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        homePage.clickOnRegisterLink();
        softAssert(registerPage.getHeadingText(),"Register","Page is not displayed successfully");
        softAssert.assertAll();
    }
    @Test(groups = {"smoke","regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        homePage.clickOnRegisterLink();
        registerPage.clickOnRegister();
        softAssert(registerPage.getFirstNameError(),"First name is required.","Message is not displayed");
        softAssert(registerPage.getLastNameError(),"Last name is required.","Message is not displayed");
        softAssert(registerPage.getEmailError(),"Email is required.","Message is not displayed");
        softAssert(registerPage.getPasswordError(),"Password is required.","Message is not displayed");
        softAssert(registerPage.getConfirmPasswordError(),"Password is required.","Message is not displayed");
        softAssert.assertAll();
    }
    @Test(groups = {"regression"})
    public void VerifyThatUserShouldCreateAccountSuccessfully(){
        homePage.clickOnRegisterLink();
        registerPage.selectGender();
        registerPage.enterFirstname("Prime");
        registerPage.enterLastname("Testing");
        registerPage.selectDate("6");
        registerPage.selectMonth("July");
        registerPage.selectYear("1995");
        registerPage.enterEmail("Prime" + getAlphaNumericString(3)+ "@gmail.com");
        registerPage.enterPassword("Prime123");
        registerPage.enterConfirmPassword("Prime123");
        registerPage.clickOnRegister();
        softAssert(registerPage.getRegisterMessage(),"Your registration completed","Register is not successful");
        softAssert.assertAll();
    }
}
