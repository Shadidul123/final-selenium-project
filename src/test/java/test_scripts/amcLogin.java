package test_scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.LandingPage;
import page_objects.LoginPage;

import java.util.ArrayList;
import java.util.List;

public class amcLogin extends DriverWrapper {
    @Test

    public void testAmc() throws InterruptedException {
        LandingPage landingPage = new LandingPage();

        ArrayList<String> emails = new ArrayList<>();
        emails.add("fuamagi@gmail.com");
        emails.add("efadsf@gmail.com");
        ArrayList<String> passwords = new ArrayList<>();
        passwords.add("Ass123@@");
        passwords.add("1232323");
        int emailsSize = emails.size();
        System.out.println(emailsSize);


//
//
//        for(int index = 0; index<emailsSize; index++){
//            landingPage.enterFanEmail(emails.get(index));
//            landingPage.enterFanPass(passwords.get(index));
//            landingPage.clickSigninFan();
//            Thread.sleep(2000);
//            if (getDriver().findElement(By.xpath("//a[contains(text(),'Hello')]")).getText().contains("Hello")){
//                ArrayList<String> hits = new ArrayList<>();
//                hits.add(emails.get(index)+ ":"+passwords.get(index));
//            }
//            landingPage.clearField();
//            Thread.sleep(2000);
//        }



//        for (int index = 0; index < emailsSize; index++) {
//            for (String email : emails) {
//                landingPage.enterFanEmail(email);
//            }
//
//            for (String password : passwords) {
//                landingPage.enterFanPass(password);
//            }
//            landingPage.clickSigninFan();
//
//            landingPage.clearField();
//
//
//        }

//        landingPage.enterFanEmail("ffafds@gmail.com");
//        landingPage.enterFanPass("12323");
//        landingPage.clickSigninFan();

    }
}
