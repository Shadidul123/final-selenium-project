package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.LandingPage;
import page_objects.LoginPage;

import java.util.ArrayList;

public class testhomework extends DriverWrapper {


    @Test
    public void test() {
        LandingPage landingPage = new LandingPage();
        LoginPage loginPage = new LoginPage();

        ArrayList<String> emails = new ArrayList<>();
        emails.add("plainaddress");
        emails.add("#@%^%#$@#$@#.com");
        emails.add("@example.com");
        emails.add("Joe Smith <email@example.com>");
        emails.add("email.example.com");
        emails.add("email@example@example.com");
        emails.add(".email@example.com");
        emails.add("email.@example.com");
        emails.add("email..email@example.com");
        emails.add("あいうえお@example.com");
        emails.add("email@example.com (Joe Smith)");
        emails.add("email@example");
        emails.add("email@-example.com");
        emails.add("email@example.web");
        emails.add("email@111.222.333.44444");
        emails.add("email@example..com");
        emails.add("Abc..123@example.com");


        for (String email : emails) {
            landingPage.enterName("smtih");
            landingPage.enterLName("bob");
            landingPage.enterMobileorEmailButton(email);
            landingPage.enterNewPass("aer123234@@!");
            landingPage.clickGender();
            landingPage.clickSignUpButton();
            //LANDING PAGE . CLEAR??
            Assert.assertEquals("Please enter a valid mobile number or email address.", loginPage.getEmailError());

        }
    }
}


        //create array of all the emails

        //for each email:emails
        //sendthe email to the webelement
        //capture the message

