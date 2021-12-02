package pages.adminarea;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.Select;
import utils.Browser;

public class AdminReviews {

    /**
     * This method enables the newly created review
     */

    public static void enableReview() {
        Browser.driver.findElement(By.xpath("//td[contains(text(),'Peppa Pig')]/following-sibling::td/a")).click();
        Select status = new Select(Browser.driver.findElement(By.id("input-status")));
        status.selectByValue("1");
        Browser.driver.findElement(By.cssSelector("button.btn-primary")).click();

    }




    /**
     * This method deletes the newly created review
     */

    public static void deleteNewReview() {
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
