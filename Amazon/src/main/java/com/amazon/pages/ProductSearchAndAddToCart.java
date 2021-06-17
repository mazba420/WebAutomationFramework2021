package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductSearchAndAddToCart {


    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchTextBox;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchButton ;

    @FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
    private WebElement msiLaptop ;

    @FindBy(xpath = "//div[@id='imgTagWrapperId']/img")
    private WebElement msiLaptopImage;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    private WebElement addToCartButton ;

    @FindBy(xpath = "//input[@aria-labelledby='attachSiNoCoverage-announce']")
    private WebElement noThanksButton ;

    public void typeOnSearchBar(String text){
        searchTextBox.sendKeys(text);
    }

    public void clickOnSearchButton(){
        searchButton.click();
    }

    public void clickOnMsiLaptop(){
        msiLaptop.click();
    }

    public boolean imageValidate(){
       return msiLaptopImage.isDisplayed();
    }

    public void addToCartButton(){
        addToCartButton.click();
        noThanksButton.click();
    }


}
