package test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page_objects.LandingPage;
import page_objects.LoginPage;

public class testNike extends DriverWrapper {

    @Test
    public void nikeStuff() throws InterruptedException {
        LandingPage landingPage = new LandingPage();
        LoginPage loginPage = new LoginPage();

        landingPage.clickNikeSignUp();
        Thread.sleep(2000);
        WebElement frame= getDriver().findElement(By.xpath("//iframe[@src='https://unite.nike.com/session.html']"));
        getDriver().switchTo().frame(frame);
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//div[@id='keepMeLoggedIn']//label[@class='checkbox']")).click();
        Thread.sleep(2000);





    }





}
