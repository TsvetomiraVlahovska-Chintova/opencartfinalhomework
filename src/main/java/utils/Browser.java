package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    public static WebDriver driver;

    /**
     * Opens Chrome browser instance and sets Implicit wait for 10 seconds
     */
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Laptop Panda\\QA22\\5 Selenium\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    /**
     * Quits the browser and all windows created
     */
    public static void quit() {
        driver.quit();
    }

}
