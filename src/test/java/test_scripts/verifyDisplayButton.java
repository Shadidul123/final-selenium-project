package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.LandingPage;

public class verifyDisplayButton extends DriverWrapper {
    @Test
    public void testBooleanActions(){
        LandingPage landingPage = new LandingPage();


        Assert.assertTrue(landingPage.isLoginButtonDisplayed());//test willpass only if value is true
        //Assert.assertFalse(); //has to be false for the test to pass

    }
}
