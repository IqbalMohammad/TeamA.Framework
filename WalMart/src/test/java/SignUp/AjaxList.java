package SignUp;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by iqbal on 9/2/2016.
 */
public class AjaxList extends Base {

    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
    }

    @DataProvider(name="search-data")
    public Object[][] dataProviderTest(){
        return new Object[][]{{"laptop"},{"book"}};
    }

    @Test(dataProvider="search-data")
    public void Search_Test(String Search){
        driver.findElement(By.xpath(".//*[@id='global-search-input']")).clear();
        driver.findElement(By.xpath(".//*[@id='global-search-input']")).sendKeys(Search);

        WebElement autoOption = driver.findElement(By.cssSelector(".header-Typeahead-row.is-hovered>a"));
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.visibilityOf(autoOption));

        // Store the all auto suggests element in the list
        List<WebElement> optionsToSelect = autoOption.findElements(By
                .tagName("li"));
        for (WebElement option : optionsToSelect) {

            // Compare Expected to available options in list and select if
            // present
            String textToSelect = "Store";
            if (option.getText().equals(textToSelect)) {
                System.out.println("Trying to select: " + textToSelect);
                option.click();
                break;
            }
        }

        int i = 1;
        int j = i + 1;
        try {
            for (i = 1; i < j; i++) {
                String suggestion = driver.findElement(By.xpath(".//*[@id='global-search-dropdown']/div[" + i + "]")).getText();
                System.out.println(suggestion);
                j++;
            }
        } catch (Exception e) {
            System.out.println("No suggestion found");
        }
    }
}