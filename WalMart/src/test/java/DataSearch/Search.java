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
    public void test1(String data){
        BasicConfigurator.configure();
        //logger.setLevel(Level.INFO);
        //logger.info("Cnn search test started");
        clickByCss(".header-GlobalSearch-submit.btn");
        typeByCss("#global-search-input", data);
    }
}
