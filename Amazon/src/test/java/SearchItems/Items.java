package SearchItems;

import common.Base;
import dataToSearch.ItemsToBeSearched;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page_factory.SearchItems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by iqbal on 8/29/2016.
 */

public class Items extends Base {
    @Test
    public void searchUsingExcelFile()throws IOException,InterruptedException{
        //initialize Search page factory
        SearchItems search = PageFactory.initElements(driver, SearchItems.class);
        //Read search.data from excel file
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        String [] value = itemsToBeSearched.getData();

        List<String> list = new ArrayList<String>();

        for(String read:value) {
            search.searchFor(read);
            sleepFor(2);
            search.clearSearchInput();
        }
    }

     @Test
//    public void searchUsingDB()throws Exception,InterruptedException{
//        //initialize Search page factory
//        SearchItems search = PageFactory.initElements(driver, SearchItems.class);
//        //Read Data From Database
//        ConnectMySqlDB db = new ConnectMySqlDB();
//        List<String> st = db.readDataBase(teama, team);
//        for(String data:st) {
//            search.searchFor(data);
//            sleepFor(2);
//            search.clearSearchInput();
//        }
//    }




    //One Data Driven Option to supply search.data from Data Provider
    @DataProvider(name = "items")
    public Object[][] createData(){
        return new Object[][]{
                {"Books"} ,
                {"Baby"} ,
                {"Computer"},
        };
    }

    //@TestNewUser(dataProvider = "items")
    public void searchUsingDataProvider(String data)throws InterruptedException{
        //initialize Search page factory
        SearchItems search = PageFactory.initElements(driver, SearchItems.class);
        search.searchFor(data);
        sleepFor(2);
        search.clearSearchInput();
    }
}
