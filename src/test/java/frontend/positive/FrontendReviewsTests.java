package frontend.positive;

import components.AdminNavigation;
import core.BaseTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.adminarea.AdminLogin;
import pages.adminarea.AdminReviews;
import pages.frontend.FrontendDesktops;
import pages.frontend.FrontendHome;
import pages.frontend.FrontendiMac;

public class FrontendReviewsTests extends BaseTest {
    @Test
    public void testFrontendReview() {
        FrontendHome.navigate();
        FrontendDesktops.chooseProduct();
        FrontendiMac.submitNewReview("Peppa Pig", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus auctor nulla nisi, quis ullamcorper leo pharetra vitae. Duis ornare dictum erat, eu congue diam mollis vitae. Donec luctus leo lacinia luctus tempus. Fusce ac nibh ligula. Sed facilisis dapibus velit, et porttitor enim vehicula ut. Proin tempor maximus sem, sit.");
        AdminLogin.navigate();
        AdminLogin.login("admin12", "parola123!");
        AdminNavigation.openCatalogMenu();
        AdminNavigation.openReviews();
        AdminReviews.enableReview();
        FrontendiMac.verifyNewReview("Peppa Pig");





    }

    @AfterMethod
    public void deleteNewReview() {
        AdminLogin.navigate();
        AdminLogin.login("admin12", "parola123!");
        AdminNavigation.openCatalogMenu();
        AdminNavigation.openReviews();
        AdminReviews.deleteNewReview();


    }
}
