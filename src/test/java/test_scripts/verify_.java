package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.LandingPage;
import page_objects.LoginPage;

public class verify_ extends DriverWrapper {


    @Test
    public void verifyInvalidLogin() {
        LandingPage landingPage = new LandingPage(); //basically does all the sending/clicking
        LoginPage loginPage = new LoginPage(); //does the retreieving (text/erorr msg)


        landingPage.enterName("Sayeem");
        landingPage.enterLName("Hossain");
        landingPage.enterNumber("123232");
        landingPage.enterNewPass("ASD123@@!!");

        landingPage.clickLoginButton();
        //Assertion
        Assert.assertEquals("The email or phone numbe r you’ve entered doesn’t match any account. Sign up for an account.", loginPage.getSignError());  //i cahnge the x-value
    }




}