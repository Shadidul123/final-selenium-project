package test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class selector extends DriverWrapper {
    @Test
    public void Selector(){

        //locator->element->select element
        WebElement element = getDriver().findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select amazonList = new Select(element);
        amazonList.selectByIndex(2);
    }
}
