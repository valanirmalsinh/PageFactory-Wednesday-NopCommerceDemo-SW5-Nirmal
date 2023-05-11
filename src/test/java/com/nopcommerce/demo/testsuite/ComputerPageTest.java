package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class ComputerPageTest extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;
    RegisterPage registerPage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourComputerPage buildYourComputerPage;
    SoftAssert softAssert;
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage=new LoginPage();
        homePage=new HomePage();
        registerPage=new RegisterPage();
        computerPage=new ComputerPage();
        desktopsPage=new DesktopsPage();
        buildYourComputerPage=new BuildYourComputerPage();
        softAssert=new SoftAssert();
    }
    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){
        homePage.clickOnComputer();
        softAssert(computerPage.getHeadingText(),"Computers","computer page is not displayed");
        softAssert.assertAll();
    }
    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        homePage.mouseHoverOnComputer();
        computerPage.clickOnDesktop();
        softAssert(desktopsPage.getHeadingText(),"Desktops","computer page is not displayed");
        softAssert.assertAll();
    }
    @Test(groups = {"regression"}, dataProvider = "selection", dataProviderClass = TestData.class)
    public void VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram,
                                                                                    String hdd, String os, String software){
        homePage.mouseHoverOnComputer();
        computerPage.clickOnDesktop();
        desktopsPage.clickOnBuildYourComputer();
        buildYourComputerPage.selectProcessor(processor);
        buildYourComputerPage.selectRAM(ram);
        buildYourComputerPage.selectHddRadio(hdd);
        buildYourComputerPage.selectOs(os);
        buildYourComputerPage.selectCheckBox(software);
        buildYourComputerPage.addToCart();
        Assert.assertEquals(buildYourComputerPage.getSuccessMessage(),"The product has been added to your shopping cart","Product is not added successfully");
    }
}
