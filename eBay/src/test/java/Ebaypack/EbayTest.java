package Ebaypack;

import common.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
/**
 * Created by iqbal on 8/31/2016.
 */

public class EbayTest extends Base {

    @Test(priority = 1)
    public void hoveroverstuff() throws InterruptedException {

        sleepFor(3);
        waitUntilClickAble(By.linkText("Electronics"));
        mouseHoverBylink("Electronics");
        sleepFor(5);
        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/div[2]/div[1]/ul[1]/li[3]/a");
        sleepFor(5);
    }

    @Test(priority = 2)

    public void searchEbay() throws InterruptedException {
        sleepFor(5);
        typeByXpath(".//*[@id='gh-ac']", "Salt");
        clickByXpath(".//*[@id='gh-btn']");
        sleepFor(5);
    }

    @Test(priority = 3)

    public void scrollfind() throws InterruptedException {
        sleepFor(5);

        scrollToElementByxpath(".//*[@id='featuredCollectionsFragment']/div/div[2]/div[11]/div[3]/div[1]/h3/a");
        sleepFor(10);
    }

    @Test(priority = 4)
    public void scroll() throws InterruptedException {
        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[7]/a");
        scrollPageDown200();
        sleepFor(3);
        scrollPageup400();
        sleepFor(3);
        scrollPageDown200();
        sleepFor(3);
        scrollPageup400();
    }

//    @Test(priority = 5)
//    public void loginChk() throws InterruptedException{
//
//        driver.findElement(By.cssSelector("#formDiv" "#pri_signin" ".fld"  ));
//
//    }

}