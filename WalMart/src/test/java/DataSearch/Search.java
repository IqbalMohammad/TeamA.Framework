package DataSearch;

import common.Base;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by iqbal on 8/29/2016.
 */
public class Search extends Base {

    @DataProvider(name = "items")
    public Object[][] createData(){
        return new Object[][]{
                {"Shirts"},
                {"Pants"},
                {"Computer"},
                {"Books"}
        };
    }
    @Test(dataProvider = "items")
    public void test1(String data) throws InterruptedException {
        BasicConfigurator.configure();

        typeByCss("#global-search-input", data);
        sleepFor(3);
        clickByCss(".header-GlobalSearch-submit.btn");
        sleepFor(3);
    }
}
