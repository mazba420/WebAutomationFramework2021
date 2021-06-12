package homepagetest;

import com.qa.homepage.HomePageHeader;
import com.qa.homepage.SearchBox;
import common.WebAPI;
import data.DataProviderForTest;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.ExtentTestManager;

public class SearchTest extends WebAPI {
    SearchBox searchBox;
    private static final Logger logger = Logger.getLogger(HomePageHeader.class);

    @BeforeMethod
    public void getInit(){
        searchBox = PageFactory.initElements(driver,SearchBox.class);
    }


  @Test(dataProviderClass = DataProviderForTest.class , dataProvider = "getDataForSearchTest")
    public void validUserTypeDifferentDataOnSearchBox(String bookName){
       searchBox.typeOnSearchButton(bookName);
       ExtentTestManager.log(bookName+" type properly",logger);
       searchBox.clickOnSearchButton();
       ExtentTestManager.log("click search bar properly",logger);
  }



}
