package data;

import org.testng.annotations.DataProvider;

public class DataProviderForTest {


    @DataProvider(name ="getDataForSearchTest")
    public static Object [][] getSearchData(){
        return new Object[][]{
                {"Java Books"},
                {"Selenium Books"}
        };
    }




}
