package adminarea.positive;

import components.AdminNavigation;
import core.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.adminarea.AdminGiftVouchers;
import pages.adminarea.AdminLogin;

public class AdminGiftVouchersTests extends BaseTest {
    @Test
    public void testCreateNewGiftVoucher() {
        AdminLogin.navigate();
        AdminLogin.login("admin12", "parola123!");
        AdminNavigation.openSalesMenu();
        AdminNavigation.openGiftVouchersMenu();
        AdminNavigation.openGiftVouchers();
        AdminGiftVouchers.checkNameAvailability("Peppa Pig");
        AdminGiftVouchers.addNew();
        AdminGiftVouchers.verifyNewGiftVoucher("Peppa Pig");

    }

//   @AfterMethod public void delete() {
//        AdminGiftVouchers.deleteGiftVoucher();
//   }




}
