package ReadXl;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by iqbal on 9/16/2016.
 */
public class XlFileRead {

        public Sheet readExcel(String filePath,String fileName,String sheetName) throws IOException{
            //Create a object of File class to open xls file
            File file =	new File(filePath+"\\"+fileName);
            //Create an object of FileInputStream class to read excel file
            FileInputStream inputStream = new FileInputStream(file);
            Workbook workbook = null;
            //Find the file extension by spliting file name in substing and getting only extension name
            String fileExtensionName = fileName.substring(fileName.indexOf("."));
            //Check condition if the file is xls file
            if(fileExtensionName.equals(".xls")){
                workbook = new HSSFWorkbook(inputStream);
            }
            //Read sheet inside the workbook by its name
            Sheet  sheet = workbook.getSheet(sheetName);
            return sheet;
        }
    }