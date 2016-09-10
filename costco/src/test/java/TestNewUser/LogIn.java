package TestNewUser;

import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.factory.SignIn;

/**
 * Created by iqbal on 9/5/2016.
 */
public class LogIn extends Base{

        @Test
        public void SignUpTest() throws InterruptedException {
            //Initialize Login Page
            SignIn signIn = PageFactory.initElements(driver, SignIn.class);
            //Click on the Sign In button
            signIn.clickSetting();
            sleepFor(3);
            //Enter user name
            signIn.EnterUserName("iqbal99@gmail.com");
            //Enter Password
            signIn.EnterPassword("12345678");
            sleepFor(3);
            //Click Register Button
            signIn.ClickLoginButton();
            sleepFor(5);
        }

    }