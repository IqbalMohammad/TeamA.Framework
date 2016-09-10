package search.data;

import common.Base;
import org.testng.annotations.Test;
import search.data.reader.ReadData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iqbal on 8/29/2016.
 */

public class SearchNews extends Base {
    ReadData readData = new ReadData();
    List<String> list = new ArrayList<String>();
    @Test
    public void searchNewsByKey()throws Exception{
        String [] news = readData.getActionName();
        for(String item:news){
            if(item!=null) {
                chooseAction(item);
            }
        }
    }

    public void chooseAction(String action)throws Exception {
        if (action.equals("ClickOnSearch")) {
            ClickOnSearch();

        } else if (action.equals("TypeOnSearch")) {
            TypeOnSearch();

        } else {
            System.out.println("Invalid Input");

        }
    }

    public List<String> getNewsData()throws Exception{
        String [] st = readData.getData();
        String data = "";
        for(String fetch:st){
            list.add(fetch);
        }
        return list;
    }
    //action steps method
    public void ClickOnSearch() {
        clickByXpath(".//*[@id='search-button']");
    }
    public void TypeOnSearch()throws Exception{
        for(int i=0; i<list.size(); i++) {
            typeByXpath(".//*[@id='search-input-field']", getNewsData().get(i));
        }
    }

}