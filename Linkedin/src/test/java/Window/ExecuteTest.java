package Window;

import ReadObject.ObjectFileReader;
import ReadObject.UIOperation;
import ReadXl.XlFileRead;
import common.Base;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.Test;

import java.util.Properties;

/**
 * THIS IS THE EXAMPLE OF KEYWORD DRIVEN TEST CASE
 *
 */
public class ExecuteTest extends Base{
    @Test
	public void testLogin() throws Exception {

       XlFileRead file = new XlFileRead();
        ObjectFileReader object = new ObjectFileReader();
        Properties allObjects =  object.getObjectRepository();
        UIOperation operation = new UIOperation(driver);
        //Read keyword sheet
        Sheet sheet = file.readExcel(System.getProperty("user.dir")+"\\","\\data\\TestCase.xls" , "Sheet1");
        //Find number of rows in excel file
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		//Create a loop over all the rows of excel file to read it
    	for (int i = 1; i < rowCount+1; i++) {
    		//Loop over all the rows
    		Row row = sheet.getRow(i);
    		//Check if the first cell contain a value, if yes, That means it is the new testcase name
    		if(row.getCell(0).toString().length()==0){
    		//Print testcase detail on console
    			System.out.println(row.getCell(1).toString()+"----"+ row.getCell(2).toString()+"----"+
    			row.getCell(3).toString()+"----"+ row.getCell(4).toString());
    		//Call perform function to perform operation on UI
    			operation.perform(allObjects, row.getCell(1).toString(), row.getCell(2).toString(),
    				row.getCell(3).toString(), row.getCell(4).toString());
    	    }
    		else{
    			//Print the new  testcase name when it started
    				System.out.println("New Testcase->"+row.getCell(0).toString() +" Started");
    			}

    			sleepFor(6);
    		}
	}

}