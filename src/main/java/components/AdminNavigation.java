package components;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Browser;

public class AdminNavigation {

    /**
     * This method open the Sales Menu in the Navigation menu
     */

    public static void openSalesMenu() {
        Browser.driver.findElement(By.cssSelector("#menu-sale > a")).click();
    }

    /**
     * This method open the Gift Voucher Menu in the Sales menu
     */

    public static void openGiftVouchersMenu() {
        WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='collapse4']//li[4]/a")));

        Browser.driver.findElement(By.xpath("//ul[@id='collapse4']//li[4]/a")).click();
    }

    /**
     * This method opens the Gift Voucher section in the Gift Voucher menu
     */

    public static void openGiftVouchers() {
        Browser.driver.findElement(By.xpath("//ul[@id='collapse4-3']/li[1]/a ")).click();

    }


    /**
     * This method open the Catalog menu in the Navigation menu
     */

    public static void openCatalogMenu() {
        Browser.driver.findElement(By.id("menu-catalog")).click();
    }

    /**
     * This method opens the Reviews section in the Catalog menu in the Navigation menu
     */

    public static void openReviews() {
        WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='collapse1']/li[9]/a ")));
        Browser.driver.findElement(By.xpath("//ul[@id='collapse1']/li[9]/a ")).click();
    }


}
