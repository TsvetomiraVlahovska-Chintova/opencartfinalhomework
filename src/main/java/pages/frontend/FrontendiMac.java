package pages.frontend;


import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;

public class FrontendiMac {

    /**
     * This method submits a new review
     * @param name the name of the customer
     *
     * @param review the actual review
     */


    public static void submitNewReview(String name, String review) {
        Browser.driver.findElement(By.xpath("//ul[@class='nav nav-tabs']/li[2]/a")).click();
        Browser.driver.findElement(By.id("input-name")).sendKeys(name);
        Browser.driver.findElement(By.id("input-review")).sendKeys(review);
        Browser.driver.findElement(By.cssSelector("input[value='5']")).click();
        Browser.driver.findElement(By.id("button-review")).click();
    }


    /**
     * This method verifies that the newly created review has been enabled
     * @param expectedName the name of the customer that submitted the review
     */

    public static void verifyNewReview(String expectedName) {
        Browser.driver.get("http://shop.pragmatic.bg/index.php?route=common/home");
        Browser.driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).click();
        Browser.driver.findElement(By.xpath("//ul[@class='list-unstyled']/li[2]/a[text()='Mac (1)']")).click();
        Browser.driver.findElement(By.cssSelector("div.caption a")).click();
        Browser.driver.findElement(By.xpath("//ul[@class='nav nav-tabs']/li[2]/a")).click();
        Assert.assertTrue(Browser.driver.findElement(By.id("review")).getText().contains(expectedName));

    }
}
