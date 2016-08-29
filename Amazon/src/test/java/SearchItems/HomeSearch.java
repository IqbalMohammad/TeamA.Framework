package SearchItems;

import common.Base;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by iqbal on 8/29/2016.
 */
public class HomeSearch extends Base {

    @Test
    public void test1()throws InterruptedException{
//        logger.setLevel(Level.INFO);
//        logger.info("Amazon search test is started");
        //fetch the list of webelemnets from drop down menu and get text form the list
        List<String> text= getTextFromWebElements("#searchDropdownBox option");

        //get each text from the list, then enter each text into input box.
        for(int i=0; i<text.size(); i++){
            typeByCss("#twotabsearchtextbox",text.get(i));
            keysInput("#twotabsearchtextbox");
            clearInput("#twotabsearchtextbox");
            sleepFor(3);
            text= getTextFromWebElements("#searchDropdownBox option");
        }
    }


}
