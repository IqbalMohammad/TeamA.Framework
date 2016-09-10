package SearchCreateLoginPF;

import common.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by iqbal on 9/9/2016.
 */
public class Search extends Base {

    @FindBy(how = How.CSS, using = "#global-search-input")
    public WebElement SearchText;

    //Writing on the searchbox
    public void inputText(String SearchKeyword){
        SearchText.sendKeys(SearchKeyword, Keys.ENTER);
    }

//    @FindBy(how = How.CSS, using = ".header-GlobalSearch-submit.btn")
//    public static WebElement Search;

    @FindBy(how = How.XPATH, using = ".//*[@id='tile-container']/div[1]/div/div/h4/a")
    public static WebElement FirstLink;

    public void searchResult1(){FirstLink.click();}

    @FindBy(how = How.XPATH, using = ".//*[@id='WMItemAddToCartBtn']")
    public static WebElement AddCart;

    public void AddToCart(){AddCart.click();}

    @FindBy(how = How.XPATH, using = ".//*[@id='spa-layout']/div/div/div/div/div[2]/div/div[1]/div[2]/div/div[7]/div/div/div/div/div[2]/form/div[2]/div[2]/label")
    public static WebElement ChoosePlan;

    public void ChooseAPlan(){ChoosePlan.click();}

    @FindBy(how=How.XPATH, using = ".//*[@id='PACCheckoutBtn']")
    public static WebElement CheckOut;

    public void CheckOutTo(){CheckOut.click();}

    @FindBy(how=How.XPATH, using = "html/body/div[1]/div/div[2]/div/div[4]/div/div/div/div[1]/div/div/div/div/div/div/div[1]/div/section/section/form/div[1]/label/div/input")
    public static WebElement LogInId;

    @FindBy(how=How.XPATH, using = "html/body/div[1]/div/div[2]/div/div[4]/div/div/div/div[1]/div/div/div/div/div/div/div[1]/div/section/section/form/div[2]/div/label[1]/div/input")
    public static WebElement UserPass;

    @FindBy(how=How.XPATH, using = "html/body/div[1]/div/div[2]/div/div[4]/div/div/div/div[1]/div/div/div/div/div/div/div[1]/div/section/section/form/div[4]/button")
    public static WebElement LoginBtn;

public void Login(String email, String Pass)
    {
        LogInId.sendKeys(email);
        UserPass.sendKeys(Pass);
        LoginBtn.click();
    }

}
