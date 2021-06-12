package homepagetest;

import com.qa.homepage.HomePageHeader;
import common.WebAPI;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.ExtentTestManager;

public class HomePageHeaderTest extends WebAPI {


    HomePageHeader homePageHeader ;
    private static final Logger logger = Logger.getLogger(HomePageHeader.class);

    @BeforeMethod
    public void getInit(){
        homePageHeader = PageFactory.initElements(driver,HomePageHeader.class);
    }


    @Test(priority = 0)
    public void validateDailyDealsLink(){
        homePageHeader.clickOnDailyDealsLink();
        String actual =  homePageHeader.validateDailyDealsLink();
        String expected = "Daily Deals";
        Assert.assertEquals(actual,expected,"title did not match");
        ExtentTestManager.log("Title match as expected",logger);
    }

    @Test(priority = 1)
    public void validateEbayLogo(){
        boolean logo =  homePageHeader.ebayLogo();
        ExtentTestManager.log("Driver find logo successfully",logger);
        Assert.assertTrue(logo,"logo not present there");
        ExtentTestManager.log("logo is present",logger);
    }


    @Test(enabled = true,priority = 2)
    public void brandOutLinkTest(){
        homePageHeader.clickOnBrandOutletLink();
       String expected = homePageHeader.validateBrandOutLinkTitle();
       String actual ="Brand Outlet";
       Assert.assertEquals(actual,expected,"title did not match");
       ExtentTestManager.log("title is match as expected",logger);
    }







    @AfterMethod
    public void tearDowm(){
        driver.close();
    }


}
