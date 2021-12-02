package pages.adminarea;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import utils.Browser;

public class AdminGiftVouchers {

    /**
     * Checks whether a gift voucher with the same name already exists
     * @param expectedName the name of the gift voucher we want to create
     */

    public static void checkNameAvailability(String expectedName) {
        if (Browser.driver.findElement(By.cssSelector("table.table")).getText().contains(expectedName)) {
            Browser.driver.findElement(By.xpath("//td[contains(text(),'Peppa Pig')]/preceding-sibling::td/input[@type='checkbox']")).click();
            Browser.driver.findElement(By.cssSelector("button.btn-danger")).click();
            try {
                Alert alert = Browser.driver.switchTo().alert();

                alert.accept();
            } catch (NoAlertPresentException e) {
                e.printStackTrace();
            }
        }


    }


    /**
     * This method creates a new Gift Voucher
     */

    public static void addNew() {
        Browser.driver.findElement(By.cssSelector("div.pull-right a.btn-primary ")).click();
        Browser.driver.findElement(By.id("input-code")).sendKeys("0987654321");
        Browser.driver.findElement(By.id("input-from-name")).sendKeys("Peppa Pig");
        Browser.driver.findElement(By.id("input-from-email")).sendKeys("peppa@pig.com");
        Browser.driver.findElement(By.id("input-to-name")).sendKeys("Suzi Sheep");
        Browser.driver.findElement(By.id("input-to-email")).sendKeys("suzi@sheep.com");
        Browser.driver.findElement(By.id("input-amount")).sendKeys("5");
        Browser.driver.findElement(By.cssSelector("div.pull-right button.btn-primary")).click();





    }


    /**
     * Verifies that the new gift voucher has been successfully created
     * @param expectedName the name of the newly created gift voucher
     */

    public static void verifyNewGiftVoucher(String expectedName) {
        Assert.assertTrue(Browser.driver.findElement(By.cssSelector("table.table")).getText().contains(expectedName));

    }




//    /**
//     * This method deletes the newly created review
//     */
//
//    public static void deleteGiftVoucher() {
//        Browser.driver.findElement(By.xpath("//td[contains(text(),'Peppa Pig')]/preceding-sibling::td/input[@type='checkbox']")).click();
//        Browser.driver.findElement(By.cssSelector("button.btn-danger")).click();
//        try {
//            Alert alert = Browser.driver.switchTo().alert();
//
//            alert.accept();
//        } catch (NoAlertPresentException e) {
//            e.printStackTrace();
//        }
//    }
}
