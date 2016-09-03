package Window;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * Created by iqbal on 9/3/2016.
 */
public class NewWindow extends Base {
        public static WebDriver driver;

        @Test
        public void verifySearchInNewWindow() throws InterruptedException {
            driver = new FirefoxDriver();
            driver.navigate().to("http://linkedin.com/");
            driver.manage().window().maximize();
            String mainHandle = driver.getWindowHandle();

            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".links>ul>li>a")));
            driver.findElement(By.linkText("Help Center")).click();
            
            String searchText="Selenium";
            WebElement searchInputBox=driver.findElement(By.xpath(".//*[@id='desktop-search-query']"));
            searchInputBox.sendKeys(searchText);

            WebElement searchButton = driver.findElement(By.cssSelector(".submit-button.mobile-excluded.js-submit-button"));
            searchButton.click();

            closeAllOtherWindows(driver, mainHandle);
        }
}
