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


    @Test
    public void validateMenuOptionTest(){
        MenuOption menuOption = PageFactory.initElements(driver,MenuOption.class);
        menuOption.validateMobileApp();
        ExtentTestManager.log("All option selected Succesfully",logger);

    }

    @Test
    public void validateAllOptionsDisplayTest(){
        MenuOption menuOption = PageFactory.initElements(driver,MenuOption.class);
        Assert.assertTrue(  menuOption.optionsDisplay());
        ExtentTestManager.log("AudioBook display",logger);
    }



}
