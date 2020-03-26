package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.LandingPage;
import page_objects.LoginPage;

public class verifyGenderErrorMsg extends DriverWrapper {

    @Test
    public void verifyGenderMsg(){
        LandingPage landingPage = new LandingPage();
        LoginPage loginPage = new LoginPage();



        landingPage.enterName("test");
        landingPage.enterLName("test");
        landingPage.enterNumber("8883338888");
        landingPage.enterNewPass("whatever");
        landingPage.clickSignUpButton();

        //Assertion
        Assert.assertEquals("Please choose a gender. You can change who can see this later.",loginPage.getGenderError());






    }



}
