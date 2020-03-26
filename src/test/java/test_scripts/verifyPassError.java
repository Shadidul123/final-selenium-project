package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.LandingPage;
import page_objects.LoginPage;

public class verifyPassError extends DriverWrapper {
    @Test

    public void VerifyPassword(){
        LandingPage landingPage = new LandingPage();
        LoginPage loginPage = new LoginPage();

        landingPage.enterEmail("shadidul123@gmail.com");
        landingPage.enterPassword("amamamam23232");
        landingPage.clickLoginButton();
        //assertion
        Assert.assertEquals("The password you’ve entered is incorrect. Forgot Password?", loginPage.getPassError());


    }
}
