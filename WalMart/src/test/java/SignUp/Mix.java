package SignUp;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;


/**
 * Created by iqbal on 9/2/2016.
 */
public class Mix extends Base {

    @Test
    public void test() throws InterruptedException {
        try {
            List<WebElement> no = driver.findElements(By.tagName("a"));
            int nooflinks = no.size();
            System.out.println(nooflinks);
            for (WebElement pagelink : no) {
                String linktext = pagelink.getText();
                String link = pagelink.getAttribute("href");
                System.out.println(linktext + " ->");
                System.out.println(link);
            }
        } catch (Exception e) {
            System.out.println("error " + e);
        }

    }
}