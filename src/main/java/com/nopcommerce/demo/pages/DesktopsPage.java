package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.List;

public class DesktopsPage extends Utility {
    @FindBy(xpath = "//h1")
    WebElement headingText;
    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement sortByLink;
    @FindBy(xpath = "//h2[@class='product-title']")
    List<WebElement> listLink;
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourComputer;
    public void clickOnBuildYourComputer(){
        clickOnElement(buildYourComputer);
        CustomListeners.test.log(Status.PASS, "Click on " + buildYourComputer);
        Reporter.log("click on " + buildYourComputer.toString());
    }
    public String getHeadingText(){
        CustomListeners.test.log(Status.PASS, "Get text " + headingText);
        Reporter.log("Get text " + headingText.toString());
        return getTextFromElement(headingText);
    }
    public void selectFromDropDown(String value){
        selectByVisibleTextFromDropDown(sortByLink,value);
        CustomListeners.test.log(Status.PASS, "Select from " + sortByLink);
        Reporter.log("Select from " + sortByLink.toString());
    }
    public List getList() throws InterruptedException {
        Thread.sleep(2000);
        CustomListeners.test.log(Status.PASS, "Get list " + listLink);
        Reporter.log("Get list " + listLink.toString());
        List<WebElement> list=getListOfElements(listLink);
        List<String> orignalList= new ArrayList<>();
        for(WebElement e:list){
            orignalList.add(e.getText());
        }
        return orignalList;
    }
}
