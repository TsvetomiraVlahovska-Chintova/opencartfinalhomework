package pages.frontend;

import org.openqa.selenium.By;
import utils.Browser;

public class FrontendDesktops {

    /**
     * This method chooses the product to be reviewed
     */

    public static void chooseProduct() {
        Browser.driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).click();
        Browser.driver.findElement(By.xpath("//ul[@class='list-unstyled']/li[2]/a[text()='Mac (1)']")).click();
        Browser.driver.findElement(By.cssSelector("div.caption a")).click();

    }
}
