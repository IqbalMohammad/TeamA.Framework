package SignUp;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by iqbal on 9/2/2016.
 */
public class InputType extends Base {

    @Test
    public void Text() throws InterruptedException{

        List<WebElement> txtfields = driver.findElements(By.xpath("//input[@type='form-control' or @type='global-search-input']"));

        for(int a=0; a<txtfields.size();a++){
            txtfields.get(a).sendKeys("Text"+(a+1));
        }
        Thread.sleep(3000);
    }

    @AfterTest
    public void CloseBrowser() {
        driver.quit();
    }
}

