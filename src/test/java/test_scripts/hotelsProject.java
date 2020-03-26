package test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page_objects.LandingPage;
import page_objects.LoginPage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class hotelsProject extends DriverWrapper {
    @Test
    public void hotelProject() throws InterruptedException {
        LandingPage landingPage = new LandingPage();
        LoginPage loginPage = new LoginPage();
        SimpleDateFormat sdf = new SimpleDateFormat("d"); //formats any date
        Date date = new Date(); // gives todays date
        String today = sdf.format(date);
        //System.out.println(today);
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//input[@id='qf-0q-localised-check-in']")).click();

        List <WebElement> days = getDriver().findElements(By.xpath("(//div[contains(@class,'datepicker-bd')])[1]//td//a"));
        //1 wwebelement #1
        //2
        //3

        for(WebElement day:days){
            if(day.getText().equals(today)){
                day.click();
                Thread.sleep(4000);
                break;
            }
        }





    }

}
