package TestNewUser;

import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.factory.SignUp;

/**
 * Created by iqbal on 9/5/2016.
 */
public class AddUser extends Base{

    @Test
    public void SignUpTest() throws InterruptedException {
        //Initialize Login Page
        SignUp signUp = PageFactory.initElements(driver, SignUp.class);
        //Click on the Sign In button
        signUp.clickSetting();
        sleepFor(3);
        //Enter user name
        signUp.EnterEmail("iqbal99@gmail.com");
        //Enter Password
        signUp.EnterPassword("12345678");
        sleepFor(3);

        //Password verify Button
        signUp.EnterPasswordAgain("A12345678");
        sleepFor(3);

        //Click Register Button
        signUp.ClickLoginButton();
        sleepFor(5);
    }

}


