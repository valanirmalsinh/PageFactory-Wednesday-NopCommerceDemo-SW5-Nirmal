package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;
    SoftAssert softAssert;
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage=new LoginPage();
        homePage=new HomePage();
        softAssert=new SoftAssert();
    }
    @Test(groups = {"sanity","regression"})
    public void userShouldNavigateToLoginPageSuccessFully(){
        homePage.clickOnLoginLink();
        softAssert(loginPage.getWelcomeText(),"Welcome, Please Sign In!","Log in page is not displayed successfully");
        softAssert.assertAll();
    }
    @Test(groups = {"smoke","regression"})
    public void verifyTheErrorMessageWithInValidCredentials(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("Primetesting@gmail.com");
        loginPage.enterPassword("Prime123");
        loginPage.clickOnLoginButton();
        softAssert(loginPage.getAlertMessage(),"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found","Message is not displayed");
        softAssert.assertAll();
    }
    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("Primetesting123@gmail.com");
        loginPage.enterPassword("Prime123");
        loginPage.clickOnLoginButton();
        Assert.assertTrue(homePage.logoutButtonIsDisplayed());
    }
    @Test(groups = {"regression"})
    public void VerifyThatUserShouldLogOutSuccessFully(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("Primetesting123@gmail.com");
        loginPage.enterPassword("Prime123");
        loginPage.clickOnLoginButton();
        homePage.clickOnLogout();
        Assert.assertTrue(homePage.loginButtonIsDisplayed());
    }
}
