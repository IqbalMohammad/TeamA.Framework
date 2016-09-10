package DataSearch;

import SearchCreateLoginPF.Search;
import common.Base;
import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by iqbal on 8/29/2016.
 */
public class Search1 extends Base {

    @DataProvider(name = "items")
    public Object[][] createData(){
        return new Object[][]{
//                {"Shirts"},
//                {"Pants"},
                {"Computer"},
//                {"Books"}
        };
    }
    @Test(dataProvider = "items")
    public void test1(String data) throws InterruptedException {
        BasicConfigurator.configure();

        typeByCss("#global-search-input", data);
        sleepFor(3);
        clickByCss(".header-GlobalSearch-submit.btn");
        sleepFor(10);

        Search Link1 = PageFactory.initElements(driver, Search.class);
        Link1.searchResult1();
        sleepFor(5);
        Link1.AddToCart();
        sleepFor(5);
        Link1.ChooseAPlan();
        sleepFor(5);
        Link1.CheckOutTo();
        sleepFor(5);
//        Search walMartLogin = PageFactory.initElements(driver, Search.class); //new UserLoginPage();
        Link1.Login("iqbal99@gmail.com", "Ab12345678");
        sleepFor(5);
    }


}
