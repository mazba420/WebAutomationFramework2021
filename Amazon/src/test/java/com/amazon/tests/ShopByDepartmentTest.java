package com.amazon.tests;

import com.amazon.pages.ShopByDepartment;
import common.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.ExtentTestManager;

public class ShopByDepartmentTest extends TestBase {

    private static final Logger logger = Logger.getLogger(SearchTest.class);

    @Test(enabled = false)
    public void tVDepartmentTest(){
        ShopByDepartment shopByDepartment = PageFactory.initElements(driver,ShopByDepartment.class);
        shopByDepartment.allOptionButtonClick();
        shopByDepartment.electricButtonClick();
        shopByDepartment.tvAndVideoButtonClick();
        Assert.assertTrue(shopByDepartment.handPickUPImage(),"Image not present");
        ExtentTestManager.log("User find as expected page",logger);
    }


    @Test
    public void validateAddToCartTest(){
        ShopByDepartment shopByDepartment = PageFactory.initElements(driver,ShopByDepartment.class);
        shopByDepartment.addToCardTV();
        ExtentTestManager.log("User successFully add to cart ",logger);
    }
















}
