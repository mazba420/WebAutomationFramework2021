package com.amazon.tests;

import com.amazon.dataprovider.DataProviderTest;
import com.amazon.pages.RegistrationPage;
import common.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.ExtentTestManager;

public class RegistrationTest extends TestBase {
    private static final Logger logger = Logger.getLogger(RegistrationTest.class);


    @Test(dataProviderClass = DataProviderTest.class,dataProvider = "getDataForRegistrationTest",enabled = false)
    public void validateUserCanRegisterAccount(String name , String email , String password , String reEnterPass){
        RegistrationPage registrationPage = PageFactory.initElements(driver,RegistrationPage.class);
        registrationPage.clickObSignInButton();
        registrationPage.clickAmazonAccountlink();
        registrationPage.UserName(name);
        ExtentTestManager.log(name+" Enter successfully",logger);
        registrationPage.UserEmail(email);
        ExtentTestManager.log(email+" Enter successfully",logger);
        registrationPage.UserPass(password);
        ExtentTestManager.log(password+" Enter successfully",logger);
        registrationPage.UserReEnterPass(reEnterPass);
        ExtentTestManager.log(reEnterPass+" Enter successfully",logger);
        sleepFor(5);
    }

    @Test
    public void validateCreateAccountText(){
        RegistrationPage registrationPage = PageFactory.initElements(driver,RegistrationPage.class);
        registrationPage.clickObSignInButton();
        registrationPage.clickAmazonAccountlink();
        String expectedText = registrationPage.createAccountText();
        String actualText = "Create account";
        Assert.assertEquals(expectedText,actualText,"Text did not match");
        ExtentTestManager.log("Create account Page text find properly",logger);
    }





}
