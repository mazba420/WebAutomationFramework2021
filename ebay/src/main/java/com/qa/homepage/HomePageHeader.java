package com.qa.homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageHeader extends WebAPI {

    //Page factory : OR

    @FindBy(xpath = "//header/div[@id='gh-top']/ul[@id='gh-topl']/li[@id='gh-p-1']/a[1]")
    WebElement dailyDealsLink ;

    @FindBy(xpath = "//a[contains(text(),'Brand Outlet')]")
    WebElement brandOutletLink ;

    @FindBy(xpath = "//a[contains(text(),'Brand Outlet')]")
    WebElement helpAndContactLink ;

     @FindBy(xpath = "//img[@id='gh-logo']")
     WebElement ebayLogo ;


    //Actions
    public void clickOnDailyDealsLink(){
        dailyDealsLink.click();
    }

    public void clickOnBrandOutletLink(){
        brandOutletLink.click();
    }

    public void clickOnHelpAndContactLink(){
        helpAndContactLink.click();
    }

   public void ebayLogo(){
        ebayLogo.isDisplayed();
   }

   public String validateDailyDealsLink(){
         return dailyDealsLink.getText();
   }

}
