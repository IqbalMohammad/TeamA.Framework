package login;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by mahedi on 8/26/2016.
 */
public class FBlogin extends Base{
    @Test
    public void test1() throws InterruptedException {
        driver.findElement(By.cssSelector("#email")).sendKeys("geom_2007@yahoo.com",Keys.END);
        driver.findElement(By.cssSelector("#pass")).sendKeys("paviliong4",Keys.ENTER);
        Thread.sleep(5000);
    }

}