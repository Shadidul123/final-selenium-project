package test_scripts;

import org.testng.annotations.Test;
import page_objects.LandingPage;
import page_objects.LoginPage;

public class practiceTest extends DriverWrapper{
    @Test
    public void verifyStuff(){
        LandingPage landingPage = new LandingPage();
        LoginPage loginPage = new LoginPage();

        landingPage.newShit();



    }
}
