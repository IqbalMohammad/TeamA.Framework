package page.factory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by iqbal on 9/5/2016.
 */
public class SignUp {

    //Define Link
    @FindBy(how = How.CSS, using = "#header_sign_in")
    private WebElement settingLink;

    //Define User name Field
    @FindBy(how = How.CSS, using = "#register_email1")
    public WebElement emailField;

    @FindBy(how = How.CSS, using = "#register_logonPassword")
    private WebElement passwordField;

    @FindBy(how = How.CSS, using = "#register_logonPasswordVerify")
    private WebElement passwordVerify;

    @FindBy(how = How.XPATH, using = ".//*[@id='RegisterForm']/div[7]/button")
    private WebElement registerButton;

    //Click on the SignIn button
    public void clickSetting(){
        settingLink.click();
    }

    //Define email Enter Method
    public void EnterEmail(String emailtext){
        emailField.sendKeys();
    }

    //Define Password Enter Method
    public void EnterPassword(String passwordtext){
        passwordField.sendKeys(passwordtext);
    }

    //Define verify password Method
    public void EnterPasswordAgain(String passwordVerifyText){
        passwordVerify.sendKeys();
    }

    //Define Login Button Click Method
    public void ClickLoginButton(){
        registerButton.click();
    }
}

