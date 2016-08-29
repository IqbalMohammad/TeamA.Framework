package home.page;

import common.Base;
import org.testng.annotations.Test;

/**
 * Created by iqbal on 8/29/2016.
 */

public class SearchProducts extends Base {

    @Test
    public void searchItems()throws InterruptedException{
        typeByCss("#twotabsearchtextbox", "Laptop");
        sleepFor(3);
    }
}
