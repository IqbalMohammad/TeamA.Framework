package SearchData;

import utility.DataReader;
import java.io.IOException;


/**
 * Created by iqbal on 9/4/2016.
 */
public class SearchFromXls {

    DataReader dr = new DataReader();
    public String [] getData()throws IOException {
        String path = System.getProperty("user.dir")+"/data/file1.xls";
        String [] st = dr.fileReader(path);
        return st;
    }
}
