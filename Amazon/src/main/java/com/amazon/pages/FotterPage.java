package com.amazon.pages;

import common.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FotterPage extends TestBase {

    @FindBy(linkText = "Careers")
    private WebElement careers ;


    public void careersLink(){
        windowsFullPageScrollDown();
        careers.click();
    }

    public String careersTitle(){
        windowsFullPageScrollDown();
        careersLink();
        return driver.getTitle();
    }








}
