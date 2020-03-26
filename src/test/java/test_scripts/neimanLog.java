package test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import page_objects.LandingPage;
import page_objects.LoginPage;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class neimanLog extends DriverWrapper {
    @Test
    public void testNeiman() throws InterruptedException {
        LandingPage landingPage = new LandingPage();
        LoginPage loginPage = new LoginPage();



        By logoutButton = By.xpath("//body//header//ul//input[5]");


        Actions actions = new Actions(getDriver());

        ArrayList<String> emails = new ArrayList<>();
        emails.add("fuamagi@gmail.com");
        emails.add("faketest@gmail.com"); //created email array list
        ArrayList<String> passwords = new ArrayList<>();
        passwords.add("Ass123@@");
        passwords.add(("fasdfasdfads")); //created  password arraylist
        int emailSize = emails.size();
        boolean isActiveAccount = landingPage.logOutNeiman();
        ArrayList<String> hitEmail = new ArrayList<>();
        ArrayList<String> hitPass = new ArrayList<>();


        Thread.sleep(2000);
        int count = 0;
        for(int index = 0; index < emailSize; index++){
            landingPage.enterNeimanEmail(emails.get(index));
            landingPage.enterNeimanPass(passwords.get(index));
            landingPage.clickSigninNeiman();
            Thread.sleep(5000);
            //if account is good
            // have to fix the is displayed stuff
            if(isActiveAccount){
                System.out.println("Working bro");
            }
//            if(isActiveAccount){   // only works if the account is active
//            WebElement logOut = getDriver().findElement(By.xpath("//span[@id='myGlobalAcct']"));
//            actions.moveToElement(logOut).build().perform();
//            Thread.sleep(2000);
//            getDriver().findElement(logoutButton).click();
//            Thread.sleep(3000);
//            hitEmail.add(emails.get(index));
//            hitPass.add(emails.get(index));
//            System.out.println(hitEmail.get(index)+ ":" + hitPass.get(index));
//            count++;
//            }
//            //landingPage.clearField();
        }




    }

}
