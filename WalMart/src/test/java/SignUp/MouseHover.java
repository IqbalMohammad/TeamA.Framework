package SignUp;

import common.Base;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by iqbal on 9/2/2016.
 */
public class MouseHover extends Base{

    @Before
    public void beforetest() {
        driver.manage().window().maximize();
    }

    @After
    public void aftertest() {
        driver.quit();

    }

    @Test
    public void test() throws InterruptedException, IOException {

        Actions actions = new Actions(driver);
        WebElement moveonmenu = driver.findElement(By.xpath("html/body/div[1]/div/div/div/header/div/div[2]/div/div/div/div/div/div[1]/nav/button[1]"));
        actions.moveToElement(moveonmenu).moveToElement(driver.findElement(By.xpath("html/body/div[1]/div/div/div/header/div/div[2]/div/div/div/div/div/div[1]/nav/div/div/div/div[1]/div/button[1]"))).click().perform();
        actions.moveToElement(moveonmenu).moveToElement(driver.findElement(By.xpath("html/body/div[1]/div/div/div/header/div/div[2]/div/div/div/div/div/div[1]/nav/div/div/div/div[2]/div[1]/div[2]/a[2]"))).click().perform();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.titleContains("Electronics&Office"));
    }

}