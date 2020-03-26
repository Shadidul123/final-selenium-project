package test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class hooverOver extends DriverWrapper {
    @Test
    public static void hoverOver() throws InterruptedException {
        getDriver().manage().window().maximize();
        Thread.sleep(2000);
        WebElement SignIn = getDriver().findElement(By.xpath("//span[text()='Sign In']"));

        Actions actions = new Actions(getDriver());
        actions.moveToElement(SignIn).build().perform();
        Thread.sleep(2000);
        getDriver().findElement(By.linkText("Create Account")).click();
        Thread.sleep(2000);

    }
}
