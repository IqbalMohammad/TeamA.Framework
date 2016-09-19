package PageFactory;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by iqbal on 9/17/2016.
 */
public class AllMethods extends Base {

    @FindBy(how = How.XPATH, using = ".//*[@id='reg-firstname']")
    public static WebElement FirstName;

    public void FirstNameInput(String Name) {
        FirstName.sendKeys(Name);
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='reg-lastname']")
    public static WebElement LastName;

    public void LastNameInput(String Name) {
        LastName.sendKeys(Name);
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='reg-email']")
    public static WebElement Email;

    public void EmailInput(String Mail) {
        Email.sendKeys(Mail);
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='reg-password']")
    public static WebElement Password;

    public void PassInput(String Pass) {
        Password.sendKeys(Pass);
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='registration-submit']")
    public static WebElement RegSubmit;

    public void Regitrstion() {
        RegSubmit.click();
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='login-email']")
    public static WebElement LoginEmail;

    public void SignInMail(String login) {
        LoginEmail.sendKeys(login);
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='login-password']")
    public static WebElement LoginPass;

    public void SignInPassword(String login) {
        LoginPass.sendKeys(login);
    }
}