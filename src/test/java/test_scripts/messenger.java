package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.LandingPage;
import page_objects.LoginPage;

public class messenger extends DriverWrapper {
    @Test
    public void messengerVerify(){
        LandingPage landingPage = new LandingPage();
        LoginPage loginPage = new LoginPage();

        landingPage.clickMessenger();
        landingPage.clickSignINbutton();
        //assertion
        Assert.assertEquals("Incorrect email or phone number", loginPage.getMessengerError());





    }
}
