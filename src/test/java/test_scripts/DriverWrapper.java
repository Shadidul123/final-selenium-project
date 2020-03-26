package test_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverWrapper {

    private static WebDriver driver;
    private static String nikeUrl = "https://www.nike.com/";
    private static String  hotelUrl = "https://www.hotels.com/";
    private static String amcUrl = "https://www.fandango.com/account/signin?from=%2F";
    private static String neimanUrl = "https://www.neimanmarcus.com/account/login.jsp";
    private static String nordUrl = "https://shop.nordstrom.com/";
    private static String fbUrl = "https://www.facebook.com/";
    private static String bloomUrl = "https://www.bloomingdales.com/account/signin";
    private static String spoofUrl = "https://www.spooftel.com/";
    private static String amazonUrl = "https://www.amazon.com/";
    @BeforeClass
    public void beforeClass() {
        //setChromedriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        //init webdriver object
        driver = new ChromeDriver();
        //navigate to the url
        driver.navigate().to(hotelUrl);

    }

    @AfterClass
    public void afterClass() throws InterruptedException {
        //quit the browser
        Thread.sleep(500);
        //driver.quit();
       // driver.manage().deleteAllCookies();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static String getUrl() {
        return nikeUrl;
    }
}
