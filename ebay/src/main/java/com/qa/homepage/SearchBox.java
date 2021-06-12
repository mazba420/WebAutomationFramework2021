package com.qa.homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBox extends WebAPI {

    @FindBy(xpath = "//input[@id='gh-ac']")
    WebElement searchBox ;

    public void typeOnSearchButton(String data){
        searchBox.sendKeys(data);
    }

    @FindBy(xpath = "//input[@id='gh-btn']")
    WebElement searchButton ;

    public void clickOnSearchButton(){
      searchButton.click();
    }




}
