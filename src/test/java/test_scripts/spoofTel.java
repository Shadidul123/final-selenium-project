package test_scripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import page_objects.LandingPage;

public class spoofTel extends DriverWrapper {
    @Test
    public void makeCall() throws InterruptedException {
        getDriver().manage().window().maximize();
        Thread.sleep(3000);
        LandingPage landingPage = new LandingPage();
        Long l = Long.parseLong("6463745434");
        Long x = Long.parseLong("3477618002");
        Long s = Long.parseLong("3473238223");
        for (int a = 0; a < 100; a++) {
            landingPage.enterSpoofEmail("0Mazu");
            landingPage.enterSpoofPass("Ass123@@");
            landingPage.clickSpoofLogIn();
            Thread.sleep(2000);

            String num = s.toString();
            String emuPhone = x.toString();
            String spoofNum = l.toString();

            //Thread.sleep(2000);
            landingPage.clickCall();
            Thread.sleep(2000);
            landingPage.enterFromNum(num);
            Thread.sleep(3000);
            landingPage.enterToNum(emuPhone);
            Thread.sleep(3000);
            landingPage.enterSpoofNum(spoofNum);
            Thread.sleep(7000);
            getDriver().switchTo().frame("oauth2relay<>");
            Thread.sleep(2000);
            landingPage.placeCall();
            Thread.sleep(1500);
            //l+=148;
            //landingPage.finalCall();
        }
    }
}
