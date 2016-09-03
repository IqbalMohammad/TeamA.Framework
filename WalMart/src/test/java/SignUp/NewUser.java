package SignUp;


import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * Created by iqbal on 8/31/2016.
 */
public class NewUser extends Base {

    @Test
    public void testRegister() throws InterruptedException

    {

//        driver.findElement(By.linkText("My Account")).click();

//        sleepFor(3);
        waitUntilClickAble(By.linkText("My Account"));
        mouseHoverBylink("My Account");
        //sleepFor(5);
//        clickByXpath("html/body/div[1]/div/div/div/header/div/div[2]/div/div/div/div/div/div[6]/div/div/div/div[2]/button");
        // clickByXpath("html/body/div[1]/div/div/div/header/div/div[2]/div/div/div/div/div/div[6]/div/div/div/div[2]/div[1]/ul/li[2]/div/a");

        //sleepFor(5);

// driver.findElement(By.linkText("Create An Account")).click();

//        driver.findElement(By.xpath("html/body/div[1]/div/div/div/header/div/div[2]/div/div/div/div/div/div[6]/div/div/div/div[2]/div[1]/ul/li[2]/div/a")).click();

//        Actions actions = new Actions(driver);
//        WebElement mainMenu = driver.findElement(By.linkText("My Account"));
//        actions.moveToElement(mainMenu);

//        WebElement subMenu = driver.findElement(By.xpath("html/body/div[1]/div/div/div/header/div/div[2]/div/div/div/div/div/div[6]/div/div/div/div[2]/div[1]/ul/li[2]/div/a"));
//        actions.moveToElement(subMenu);
//        actions.click().build().perform();
        Actions actions = new Actions(driver);
        WebElement moveonmenu = driver.findElement(By.xpath("html/body/div[1]/div/div/div/header/div/div[2]/div/div/div/div/div/div[6]/div/div/div/div[2]/button"));
        actions.moveToElement(moveonmenu).moveToElement(driver.findElement(By.xpath("html/body/div[1]/div/div/div/header/div/div[2]/div/div/div/div/div/div[6]/div/div/div/div[2]/div[1]/ul/li[2]/div/a"))).click().perform();
//        actions.moveToElement(moveonmenu).moveToElement(driver.findElement(By.xpath("html/body/div[1]/div/div/div/header/div/div[2]/div/div/div/div/div/div[1]/nav/div/div/div/div[2]/div[1]/div[2]/a[2]"))).click().perform();
        WebDriverWait wait = new WebDriverWait(driver, 15);


        driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/section/form/label[1]/div/input")).sendKeys("Mohammad");
        driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/section/form/label[2]/div/input")).sendKeys("Iqbal");
        driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/section/form/label[3]/div/input")).sendKeys("iqbal99@gmail.com");
        driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/section/form/div[2]/div/label[1]/div/input")).sendKeys("1234abcd");
        driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/section/form/div[4]/div/label")).click();
        driver.findElement(By.xpath("\"html/body/div[1]/div/div[2]/div/section/form/div[5]/button\"")).click();
        sleepFor(4);
        driver.close();
        driver.quit();

    }

}

