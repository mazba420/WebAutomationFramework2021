package com.amazon.tests;

import com.amazon.dataprovider.DataProviderTest;
import com.amazon.pages.ProductSearchAndAddToCart;
import com.amazon.pages.SearchPage;
import common.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.ExtentTestManager;

public class ProductSearchAndAddToCartTest extends TestBase {
    private static final Logger logger = Logger.getLogger(SearchTest.class);

    @Test(dataProviderClass = DataProviderTest.class,dataProvider = "getDataForSearchTestAndAddToCart",enabled = false)
    public void validateUserSearchAnItemTest(String productName){
        ProductSearchAndAddToCart productSearchAndAddToCart = PageFactory.initElements(driver,ProductSearchAndAddToCart.class);
        productSearchAndAddToCart.typeOnSearchBar(productName);
        ExtentTestManager.log(productName+" type on search bar",logger);
        productSearchAndAddToCart.clickOnSearchButton();
        ExtentTestManager.log("Clicked on search bar",logger);
    }


    @Test(dataProviderClass = DataProviderTest.class,dataProvider = "getDataForSearchTestAndAddToCart")
    public void validateUserSearchAnItemAndAddToCartTest(String productName){
        ProductSearchAndAddToCart productSearchAndAddToCart = PageFactory.initElements(driver,ProductSearchAndAddToCart.class);
        productSearchAndAddToCart.typeOnSearchBar(productName);
        ExtentTestManager.log(productName+" type on search bar",logger);
        productSearchAndAddToCart.clickOnSearchButton();
        ExtentTestManager.log("Clicked on search bar",logger);
        productSearchAndAddToCart.clickOnMsiLaptop();
        ExtentTestManager.log("User Successfully click on Msi Laptop",logger);
        Assert.assertTrue(productSearchAndAddToCart.imageValidate(),"Image not present");
        String expectedTitle ="Amazon.com: 2020 Newest Acer Aspire 5 Slim Laptop 15.6\" FHD IPS Display, AMD Ryzen 3 3200u (up to 3.5GHz), Vega 3 Graphics, 8GB RAM DDR4, 256GB PCIe SSD, Backlit KB,WiFi,HDMI, Win10 w/Ghost Manta Accessories: Computers & Accessories";
        String actualTitle = getTitle();
        Assert.assertEquals(expectedTitle,actualTitle,"Title did not match");
        productSearchAndAddToCart.addToCartButton();
        ExtentTestManager.log("User successfully add to cart the product",logger);
    }

}
