package test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class verifydate extends DriverWrapper {

    @Test
    public void testDate() throws InterruptedException {

        WebElement month = getDriver().findElement(By.id("month"));
        Select monthDropDrown = new Select(month);
        monthDropDrown.selectByVisibleText("Jan");
        monthDropDrown.selectByIndex(4); //apr





      /*  WebElement departments = getDriver().findElement(By.id("searchDropdownBox"));
        Select departmentDropDown = new Select(departments);
        departmentDropDown.selectByVisibleText("Amazon Pantry");
        Thread.sleep(3000);*/

        //summary: find the webelement-> select the webelement-> select by text

        List<WebElement> options = monthDropDrown.getOptions();
        boolean isFound = false;
        for(WebElement option:options){
            if(option.getText().equals("Jan")){
                isFound = true;
                break;
            }
        }

        Assert.assertTrue(isFound);


    }

}
