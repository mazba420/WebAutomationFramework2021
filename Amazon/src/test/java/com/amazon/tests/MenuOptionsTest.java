package com.amazon.tests;

import com.amazon.pages.MenuOption;
import common.TestBase;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.ExtentTestManager;

public class MenuOptionsTest extends TestBase {
    private static final Logger logger = Logger.getLogger(RegistrationTest.class);



    @Test(priority = 1,description = "verifying amazon option Test")
    public void validateMenuOptionTest(){
        MenuOption menuOption = PageFactory.initElements(driver,MenuOption.class);
        menuOption.validateMobileApp();
        ExtentTestManager.log("All option selected Successfully",logger);

    }

    @Test(priority = 2,description = "check audioBook link display",enabled = false)
    public void validateAllOptionsDisplayTest(){
        MenuOption menuOption = PageFactory.initElements(driver,MenuOption.class);
        Assert.assertTrue(  menuOption.optionsDisplay());
        ExtentTestManager.log("AudioBook display",logger);
    }



}
