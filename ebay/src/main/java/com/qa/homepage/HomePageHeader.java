package com.qa.homepage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePageHeader extends WebAPI {

    //Page factory : OR

    By dailyDealsLinks = By.xpath("//header/div[@id='gh-top']/ul[@id='gh-topl']/li[@id='gh-p-1']/a[1]");

//    @FindBy(xpath = "//header/div[@id='gh-top']/ul[@id='gh-topl']/li[@id='gh-p-1']/a[1]")
//    WebElement dailyDealsLink ;
//
//    @FindBy(xpath = "//a[contains(text(),'Brand Outlet')]")
//    WebElement brandOutletLink ;
//
//    @FindBy(xpath = "//a[contains(text(),'Brand Outlet')]")
//    WebElement helpAndContactLink ;


   public HomePageHeader(){
       PageFactory.initElements(driver,this);
   }

   //page actions/ page method
    public void validateDailyDealsLink(){

    }

    public String ebayPageTitle(){
     return driver.getTitle();
    }



}
