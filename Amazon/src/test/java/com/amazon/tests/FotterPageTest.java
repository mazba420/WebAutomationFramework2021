package com.amazon.tests;

import com.amazon.pages.FotterPage;
import com.amazon.pages.RegistrationPage;
import common.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.ExtentTestManager;

public class FotterPageTest extends TestBase {
    private static final Logger logger = Logger.getLogger(RegistrationTest.class);


    @Test
    public void validateUserCanClickCarrerLinkTest(){
           FotterPage fotterPage = PageFactory.initElements(driver,FotterPage.class);
           fotterPage.careersLink();
           ExtentTestManager.log("click carrer lik=nk",logger);
    }

    @Test
    public void CareerLinkTitle(){
        FotterPage fotterPage = PageFactory.initElements(driver,FotterPage.class);
        String expected = fotterPage.careersTitle();
        String actual = "Amazon.jobs: Help us build Earth’s most customer-centric company.";
        Assert.assertEquals(expected,actual);
    }










}
