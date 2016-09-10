package ItemSearch;

import dataRead.SearchFromXls;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by iqbal on 8/29/2016.
 */

public class Items extends Base {
    @Test
    public void searchUsingExcelFile() throws IOException, InterruptedException {
        //initialize Search page factory
        Items search = PageFactory.initElements(driver, Items.class);
        //Read search.data from excel file
        SearchFromXls itemsInXl = new SearchFromXls();
        String[] value = itemsInXl.getData();

        List<String> list = new ArrayList<String>();

        for (String read : value) {
            search.searchFor(read);
            sleepFor(2);
            //search.clearSearchInput();
        }
    }


}