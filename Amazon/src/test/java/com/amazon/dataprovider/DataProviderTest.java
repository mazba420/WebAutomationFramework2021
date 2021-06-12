package com.amazon.dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviderTest {


    //For searchBox test data
    @DataProvider(name ="getDataForSearchTest")
    public static Object [][] getSearchData(){
        return new Object[][]{
                {"Laptop"},
                {"Iphone"}
        };
    }


   //For registration Page test data
    @DataProvider(name ="getDataForRegistrationTest")
    public static Object [][] getRegistrationData(){
        return new Object[][]{
                {"tom","Tom@gmail.com","123456","785544"},
                {"Jerry","Jerry@gmail.com","654215","995442555"}
        };
    }



}
