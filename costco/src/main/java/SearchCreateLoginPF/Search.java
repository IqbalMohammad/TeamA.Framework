package SearchCreateLoginPF;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by iqbal on 9/9/2016.
 */
public class Search {

    @FindBy(how = How.CSS, using = "#global-search-input")
    private WebElement settingLink;

    //Click on the SignIn button
    public void clickSetting(){
        settingLink.click();
    }

}
