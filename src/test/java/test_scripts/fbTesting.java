package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.LandingPage;
import page_objects.LoginPage;

import java.util.ArrayList;
import java.util.Arrays;

public class fbTesting extends DriverWrapper {
    @Test
    public void testFB() throws InterruptedException {
        LandingPage landingPage = new LandingPage();
        LoginPage loginPage = new LoginPage();

        for (String e:Arrays.asList("plain address", "#@$@#$#@$@#$@.com", "email.example.com")){
            landingPage.enterName("Josh");
            landingPage.enterLName("Blake");
            landingPage.enterMobileorEmailButton(e);
            landingPage.enterNewPass("2342343asdf@@A24234234");
            landingPage.clickGender();
            landingPage.clickSignUpButton();
            Thread.sleep(1000);
            Assert.assertEquals(loginPage.getEmailError(),"Please enter a valid mobile number or email address.", "not invalid email");
            landingPage.clearField();
            Thread.sleep(3000);



        }


    }
}
