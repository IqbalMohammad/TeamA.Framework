package Methods;

import common.Base;
import utility.ConnectMySqlDB;

import java.io.IOException;
import java.sql.*;

/**
 * Created by iqbal on 9/17/2016.
 */
public class FromMySql extends Base{

    Connection connect = null;
    Statement statement = null;
    ResultSet resultSet = null;
//    public String[] loginCredential() throws SQLException, IOException, ClassNotFoundException {
//        ConnectMySqlDB objMySqlObj = new ConnectMySqlDB();
//
//        String LoginId = "";
//        String LoginPass = "";
//        String[] loginCre = {"test1", "test1"};
//        connect = objMySqlObj.connectToDatabase2();
//        statement = connect.createStatement();
//        // statement = connect.createStatement();
//        resultSet = statement.executeQuery("select * from tbl_test_module_login_access where ModuleName = 'Target'");
//
//
//        if (resultSet.next()) {
//            loginCre[0] = resultSet.getString(3);
//            loginCre[1] = resultSet.getString(4);
//
//        }
//        return loginCre;
//    }


    public String[] signUpData() throws SQLException, IOException, ClassNotFoundException {
        ConnectMySqlDB sqlCon = new ConnectMySqlDB();
        String[] loginCre = {"FirstName", "LastName", "Email", "Password"};
        connect = sqlCon.connectToDatabase();
        statement = connect.createStatement();
        resultSet = statement.executeQuery("select * from newuser");


        if (resultSet.next()) {
            loginCre[0] = resultSet.getString(2);
            loginCre[1] = resultSet.getString(3);
            loginCre[2] = resultSet.getString(4);
            loginCre[3] = resultSet.getString(5);

        }
        return loginCre;
    }
}
