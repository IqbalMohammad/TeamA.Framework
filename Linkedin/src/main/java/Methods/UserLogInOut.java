package Methods;


import PageFactory.AllMethods;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by iqbal on 9/17/2016.
 */
public class UserLogInOut extends FromMySql {
    //    public boolean LoggedIn = false;
    AllMethods methods = PageFactory.initElements(driver, AllMethods.class);

    public void UserLogIn() throws Exception {
        String[] userInfo = signUpData();
//        if (!LoggedIn) {
        methods.FirstNameInput(userInfo[0]);
        sleepFor(2);
        methods.LastNameInput(userInfo[1]);
        sleepFor(2);
        methods.EmailInput(userInfo[2]);
        sleepFor(2);
        methods.PassInput(userInfo[3]);
        sleepFor(2);
        methods.Regitrstion();

//            LoggedIn = true;
    }

}