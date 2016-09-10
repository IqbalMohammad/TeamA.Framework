package page.factory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by iqbal on 9/5/2016.
 */
public class SignIn {

    //Define Link
    @FindBy(how = How.CSS, using = "#header_sign_in")
    private WebElement settingLink;

    //Define User name Field
    @FindBy(how = How.ID, using="#logonId")
    private WebElement usernameField;

    //Define Password Field
    @FindBy(how = How.ID, using="#logonPassword")
    private WebElement passwordField;

    //Define Login Button
    @FindBy(how = How.ID, using=".submit.costco-button")
    private WebElement loginButton;

    //Click on the SignIn button
    public void clickSetting(){
        settingLink.click();
    }

    //Define User name Enter Method
    public void EnterUserName(String usernametext)
    {
        usernameField.sendKeys(usernametext);
    }

    //Define Password Enter Method
    public void EnterPassword(String passwordtext)
    {
        passwordField.sendKeys(passwordtext);
    }

    //Define Login Button Click Method
    public void ClickLoginButton()
    {
        loginButton.click();
     }
}