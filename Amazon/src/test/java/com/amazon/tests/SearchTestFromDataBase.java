package com.amazon.tests;

import com.amazon.dataprovider.DataProviderTest;
import com.amazon.pages.SearchPage;
import common.TestBase;
import databases.ConnectDB;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ExtentTestManager;

import java.sql.*;
import java.util.ArrayList;

public class SearchTestFromDataBase extends TestBase {
    private static final Logger logger = Logger.getLogger(SearchTest.class);

    @Test
    public void validateUserSearchAnItemFromDataBase() throws SQLException {
            String query = "select * from testdata; ";
            ArrayList<String> datas = connectToDataBaseAndGetData(query,"booknames");

            SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
            ExtentTestManager.log("Get data from database",logger);
            searchPage.typeOnSearchBar(datas.get(0));
            searchPage.typeOnSearchBar(datas.get(1));
            searchPage.typeOnSearchBar(datas.get(2));
            ExtentTestManager.log(datas.get(0) + " type on search bar", logger);
            ExtentTestManager.log(datas.get(1) + " type on search bar", logger);
            ExtentTestManager.log(datas.get(2) + " type on search bar", logger);
            searchPage.clickOnSearchButton();
            ExtentTestManager.log("Clicked on search bar", logger);

        }
    }
