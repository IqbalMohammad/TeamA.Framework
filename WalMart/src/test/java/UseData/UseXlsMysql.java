package UseData;

import common.Base;
import dataRead.FromFile;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iqbal on 9/9/2016.
 */
public class UseXlsMysql extends Base {

    FromFile readData = new FromFile();
        List<String> list = new ArrayList<String>();
        @Test
        public void searchByKey()throws Exception{
            String [] key = readData.getActionName();
            for(String item:key){
                if(item!=null) {
                    chooseAction(item);
                }
            }
        }

        public void chooseAction(String action)throws Exception {
            if (action.equals("TypeOnSearch")) {
                TypeOnSearch();

            } else if (action.equals("ClickOnSearch")) {
                ClickOnSearch();
            } else {
                System.out.println("Invalid Input");

            }
        }

        public List<String> getData()throws Exception{
            String [] st = readData.getData();
            String data = "";
            for(String fetch:st){
                list.add(fetch);
            }
            return list;
        }

        public void TypeOnSearch()throws Exception{
            for(int i=0; i<list.size(); i++) {
                typeByCss("#global-search-input", getData().get(i));
            }
        }
         public void ClickOnSearch() throws InterruptedException {
            clickByCss(".header-GlobalSearch-submit.btn");
            sleepFor(5);
         }
}