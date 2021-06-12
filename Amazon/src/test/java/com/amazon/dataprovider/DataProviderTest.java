package com.amazon.dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviderTest {

    @DataProvider(name ="getDataForSearchTest")
    public static Object [][] getSearchData(){
        return new Object[][]{
                {"Laptop"},
                {"Iphone"}
        };
    }



}
